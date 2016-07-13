package com.upsight.android.internal;

import android.content.Context;
import com.upsight.android.logger.UpsightLogger;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class PropertiesModule_ProvideSdkPluginFactory implements Factory<String> {
    static final /* synthetic */ boolean $assertionsDisabled;
    private final Provider<Context> contextProvider;
    private final Provider<UpsightLogger> loggerProvider;
    private final PropertiesModule module;

    static {
        $assertionsDisabled = !PropertiesModule_ProvideSdkPluginFactory.class.desiredAssertionStatus();
    }

    public PropertiesModule_ProvideSdkPluginFactory(PropertiesModule module, Provider<Context> contextProvider, Provider<UpsightLogger> loggerProvider) {
        if ($assertionsDisabled || module != null) {
            this.module = module;
            if ($assertionsDisabled || contextProvider != null) {
                this.contextProvider = contextProvider;
                if ($assertionsDisabled || loggerProvider != null) {
                    this.loggerProvider = loggerProvider;
                    return;
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    public String get() {
        String provided = this.module.provideSdkPlugin((Context) this.contextProvider.get(), (UpsightLogger) this.loggerProvider.get());
        if (provided != null) {
            return provided;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static Factory<String> create(PropertiesModule module, Provider<Context> contextProvider, Provider<UpsightLogger> loggerProvider) {
        return new PropertiesModule_ProvideSdkPluginFactory(module, contextProvider, loggerProvider);
    }
}
