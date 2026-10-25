package app.chalo.security;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.extensions.ThrowableExtKt;
import app.chalo.security.encryption.data.EncryptionKey;
import app.chalo.security.encryption.exception.CryptoException;
import app.chalo.security.encryption.exception.CryptoOperationResultKt;
import app.chalo.security.encryption.storage.KeyStorageContract;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.security.EncryptionFeatureImpl", f = "EncryptionFeatureImpl.kt", l = {32, 32, 35}, m = "decrypt", v = 1)
final class EncryptionFeatureImpl$decrypt$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EncryptionFeatureImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptionFeatureImpl$decrypt$1(EncryptionFeatureImpl encryptionFeatureImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = encryptionFeatureImpl;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00cc A[Catch: CancellationException -> 0x0041, all -> 0x0058, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0041, blocks: (B:12:0x0039, B:45:0x00df, B:21:0x0054, B:39:0x00ac, B:41:0x00cc, B:47:0x00f3, B:48:0x00fc, B:50:0x0102, B:54:0x012b, B:55:0x0149, B:57:0x014f, B:58:0x0163, B:59:0x0181, B:26:0x006c, B:35:0x0093, B:31:0x0079), top: B:68:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f3 A[Catch: CancellationException -> 0x0041, all -> 0x0058, TRY_ENTER, TryCatch #1 {CancellationException -> 0x0041, blocks: (B:12:0x0039, B:45:0x00df, B:21:0x0054, B:39:0x00ac, B:41:0x00cc, B:47:0x00f3, B:48:0x00fc, B:50:0x0102, B:54:0x012b, B:55:0x0149, B:57:0x014f, B:58:0x0163, B:59:0x0181, B:26:0x006c, B:35:0x0093, B:31:0x0079), top: B:68:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0102 A[Catch: CancellationException -> 0x0041, all -> 0x0058, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0041, blocks: (B:12:0x0039, B:45:0x00df, B:21:0x0054, B:39:0x00ac, B:41:0x00cc, B:47:0x00f3, B:48:0x00fc, B:50:0x0102, B:54:0x012b, B:55:0x0149, B:57:0x014f, B:58:0x0163, B:59:0x0181, B:26:0x006c, B:35:0x0093, B:31:0x0079), top: B:68:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:57:0x014f A[Catch: CancellationException -> 0x0041, all -> 0x0058, TryCatch #1 {CancellationException -> 0x0041, blocks: (B:12:0x0039, B:45:0x00df, B:21:0x0054, B:39:0x00ac, B:41:0x00cc, B:47:0x00f3, B:48:0x00fc, B:50:0x0102, B:54:0x012b, B:55:0x0149, B:57:0x014f, B:58:0x0163, B:59:0x0181, B:26:0x006c, B:35:0x0093, B:31:0x0079), top: B:68:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0163 A[Catch: CancellationException -> 0x0041, all -> 0x0058, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0041, blocks: (B:12:0x0039, B:45:0x00df, B:21:0x0054, B:39:0x00ac, B:41:0x00cc, B:47:0x00f3, B:48:0x00fc, B:50:0x0102, B:54:0x012b, B:55:0x0149, B:57:0x014f, B:58:0x0163, B:59:0x0181, B:26:0x006c, B:35:0x0093, B:31:0x0079), top: B:68:0x002c }] */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0163, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        EncryptionFeatureImpl$decrypt$1 encryptionFeatureImpl$decrypt$1;
        String str;
        KeyStorageContract keyStorageContract;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        List list;
        String str8;
        ArrayList arrayList;
        Iterator it;
        EncryptionFeatureImpl$decrypt$2 encryptionFeatureImpl$decrypt$2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        EncryptionFeatureImpl encryptionFeatureImpl = this.this$0;
        encryptionFeatureImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            encryptionFeatureImpl$decrypt$1 = this;
        } else {
            encryptionFeatureImpl$decrypt$1 = new EncryptionFeatureImpl$decrypt$1(encryptionFeatureImpl, this);
        }
        Object objB = encryptionFeatureImpl$decrypt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = encryptionFeatureImpl$decrypt$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                str = "";
                try {
                    keyStorageContract = encryptionFeatureImpl.f9350a;
                    BasicInfoContract basicInfoContract = encryptionFeatureImpl.b;
                    encryptionFeatureImpl$decrypt$1.L$0 = null;
                    encryptionFeatureImpl$decrypt$1.L$1 = null;
                    encryptionFeatureImpl$decrypt$1.L$2 = "";
                    encryptionFeatureImpl$decrypt$1.L$3 = keyStorageContract;
                    encryptionFeatureImpl$decrypt$1.label = 1;
                    Object objC = basicInfoContract.c(encryptionFeatureImpl$decrypt$1);
                    if (objC != coroutineSingletons) {
                        str2 = "";
                        objB = objC;
                        str3 = null;
                        str4 = null;
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    th = th;
                    str5 = str;
                    AnalyticsContract.DefaultImpls.a(encryptionFeatureImpl.d, "decryption failed", "decryptionAction", MapsKt.i(new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th))), new Pair("logMsg", vo1.A(str5, "| failed"))), null, false, 24);
                    encryptionFeatureImpl.c.i(th);
                    return new ChaloUseCaseResult.Failure(th);
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str5 = (String) encryptionFeatureImpl$decrypt$1.L$0;
                    try {
                        ResultKt.b(objB);
                        return new ChaloUseCaseResult.Failure(new CryptoException("no key found", new Throwable("no keys")));
                    } catch (Throwable th2) {
                        th = th2;
                        AnalyticsContract.DefaultImpls.a(encryptionFeatureImpl.d, "decryption failed", "decryptionAction", MapsKt.i(new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th))), new Pair("logMsg", vo1.A(str5, "| failed"))), null, false, 24);
                        encryptionFeatureImpl.c.i(th);
                        return new ChaloUseCaseResult.Failure(th);
                    }
                }
                str6 = (String) encryptionFeatureImpl$decrypt$1.L$1;
                str7 = (String) encryptionFeatureImpl$decrypt$1.L$0;
                try {
                    ResultKt.b(objB);
                    list = (List) objB;
                    str8 = str6 + "keyList size " + list.size();
                    if (!list.isEmpty()) {
                        encryptionFeatureImpl$decrypt$2 = new EncryptionFeatureImpl$decrypt$2(encryptionFeatureImpl, null);
                        encryptionFeatureImpl$decrypt$1.L$0 = str8;
                        encryptionFeatureImpl$decrypt$1.L$1 = null;
                        encryptionFeatureImpl$decrypt$1.label = 3;
                        if (CoroutineScopeKt.c(encryptionFeatureImpl$decrypt$2, encryptionFeatureImpl$decrypt$1) != coroutineSingletons) {
                            str5 = str8;
                            return new ChaloUseCaseResult.Failure(new CryptoException("no key found", new Throwable("no keys")));
                        }
                        return coroutineSingletons;
                    }
                    arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(CryptoOperationResultKt.a(encryptionFeatureImpl.e.b(str7, ((EncryptionKey) it.next()).f9352a)));
                            str8 = str8 + "| decrypted";
                        } catch (Throwable th3) {
                            str8 = str8 + "| error " + ThrowableExtKt.a(ThrowableExtKt.b(th3));
                        }
                    }
                    if (arrayList.size() == 0) {
                        return new ChaloUseCaseResult.Failure(new CryptoException("none of the available keys could decrypt payload", new Throwable("could not decrypt")));
                    }
                    str = str8 + "| success size " + arrayList.size() + " ";
                    return new ChaloUseCaseResult.Success(arrayList);
                } catch (Throwable th4) {
                    th = th4;
                    str5 = str6;
                    AnalyticsContract.DefaultImpls.a(encryptionFeatureImpl.d, "decryption failed", "decryptionAction", MapsKt.i(new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th))), new Pair("logMsg", vo1.A(str5, "| failed"))), null, false, 24);
                    encryptionFeatureImpl.c.i(th);
                    return new ChaloUseCaseResult.Failure(th);
                }
            }
            keyStorageContract = (KeyStorageContract) encryptionFeatureImpl$decrypt$1.L$3;
            str2 = (String) encryptionFeatureImpl$decrypt$1.L$2;
            str3 = (String) encryptionFeatureImpl$decrypt$1.L$1;
            str4 = (String) encryptionFeatureImpl$decrypt$1.L$0;
            try {
                ResultKt.b(objB);
            } catch (Throwable th5) {
                th = th5;
                str5 = str2;
                AnalyticsContract.DefaultImpls.a(encryptionFeatureImpl.d, "decryption failed", "decryptionAction", MapsKt.i(new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th))), new Pair("logMsg", vo1.A(str5, "| failed"))), null, false, 24);
                encryptionFeatureImpl.c.i(th);
                return new ChaloUseCaseResult.Failure(th);
            }
            long jLongValue = ((Number) objB).longValue();
            encryptionFeatureImpl$decrypt$1.L$0 = str4;
            encryptionFeatureImpl$decrypt$1.L$1 = str2;
            encryptionFeatureImpl$decrypt$1.L$2 = null;
            encryptionFeatureImpl$decrypt$1.L$3 = null;
            encryptionFeatureImpl$decrypt$1.label = 2;
            objB = keyStorageContract.b(jLongValue, str3, encryptionFeatureImpl$decrypt$1);
            if (objB != coroutineSingletons) {
                str6 = str2;
                str7 = str4;
                list = (List) objB;
                str8 = str6 + "keyList size " + list.size();
                if (!list.isEmpty()) {
                    arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(CryptoOperationResultKt.a(encryptionFeatureImpl.e.b(str7, ((EncryptionKey) it.next()).f9352a)));
                        str8 = str8 + "| decrypted";
                    }
                    if (arrayList.size() == 0) {
                        return new ChaloUseCaseResult.Failure(new CryptoException("none of the available keys could decrypt payload", new Throwable("could not decrypt")));
                    }
                    str = str8 + "| success size " + arrayList.size() + " ";
                    return new ChaloUseCaseResult.Success(arrayList);
                }
                encryptionFeatureImpl$decrypt$2 = new EncryptionFeatureImpl$decrypt$2(encryptionFeatureImpl, null);
                encryptionFeatureImpl$decrypt$1.L$0 = str8;
                encryptionFeatureImpl$decrypt$1.L$1 = null;
                encryptionFeatureImpl$decrypt$1.label = 3;
                if (CoroutineScopeKt.c(encryptionFeatureImpl$decrypt$2, encryptionFeatureImpl$decrypt$1) != coroutineSingletons) {
                    str5 = str8;
                    return new ChaloUseCaseResult.Failure(new CryptoException("no key found", new Throwable("no keys")));
                }
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
