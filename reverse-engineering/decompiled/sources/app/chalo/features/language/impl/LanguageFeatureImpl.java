package app.chalo.features.language.impl;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import app.chalo.behaviour.policy.ResolveLanguagePolicyUseCase;
import app.chalo.behaviour.policy.ResolvedLanguagePolicy;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.LanguagePlatformHelper;
import app.chalo.features.language.data.Language;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.stringprovider.StringProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/language/impl/LanguageFeatureImpl;", "Lapp/chalo/features/language/LanguageFeature;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LanguageFeatureImpl implements LanguageFeature {
    public static final Preferences.Key f = PreferencesKeys.stringKey("current_language_key");
    public static final Preferences.Key g = PreferencesKeys.booleanKey("lang_info_shown");
    public static final Preferences.Key h = PreferencesKeys.booleanKey("language_selected");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f2724a;
    public final LanguagePlatformHelper b;
    public final StringProvider c;
    public final ResolveLanguagePolicyUseCase d;
    public final StateFlow e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/features/language/impl/LanguageFeatureImpl$Companion;", "", "", "LANGUAGE_DATA_STORE_NAME", "Ljava/lang/String;", "CURRENT_LANGUAGE_KEY", "LANG_INFO_SHOWN", "LANGUAGE_SELECTED", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public LanguageFeatureImpl(DataStore dataStore, LanguagePlatformHelper languagePlatformHelper, StringProvider stringProvider, CoroutineContextProvider coroutineContextProvider, ResolveLanguagePolicyUseCase resolveLanguagePolicyUseCase) {
        this.f2724a = dataStore;
        this.b = languagePlatformHelper;
        this.c = stringProvider;
        this.d = resolveLanguagePolicyUseCase;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        final Flow data = dataStore.getData();
        this.e = FlowKt.G(new Flow<Language>() { // from class: app.chalo.features.language.impl.LanguageFeatureImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.features.language.impl.LanguageFeatureImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2730a;
                public final /* synthetic */ LanguageFeatureImpl b;

                /* JADX INFO: renamed from: app.chalo.features.language.impl.LanguageFeatureImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.features.language.impl.LanguageFeatureImpl$special$$inlined$map$1$2", f = "LanguageFeatureImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, LanguageFeatureImpl languageFeatureImpl) {
                    this.f2730a = flowCollector;
                    this.b = languageFeatureImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        String strA = (String) ((Preferences) obj).get(LanguageFeatureImpl.f);
                        if (strA == null) {
                            strA = this.b.b.a();
                        }
                        Language.INSTANCE.getClass();
                        Language languageA = Language.Companion.a(strA);
                        if (languageA == null) {
                            languageA = Language.ENGLISH;
                        }
                        anonymousClass1.label = 1;
                        if (this.f2730a.emit(languageA, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, contextScopeA, SharingStarted.Companion.f17836a, null);
    }

    @Override // app.chalo.features.language.LanguageFeature
    public final Flow a() {
        final Flow data = this.f2724a.getData();
        return new Flow<Boolean>() { // from class: app.chalo.features.language.impl.LanguageFeatureImpl$getLangInfoShown$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.features.language.impl.LanguageFeatureImpl$getLangInfoShown$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2726a;

                /* JADX INFO: renamed from: app.chalo.features.language.impl.LanguageFeatureImpl$getLangInfoShown$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.features.language.impl.LanguageFeatureImpl$getLangInfoShown$$inlined$map$1$2", f = "LanguageFeatureImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f2726a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        Boolean bool = (Boolean) ((Preferences) obj).get(LanguageFeatureImpl.g);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        anonymousClass1.label = 1;
                        if (this.f2726a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.features.language.LanguageFeature
    public final Flow b() {
        final Flow data = this.f2724a.getData();
        return new Flow<Boolean>() { // from class: app.chalo.features.language.impl.LanguageFeatureImpl$isLanguageSelected$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.features.language.impl.LanguageFeatureImpl$isLanguageSelected$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2728a;

                /* JADX INFO: renamed from: app.chalo.features.language.impl.LanguageFeatureImpl$isLanguageSelected$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.features.language.impl.LanguageFeatureImpl$isLanguageSelected$$inlined$map$1$2", f = "LanguageFeatureImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f2728a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        Boolean bool = (Boolean) ((Preferences) obj).get(LanguageFeatureImpl.h);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        anonymousClass1.label = 1;
                        if (this.f2728a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = data.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.language.LanguageFeature
    public final Object c(Language language, Continuation continuation) {
        LanguageFeatureImpl$updateCurrentLanguage$1 languageFeatureImpl$updateCurrentLanguage$1;
        if (continuation instanceof LanguageFeatureImpl$updateCurrentLanguage$1) {
            languageFeatureImpl$updateCurrentLanguage$1 = (LanguageFeatureImpl$updateCurrentLanguage$1) continuation;
            int i = languageFeatureImpl$updateCurrentLanguage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageFeatureImpl$updateCurrentLanguage$1.label = i - Integer.MIN_VALUE;
            } else {
                languageFeatureImpl$updateCurrentLanguage$1 = new LanguageFeatureImpl$updateCurrentLanguage$1(this, (ContinuationImpl) continuation);
            }
        } else {
            languageFeatureImpl$updateCurrentLanguage$1 = new LanguageFeatureImpl$updateCurrentLanguage$1(this, (ContinuationImpl) continuation);
        }
        Object obj = languageFeatureImpl$updateCurrentLanguage$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageFeatureImpl$updateCurrentLanguage$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LanguageFeatureImpl$updateCurrentLanguage$2 languageFeatureImpl$updateCurrentLanguage$2 = new LanguageFeatureImpl$updateCurrentLanguage$2(language, null);
            languageFeatureImpl$updateCurrentLanguage$1.L$0 = language;
            languageFeatureImpl$updateCurrentLanguage$1.label = 1;
            if (PreferencesKt.edit(this.f2724a, languageFeatureImpl$updateCurrentLanguage$2, languageFeatureImpl$updateCurrentLanguage$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            language = (Language) languageFeatureImpl$updateCurrentLanguage$1.L$0;
            ResultKt.b(obj);
        }
        this.b.b(language);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.language.LanguageFeature
    public final Object d(Continuation continuation) {
        LanguageFeatureImpl$availableLanguages$1 languageFeatureImpl$availableLanguages$1;
        if (continuation instanceof LanguageFeatureImpl$availableLanguages$1) {
            languageFeatureImpl$availableLanguages$1 = (LanguageFeatureImpl$availableLanguages$1) continuation;
            int i = languageFeatureImpl$availableLanguages$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageFeatureImpl$availableLanguages$1.label = i - Integer.MIN_VALUE;
            } else {
                languageFeatureImpl$availableLanguages$1 = new LanguageFeatureImpl$availableLanguages$1(this, (ContinuationImpl) continuation);
            }
        } else {
            languageFeatureImpl$availableLanguages$1 = new LanguageFeatureImpl$availableLanguages$1(this, (ContinuationImpl) continuation);
        }
        Object objA = languageFeatureImpl$availableLanguages$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageFeatureImpl$availableLanguages$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            languageFeatureImpl$availableLanguages$1.label = 1;
            objA = this.d.a(languageFeatureImpl$availableLanguages$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return ((ResolvedLanguagePolicy) objA).f1071a;
    }

    @Override // app.chalo.features.language.LanguageFeature
    public final Object e(Language language, ContinuationImpl continuationImpl) {
        return this.c.b(language.getStrEnum(), new Object[0], continuationImpl);
    }

    @Override // app.chalo.features.language.LanguageFeature
    public final Object f(ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f2724a, new LanguageFeatureImpl$setLanguageInfoShown$2(true, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    @Override // app.chalo.features.language.LanguageFeature
    public final Object g(Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f2724a, new LanguageFeatureImpl$setLanguageSelected$2(true, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    @Override // app.chalo.features.language.LanguageFeature
    /* JADX INFO: renamed from: h, reason: from getter */
    public final StateFlow getE() {
        return this.e;
    }
}
