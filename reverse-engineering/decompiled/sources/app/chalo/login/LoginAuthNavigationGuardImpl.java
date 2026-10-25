package app.chalo.login;

import app.chalo.features.foreground.ActiveSceneInStackResolver;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/login/LoginAuthNavigationGuardImpl;", "Lapp/chalo/login/LoginAuthNavigationGuard;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoginAuthNavigationGuardImpl implements LoginAuthNavigationGuard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f5181a;
    public final ActiveSceneInStackResolver b;
    public final SharedFlowImpl c = SharedFlowKt.b(0, 0, null, 7);
    public final MutexImpl d = MutexKt.a();
    public final MutableStateFlow e = StateFlowKt.a(null);

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/login/LoginAuthNavigationGuardImpl$Companion;", "", "", "SAFE_LOGIN_WAIT_TIMEOUT", "J", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public LoginAuthNavigationGuardImpl(UserProfileDetailsProvider userProfileDetailsProvider, ActiveSceneInStackResolver activeSceneInStackResolver) {
        this.f5181a = userProfileDetailsProvider;
        this.b = activeSceneInStackResolver;
    }

    public static boolean c(ChaloNavigationRequest chaloNavigationRequest) {
        AuthenticatedArgs authenticatedArgs;
        if (chaloNavigationRequest instanceof ChaloNavigationRequest.GoBack) {
            return false;
        }
        if (chaloNavigationRequest instanceof ChaloNavigationRequest.BuildStack) {
            Object objP = CollectionsKt.P(((ChaloNavigationRequest.BuildStack) chaloNavigationRequest).f9214a);
            authenticatedArgs = objP instanceof AuthenticatedArgs ? (AuthenticatedArgs) objP : null;
            if (authenticatedArgs != null) {
                return authenticatedArgs.b();
            }
        } else {
            if (!(chaloNavigationRequest instanceof ChaloNavigationRequest.Navigate)) {
                throw new NoWhenBranchMatchedException();
            }
            Object obj = ((ChaloNavigationRequest.Navigate) chaloNavigationRequest).f9216a;
            authenticatedArgs = obj instanceof AuthenticatedArgs ? (AuthenticatedArgs) obj : null;
            if (authenticatedArgs != null) {
                return authenticatedArgs.b();
            }
        }
        return false;
    }

    public static boolean d(PopUpToConfig popUpToConfig) {
        if (popUpToConfig instanceof PopUpToConfig.ClearAll) {
            return true;
        }
        if ((popUpToConfig instanceof PopUpToConfig.Finish) || Intrinsics.d(popUpToConfig, PopUpToConfig.None.f9220a) || Intrinsics.d(popUpToConfig, PopUpToConfig.Prev.f9221a) || (popUpToConfig instanceof PopUpToConfig.Scene) || popUpToConfig == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ec A[Catch: all -> 0x0292, PHI: r0 r5 r8
      0x01ec: PHI (r0v21 kotlin.jvm.internal.Ref$ObjectRef) = (r0v13 kotlin.jvm.internal.Ref$ObjectRef), (r0v24 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:101:0x01e8, B:22:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r5v16 kotlinx.coroutines.sync.Mutex) = (r5v29 kotlinx.coroutines.sync.Mutex), (r5v30 kotlinx.coroutines.sync.Mutex) binds: [B:101:0x01e8, B:22:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x01ec: PHI (r8v4 app.chalo.scenes.ChaloNavigationRequest) = (r8v1 app.chalo.scenes.ChaloNavigationRequest), (r8v6 app.chalo.scenes.ChaloNavigationRequest) binds: [B:101:0x01e8, B:22:0x0086] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0292, blocks: (B:103:0x01ec, B:80:0x0165, B:84:0x016f, B:86:0x017f, B:97:0x01a7, B:100:0x01b6, B:89:0x0186, B:91:0x018a, B:92:0x0198, B:94:0x019c, B:140:0x0294, B:141:0x0299, B:142:0x029a), top: B:155:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0205 A[PHI: r0 r5 r8 r9 r17 r18
      0x0205: PHI (r0v25 kotlin.jvm.internal.Ref$ObjectRef) = (r0v21 kotlin.jvm.internal.Ref$ObjectRef), (r0v36 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:104:0x0201, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r5v19 kotlinx.coroutines.sync.Mutex) = (r5v27 kotlinx.coroutines.sync.Mutex), (r5v28 kotlinx.coroutines.sync.Mutex) binds: [B:104:0x0201, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r8v7 app.chalo.scenes.ChaloNavigationRequest) = (r8v4 app.chalo.scenes.ChaloNavigationRequest), (r8v9 app.chalo.scenes.ChaloNavigationRequest) binds: [B:104:0x0201, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r9v10 java.lang.Object) = (r9v9 java.lang.Object), (r9v11 java.lang.Object) binds: [B:104:0x0201, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r17v3 app.chalo.providers.UserProfileDetailsProvider) = (r7v0 app.chalo.providers.UserProfileDetailsProvider), (r17v4 app.chalo.providers.UserProfileDetailsProvider) binds: [B:104:0x0201, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r18v3 app.chalo.features.foreground.ActiveSceneInStackResolver) = 
      (r9v0 app.chalo.features.foreground.ActiveSceneInStackResolver)
      (r18v4 app.chalo.features.foreground.ActiveSceneInStackResolver)
     binds: [B:104:0x0201, B:17:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x0214  */
    /* JADX WARN: Code duplicated, block: B:114:0x0247  */
    /* JADX WARN: Code duplicated, block: B:117:0x024b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0257  */
    /* JADX WARN: Code duplicated, block: B:123:0x0267  */
    /* JADX WARN: Code duplicated, block: B:126:0x0275  */
    /* JADX WARN: Code duplicated, block: B:129:0x0282  */
    /* JADX WARN: Code duplicated, block: B:136:0x028f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:140:0x0294 A[Catch: all -> 0x0292, TRY_ENTER, TryCatch #1 {all -> 0x0292, blocks: (B:103:0x01ec, B:80:0x0165, B:84:0x016f, B:86:0x017f, B:97:0x01a7, B:100:0x01b6, B:89:0x0186, B:91:0x018a, B:92:0x0198, B:94:0x019c, B:140:0x0294, B:141:0x0299, B:142:0x029a), top: B:155:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x029a A[Catch: all -> 0x0292, TRY_LEAVE, TryCatch #1 {all -> 0x0292, blocks: (B:103:0x01ec, B:80:0x0165, B:84:0x016f, B:86:0x017f, B:97:0x01a7, B:100:0x01b6, B:89:0x0186, B:91:0x018a, B:92:0x0198, B:94:0x019c, B:140:0x0294, B:141:0x0299, B:142:0x029a), top: B:155:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111  */
    /* JADX WARN: Code duplicated, block: B:60:0x011f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x0126  */
    /* JADX WARN: Code duplicated, block: B:65:0x012f  */
    /* JADX WARN: Code duplicated, block: B:73:0x013e  */
    /* JADX WARN: Code duplicated, block: B:76:0x014c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0162  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x016b  */
    /* JADX WARN: Code duplicated, block: B:84:0x016f A[Catch: all -> 0x0292, TRY_ENTER, TryCatch #1 {all -> 0x0292, blocks: (B:103:0x01ec, B:80:0x0165, B:84:0x016f, B:86:0x017f, B:97:0x01a7, B:100:0x01b6, B:89:0x0186, B:91:0x018a, B:92:0x0198, B:94:0x019c, B:140:0x0294, B:141:0x0299, B:142:0x029a), top: B:155:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x017f A[Catch: all -> 0x0292, TryCatch #1 {all -> 0x0292, blocks: (B:103:0x01ec, B:80:0x0165, B:84:0x016f, B:86:0x017f, B:97:0x01a7, B:100:0x01b6, B:89:0x0186, B:91:0x018a, B:92:0x0198, B:94:0x019c, B:140:0x0294, B:141:0x0299, B:142:0x029a), top: B:155:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0183  */
    /* JADX WARN: Code duplicated, block: B:89:0x0186 A[Catch: all -> 0x0292, TryCatch #1 {all -> 0x0292, blocks: (B:103:0x01ec, B:80:0x0165, B:84:0x016f, B:86:0x017f, B:97:0x01a7, B:100:0x01b6, B:89:0x0186, B:91:0x018a, B:92:0x0198, B:94:0x019c, B:140:0x0294, B:141:0x0299, B:142:0x029a), top: B:155:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x018a A[Catch: all -> 0x0292, TryCatch #1 {all -> 0x0292, blocks: (B:103:0x01ec, B:80:0x0165, B:84:0x016f, B:86:0x017f, B:97:0x01a7, B:100:0x01b6, B:89:0x0186, B:91:0x018a, B:92:0x0198, B:94:0x019c, B:140:0x0294, B:141:0x0299, B:142:0x029a), top: B:155:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0198 A[Catch: all -> 0x0292, TryCatch #1 {all -> 0x0292, blocks: (B:103:0x01ec, B:80:0x0165, B:84:0x016f, B:86:0x017f, B:97:0x01a7, B:100:0x01b6, B:89:0x0186, B:91:0x018a, B:92:0x0198, B:94:0x019c, B:140:0x0294, B:141:0x0299, B:142:0x029a), top: B:155:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x019c A[Catch: all -> 0x0292, TryCatch #1 {all -> 0x0292, blocks: (B:103:0x01ec, B:80:0x0165, B:84:0x016f, B:86:0x017f, B:97:0x01a7, B:100:0x01b6, B:89:0x0186, B:91:0x018a, B:92:0x0198, B:94:0x019c, B:140:0x0294, B:141:0x0299, B:142:0x029a), top: B:155:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a7 A[Catch: all -> 0x0292, TRY_LEAVE, TryCatch #1 {all -> 0x0292, blocks: (B:103:0x01ec, B:80:0x0165, B:84:0x016f, B:86:0x017f, B:97:0x01a7, B:100:0x01b6, B:89:0x0186, B:91:0x018a, B:92:0x0198, B:94:0x019c, B:140:0x0294, B:141:0x0299, B:142:0x029a), top: B:155:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b3 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0072, blocks: (B:16:0x0068, B:21:0x0083, B:24:0x0091, B:99:0x01b3), top: B:156:0x0035 }] */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02a8, code lost:
    
        if (r12.emit(r8, r3) == r4) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v57, types: [T, app.chalo.scenes.ChaloScenes] */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    @Override // app.chalo.login.LoginAuthNavigationGuard
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.scenes.ChaloNavigationRequest r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.LoginAuthNavigationGuardImpl.a(app.chalo.scenes.ChaloNavigationRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.login.LoginAuthNavigationGuard
    public final Flow b() {
        return FlowKt.b(this.c);
    }
}
