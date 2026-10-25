package app.chalo.security.sync;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.extensions.ThrowableExtKt;
import app.chalo.network.NetworkManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.rest.request.ChaloRequest;
import app.chalo.network.rest.request.HttpRequestType;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.security.encryption.exception.CryptoOperationResultKt;
import app.chalo.security.encryption.storage.EncryptedKeysSaveResult;
import app.chalo.security.encryption.storage.KeyStorageContract;
import app.chalo.security.encryption.utils.AESCryptoUtils;
import app.chalo.security.encryption.utils.RSACryptoUtils;
import app.chalo.security.sync.data.EncryptionKeyListData;
import app.chalo.security.sync.data.EncryptionKeySyncApiData;
import app.chalo.security.sync.data.EncryptionKeySyncApiDataKt;
import app.chalo.security.sync.data.EncryptionKeySyncApiRequestModel;
import app.chalo.security.sync.data.EncryptionKeySyncApiResponseModel;
import app.chalo.security.sync.data.EncryptionKeysPurposeType;
import app.chalo.security.sync.data.KeySyncRemoteConfig;
import app.chalo.security.sync.usecase.GetKeySyncRemoteConfigUseCase;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/security/sync/KeySyncManager;", "", "Companion", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeySyncManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyStorageContract f9377a;
    public final NetworkManager b;
    public final BasicInfoContract c;
    public final ClientSecretManager d;
    public final CrashlyticsLogger e;
    public final AnalyticsContract f;
    public final GetKeySyncRemoteConfigUseCase g;
    public final AESCryptoUtils h;
    public final RSACryptoUtils i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/security/sync/KeySyncManager$Companion;", "", "", "SUB_URL_SYNC_KEYS", "Ljava/lang/String;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public KeySyncManager(KeyStorageContract keyStorageContract, NetworkManager networkManager, BasicInfoContract basicInfoContract, ClientSecretManager clientSecretManager, CrashlyticsLogger crashlyticsLogger, AnalyticsContract analyticsContract, GetKeySyncRemoteConfigUseCase getKeySyncRemoteConfigUseCase, AESCryptoUtils aESCryptoUtils, RSACryptoUtils rSACryptoUtils) {
        this.f9377a = keyStorageContract;
        this.b = networkManager;
        this.c = basicInfoContract;
        this.d = clientSecretManager;
        this.e = crashlyticsLogger;
        this.f = analyticsContract;
        this.g = getKeySyncRemoteConfigUseCase;
        this.h = aESCryptoUtils;
        this.i = rSACryptoUtils;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x030e  */
    /* JADX WARN: Code duplicated, block: B:124:0x032b A[LOOP:0: B:122:0x0325->B:124:0x032b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x02bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0196  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ca A[Catch: CancellationException -> 0x0061, all -> 0x0214, PHI: r0 r2 r3 r4 r5 r6 r14 r16
      0x01ca: PHI (r0v27 java.lang.Object) = (r0v25 java.lang.Object), (r0v1 java.lang.Object) binds: [B:61:0x01c6, B:31:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r2v18 java.lang.String) = (r2v15 java.lang.String), (r2v26 java.lang.String) binds: [B:61:0x01c6, B:31:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r3v32 java.lang.String) = (r3v27 java.lang.String), (r3v37 java.lang.String) binds: [B:61:0x01c6, B:31:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r4v16 java.lang.String) = (r4v12 java.lang.String), (r4v26 java.lang.String) binds: [B:61:0x01c6, B:31:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r5v26 java.util.List) = (r5v61 java.util.List), (r5v29 java.util.List) binds: [B:61:0x01c6, B:31:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r6v28 ??) = (r6v56 ??), (r6v31 ??) binds: [B:61:0x01c6, B:31:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r14v14 java.lang.String) = (r14v10 java.lang.String), (r14v16 java.lang.String) binds: [B:61:0x01c6, B:31:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x01ca: PHI (r16v11 char) = (r16v6 char), (r16v14 char) binds: [B:61:0x01c6, B:31:0x00c7] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0061, blocks: (B:14:0x004c, B:90:0x02a4, B:92:0x02bb, B:96:0x02c6, B:21:0x007d, B:84:0x0283, B:86:0x0286, B:24:0x009b, B:73:0x0233, B:80:0x0256, B:79:0x024a, B:30:0x00c4, B:63:0x01ca, B:65:0x0211, B:69:0x0219, B:37:0x00f8, B:60:0x019a, B:40:0x0121, B:53:0x0169, B:55:0x016d, B:56:0x017f, B:43:0x0135, B:45:0x0143, B:47:0x0147, B:49:0x014b), top: B:132:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0211 A[Catch: CancellationException -> 0x0061, all -> 0x0214, TryCatch #2 {CancellationException -> 0x0061, blocks: (B:14:0x004c, B:90:0x02a4, B:92:0x02bb, B:96:0x02c6, B:21:0x007d, B:84:0x0283, B:86:0x0286, B:24:0x009b, B:73:0x0233, B:80:0x0256, B:79:0x024a, B:30:0x00c4, B:63:0x01ca, B:65:0x0211, B:69:0x0219, B:37:0x00f8, B:60:0x019a, B:40:0x0121, B:53:0x0169, B:55:0x016d, B:56:0x017f, B:43:0x0135, B:45:0x0143, B:47:0x0147, B:49:0x014b), top: B:132:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0218  */
    /* JADX WARN: Code duplicated, block: B:72:0x0231  */
    /* JADX WARN: Code duplicated, block: B:75:0x0242  */
    /* JADX WARN: Code duplicated, block: B:79:0x024a A[Catch: CancellationException -> 0x0061, all -> 0x02e3, TRY_ENTER, TryCatch #2 {CancellationException -> 0x0061, blocks: (B:14:0x004c, B:90:0x02a4, B:92:0x02bb, B:96:0x02c6, B:21:0x007d, B:84:0x0283, B:86:0x0286, B:24:0x009b, B:73:0x0233, B:80:0x0256, B:79:0x024a, B:30:0x00c4, B:63:0x01ca, B:65:0x0211, B:69:0x0219, B:37:0x00f8, B:60:0x019a, B:40:0x0121, B:53:0x0169, B:55:0x016d, B:56:0x017f, B:43:0x0135, B:45:0x0143, B:47:0x0147, B:49:0x014b), top: B:132:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:83:0x027d  */
    /* JADX WARN: Code duplicated, block: B:89:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c5  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x01ca, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x024a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x005d: MOVE (r11 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:94), block:B:17:0x005a */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00d6: MOVE (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:215), block:B:33:0x00d6 */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v0, types: [app.chalo.security.encryption.storage.KeyStorageContract, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [app.chalo.security.encryption.storage.KeyStorageContract] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r24v0, types: [app.chalo.security.sync.KeySyncManager] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v35, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final Object a(String str, List list, List list2, ContinuationImpl continuationImpl) {
        KeySyncManager$fetchEncryptionKeys$1 keySyncManager$fetchEncryptionKeys$1;
        int i;
        char c;
        String str2;
        String str3;
        ?? r6;
        List list3;
        ?? r7;
        List list4;
        ?? r3;
        String str4;
        ?? r8;
        List list5;
        ?? r4;
        ?? r5;
        ?? r9;
        ?? r10;
        ArrayList arrayList;
        Iterator it;
        String str5;
        List list6;
        List list7;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        ?? r11;
        List list8;
        String str12;
        ?? r2;
        List list9;
        ?? r12;
        ?? r13;
        EncryptedKeysSaveResult encryptedKeysSaveResult;
        List list10;
        String str13;
        Object objC;
        EncryptedKeysSaveResult encryptedKeysSaveResult2;
        ?? r14;
        ?? r15;
        ?? r16;
        List list11;
        ?? r17;
        ?? r18;
        long jLongValue;
        ?? r19;
        EncryptedKeysSaveResult encryptedKeysSaveResult3;
        String str14;
        List list12;
        ?? r20;
        List list13;
        ?? r21;
        int i2;
        ?? r22;
        if (!(continuationImpl instanceof KeySyncManager$fetchEncryptionKeys$1) || (r22 = (i2 = (keySyncManager$fetchEncryptionKeys$1 = (KeySyncManager$fetchEncryptionKeys$1) continuationImpl).label) & Integer.MIN_VALUE) == 0) {
            keySyncManager$fetchEncryptionKeys$1 = new KeySyncManager$fetchEncryptionKeys$1(this, continuationImpl);
            i = i2;
        } else {
            int i3 = i2 - Integer.MIN_VALUE;
            keySyncManager$fetchEncryptionKeys$1.label = i3;
            i = i3;
        }
        KeySyncManager$fetchEncryptionKeys$1 keySyncManager$fetchEncryptionKeys$2 = keySyncManager$fetchEncryptionKeys$1;
        Object objB = keySyncManager$fetchEncryptionKeys$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = keySyncManager$fetchEncryptionKeys$2.label;
        char c2 = 2;
        ?? r110 = this.f9377a;
        AESCryptoUtils aESCryptoUtils = this.h;
        try {
            try {
                try {
                    switch (i4) {
                        case 0:
                            ResultKt.b(objB);
                            String str15 = "";
                            try {
                                String strE = aESCryptoUtils.e();
                                String strC = aESCryptoUtils.c(strE);
                                str15 = "key iv gen";
                                ClientSecretManager clientSecretManager = this.d;
                                str5 = str;
                                try {
                                    keySyncManager$fetchEncryptionKeys$2.L$0 = str5;
                                    list6 = list;
                                    try {
                                        keySyncManager$fetchEncryptionKeys$2.L$1 = list6;
                                        list7 = list2;
                                        try {
                                            keySyncManager$fetchEncryptionKeys$2.L$2 = list7;
                                            keySyncManager$fetchEncryptionKeys$2.L$3 = "key iv gen";
                                            keySyncManager$fetchEncryptionKeys$2.L$4 = strE;
                                            keySyncManager$fetchEncryptionKeys$2.L$5 = strC;
                                            keySyncManager$fetchEncryptionKeys$2.label = 1;
                                            Object objA = clientSecretManager.a(keySyncManager$fetchEncryptionKeys$2);
                                            if (objA != coroutineSingletons) {
                                                str6 = strE;
                                                objB = objA;
                                                str7 = strC;
                                                str4 = str5;
                                                list4 = list6;
                                                r7 = list7;
                                                r3 = str15;
                                                try {
                                                    String str16 = (String) objB;
                                                    c = 1;
                                                    try {
                                                        str8 = r3 + "| got sp key";
                                                        try {
                                                            keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                                            keySyncManager$fetchEncryptionKeys$2.L$1 = list4;
                                                            keySyncManager$fetchEncryptionKeys$2.L$2 = r7;
                                                            keySyncManager$fetchEncryptionKeys$2.L$3 = str8;
                                                            keySyncManager$fetchEncryptionKeys$2.L$4 = str6;
                                                            keySyncManager$fetchEncryptionKeys$2.L$5 = str7;
                                                            keySyncManager$fetchEncryptionKeys$2.label = 2;
                                                            objB = b(str6, str16, str7, list4, r7, keySyncManager$fetchEncryptionKeys$2);
                                                            if (objB != coroutineSingletons) {
                                                                String str17 = str7;
                                                                str9 = str6;
                                                                str10 = str17;
                                                                str11 = str8;
                                                                list8 = list4;
                                                                r11 = r7;
                                                                str12 = str11 + "| data gen";
                                                                EncryptionKeySyncApiRequestModel encryptionKeySyncApiRequestModel = new EncryptionKeySyncApiRequestModel((String) objB);
                                                                keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                                                keySyncManager$fetchEncryptionKeys$2.L$1 = list8;
                                                                keySyncManager$fetchEncryptionKeys$2.L$2 = r11;
                                                                keySyncManager$fetchEncryptionKeys$2.L$3 = str12;
                                                                keySyncManager$fetchEncryptionKeys$2.L$4 = str9;
                                                                keySyncManager$fetchEncryptionKeys$2.L$5 = str10;
                                                                keySyncManager$fetchEncryptionKeys$2.label = 3;
                                                                objB = d(encryptionKeySyncApiRequestModel, keySyncManager$fetchEncryptionKeys$2);
                                                                list4 = list8;
                                                                r7 = r11;
                                                                if (objB != coroutineSingletons) {
                                                                    String str18 = (String) CryptoOperationResultKt.a(aESCryptoUtils.d(str9, ((EncryptionKeySyncApiResponseModel) objB).f9388a, str10));
                                                                    Json json = ChaloJson.b;
                                                                    json.getClass();
                                                                    EncryptionKeyListData encryptionKeyListData = (EncryptionKeyListData) json.b(str18, EncryptionKeyListData.INSTANCE.serializer());
                                                                    r3 = (str12 + "| response receive") + "| list";
                                                                    if (r7 == 0) {
                                                                        r2 = EmptyList.f17557a;
                                                                    } else {
                                                                        r2 = r7;
                                                                    }
                                                                    keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                                                    keySyncManager$fetchEncryptionKeys$2.L$1 = list4;
                                                                    keySyncManager$fetchEncryptionKeys$2.L$2 = r7;
                                                                    keySyncManager$fetchEncryptionKeys$2.L$3 = r3;
                                                                    keySyncManager$fetchEncryptionKeys$2.L$4 = null;
                                                                    keySyncManager$fetchEncryptionKeys$2.L$5 = null;
                                                                    keySyncManager$fetchEncryptionKeys$2.label = 4;
                                                                    objB = r110.c(encryptionKeyListData, list4, r2, keySyncManager$fetchEncryptionKeys$2);
                                                                    if (objB != coroutineSingletons) {
                                                                        list9 = list4;
                                                                        r12 = r7;
                                                                        r13 = r3;
                                                                        try {
                                                                            encryptedKeysSaveResult = (EncryptedKeysSaveResult) objB;
                                                                            Intrinsics.i(encryptedKeysSaveResult, "<this>");
                                                                            list10 = encryptedKeysSaveResult.f9360a;
                                                                            if (list10.isEmpty()) {
                                                                                str13 = "| saved";
                                                                            } else {
                                                                                str13 = "| incomplete save for " + list10;
                                                                            }
                                                                            r13 = r13 + str13;
                                                                            BasicInfoContract basicInfoContract = this.c;
                                                                            keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                                                            keySyncManager$fetchEncryptionKeys$2.L$1 = list9;
                                                                            keySyncManager$fetchEncryptionKeys$2.L$2 = r12;
                                                                            keySyncManager$fetchEncryptionKeys$2.L$3 = r13;
                                                                            keySyncManager$fetchEncryptionKeys$2.L$4 = encryptedKeysSaveResult;
                                                                            keySyncManager$fetchEncryptionKeys$2.L$5 = r110;
                                                                            keySyncManager$fetchEncryptionKeys$2.label = 5;
                                                                            objC = basicInfoContract.c(keySyncManager$fetchEncryptionKeys$2);
                                                                            if (objC != coroutineSingletons) {
                                                                                encryptedKeysSaveResult2 = encryptedKeysSaveResult;
                                                                                objB = objC;
                                                                                r14 = r13;
                                                                                r17 = r12;
                                                                                list11 = list9;
                                                                                r16 = r110;
                                                                                try {
                                                                                    c2 = 2;
                                                                                    try {
                                                                                        jLongValue = ((Number) objB).longValue();
                                                                                        keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                                                                        keySyncManager$fetchEncryptionKeys$2.L$1 = list11;
                                                                                        keySyncManager$fetchEncryptionKeys$2.L$2 = r17;
                                                                                        keySyncManager$fetchEncryptionKeys$2.L$3 = r14;
                                                                                        keySyncManager$fetchEncryptionKeys$2.L$4 = encryptedKeysSaveResult2;
                                                                                        keySyncManager$fetchEncryptionKeys$2.L$5 = null;
                                                                                        keySyncManager$fetchEncryptionKeys$2.label = 6;
                                                                                        if (r16.d(jLongValue, keySyncManager$fetchEncryptionKeys$2) != coroutineSingletons) {
                                                                                            r19 = r17;
                                                                                            encryptedKeysSaveResult3 = encryptedKeysSaveResult2;
                                                                                            str14 = str4;
                                                                                            list13 = list11;
                                                                                            r20 = r14;
                                                                                            try {
                                                                                                String str19 = r20 + "| key sync done " + str14;
                                                                                                if (r19 == 0) {
                                                                                                    try {
                                                                                                        r21 = EmptyList.f17557a;
                                                                                                    } catch (Throwable th) {
                                                                                                        th = th;
                                                                                                        str3 = str14;
                                                                                                        r5 = list13;
                                                                                                        r6 = r19;
                                                                                                        r9 = str19;
                                                                                                        String strN = vo1.n(r9, "| key sync failed ", str3);
                                                                                                        r10 = r6;
                                                                                                        if (r6 == 0) {
                                                                                                            r10 = EmptyList.f17557a;
                                                                                                        }
                                                                                                        ListBuilder listBuilderY = CollectionsKt.y();
                                                                                                        Iterable iterable = (Iterable) r5;
                                                                                                        arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
                                                                                                        it = iterable.iterator();
                                                                                                        while (it.hasNext()) {
                                                                                                            arrayList.add(((EncryptionKeysPurposeType) it.next()).name());
                                                                                                        }
                                                                                                        listBuilderY.addAll(arrayList);
                                                                                                        listBuilderY.addAll((Collection) r10);
                                                                                                        ListBuilder listBuilderG = listBuilderY.g();
                                                                                                        Pair pair = new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th)));
                                                                                                        Pair pair2 = new Pair("requestedKeys", CollectionsKt.O(listBuilderG, null, null, null, null, 63));
                                                                                                        Pair pair3 = new Pair("logMsg", strN);
                                                                                                        Pair[] pairArr = new Pair[3];
                                                                                                        pairArr[0] = pair;
                                                                                                        pairArr[c] = pair2;
                                                                                                        pairArr[c2] = pair3;
                                                                                                        AnalyticsContract.DefaultImpls.a(this.f, "encryption key sync failed", str3, MapsKt.i(pairArr), null, false, 24);
                                                                                                        this.e.i(th);
                                                                                                        return Boolean.FALSE;
                                                                                                    }
                                                                                                } else {
                                                                                                    r21 = r19;
                                                                                                }
                                                                                                c(str19, str14, list13, r21, encryptedKeysSaveResult3);
                                                                                                return Boolean.valueOf(encryptedKeysSaveResult3.f9360a.isEmpty());
                                                                                            } catch (Throwable th2) {
                                                                                                th = th2;
                                                                                                str3 = str14;
                                                                                                r18 = r20;
                                                                                                r15 = r19;
                                                                                                list12 = list13;
                                                                                                r5 = list12;
                                                                                                r9 = r18;
                                                                                                r6 = r15;
                                                                                                String strN2 = vo1.n(r9, "| key sync failed ", str3);
                                                                                                r10 = r6;
                                                                                                if (r6 == 0) {
                                                                                                    r10 = EmptyList.f17557a;
                                                                                                }
                                                                                                ListBuilder listBuilderY2 = CollectionsKt.y();
                                                                                                Iterable iterable2 = (Iterable) r5;
                                                                                                arrayList = new ArrayList(CollectionsKt.v(iterable2, 10));
                                                                                                it = iterable2.iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    arrayList.add(((EncryptionKeysPurposeType) it.next()).name());
                                                                                                }
                                                                                                listBuilderY2.addAll(arrayList);
                                                                                                listBuilderY2.addAll((Collection) r10);
                                                                                                ListBuilder listBuilderG2 = listBuilderY2.g();
                                                                                                Pair pair4 = new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th)));
                                                                                                Pair pair5 = new Pair("requestedKeys", CollectionsKt.O(listBuilderG2, null, null, null, null, 63));
                                                                                                Pair pair6 = new Pair("logMsg", strN2);
                                                                                                Pair[] pairArr2 = new Pair[3];
                                                                                                pairArr2[0] = pair4;
                                                                                                pairArr2[c] = pair5;
                                                                                                pairArr2[c2] = pair6;
                                                                                                AnalyticsContract.DefaultImpls.a(this.f, "encryption key sync failed", str3, MapsKt.i(pairArr2), null, false, 24);
                                                                                                this.e.i(th);
                                                                                                return Boolean.FALSE;
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th3) {
                                                                                        th = th3;
                                                                                        r15 = r17;
                                                                                        r18 = r14;
                                                                                        str3 = str4;
                                                                                        list12 = list11;
                                                                                        r5 = list12;
                                                                                        r9 = r18;
                                                                                        r6 = r15;
                                                                                        String strN3 = vo1.n(r9, "| key sync failed ", str3);
                                                                                        r10 = r6;
                                                                                        if (r6 == 0) {
                                                                                            r10 = EmptyList.f17557a;
                                                                                        }
                                                                                        ListBuilder listBuilderY3 = CollectionsKt.y();
                                                                                        Iterable iterable3 = (Iterable) r5;
                                                                                        arrayList = new ArrayList(CollectionsKt.v(iterable3, 10));
                                                                                        it = iterable3.iterator();
                                                                                        while (it.hasNext()) {
                                                                                            arrayList.add(((EncryptionKeysPurposeType) it.next()).name());
                                                                                        }
                                                                                        listBuilderY3.addAll(arrayList);
                                                                                        listBuilderY3.addAll((Collection) r10);
                                                                                        ListBuilder listBuilderG3 = listBuilderY3.g();
                                                                                        Pair pair7 = new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th)));
                                                                                        Pair pair8 = new Pair("requestedKeys", CollectionsKt.O(listBuilderG3, null, null, null, null, 63));
                                                                                        Pair pair9 = new Pair("logMsg", strN3);
                                                                                        Pair[] pairArr3 = new Pair[3];
                                                                                        pairArr3[0] = pair7;
                                                                                        pairArr3[c] = pair8;
                                                                                        pairArr3[c2] = pair9;
                                                                                        AnalyticsContract.DefaultImpls.a(this.f, "encryption key sync failed", str3, MapsKt.i(pairArr3), null, false, 24);
                                                                                        this.e.i(th);
                                                                                        return Boolean.FALSE;
                                                                                    }
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    c2 = 2;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            r8 = r12;
                                                                            list5 = list9;
                                                                            r4 = r13;
                                                                            str3 = str4;
                                                                            r9 = r4;
                                                                            r5 = list5;
                                                                            r6 = r8;
                                                                            String strN4 = vo1.n(r9, "| key sync failed ", str3);
                                                                            r10 = r6;
                                                                            if (r6 == 0) {
                                                                                r10 = EmptyList.f17557a;
                                                                            }
                                                                            ListBuilder listBuilderY4 = CollectionsKt.y();
                                                                            Iterable iterable4 = (Iterable) r5;
                                                                            arrayList = new ArrayList(CollectionsKt.v(iterable4, 10));
                                                                            it = iterable4.iterator();
                                                                            while (it.hasNext()) {
                                                                                arrayList.add(((EncryptionKeysPurposeType) it.next()).name());
                                                                            }
                                                                            listBuilderY4.addAll(arrayList);
                                                                            listBuilderY4.addAll((Collection) r10);
                                                                            ListBuilder listBuilderG4 = listBuilderY4.g();
                                                                            Pair pair10 = new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th)));
                                                                            Pair pair11 = new Pair("requestedKeys", CollectionsKt.O(listBuilderG4, null, null, null, null, 63));
                                                                            Pair pair12 = new Pair("logMsg", strN4);
                                                                            Pair[] pairArr4 = new Pair[3];
                                                                            pairArr4[0] = pair10;
                                                                            pairArr4[c] = pair11;
                                                                            pairArr4[c2] = pair12;
                                                                            AnalyticsContract.DefaultImpls.a(this.f, "encryption key sync failed", str3, MapsKt.i(pairArr4), null, false, 24);
                                                                            this.e.i(th);
                                                                            return Boolean.FALSE;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            r4 = str8;
                                                            list5 = list4;
                                                            r8 = r7;
                                                            str3 = str4;
                                                            r9 = r4;
                                                            r5 = list5;
                                                            r6 = r8;
                                                            String strN5 = vo1.n(r9, "| key sync failed ", str3);
                                                            r10 = r6;
                                                            if (r6 == 0) {
                                                                r10 = EmptyList.f17557a;
                                                            }
                                                            ListBuilder listBuilderY5 = CollectionsKt.y();
                                                            Iterable iterable5 = (Iterable) r5;
                                                            arrayList = new ArrayList(CollectionsKt.v(iterable5, 10));
                                                            it = iterable5.iterator();
                                                            while (it.hasNext()) {
                                                                arrayList.add(((EncryptionKeysPurposeType) it.next()).name());
                                                            }
                                                            listBuilderY5.addAll(arrayList);
                                                            listBuilderY5.addAll((Collection) r10);
                                                            ListBuilder listBuilderG5 = listBuilderY5.g();
                                                            Pair pair13 = new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th)));
                                                            Pair pair14 = new Pair("requestedKeys", CollectionsKt.O(listBuilderG5, null, null, null, null, 63));
                                                            Pair pair15 = new Pair("logMsg", strN5);
                                                            Pair[] pairArr5 = new Pair[3];
                                                            pairArr5[0] = pair13;
                                                            pairArr5[c] = pair14;
                                                            pairArr5[c2] = pair15;
                                                            AnalyticsContract.DefaultImpls.a(this.f, "encryption key sync failed", str3, MapsKt.i(pairArr5), null, false, 24);
                                                            this.e.i(th);
                                                            return Boolean.FALSE;
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        r4 = r3;
                                                        list5 = list4;
                                                        r8 = r7;
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    c = 1;
                                                    r4 = r3;
                                                    list5 = list4;
                                                    r8 = r7;
                                                    str3 = str4;
                                                    r9 = r4;
                                                    r5 = list5;
                                                    r6 = r8;
                                                    String strN6 = vo1.n(r9, "| key sync failed ", str3);
                                                    r10 = r6;
                                                    if (r6 == 0) {
                                                        r10 = EmptyList.f17557a;
                                                    }
                                                    ListBuilder listBuilderY6 = CollectionsKt.y();
                                                    Iterable iterable6 = (Iterable) r5;
                                                    arrayList = new ArrayList(CollectionsKt.v(iterable6, 10));
                                                    it = iterable6.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(((EncryptionKeysPurposeType) it.next()).name());
                                                    }
                                                    listBuilderY6.addAll(arrayList);
                                                    listBuilderY6.addAll((Collection) r10);
                                                    ListBuilder listBuilderG6 = listBuilderY6.g();
                                                    Pair pair16 = new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th)));
                                                    Pair pair17 = new Pair("requestedKeys", CollectionsKt.O(listBuilderG6, null, null, null, null, 63));
                                                    Pair pair18 = new Pair("logMsg", strN6);
                                                    Pair[] pairArr6 = new Pair[3];
                                                    pairArr6[0] = pair16;
                                                    pairArr6[c] = pair17;
                                                    pairArr6[c2] = pair18;
                                                    AnalyticsContract.DefaultImpls.a(this.f, "encryption key sync failed", str3, MapsKt.i(pairArr6), null, false, 24);
                                                    this.e.i(th);
                                                    return Boolean.FALSE;
                                                }
                                            }
                                            return coroutineSingletons;
                                        } catch (Throwable th9) {
                                            th = th9;
                                            c2 = 2;
                                            c = 1;
                                            str3 = str5;
                                            r5 = list6;
                                            r6 = list7;
                                            r9 = str15;
                                            String strN7 = vo1.n(r9, "| key sync failed ", str3);
                                            r10 = r6;
                                            if (r6 == 0) {
                                                r10 = EmptyList.f17557a;
                                            }
                                            ListBuilder listBuilderY7 = CollectionsKt.y();
                                            Iterable iterable7 = (Iterable) r5;
                                            arrayList = new ArrayList(CollectionsKt.v(iterable7, 10));
                                            it = iterable7.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((EncryptionKeysPurposeType) it.next()).name());
                                            }
                                            listBuilderY7.addAll(arrayList);
                                            listBuilderY7.addAll((Collection) r10);
                                            ListBuilder listBuilderG7 = listBuilderY7.g();
                                            Pair pair19 = new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th)));
                                            Pair pair110 = new Pair("requestedKeys", CollectionsKt.O(listBuilderG7, null, null, null, null, 63));
                                            Pair pair111 = new Pair("logMsg", strN7);
                                            Pair[] pairArr7 = new Pair[3];
                                            pairArr7[0] = pair19;
                                            pairArr7[c] = pair110;
                                            pairArr7[c2] = pair111;
                                            AnalyticsContract.DefaultImpls.a(this.f, "encryption key sync failed", str3, MapsKt.i(pairArr7), null, false, 24);
                                            this.e.i(th);
                                            return Boolean.FALSE;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        list7 = list2;
                                        c2 = 2;
                                        c = 1;
                                        str3 = str5;
                                        r5 = list6;
                                        r6 = list7;
                                        r9 = str15;
                                        String strN8 = vo1.n(r9, "| key sync failed ", str3);
                                        r10 = r6;
                                        if (r6 == 0) {
                                            r10 = EmptyList.f17557a;
                                        }
                                        ListBuilder listBuilderY8 = CollectionsKt.y();
                                        Iterable iterable8 = (Iterable) r5;
                                        arrayList = new ArrayList(CollectionsKt.v(iterable8, 10));
                                        it = iterable8.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((EncryptionKeysPurposeType) it.next()).name());
                                        }
                                        listBuilderY8.addAll(arrayList);
                                        listBuilderY8.addAll((Collection) r10);
                                        ListBuilder listBuilderG8 = listBuilderY8.g();
                                        Pair pair112 = new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th)));
                                        Pair pair113 = new Pair("requestedKeys", CollectionsKt.O(listBuilderG8, null, null, null, null, 63));
                                        Pair pair114 = new Pair("logMsg", strN8);
                                        Pair[] pairArr8 = new Pair[3];
                                        pairArr8[0] = pair112;
                                        pairArr8[c] = pair113;
                                        pairArr8[c2] = pair114;
                                        AnalyticsContract.DefaultImpls.a(this.f, "encryption key sync failed", str3, MapsKt.i(pairArr8), null, false, 24);
                                        this.e.i(th);
                                        return Boolean.FALSE;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    list6 = list;
                                    list7 = list2;
                                    c2 = 2;
                                    c = 1;
                                    str3 = str5;
                                    r5 = list6;
                                    r6 = list7;
                                    r9 = str15;
                                    String strN9 = vo1.n(r9, "| key sync failed ", str3);
                                    r10 = r6;
                                    if (r6 == 0) {
                                        r10 = EmptyList.f17557a;
                                    }
                                    ListBuilder listBuilderY9 = CollectionsKt.y();
                                    Iterable iterable9 = (Iterable) r5;
                                    arrayList = new ArrayList(CollectionsKt.v(iterable9, 10));
                                    it = iterable9.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((EncryptionKeysPurposeType) it.next()).name());
                                    }
                                    listBuilderY9.addAll(arrayList);
                                    listBuilderY9.addAll((Collection) r10);
                                    ListBuilder listBuilderG9 = listBuilderY9.g();
                                    Pair pair115 = new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th)));
                                    Pair pair116 = new Pair("requestedKeys", CollectionsKt.O(listBuilderG9, null, null, null, null, 63));
                                    Pair pair117 = new Pair("logMsg", strN9);
                                    Pair[] pairArr9 = new Pair[3];
                                    pairArr9[0] = pair115;
                                    pairArr9[c] = pair116;
                                    pairArr9[c2] = pair117;
                                    AnalyticsContract.DefaultImpls.a(this.f, "encryption key sync failed", str3, MapsKt.i(pairArr9), null, false, 24);
                                    this.e.i(th);
                                    return Boolean.FALSE;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                str5 = str;
                            }
                            break;
                        case 1:
                            String str20 = (String) keySyncManager$fetchEncryptionKeys$2.L$5;
                            String str21 = (String) keySyncManager$fetchEncryptionKeys$2.L$4;
                            String str22 = (String) keySyncManager$fetchEncryptionKeys$2.L$3;
                            List list14 = (List) keySyncManager$fetchEncryptionKeys$2.L$2;
                            List list15 = (List) keySyncManager$fetchEncryptionKeys$2.L$1;
                            str4 = (String) keySyncManager$fetchEncryptionKeys$2.L$0;
                            ResultKt.b(objB);
                            str7 = str20;
                            str6 = str21;
                            r3 = str22;
                            r7 = list14;
                            list4 = list15;
                            String str110 = (String) objB;
                            c = 1;
                            str8 = r3 + "| got sp key";
                            keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                            keySyncManager$fetchEncryptionKeys$2.L$1 = list4;
                            keySyncManager$fetchEncryptionKeys$2.L$2 = r7;
                            keySyncManager$fetchEncryptionKeys$2.L$3 = str8;
                            keySyncManager$fetchEncryptionKeys$2.L$4 = str6;
                            keySyncManager$fetchEncryptionKeys$2.L$5 = str7;
                            keySyncManager$fetchEncryptionKeys$2.label = 2;
                            objB = b(str6, str110, str7, list4, r7, keySyncManager$fetchEncryptionKeys$2);
                            if (objB != coroutineSingletons) {
                                String str111 = str7;
                                str9 = str6;
                                str10 = str111;
                                str11 = str8;
                                list8 = list4;
                                r11 = r7;
                                str12 = str11 + "| data gen";
                                EncryptionKeySyncApiRequestModel encryptionKeySyncApiRequestModel2 = new EncryptionKeySyncApiRequestModel((String) objB);
                                keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                keySyncManager$fetchEncryptionKeys$2.L$1 = list8;
                                keySyncManager$fetchEncryptionKeys$2.L$2 = r11;
                                keySyncManager$fetchEncryptionKeys$2.L$3 = str12;
                                keySyncManager$fetchEncryptionKeys$2.L$4 = str9;
                                keySyncManager$fetchEncryptionKeys$2.L$5 = str10;
                                keySyncManager$fetchEncryptionKeys$2.label = 3;
                                objB = d(encryptionKeySyncApiRequestModel2, keySyncManager$fetchEncryptionKeys$2);
                                list4 = list8;
                                r7 = r11;
                                if (objB != coroutineSingletons) {
                                    String str112 = (String) CryptoOperationResultKt.a(aESCryptoUtils.d(str9, ((EncryptionKeySyncApiResponseModel) objB).f9388a, str10));
                                    Json json2 = ChaloJson.b;
                                    json2.getClass();
                                    EncryptionKeyListData encryptionKeyListData2 = (EncryptionKeyListData) json2.b(str112, EncryptionKeyListData.INSTANCE.serializer());
                                    r3 = (str12 + "| response receive") + "| list";
                                    if (r7 == 0) {
                                        r2 = EmptyList.f17557a;
                                    } else {
                                        r2 = r7;
                                    }
                                    keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                    keySyncManager$fetchEncryptionKeys$2.L$1 = list4;
                                    keySyncManager$fetchEncryptionKeys$2.L$2 = r7;
                                    keySyncManager$fetchEncryptionKeys$2.L$3 = r3;
                                    keySyncManager$fetchEncryptionKeys$2.L$4 = null;
                                    keySyncManager$fetchEncryptionKeys$2.L$5 = null;
                                    keySyncManager$fetchEncryptionKeys$2.label = 4;
                                    objB = r110.c(encryptionKeyListData2, list4, r2, keySyncManager$fetchEncryptionKeys$2);
                                    if (objB != coroutineSingletons) {
                                        list9 = list4;
                                        r12 = r7;
                                        r13 = r3;
                                        encryptedKeysSaveResult = (EncryptedKeysSaveResult) objB;
                                        Intrinsics.i(encryptedKeysSaveResult, "<this>");
                                        list10 = encryptedKeysSaveResult.f9360a;
                                        if (list10.isEmpty()) {
                                            str13 = "| saved";
                                        } else {
                                            str13 = "| incomplete save for " + list10;
                                        }
                                        r13 = r13 + str13;
                                        BasicInfoContract basicInfoContract2 = this.c;
                                        keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                        keySyncManager$fetchEncryptionKeys$2.L$1 = list9;
                                        keySyncManager$fetchEncryptionKeys$2.L$2 = r12;
                                        keySyncManager$fetchEncryptionKeys$2.L$3 = r13;
                                        keySyncManager$fetchEncryptionKeys$2.L$4 = encryptedKeysSaveResult;
                                        keySyncManager$fetchEncryptionKeys$2.L$5 = r110;
                                        keySyncManager$fetchEncryptionKeys$2.label = 5;
                                        objC = basicInfoContract2.c(keySyncManager$fetchEncryptionKeys$2);
                                        if (objC != coroutineSingletons) {
                                            encryptedKeysSaveResult2 = encryptedKeysSaveResult;
                                            objB = objC;
                                            r14 = r13;
                                            r17 = r12;
                                            list11 = list9;
                                            r16 = r110;
                                            c2 = 2;
                                            jLongValue = ((Number) objB).longValue();
                                            keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                            keySyncManager$fetchEncryptionKeys$2.L$1 = list11;
                                            keySyncManager$fetchEncryptionKeys$2.L$2 = r17;
                                            keySyncManager$fetchEncryptionKeys$2.L$3 = r14;
                                            keySyncManager$fetchEncryptionKeys$2.L$4 = encryptedKeysSaveResult2;
                                            keySyncManager$fetchEncryptionKeys$2.L$5 = null;
                                            keySyncManager$fetchEncryptionKeys$2.label = 6;
                                            if (r16.d(jLongValue, keySyncManager$fetchEncryptionKeys$2) != coroutineSingletons) {
                                                r19 = r17;
                                                encryptedKeysSaveResult3 = encryptedKeysSaveResult2;
                                                str14 = str4;
                                                list13 = list11;
                                                r20 = r14;
                                                String str113 = r20 + "| key sync done " + str14;
                                                if (r19 == 0) {
                                                    r21 = EmptyList.f17557a;
                                                } else {
                                                    r21 = r19;
                                                }
                                                c(str113, str14, list13, r21, encryptedKeysSaveResult3);
                                                return Boolean.valueOf(encryptedKeysSaveResult3.f9360a.isEmpty());
                                            }
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 2:
                            str10 = (String) keySyncManager$fetchEncryptionKeys$2.L$5;
                            String str23 = (String) keySyncManager$fetchEncryptionKeys$2.L$4;
                            String str24 = (String) keySyncManager$fetchEncryptionKeys$2.L$3;
                            List list16 = (List) keySyncManager$fetchEncryptionKeys$2.L$2;
                            List list17 = (List) keySyncManager$fetchEncryptionKeys$2.L$1;
                            str4 = (String) keySyncManager$fetchEncryptionKeys$2.L$0;
                            ResultKt.b(objB);
                            str9 = str23;
                            str11 = str24;
                            r11 = list16;
                            list8 = list17;
                            c = 1;
                            str12 = str11 + "| data gen";
                            EncryptionKeySyncApiRequestModel encryptionKeySyncApiRequestModel3 = new EncryptionKeySyncApiRequestModel((String) objB);
                            keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                            keySyncManager$fetchEncryptionKeys$2.L$1 = list8;
                            keySyncManager$fetchEncryptionKeys$2.L$2 = r11;
                            keySyncManager$fetchEncryptionKeys$2.L$3 = str12;
                            keySyncManager$fetchEncryptionKeys$2.L$4 = str9;
                            keySyncManager$fetchEncryptionKeys$2.L$5 = str10;
                            keySyncManager$fetchEncryptionKeys$2.label = 3;
                            objB = d(encryptionKeySyncApiRequestModel3, keySyncManager$fetchEncryptionKeys$2);
                            list4 = list8;
                            r7 = r11;
                            if (objB != coroutineSingletons) {
                                String str114 = (String) CryptoOperationResultKt.a(aESCryptoUtils.d(str9, ((EncryptionKeySyncApiResponseModel) objB).f9388a, str10));
                                Json json3 = ChaloJson.b;
                                json3.getClass();
                                EncryptionKeyListData encryptionKeyListData3 = (EncryptionKeyListData) json3.b(str114, EncryptionKeyListData.INSTANCE.serializer());
                                r3 = (str12 + "| response receive") + "| list";
                                if (r7 == 0) {
                                    r2 = EmptyList.f17557a;
                                } else {
                                    r2 = r7;
                                }
                                keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                keySyncManager$fetchEncryptionKeys$2.L$1 = list4;
                                keySyncManager$fetchEncryptionKeys$2.L$2 = r7;
                                keySyncManager$fetchEncryptionKeys$2.L$3 = r3;
                                keySyncManager$fetchEncryptionKeys$2.L$4 = null;
                                keySyncManager$fetchEncryptionKeys$2.L$5 = null;
                                keySyncManager$fetchEncryptionKeys$2.label = 4;
                                objB = r110.c(encryptionKeyListData3, list4, r2, keySyncManager$fetchEncryptionKeys$2);
                                if (objB != coroutineSingletons) {
                                    list9 = list4;
                                    r12 = r7;
                                    r13 = r3;
                                    encryptedKeysSaveResult = (EncryptedKeysSaveResult) objB;
                                    Intrinsics.i(encryptedKeysSaveResult, "<this>");
                                    list10 = encryptedKeysSaveResult.f9360a;
                                    if (list10.isEmpty()) {
                                        str13 = "| saved";
                                    } else {
                                        str13 = "| incomplete save for " + list10;
                                    }
                                    r13 = r13 + str13;
                                    BasicInfoContract basicInfoContract3 = this.c;
                                    keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                    keySyncManager$fetchEncryptionKeys$2.L$1 = list9;
                                    keySyncManager$fetchEncryptionKeys$2.L$2 = r12;
                                    keySyncManager$fetchEncryptionKeys$2.L$3 = r13;
                                    keySyncManager$fetchEncryptionKeys$2.L$4 = encryptedKeysSaveResult;
                                    keySyncManager$fetchEncryptionKeys$2.L$5 = r110;
                                    keySyncManager$fetchEncryptionKeys$2.label = 5;
                                    objC = basicInfoContract3.c(keySyncManager$fetchEncryptionKeys$2);
                                    if (objC != coroutineSingletons) {
                                        encryptedKeysSaveResult2 = encryptedKeysSaveResult;
                                        objB = objC;
                                        r14 = r13;
                                        r17 = r12;
                                        list11 = list9;
                                        r16 = r110;
                                        c2 = 2;
                                        jLongValue = ((Number) objB).longValue();
                                        keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                        keySyncManager$fetchEncryptionKeys$2.L$1 = list11;
                                        keySyncManager$fetchEncryptionKeys$2.L$2 = r17;
                                        keySyncManager$fetchEncryptionKeys$2.L$3 = r14;
                                        keySyncManager$fetchEncryptionKeys$2.L$4 = encryptedKeysSaveResult2;
                                        keySyncManager$fetchEncryptionKeys$2.L$5 = null;
                                        keySyncManager$fetchEncryptionKeys$2.label = 6;
                                        if (r16.d(jLongValue, keySyncManager$fetchEncryptionKeys$2) != coroutineSingletons) {
                                            r19 = r17;
                                            encryptedKeysSaveResult3 = encryptedKeysSaveResult2;
                                            str14 = str4;
                                            list13 = list11;
                                            r20 = r14;
                                            String str115 = r20 + "| key sync done " + str14;
                                            if (r19 == 0) {
                                                r21 = EmptyList.f17557a;
                                            } else {
                                                r21 = r19;
                                            }
                                            c(str115, str14, list13, r21, encryptedKeysSaveResult3);
                                            return Boolean.valueOf(encryptedKeysSaveResult3.f9360a.isEmpty());
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 3:
                            str10 = (String) keySyncManager$fetchEncryptionKeys$2.L$5;
                            String str25 = (String) keySyncManager$fetchEncryptionKeys$2.L$4;
                            String str26 = (String) keySyncManager$fetchEncryptionKeys$2.L$3;
                            List list18 = (List) keySyncManager$fetchEncryptionKeys$2.L$2;
                            List list19 = (List) keySyncManager$fetchEncryptionKeys$2.L$1;
                            str4 = (String) keySyncManager$fetchEncryptionKeys$2.L$0;
                            ResultKt.b(objB);
                            str9 = str25;
                            str12 = str26;
                            r7 = list18;
                            list4 = list19;
                            c = 1;
                            String str116 = (String) CryptoOperationResultKt.a(aESCryptoUtils.d(str9, ((EncryptionKeySyncApiResponseModel) objB).f9388a, str10));
                            Json json4 = ChaloJson.b;
                            json4.getClass();
                            EncryptionKeyListData encryptionKeyListData4 = (EncryptionKeyListData) json4.b(str116, EncryptionKeyListData.INSTANCE.serializer());
                            r3 = (str12 + "| response receive") + "| list";
                            if (r7 == 0) {
                                r2 = EmptyList.f17557a;
                            } else {
                                r2 = r7;
                            }
                            keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                            keySyncManager$fetchEncryptionKeys$2.L$1 = list4;
                            keySyncManager$fetchEncryptionKeys$2.L$2 = r7;
                            keySyncManager$fetchEncryptionKeys$2.L$3 = r3;
                            keySyncManager$fetchEncryptionKeys$2.L$4 = null;
                            keySyncManager$fetchEncryptionKeys$2.L$5 = null;
                            keySyncManager$fetchEncryptionKeys$2.label = 4;
                            objB = r110.c(encryptionKeyListData4, list4, r2, keySyncManager$fetchEncryptionKeys$2);
                            if (objB != coroutineSingletons) {
                                list9 = list4;
                                r12 = r7;
                                r13 = r3;
                                encryptedKeysSaveResult = (EncryptedKeysSaveResult) objB;
                                Intrinsics.i(encryptedKeysSaveResult, "<this>");
                                list10 = encryptedKeysSaveResult.f9360a;
                                if (list10.isEmpty()) {
                                    str13 = "| saved";
                                } else {
                                    str13 = "| incomplete save for " + list10;
                                }
                                r13 = r13 + str13;
                                BasicInfoContract basicInfoContract4 = this.c;
                                keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                keySyncManager$fetchEncryptionKeys$2.L$1 = list9;
                                keySyncManager$fetchEncryptionKeys$2.L$2 = r12;
                                keySyncManager$fetchEncryptionKeys$2.L$3 = r13;
                                keySyncManager$fetchEncryptionKeys$2.L$4 = encryptedKeysSaveResult;
                                keySyncManager$fetchEncryptionKeys$2.L$5 = r110;
                                keySyncManager$fetchEncryptionKeys$2.label = 5;
                                objC = basicInfoContract4.c(keySyncManager$fetchEncryptionKeys$2);
                                if (objC != coroutineSingletons) {
                                    encryptedKeysSaveResult2 = encryptedKeysSaveResult;
                                    objB = objC;
                                    r14 = r13;
                                    r17 = r12;
                                    list11 = list9;
                                    r16 = r110;
                                    c2 = 2;
                                    jLongValue = ((Number) objB).longValue();
                                    keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                    keySyncManager$fetchEncryptionKeys$2.L$1 = list11;
                                    keySyncManager$fetchEncryptionKeys$2.L$2 = r17;
                                    keySyncManager$fetchEncryptionKeys$2.L$3 = r14;
                                    keySyncManager$fetchEncryptionKeys$2.L$4 = encryptedKeysSaveResult2;
                                    keySyncManager$fetchEncryptionKeys$2.L$5 = null;
                                    keySyncManager$fetchEncryptionKeys$2.label = 6;
                                    if (r16.d(jLongValue, keySyncManager$fetchEncryptionKeys$2) != coroutineSingletons) {
                                        r19 = r17;
                                        encryptedKeysSaveResult3 = encryptedKeysSaveResult2;
                                        str14 = str4;
                                        list13 = list11;
                                        r20 = r14;
                                        String str117 = r20 + "| key sync done " + str14;
                                        if (r19 == 0) {
                                            r21 = EmptyList.f17557a;
                                        } else {
                                            r21 = r19;
                                        }
                                        c(str117, str14, list13, r21, encryptedKeysSaveResult3);
                                        return Boolean.valueOf(encryptedKeysSaveResult3.f9360a.isEmpty());
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 4:
                            String str27 = (String) keySyncManager$fetchEncryptionKeys$2.L$3;
                            List list20 = (List) keySyncManager$fetchEncryptionKeys$2.L$2;
                            List list21 = (List) keySyncManager$fetchEncryptionKeys$2.L$1;
                            String str28 = (String) keySyncManager$fetchEncryptionKeys$2.L$0;
                            try {
                                ResultKt.b(objB);
                                str4 = str28;
                                c = 1;
                                r12 = list20;
                                r13 = str27;
                                list9 = list21;
                                encryptedKeysSaveResult = (EncryptedKeysSaveResult) objB;
                                Intrinsics.i(encryptedKeysSaveResult, "<this>");
                                list10 = encryptedKeysSaveResult.f9360a;
                                if (list10.isEmpty()) {
                                    str13 = "| saved";
                                } else {
                                    str13 = "| incomplete save for " + list10;
                                }
                                r13 = r13 + str13;
                                BasicInfoContract basicInfoContract5 = this.c;
                                keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                keySyncManager$fetchEncryptionKeys$2.L$1 = list9;
                                keySyncManager$fetchEncryptionKeys$2.L$2 = r12;
                                keySyncManager$fetchEncryptionKeys$2.L$3 = r13;
                                keySyncManager$fetchEncryptionKeys$2.L$4 = encryptedKeysSaveResult;
                                keySyncManager$fetchEncryptionKeys$2.L$5 = r110;
                                keySyncManager$fetchEncryptionKeys$2.label = 5;
                                objC = basicInfoContract5.c(keySyncManager$fetchEncryptionKeys$2);
                                if (objC != coroutineSingletons) {
                                    encryptedKeysSaveResult2 = encryptedKeysSaveResult;
                                    objB = objC;
                                    r14 = r13;
                                    r17 = r12;
                                    list11 = list9;
                                    r16 = r110;
                                    c2 = 2;
                                    jLongValue = ((Number) objB).longValue();
                                    keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                                    keySyncManager$fetchEncryptionKeys$2.L$1 = list11;
                                    keySyncManager$fetchEncryptionKeys$2.L$2 = r17;
                                    keySyncManager$fetchEncryptionKeys$2.L$3 = r14;
                                    keySyncManager$fetchEncryptionKeys$2.L$4 = encryptedKeysSaveResult2;
                                    keySyncManager$fetchEncryptionKeys$2.L$5 = null;
                                    keySyncManager$fetchEncryptionKeys$2.label = 6;
                                    if (r16.d(jLongValue, keySyncManager$fetchEncryptionKeys$2) != coroutineSingletons) {
                                        r19 = r17;
                                        encryptedKeysSaveResult3 = encryptedKeysSaveResult2;
                                        str14 = str4;
                                        list13 = list11;
                                        r20 = r14;
                                        String str118 = r20 + "| key sync done " + str14;
                                        if (r19 == 0) {
                                            r21 = EmptyList.f17557a;
                                        } else {
                                            r21 = r19;
                                        }
                                        c(str118, str14, list13, r21, encryptedKeysSaveResult3);
                                        return Boolean.valueOf(encryptedKeysSaveResult3.f9360a.isEmpty());
                                    }
                                }
                                return coroutineSingletons;
                            } catch (Throwable th13) {
                                th = th13;
                                r15 = list20;
                                c2 = 2;
                                c = 1;
                                str3 = str28;
                                r18 = str27;
                                list12 = list21;
                                r5 = list12;
                                r9 = r18;
                                r6 = r15;
                                String strN10 = vo1.n(r9, "| key sync failed ", str3);
                                r10 = r6;
                                if (r6 == 0) {
                                    r10 = EmptyList.f17557a;
                                }
                                ListBuilder listBuilderY10 = CollectionsKt.y();
                                Iterable iterable10 = (Iterable) r5;
                                arrayList = new ArrayList(CollectionsKt.v(iterable10, 10));
                                it = iterable10.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((EncryptionKeysPurposeType) it.next()).name());
                                }
                                listBuilderY10.addAll(arrayList);
                                listBuilderY10.addAll((Collection) r10);
                                ListBuilder listBuilderG10 = listBuilderY10.g();
                                Pair pair118 = new Pair("error", ThrowableExtKt.a(ThrowableExtKt.b(th)));
                                Pair pair119 = new Pair("requestedKeys", CollectionsKt.O(listBuilderG10, null, null, null, null, 63));
                                Pair pair1110 = new Pair("logMsg", strN10);
                                Pair[] pairArr10 = new Pair[3];
                                pairArr10[0] = pair118;
                                pairArr10[c] = pair119;
                                pairArr10[c2] = pair1110;
                                AnalyticsContract.DefaultImpls.a(this.f, "encryption key sync failed", str3, MapsKt.i(pairArr10), null, false, 24);
                                this.e.i(th);
                                return Boolean.FALSE;
                            }
                        case 5:
                            KeyStorageContract keyStorageContract = (KeyStorageContract) keySyncManager$fetchEncryptionKeys$2.L$5;
                            EncryptedKeysSaveResult encryptedKeysSaveResult4 = (EncryptedKeysSaveResult) keySyncManager$fetchEncryptionKeys$2.L$4;
                            String str29 = (String) keySyncManager$fetchEncryptionKeys$2.L$3;
                            List list22 = (List) keySyncManager$fetchEncryptionKeys$2.L$2;
                            List list23 = (List) keySyncManager$fetchEncryptionKeys$2.L$1;
                            String str30 = (String) keySyncManager$fetchEncryptionKeys$2.L$0;
                            ResultKt.b(objB);
                            encryptedKeysSaveResult2 = encryptedKeysSaveResult4;
                            r17 = list22;
                            list11 = list23;
                            r14 = str29;
                            str4 = str30;
                            c = 1;
                            r16 = keyStorageContract;
                            c2 = 2;
                            jLongValue = ((Number) objB).longValue();
                            keySyncManager$fetchEncryptionKeys$2.L$0 = str4;
                            keySyncManager$fetchEncryptionKeys$2.L$1 = list11;
                            keySyncManager$fetchEncryptionKeys$2.L$2 = r17;
                            keySyncManager$fetchEncryptionKeys$2.L$3 = r14;
                            keySyncManager$fetchEncryptionKeys$2.L$4 = encryptedKeysSaveResult2;
                            keySyncManager$fetchEncryptionKeys$2.L$5 = null;
                            keySyncManager$fetchEncryptionKeys$2.label = 6;
                            if (r16.d(jLongValue, keySyncManager$fetchEncryptionKeys$2) != coroutineSingletons) {
                                r19 = r17;
                                encryptedKeysSaveResult3 = encryptedKeysSaveResult2;
                                str14 = str4;
                                list13 = list11;
                                r20 = r14;
                                String str119 = r20 + "| key sync done " + str14;
                                if (r19 == 0) {
                                    r21 = EmptyList.f17557a;
                                } else {
                                    r21 = r19;
                                }
                                c(str119, str14, list13, r21, encryptedKeysSaveResult3);
                                return Boolean.valueOf(encryptedKeysSaveResult3.f9360a.isEmpty());
                            }
                            return coroutineSingletons;
                        case 6:
                            EncryptedKeysSaveResult encryptedKeysSaveResult5 = (EncryptedKeysSaveResult) keySyncManager$fetchEncryptionKeys$2.L$4;
                            String str31 = (String) keySyncManager$fetchEncryptionKeys$2.L$3;
                            List list24 = (List) keySyncManager$fetchEncryptionKeys$2.L$2;
                            List list25 = (List) keySyncManager$fetchEncryptionKeys$2.L$1;
                            String str32 = (String) keySyncManager$fetchEncryptionKeys$2.L$0;
                            ResultKt.b(objB);
                            r19 = list24;
                            list13 = list25;
                            c2 = 2;
                            c = 1;
                            r20 = str31;
                            str14 = str32;
                            encryptedKeysSaveResult3 = encryptedKeysSaveResult5;
                            String str1110 = r20 + "| key sync done " + str14;
                            if (r19 == 0) {
                                r21 = EmptyList.f17557a;
                            } else {
                                r21 = r19;
                            }
                            c(str1110, str14, list13, r21, encryptedKeysSaveResult3);
                            return Boolean.valueOf(encryptedKeysSaveResult3.f9360a.isEmpty());
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th14) {
                th = th14;
                r7 = r22;
                list4 = list3;
                r3 = -2147483648;
            }
        } catch (Throwable th15) {
            th = th15;
            c2 = 2;
            c = 1;
            str3 = str2;
            r6 = -2147483648;
            r9 = i;
            r5 = r22;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, String str3, List list, List list2, ContinuationImpl continuationImpl) {
        KeySyncManager$getEncryptedData$1 keySyncManager$getEncryptedData$1;
        String aesKey;
        String iv;
        String str4;
        List keysPurposeTypes;
        List list3;
        String str5;
        if (continuationImpl instanceof KeySyncManager$getEncryptedData$1) {
            keySyncManager$getEncryptedData$1 = (KeySyncManager$getEncryptedData$1) continuationImpl;
            int i = keySyncManager$getEncryptedData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                keySyncManager$getEncryptedData$1.label = i - Integer.MIN_VALUE;
            } else {
                keySyncManager$getEncryptedData$1 = new KeySyncManager$getEncryptedData$1(this, continuationImpl);
            }
        } else {
            keySyncManager$getEncryptedData$1 = new KeySyncManager$getEncryptedData$1(this, continuationImpl);
        }
        Object obj = keySyncManager$getEncryptedData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = keySyncManager$getEncryptedData$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            keySyncManager$getEncryptedData$1.L$0 = str;
            keySyncManager$getEncryptedData$1.L$1 = str2;
            keySyncManager$getEncryptedData$1.L$2 = str3;
            keySyncManager$getEncryptedData$1.L$3 = list;
            keySyncManager$getEncryptedData$1.L$4 = list2;
            keySyncManager$getEncryptedData$1.label = 1;
            Object objA = this.g.a(keySyncManager$getEncryptedData$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            aesKey = str;
            iv = str3;
            str4 = str2;
            keysPurposeTypes = list;
            list3 = list2;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list4 = (List) keySyncManager$getEncryptedData$1.L$4;
            keysPurposeTypes = (List) keySyncManager$getEncryptedData$1.L$3;
            String str6 = (String) keySyncManager$getEncryptedData$1.L$2;
            str4 = (String) keySyncManager$getEncryptedData$1.L$1;
            String str7 = (String) keySyncManager$getEncryptedData$1.L$0;
            ResultKt.b(obj);
            list3 = list4;
            iv = str6;
            aesKey = str7;
        }
        int i3 = ((KeySyncRemoteConfig) obj).f9390a + 2;
        EncryptionKeySyncApiData.INSTANCE.getClass();
        Intrinsics.i(aesKey, "aesKey");
        Intrinsics.i(iv, "iv");
        Intrinsics.i(keysPurposeTypes, "keysPurposeTypes");
        List<EncryptionKeysPurposeType> list5 = keysPurposeTypes;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list5, 10));
        for (EncryptionKeysPurposeType encryptionKeysPurposeType : list5) {
            Intrinsics.i(encryptionKeysPurposeType, "<this>");
            int i4 = EncryptionKeySyncApiDataKt.WhenMappings.f9385a[encryptionKeysPurposeType.ordinal()];
            if (i4 == 1) {
                str5 = "chaloPay";
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str5 = "CLDW";
            }
            arrayList.add(str5);
        }
        EncryptionKeySyncApiData encryptionKeySyncApiData = new EncryptionKeySyncApiData(i3, aesKey, iv, CollectionsKt.z(arrayList), list3 != null ? CollectionsKt.z(list3) : null);
        Json json = ChaloJson.b;
        json.getClass();
        return CryptoOperationResultKt.a(this.i.a(json.a(EncryptionKeySyncApiData.INSTANCE.serializer(), encryptionKeySyncApiData), str4));
    }

    public final void c(String str, String str2, List list, List list2, EncryptedKeysSaveResult encryptedKeysSaveResult) {
        ListBuilder listBuilderY = CollectionsKt.y();
        List list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((EncryptionKeysPurposeType) it.next()).name());
        }
        listBuilderY.addAll(arrayList);
        listBuilderY.addAll(list2);
        AnalyticsContract.DefaultImpls.a(this.f, "encryption key sync success", str2, MapsKt.i(new Pair("logMsg", str), new Pair("requestedKeys", CollectionsKt.O(listBuilderY.g(), null, null, null, null, 63)), new Pair("keysMissingOnSave", CollectionsKt.O(encryptedKeysSaveResult.f9360a, null, null, null, null, 63))), null, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(EncryptionKeySyncApiRequestModel encryptionKeySyncApiRequestModel, ContinuationImpl continuationImpl) throws NetworkSuccessResponseParseException {
        KeySyncManager$sendSyncRequest$1 keySyncManager$sendSyncRequest$1;
        if (continuationImpl instanceof KeySyncManager$sendSyncRequest$1) {
            keySyncManager$sendSyncRequest$1 = (KeySyncManager$sendSyncRequest$1) continuationImpl;
            int i = keySyncManager$sendSyncRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                keySyncManager$sendSyncRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                keySyncManager$sendSyncRequest$1 = new KeySyncManager$sendSyncRequest$1(this, continuationImpl);
            }
        } else {
            keySyncManager$sendSyncRequest$1 = new KeySyncManager$sendSyncRequest$1(this, continuationImpl);
        }
        Object objC = keySyncManager$sendSyncRequest$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = keySyncManager$sendSyncRequest$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            NetworkRequestBuilder networkRequestBuilderD = this.b.d();
            networkRequestBuilderD.j("mticketing/v2/wallet/keys/sync");
            networkRequestBuilderD.f(HttpRequestType.POST);
            networkRequestBuilderD.b();
            networkRequestBuilderD.c();
            networkRequestBuilderD.f6519a.p = 3;
            Json json = ChaloJson.b;
            json.getClass();
            networkRequestBuilderD.i(json.a(EncryptionKeySyncApiRequestModel.INSTANCE.serializer(), encryptionKeySyncApiRequestModel));
            ChaloRequest chaloRequestE = networkRequestBuilderD.e();
            keySyncManager$sendSyncRequest$1.label = 1;
            objC = chaloRequestE.c(keySyncManager$sendSyncRequest$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        NetworkResponse networkResponse = (NetworkResponse) objC;
        Json json2 = ChaloJson.b;
        NetworkSuccessResponseParseException networkSuccessResponseParseException = new NetworkSuccessResponseParseException("Response json is either null or empty");
        Object objB = null;
        try {
            String str = networkResponse.c;
            if (str != null) {
                json2.getClass();
                objB = json2.b(str, BuiltinSerializersKt.c(EncryptionKeySyncApiResponseModel.INSTANCE.serializer()));
            }
        } catch (Exception e) {
            networkSuccessResponseParseException = new NetworkSuccessResponseParseException(NetworkResponse.Companion.a(e.getMessage(), Reflection.a(EncryptionKeySyncApiResponseModel.class).f(), networkResponse.c));
            networkResponse.g.b(networkSuccessResponseParseException);
        }
        if (objB != null) {
            return objB;
        }
        throw networkSuccessResponseParseException;
    }
}
