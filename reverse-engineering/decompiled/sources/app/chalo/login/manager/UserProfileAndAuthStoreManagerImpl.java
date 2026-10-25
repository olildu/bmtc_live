package app.chalo.login.manager;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.extensions.DataStoreExtensionsKt;
import app.chalo.extensions.DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1;
import app.chalo.network.config.ChaloJson;
import app.chalo.userprofile.UserProfileAndAuthStoreManager;
import app.chalo.userprofile.UserProfileLocalInfoModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/login/manager/UserProfileAndAuthStoreManagerImpl;", "Lapp/chalo/userprofile/UserProfileAndAuthStoreManager;", "Companion", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserProfileAndAuthStoreManagerImpl implements UserProfileAndAuthStoreManager {
    public static final Preferences.Key c = PreferencesKeys.stringKey("user_info");
    public static final Preferences.Key d = PreferencesKeys.stringKey("accessToken");
    public static final Preferences.Key e = PreferencesKeys.stringKey("refreshToken");
    public static final Preferences.Key f = PreferencesKeys.longKey("expiryTime");
    public static final Preferences.Key g = PreferencesKeys.longKey("delta");
    public static final Preferences.Key h = PreferencesKeys.booleanKey("firstLogin");
    public static final Preferences.Key i = PreferencesKeys.stringKey("countryConfig");
    public static final Preferences.Key j = PreferencesKeys.booleanKey("shouldRequestConsentAfterSplash");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f5260a;
    public final MutexImpl b = MutexKt.a();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\r"}, d2 = {"Lapp/chalo/login/manager/UserProfileAndAuthStoreManagerImpl$Companion;", "", "", "USER_DETAILS_DATA_STORE_NAME", "Ljava/lang/String;", "USER_INFO_KEY_NAME", "ACCESS_TOKEN_KEY_NAME", "REFRESH_TOKEN_KEY_NAME", "EXPIRY_TIME_KEY_NAME", "DELTA_KEY_NAME", "FIRST_LOGIN_KEY_NAME", "KEY_COUNTRY_CONFIG", "SHOULD_REQUEST_CONSENT_AFTER_SPLASH", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public UserProfileAndAuthStoreManagerImpl(DataStore dataStore) {
        this.f5260a = dataStore;
    }

    @Override // app.chalo.userprofile.UserProfileAndAuthStoreManager
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f5260a, new UserProfileAndAuthStoreManagerImpl$setRequestConsentAfterSplashScreen$2(z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    @Override // app.chalo.userprofile.UserProfileAndAuthStoreManager
    public final Object b(ContinuationImpl continuationImpl) {
        final Flow data = this.f5260a.getData();
        return FlowKt.v(new Flow<String>() { // from class: app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getAccessToken$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getAccessToken$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5262a;

                /* JADX INFO: renamed from: app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getAccessToken$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getAccessToken$$inlined$map$1$2", f = "UserProfileAndAuthStoreManagerImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f5262a = flowCollector;
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
                        Object obj3 = ((Preferences) obj).get(UserProfileAndAuthStoreManagerImpl.d);
                        anonymousClass1.label = 1;
                        if (this.f5262a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
        }, continuationImpl);
    }

    @Override // app.chalo.userprofile.UserProfileAndAuthStoreManager
    public final Object c(Continuation continuation) {
        return FlowKt.v(DataStoreExtensionsKt.a(this.f5260a, j, Boolean.FALSE), continuation);
    }

    @Override // app.chalo.userprofile.UserProfileAndAuthStoreManager
    public final Object d(CountryPhoneNumberConfig countryPhoneNumberConfig, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f5260a, new UserProfileAndAuthStoreManagerImpl$setCurrentCountryPhoneNumberConfig$2(countryPhoneNumberConfig, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1] */
    @Override // app.chalo.userprofile.UserProfileAndAuthStoreManager
    public final UserProfileAndAuthStoreManagerImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1 e() {
        final Flow data = this.f5260a.getData();
        return new Flow<CountryPhoneNumberConfig>() { // from class: app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5266a;

                /* JADX INFO: renamed from: app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getCurrentCountryPhoneNumberConfig$$inlined$map$1$2", f = "UserProfileAndAuthStoreManagerImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f5266a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object objB;
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
                        String str = (String) ((Preferences) obj).get(UserProfileAndAuthStoreManagerImpl.i);
                        CountryPhoneNumberConfig countryPhoneNumberConfig = null;
                        if (str != null) {
                            try {
                                Json json = ChaloJson.b;
                                json.getClass();
                                objB = json.b(str, BuiltinSerializersKt.c(CountryPhoneNumberConfig.INSTANCE.serializer()));
                            } catch (Exception unused) {
                                objB = null;
                            }
                            try {
                                countryPhoneNumberConfig = (CountryPhoneNumberConfig) objB;
                            } catch (Exception unused2) {
                            }
                        }
                        anonymousClass1.label = 1;
                        if (this.f5266a.emit(countryPhoneNumberConfig, anonymousClass1) == coroutineSingletons) {
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

    /* JADX WARN: Type inference failed for: r1v0, types: [app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1] */
    @Override // app.chalo.userprofile.UserProfileAndAuthStoreManager
    public final UserProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1 f() {
        final Flow data = this.f5260a.getData();
        return new Flow<UserProfileLocalInfoModel>() { // from class: app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5272a;

                /* JADX INFO: renamed from: app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1$2", f = "UserProfileAndAuthStoreManagerImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f5272a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object objB;
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
                        String str = (String) ((Preferences) obj).get(UserProfileAndAuthStoreManagerImpl.c);
                        UserProfileLocalInfoModel userProfileLocalInfoModel = null;
                        if (str != null) {
                            try {
                                Json json = ChaloJson.b;
                                json.getClass();
                                objB = json.b(str, BuiltinSerializersKt.c(UserProfileLocalInfoModel.INSTANCE.serializer()));
                            } catch (Exception unused) {
                                objB = null;
                            }
                            try {
                                userProfileLocalInfoModel = (UserProfileLocalInfoModel) objB;
                            } catch (Exception unused2) {
                            }
                        }
                        anonymousClass1.label = 1;
                        if (this.f5272a.emit(userProfileLocalInfoModel, anonymousClass1) == coroutineSingletons) {
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

    @Override // app.chalo.userprofile.UserProfileAndAuthStoreManager
    public final Object g(ContinuationImpl continuationImpl) {
        final Flow data = this.f5260a.getData();
        return FlowKt.v(new Flow<String>() { // from class: app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getRefreshToken$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getRefreshToken$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f5270a;

                /* JADX INFO: renamed from: app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getRefreshToken$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getRefreshToken$$inlined$map$1$2", f = "UserProfileAndAuthStoreManagerImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f5270a = flowCollector;
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
                        Object obj3 = ((Preferences) obj).get(UserProfileAndAuthStoreManagerImpl.e);
                        anonymousClass1.label = 1;
                        if (this.f5270a.emit(obj3, anonymousClass1) == coroutineSingletons) {
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
        }, continuationImpl);
    }

    @Override // app.chalo.userprofile.UserProfileAndAuthStoreManager
    public final Object h(Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f5260a, new UserProfileAndAuthStoreManagerImpl$clearStoredUserDetails$2(2, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    @Override // app.chalo.userprofile.UserProfileAndAuthStoreManager
    public final Object i(Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f5260a, new UserProfileAndAuthStoreManagerImpl$clearStoredAuthTokensDetails$2(2, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00b9, B:35:0x00bd, B:41:0x00ca), top: B:52:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:33:0x00b9, B:35:0x00bd, B:41:0x00ca), top: B:52:0x00b9 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // app.chalo.userprofile.UserProfileAndAuthStoreManager
    public final Object j(long j2, String str, ContinuationImpl continuationImpl) throws Throwable {
        UserProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$1 userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$1;
        String str2;
        Mutex mutex;
        long j3;
        String str3;
        Mutex mutex2;
        long j4;
        Long l;
        long jLongValue;
        UserProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2$1 userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2$1;
        long j5;
        Mutex mutex3;
        if (continuationImpl instanceof UserProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$1) {
            userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$1 = (UserProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$1) continuationImpl;
            int i2 = userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$1.label = i2 - Integer.MIN_VALUE;
            } else {
                userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$1 = new UserProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$1(this, continuationImpl);
            }
        } else {
            userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$1 = new UserProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$1(this, continuationImpl);
        }
        UserProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$1 userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2 = userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$1;
        Object obj = userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.label;
        DataStore dataStore = this.f5260a;
        ?? r4 = 1;
        try {
            if (i3 == 0) {
                ResultKt.b(obj);
                str2 = str;
                userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.L$0 = str2;
                mutex = this.b;
                userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.L$1 = mutex;
                j3 = j2;
                userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.J$0 = j3;
                userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.label = 1;
                if (mutex.a(userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 == 1) {
                long j6 = userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.J$0;
                mutex = (Mutex) userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.L$1;
                String str4 = (String) userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.L$0;
                ResultKt.b(obj);
                str2 = str4;
                j3 = j6;
            } else {
                if (i3 == 2) {
                    long j7 = userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.J$0;
                    Mutex mutex4 = (Mutex) userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.L$1;
                    String str5 = (String) userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.L$0;
                    ResultKt.b(obj);
                    mutex2 = mutex4;
                    j4 = j7;
                    str3 = str5;
                    try {
                        l = (Long) obj;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = -1;
                        }
                        if (jLongValue == -1) {
                            userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2$1 = new UserProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2$1(this, str3, j4, null);
                            userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.L$0 = mutex2;
                            userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.L$1 = null;
                            userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.J$0 = j4;
                            userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.label = 3;
                            if (PreferencesKt.edit(dataStore, userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2$1, userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2) != coroutineSingletons) {
                                j5 = j4;
                                mutex3 = mutex2;
                            }
                            return coroutineSingletons;
                        }
                        r4 = mutex2;
                        Long l2 = new Long(jLongValue);
                        r4.e(null);
                        return l2;
                    } catch (Throwable th) {
                        th = th;
                        r4 = mutex2;
                        r4.e(null);
                        throw th;
                    }
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j5 = userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.J$0;
                Mutex mutex5 = (Mutex) userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.L$0;
                ResultKt.b(obj);
                mutex3 = mutex5;
            }
            jLongValue = j5;
            r4 = mutex3;
            Long l3 = new Long(jLongValue);
            r4.e(null);
            return l3;
            Mutex mutex6 = mutex;
            DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1A = DataStoreExtensionsKt.a(dataStore, PreferencesKeys.longKey(str2 + "_first_time_consent_requested"), new Long(-1L));
            userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.L$0 = str2;
            userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.L$1 = mutex6;
            userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.J$0 = j3;
            userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.label = 2;
            Object objV = FlowKt.v(dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1A, userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2);
            if (objV != coroutineSingletons) {
                str3 = str2;
                obj = objV;
                long j8 = j3;
                mutex2 = mutex6;
                j4 = j8;
                l = (Long) obj;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = -1;
                }
                if (jLongValue == -1) {
                    userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2$1 = new UserProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2$1(this, str3, j4, null);
                    userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.L$0 = mutex2;
                    userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.L$1 = null;
                    userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.J$0 = j4;
                    userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2.label = 3;
                    if (PreferencesKt.edit(dataStore, userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2$1, userProfileAndAuthStoreManagerImpl$getOrUpdateFirstConsentRequestedAt$2) != coroutineSingletons) {
                        j5 = j4;
                        mutex3 = mutex2;
                        jLongValue = j5;
                        r4 = mutex3;
                    }
                } else {
                    r4 = mutex2;
                }
                Long l4 = new Long(jLongValue);
                r4.e(null);
                return l4;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // app.chalo.userprofile.UserProfileAndAuthStoreManager
    public final Object k(String str, String str2, long j2, long j3, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f5260a, new UserProfileAndAuthStoreManagerImpl$storeAuthTokens$2(str, str2, j2, j3, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }

    @Override // app.chalo.userprofile.UserProfileAndAuthStoreManager
    public final Object l(UserProfileLocalInfoModel userProfileLocalInfoModel, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f5260a, new UserProfileAndAuthStoreManagerImpl$storeUserProfileDetails$2(userProfileLocalInfoModel, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : Unit.f17538a;
    }
}
