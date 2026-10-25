package app.chalo.security.encryption.storage;

import app.chalo.contract.BasicInfoContract;
import app.chalo.security.encryption.data.EncryptionKey;
import app.chalo.security.encryption.exception.CryptoOperationResultKt;
import app.chalo.security.encryption.utils.KeyStoreUtils;
import app.chalo.security.sync.data.EncryptionKeysPurposeType;
import app.chalo.security.sync.keystorage.KeyDao;
import app.chalo.security.sync.keystorage.KeyEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalDateKt;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/security/encryption/storage/EncryptedKeyStorage;", "Lapp/chalo/security/encryption/storage/KeyStorageContract;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EncryptedKeyStorage implements KeyStorageContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyDao f9358a;
    public final KeyStoreUtils b;
    public final BasicInfoContract c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9359a;

        static {
            int[] iArr = new int[EncryptionKeysPurposeType.values().length];
            try {
                iArr[EncryptionKeysPurposeType.SEMI_CLOSED_WALLET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EncryptionKeysPurposeType.CLOSED_LOOP_WALLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9359a = iArr;
        }
    }

    public EncryptedKeyStorage(KeyDao keyDao, KeyStoreUtils keyStoreUtils, BasicInfoContract basicInfoContract) {
        this.f9358a = keyDao;
        this.b = keyStoreUtils;
        this.c = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r8 == r1) goto L21;
     */
    @Override // app.chalo.security.encryption.storage.KeyStorageContract
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.security.encryption.storage.EncryptedKeyStorage$getKey$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.security.encryption.storage.EncryptedKeyStorage$getKey$1 r0 = (app.chalo.security.encryption.storage.EncryptedKeyStorage$getKey$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.security.encryption.storage.EncryptedKeyStorage$getKey$1 r0 = new app.chalo.security.encryption.storage.EncryptedKeyStorage$getKey$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r8)
            goto L5a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.b(r8)
            goto L48
        L3a:
            kotlin.ResultKt.b(r8)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r6.e(r0)
            if (r8 != r1) goto L48
            goto L59
        L48:
            java.lang.Number r8 = (java.lang.Number) r8
            long r4 = r8.longValue()
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.io.Serializable r8 = r6.b(r4, r7, r0)
            if (r8 != r1) goto L5a
        L59:
            return r1
        L5a:
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = kotlin.collections.CollectionsKt.H(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.security.encryption.storage.EncryptedKeyStorage.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.security.encryption.storage.KeyStorageContract
    public final Serializable b(long j, String str, ContinuationImpl continuationImpl) {
        EncryptedKeyStorage$getOverlappingKeys$1 encryptedKeyStorage$getOverlappingKeys$1;
        if (continuationImpl instanceof EncryptedKeyStorage$getOverlappingKeys$1) {
            encryptedKeyStorage$getOverlappingKeys$1 = (EncryptedKeyStorage$getOverlappingKeys$1) continuationImpl;
            int i = encryptedKeyStorage$getOverlappingKeys$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                encryptedKeyStorage$getOverlappingKeys$1.label = i - Integer.MIN_VALUE;
            } else {
                encryptedKeyStorage$getOverlappingKeys$1 = new EncryptedKeyStorage$getOverlappingKeys$1(this, continuationImpl);
            }
        } else {
            encryptedKeyStorage$getOverlappingKeys$1 = new EncryptedKeyStorage$getOverlappingKeys$1(this, continuationImpl);
        }
        Object objA = encryptedKeyStorage$getOverlappingKeys$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = encryptedKeyStorage$getOverlappingKeys$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            encryptedKeyStorage$getOverlappingKeys$1.label = 1;
            objA = this.f9358a.a(j, str, encryptedKeyStorage$getOverlappingKeys$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        Iterable<KeyEntity> iterable = (Iterable) objA;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        for (KeyEntity keyEntity : iterable) {
            arrayList.add(new EncryptionKey((String) CryptoOperationResultKt.a(this.b.a(keyEntity.c)), keyEntity.f9392a, keyEntity.b));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007c  */
    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ad A[LOOP:2: B:23:0x00a7->B:25:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00de  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:56:0x0113 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ca -> B:27:0x00d8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // app.chalo.security.encryption.storage.KeyStorageContract
    public final java.lang.Object c(app.chalo.security.sync.data.EncryptionKeyListData r12, java.util.List r13, java.util.List r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.security.encryption.storage.EncryptedKeyStorage.c(app.chalo.security.sync.data.EncryptionKeyListData, java.util.List, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.security.encryption.storage.KeyStorageContract
    public final Object d(long j, Continuation continuation) {
        Object objC = this.f9358a.c(j, continuation);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ContinuationImpl continuationImpl) throws Exception {
        EncryptedKeyStorage$getTimeAtNoonToday$1 encryptedKeyStorage$getTimeAtNoonToday$1;
        if (continuationImpl instanceof EncryptedKeyStorage$getTimeAtNoonToday$1) {
            encryptedKeyStorage$getTimeAtNoonToday$1 = (EncryptedKeyStorage$getTimeAtNoonToday$1) continuationImpl;
            int i = encryptedKeyStorage$getTimeAtNoonToday$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                encryptedKeyStorage$getTimeAtNoonToday$1.label = i - Integer.MIN_VALUE;
            } else {
                encryptedKeyStorage$getTimeAtNoonToday$1 = new EncryptedKeyStorage$getTimeAtNoonToday$1(this, continuationImpl);
            }
        } else {
            encryptedKeyStorage$getTimeAtNoonToday$1 = new EncryptedKeyStorage$getTimeAtNoonToday$1(this, continuationImpl);
        }
        Object objC = encryptedKeyStorage$getTimeAtNoonToday$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = encryptedKeyStorage$getTimeAtNoonToday$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            encryptedKeyStorage$getTimeAtNoonToday$1.label = 1;
            objC = this.c.c(encryptedKeyStorage$getTimeAtNoonToday$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        long jLongValue = ((Number) objC).longValue();
        TimeZone.INSTANCE.getClass();
        TimeZone timeZoneA = TimeZone.Companion.a("Asia/Calcutta");
        Instant.INSTANCE.getClass();
        LocalDateTime localDateTimeC = TimeZoneKt.c(Instant.Companion.a(jLongValue), timeZoneA);
        return new Long(TimeZoneKt.a(LocalDateKt.a(localDateTimeC.a(), 12, localDateTimeC.h(), 0, 12), timeZoneA).f());
    }

    public final Object f(String str, List list, Continuation continuation) {
        List<EncryptionKey> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (EncryptionKey encryptionKey : list2) {
            String str2 = (String) CryptoOperationResultKt.a(this.b.b(encryptionKey.f9352a));
            long j = encryptionKey.b;
            long j2 = encryptionKey.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            arrayList.add(new KeyEntity(j, j2, str2, lowerCase));
        }
        Object objB = this.f9358a.b(arrayList, continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }
}
