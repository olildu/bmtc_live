package app.chalo.userprofile.data.local;

import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.login.manager.UserProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/data/local/UserProfileLocalDataSourceImpl;", "Lapp/chalo/userprofile/data/local/UserProfileLocalDataSource;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserProfileLocalDataSourceImpl implements UserProfileLocalDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileAndAuthStoreManager f10308a;

    public UserProfileLocalDataSourceImpl(UserProfileAndAuthStoreManager userProfileAndAuthStoreManager) {
        this.f10308a = userProfileAndAuthStoreManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r2.i(r0) == r1) goto L22;
     */
    @Override // app.chalo.userprofile.data.local.UserProfileLocalDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof app.chalo.userprofile.data.local.UserProfileLocalDataSourceImpl$clearStoredUserProfileAndAuthTokensDetails$1
            if (r0 == 0) goto L13
            r0 = r6
            app.chalo.userprofile.data.local.UserProfileLocalDataSourceImpl$clearStoredUserProfileAndAuthTokensDetails$1 r0 = (app.chalo.userprofile.data.local.UserProfileLocalDataSourceImpl$clearStoredUserProfileAndAuthTokensDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.userprofile.data.local.UserProfileLocalDataSourceImpl$clearStoredUserProfileAndAuthTokensDetails$1 r0 = new app.chalo.userprofile.data.local.UserProfileLocalDataSourceImpl$clearStoredUserProfileAndAuthTokensDetails$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            app.chalo.userprofile.UserProfileAndAuthStoreManager r0 = (app.chalo.userprofile.UserProfileAndAuthStoreManager) r0
            kotlin.ResultKt.b(r6)
            goto L63
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            java.lang.Object r2 = r0.L$1
            app.chalo.userprofile.UserProfileAndAuthStoreManager r2 = (app.chalo.userprofile.UserProfileAndAuthStoreManager) r2
            java.lang.Object r4 = r0.L$0
            app.chalo.userprofile.UserProfileAndAuthStoreManager r4 = (app.chalo.userprofile.UserProfileAndAuthStoreManager) r4
            kotlin.ResultKt.b(r6)
            goto L55
        L42:
            kotlin.ResultKt.b(r6)
            app.chalo.userprofile.UserProfileAndAuthStoreManager r2 = r5.f10308a
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r6 = r2.h(r0)
            if (r6 != r1) goto L54
            goto L62
        L54:
            r4 = r2
        L55:
            r0.L$0 = r4
            r6 = 0
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r2.i(r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.userprofile.data.local.UserProfileLocalDataSourceImpl.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [app.chalo.userprofile.data.local.UserProfileLocalDataSourceImpl$isUserLoggedIn$$inlined$map$1] */
    @Override // app.chalo.userprofile.data.local.UserProfileLocalDataSource
    public final UserProfileLocalDataSourceImpl$isUserLoggedIn$$inlined$map$1 b() {
        final UserProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1 userProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1F = this.f10308a.f();
        return new Flow<Boolean>() { // from class: app.chalo.userprofile.data.local.UserProfileLocalDataSourceImpl$isUserLoggedIn$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.userprofile.data.local.UserProfileLocalDataSourceImpl$isUserLoggedIn$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f10310a;

                /* JADX INFO: renamed from: app.chalo.userprofile.data.local.UserProfileLocalDataSourceImpl$isUserLoggedIn$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.userprofile.data.local.UserProfileLocalDataSourceImpl$isUserLoggedIn$$inlined$map$1$2", f = "UserProfileLocalDataSourceImpl.kt", l = {50}, m = "emit", v = 1)
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
                    this.f10310a = flowCollector;
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
                        UserProfileLocalInfoModel userProfileLocalInfoModel = (UserProfileLocalInfoModel) obj;
                        Boolean boolValueOf = Boolean.valueOf((userProfileLocalInfoModel != null ? userProfileLocalInfoModel.f10306a : null) != null);
                        anonymousClass1.label = 1;
                        if (this.f10310a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
                Object objCollect = userProfileAndAuthStoreManagerImpl$getUserProfileDetails$$inlined$map$1F.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.userprofile.data.local.UserProfileLocalDataSource
    public final Object c(UserProfileLocalInfoModel userProfileLocalInfoModel, ContinuationImpl continuationImpl) {
        Object objL = this.f10308a.l(userProfileLocalInfoModel, continuationImpl);
        return objL == CoroutineSingletons.COROUTINE_SUSPENDED ? objL : Unit.f17538a;
    }

    @Override // app.chalo.userprofile.data.local.UserProfileLocalDataSource
    public final Object d(CountryPhoneNumberConfig countryPhoneNumberConfig, Continuation continuation) {
        Object objD = this.f10308a.d(countryPhoneNumberConfig, continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    @Override // app.chalo.userprofile.data.local.UserProfileLocalDataSource
    public final Flow e() {
        return this.f10308a.f();
    }

    @Override // app.chalo.userprofile.data.local.UserProfileLocalDataSource
    public final Object f(ContinuationImpl continuationImpl) {
        return FlowKt.v(this.f10308a.f(), continuationImpl);
    }

    @Override // app.chalo.userprofile.data.local.UserProfileLocalDataSource
    public final Object g(Continuation continuation) {
        return this.f10308a.e();
    }
}
