package app.chalo.security;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.security.encryption.storage.KeyStorageContract;
import app.chalo.security.sync.KeySyncManager;
import app.chalo.security.sync.usecase.GetKeySyncRemoteConfigUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/security/FetchEncryptionKeysUseCase;", "", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchEncryptionKeysUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f9351a;
    public final GetKeySyncRemoteConfigUseCase b;
    public final CrashlyticsLogger c;
    public final KeySyncManager d;
    public final KeyStorageContract e;
    public final BasicInfoContract f;
    public final GetWalletSetupConfigurationUseCase g;

    public FetchEncryptionKeysUseCase(UserProfileDetailsProvider userProfileDetailsProvider, GetKeySyncRemoteConfigUseCase getKeySyncRemoteConfigUseCase, CrashlyticsLogger crashlyticsLogger, KeySyncManager keySyncManager, KeyStorageContract keyStorageContract, BasicInfoContract basicInfoContract, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase) {
        this.f9351a = userProfileDetailsProvider;
        this.b = getKeySyncRemoteConfigUseCase;
        this.c = crashlyticsLogger;
        this.d = keySyncManager;
        this.e = keyStorageContract;
        this.f = basicInfoContract;
        this.g = getWalletSetupConfigurationUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:13:0x002a, B:37:0x0080, B:20:0x003c, B:32:0x006c, B:34:0x0074, B:23:0x0044, B:29:0x0058, B:26:0x004b), top: B:46:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r13 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailable$1
            if (r0 == 0) goto L13
            r0 = r13
            app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailable$1 r0 = (app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailable$1 r0 = new app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailable$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L2e
            goto L80
        L2e:
            r12 = move-exception
            goto L8a
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            java.lang.Object r12 = r0.L$0
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L2e
            goto L6c
        L40:
            java.lang.Object r12 = r0.L$0
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L2e
            goto L58
        L48:
            kotlin.ResultKt.b(r13)
            app.chalo.security.sync.usecase.GetKeySyncRemoteConfigUseCase r13 = r11.b     // Catch: java.lang.Throwable -> L2e
            r0.L$0 = r12     // Catch: java.lang.Throwable -> L2e
            r0.label = r6     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r13 = r13.a(r0)     // Catch: java.lang.Throwable -> L2e
            if (r13 != r1) goto L58
            goto L7f
        L58:
            app.chalo.security.sync.data.KeySyncRemoteConfig r13 = (app.chalo.security.sync.data.KeySyncRemoteConfig) r13     // Catch: java.lang.Throwable -> L2e
            int r13 = r13.f9390a     // Catch: java.lang.Throwable -> L2e
            long r7 = (long) r13     // Catch: java.lang.Throwable -> L2e
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r7 * r9
            r0.L$0 = r12     // Catch: java.lang.Throwable -> L2e
            r0.label = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r13 = r11.b(r7, r12, r0)     // Catch: java.lang.Throwable -> L2e
            if (r13 != r1) goto L6c
            goto L7f
        L6c:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L2e
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r13 == 0) goto L93
            r13 = 0
            r0.L$0 = r13     // Catch: java.lang.Throwable -> L2e
            r0.label = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r13 = r11.c(r12, r0)     // Catch: java.lang.Throwable -> L2e
            if (r13 != r1) goto L80
        L7f:
            return r1
        L80:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L2e
            boolean r12 = r13.booleanValue()     // Catch: java.lang.Throwable -> L2e
            if (r12 == 0) goto L93
            r3 = r6
            goto L93
        L8a:
            boolean r13 = r12 instanceof java.util.concurrent.CancellationException
            if (r13 != 0) goto L98
            app.chalo.crashlytics.CrashlyticsLogger r13 = r11.c
            r13.i(r12)
        L93:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            return r12
        L98:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.security.FetchEncryptionKeysUseCase.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r12 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r9, java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailableForDaysAheadFromToday$1
            if (r0 == 0) goto L13
            r0 = r12
            app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailableForDaysAheadFromToday$1 r0 = (app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailableForDaysAheadFromToday$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailableForDaysAheadFromToday$1 r0 = new app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailableForDaysAheadFromToday$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r12)
            goto L6f
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            long r9 = r0.J$0
            java.lang.Object r11 = r0.L$1
            app.chalo.security.encryption.storage.KeyStorageContract r11 = (app.chalo.security.encryption.storage.KeyStorageContract) r11
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r12)
            goto L5a
        L40:
            kotlin.ResultKt.b(r12)
            r0.L$0 = r11
            app.chalo.security.encryption.storage.KeyStorageContract r12 = r8.e
            r0.L$1 = r12
            r0.J$0 = r9
            r0.label = r4
            app.chalo.contract.BasicInfoContract r2 = r8.f
            java.lang.Object r2 = r2.c(r0)
            if (r2 != r1) goto L56
            goto L6e
        L56:
            r7 = r2
            r2 = r11
            r11 = r12
            r12 = r7
        L5a:
            java.lang.Number r12 = (java.lang.Number) r12
            long r5 = r12.longValue()
            long r5 = r5 + r9
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.io.Serializable r12 = r11.b(r5, r2, r0)
            if (r12 != r1) goto L6f
        L6e:
            return r1
        L6f:
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r9 = r12.isEmpty()
            r9 = r9 ^ r4
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.security.FetchEncryptionKeysUseCase.b(long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r10 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailableForToday$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailableForToday$1 r0 = (app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailableForToday$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailableForToday$1 r0 = new app.chalo.security.FetchEncryptionKeysUseCase$areKeysAvailableForToday$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r10)
            goto L6a
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            java.lang.Object r9 = r0.L$1
            app.chalo.security.encryption.storage.KeyStorageContract r9 = (app.chalo.security.encryption.storage.KeyStorageContract) r9
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r10)
            goto L56
        L3e:
            kotlin.ResultKt.b(r10)
            r0.L$0 = r9
            app.chalo.security.encryption.storage.KeyStorageContract r10 = r8.e
            r0.L$1 = r10
            r0.label = r4
            app.chalo.contract.BasicInfoContract r2 = r8.f
            java.lang.Object r2 = r2.c(r0)
            if (r2 != r1) goto L52
            goto L69
        L52:
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r7
        L56:
            java.lang.Number r10 = (java.lang.Number) r10
            long r5 = r10.longValue()
            r10 = 0
            r0.L$0 = r10
            r0.L$1 = r10
            r0.label = r3
            java.io.Serializable r10 = r9.b(r5, r2, r0)
            if (r10 != r1) goto L6a
        L69:
            return r1
        L6a:
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r9 = r10.isEmpty()
            r9 = r9 ^ r4
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.security.FetchEncryptionKeysUseCase.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x010b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0135  */
    /* JADX WARN: Code duplicated, block: B:47:0x013b  */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0153  */
    /* JADX WARN: Code duplicated, block: B:55:0x016b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0121, code lost:
    
        if (r11 == r1) goto L54;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0121 -> B:42:0x0124). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.security.FetchEncryptionKeysUseCase.d(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
