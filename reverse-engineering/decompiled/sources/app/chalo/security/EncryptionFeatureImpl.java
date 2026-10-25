package app.chalo.security;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.extensions.ThrowableExtKt;
import app.chalo.features.encryption.EncryptionFeature;
import app.chalo.security.encryption.data.EncryptionKey;
import app.chalo.security.encryption.exception.CryptoException;
import app.chalo.security.encryption.exception.CryptoOperationResultKt;
import app.chalo.security.encryption.storage.KeyStorageContract;
import app.chalo.security.encryption.utils.AESCryptoUtils;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.worker.ApplicationBackgroundWorkersManager;
import defpackage.vo1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/security/EncryptionFeatureImpl;", "Lapp/chalo/features/encryption/EncryptionFeature;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncryptionFeatureImpl implements EncryptionFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyStorageContract f9350a;
    public final BasicInfoContract b;
    public final CrashlyticsLogger c;
    public final AnalyticsContract d;
    public final AESCryptoUtils e;
    public final ApplicationBackgroundWorkersManager f;
    public final FetchEncryptionKeysUseCase g;

    public EncryptionFeatureImpl(KeyStorageContract keyStorageContract, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, AnalyticsContract analyticsContract, AESCryptoUtils aESCryptoUtils, ApplicationBackgroundWorkersManager applicationBackgroundWorkersManager, FetchEncryptionKeysUseCase fetchEncryptionKeysUseCase) {
        this.f9350a = keyStorageContract;
        this.b = basicInfoContract;
        this.c = crashlyticsLogger;
        this.d = analyticsContract;
        this.e = aESCryptoUtils;
        this.f = applicationBackgroundWorkersManager;
        this.g = fetchEncryptionKeysUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b3 A[Catch: all -> 0x0038, CancellationException -> 0x003b, TryCatch #2 {CancellationException -> 0x003b, blocks: (B:13:0x0033, B:35:0x009e, B:37:0x00b3, B:39:0x00ce, B:22:0x0056, B:31:0x0085, B:27:0x0069), top: B:50:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce A[Catch: all -> 0x0038, CancellationException -> 0x003b, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003b, blocks: (B:13:0x0033, B:35:0x009e, B:37:0x00b3, B:39:0x00ce, B:22:0x0056, B:31:0x0085, B:27:0x0069), top: B:50:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.features.encryption.EncryptionFeature
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        EncryptionFeatureImpl$encrypt$1 encryptionFeatureImpl$encrypt$1;
        String str3;
        String str4;
        String str5;
        KeyStorageContract keyStorageContract;
        String str6;
        String str7;
        EncryptionKey encryptionKey;
        if (continuationImpl instanceof EncryptionFeatureImpl$encrypt$1) {
            encryptionFeatureImpl$encrypt$1 = (EncryptionFeatureImpl$encrypt$1) continuationImpl;
            int i = encryptionFeatureImpl$encrypt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                encryptionFeatureImpl$encrypt$1.label = i - Integer.MIN_VALUE;
            } else {
                encryptionFeatureImpl$encrypt$1 = new EncryptionFeatureImpl$encrypt$1(this, continuationImpl);
            }
        } else {
            encryptionFeatureImpl$encrypt$1 = new EncryptionFeatureImpl$encrypt$1(this, continuationImpl);
        }
        Object objA = encryptionFeatureImpl$encrypt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = encryptionFeatureImpl$encrypt$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    KeyStorageContract keyStorageContract2 = (KeyStorageContract) encryptionFeatureImpl$encrypt$1.L$3;
                    String str8 = (String) encryptionFeatureImpl$encrypt$1.L$2;
                    String str9 = (String) encryptionFeatureImpl$encrypt$1.L$1;
                    String str10 = (String) encryptionFeatureImpl$encrypt$1.L$0;
                    try {
                        ResultKt.b(objA);
                        keyStorageContract = keyStorageContract2;
                        str3 = str8;
                        str5 = str9;
                        str4 = str10;
                    } catch (Throwable th) {
                        th = th;
                        str6 = str8;
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str6 = (String) encryptionFeatureImpl$encrypt$1.L$1;
                    str7 = (String) encryptionFeatureImpl$encrypt$1.L$0;
                    try {
                        ResultKt.b(objA);
                        encryptionKey = (EncryptionKey) objA;
                        String str11 = str6 + "Got key";
                        if (encryptionKey == null) {
                            return new ChaloUseCaseResult.Success(CryptoOperationResultKt.a(this.e.a(str7, encryptionKey.f9352a)));
                        }
                        this.f.d("encryptionAction", false);
                        return new ChaloUseCaseResult.Failure(new CryptoException("no key", new Throwable("no keys")));
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                AnalyticsContract.DefaultImpls.a(this.d, "encryption failed", "encryptionAction", MapsKt.i(new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th))), new Pair("logMsg", vo1.A(str6, "| failed"))), null, false, 24);
                this.c.i(th);
                return new ChaloUseCaseResult.Failure(th);
            }
            ResultKt.b(objA);
            str3 = "";
            try {
                KeyStorageContract keyStorageContract3 = this.f9350a;
                BasicInfoContract basicInfoContract = this.b;
                str4 = str;
                encryptionFeatureImpl$encrypt$1.L$0 = str4;
                str5 = str2;
                encryptionFeatureImpl$encrypt$1.L$1 = str5;
                encryptionFeatureImpl$encrypt$1.L$2 = "";
                encryptionFeatureImpl$encrypt$1.L$3 = keyStorageContract3;
                encryptionFeatureImpl$encrypt$1.label = 1;
                Object objC = basicInfoContract.c(encryptionFeatureImpl$encrypt$1);
                if (objC != coroutineSingletons) {
                    keyStorageContract = keyStorageContract3;
                    objA = objC;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                th = th3;
                str6 = str3;
            }
            ((Number) objA).longValue();
            encryptionFeatureImpl$encrypt$1.L$0 = str4;
            encryptionFeatureImpl$encrypt$1.L$1 = str3;
            encryptionFeatureImpl$encrypt$1.L$2 = null;
            encryptionFeatureImpl$encrypt$1.L$3 = null;
            encryptionFeatureImpl$encrypt$1.label = 2;
            objA = keyStorageContract.a(str5, encryptionFeatureImpl$encrypt$1);
            if (objA != coroutineSingletons) {
                str6 = str3;
                str7 = str4;
                encryptionKey = (EncryptionKey) objA;
                String str12 = str6 + "Got key";
                if (encryptionKey == null) {
                    return new ChaloUseCaseResult.Success(CryptoOperationResultKt.a(this.e.a(str7, encryptionKey.f9352a)));
                }
                this.f.d("encryptionAction", false);
                return new ChaloUseCaseResult.Failure(new CryptoException("no key", new Throwable("no keys")));
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r10 == r1) goto L30;
     */
    @Override // app.chalo.features.encryption.EncryptionFeature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof app.chalo.security.EncryptionFeatureImpl$isKeyAvailable$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.security.EncryptionFeatureImpl$isKeyAvailable$1 r0 = (app.chalo.security.EncryptionFeatureImpl$isKeyAvailable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.security.EncryptionFeatureImpl$isKeyAvailable$1 r0 = new app.chalo.security.EncryptionFeatureImpl$isKeyAvailable$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            goto L6e
        L2a:
            r9 = move-exception
            goto L76
        L2c:
            r9 = move-exception
            goto L81
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.Object r9 = r0.L$1
            app.chalo.security.encryption.storage.KeyStorageContract r9 = (app.chalo.security.encryption.storage.KeyStorageContract) r9
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            goto L5a
        L42:
            kotlin.ResultKt.b(r10)
            app.chalo.security.encryption.storage.KeyStorageContract r10 = r8.f9350a     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            app.chalo.contract.BasicInfoContract r2 = r8.b     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r0.label = r4     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r2 = r2.c(r0)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r2 != r1) goto L56
            goto L6d
        L56:
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r7
        L5a:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            long r5 = r10.longValue()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r10 = 0
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r0.label = r3     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.io.Serializable r10 = r9.b(r5, r2, r0)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r10 != r1) goto L6e
        L6d:
            return r1
        L6e:
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            boolean r9 = r10.isEmpty()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r9 = r9 ^ r4
            goto L7c
        L76:
            app.chalo.crashlytics.CrashlyticsLogger r10 = r8.c
            r10.i(r9)
            r9 = 0
        L7c:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L81:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.security.EncryptionFeatureImpl.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.features.encryption.EncryptionFeature
    public final Object c(String str, Continuation continuation) {
        return this.g.d(str, (ContinuationImpl) continuation);
    }
}
