package app.chalo.sos.official;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.ClusterConfig;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.cityprovider.CityProvider;
import defpackage.uf0;
import defpackage.xs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/sos/official/GetOfficialSosContactsUseCase;", "", "IndexedEntry", "EligibleEntryRows", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetOfficialSosContactsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f9444a;
    public final CityProvider b;
    public final GetClusterConfigForCityUseCase c;
    public final BasicInfoContract d;
    public final ChaloBuildConfig e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/sos/official/GetOfficialSosContactsUseCase$Companion;", "", "", "MAX_OFFICIAL_CONTACT_ROWS", "I", "", "KSRTC_CLUSTER_FLAG", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/official/GetOfficialSosContactsUseCase$EligibleEntryRows;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EligibleEntryRows {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9445a;
        public final int b;
        public final List c;

        public EligibleEntryRows(int i, int i2, List list) {
            this.f9445a = i;
            this.b = i2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EligibleEntryRows)) {
                return false;
            }
            EligibleEntryRows eligibleEntryRows = (EligibleEntryRows) obj;
            return this.f9445a == eligibleEntryRows.f9445a && this.b == eligibleEntryRows.b && Intrinsics.d(this.c, eligibleEntryRows.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (((this.f9445a * 31) + this.b) * 31);
        }

        public final String toString() {
            return xs.l(uf0.s(this.f9445a, this.b, "EligibleEntryRows(index=", ", priority=", ", rows="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/sos/official/GetOfficialSosContactsUseCase$IndexedEntry;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IndexedEntry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9446a;
        public final SosOfficialContactEntryApiModel b;

        public IndexedEntry(int i, SosOfficialContactEntryApiModel entry) {
            Intrinsics.i(entry, "entry");
            this.f9446a = i;
            this.b = entry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IndexedEntry)) {
                return false;
            }
            IndexedEntry indexedEntry = (IndexedEntry) obj;
            return this.f9446a == indexedEntry.f9446a && Intrinsics.d(this.b, indexedEntry.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9446a * 31);
        }

        public final String toString() {
            return "IndexedEntry(index=" + this.f9446a + ", entry=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9447a;

        static {
            int[] iArr = new int[ProductFlavor.values().length];
            try {
                iArr[ProductFlavor.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductFlavor.BETA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductFlavor.ALPHA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9447a = iArr;
        }
    }

    public GetOfficialSosContactsUseCase(ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider, GetClusterConfigForCityUseCase getClusterConfigForCityUseCase, BasicInfoContract basicInfoContract, ChaloBuildConfig chaloBuildConfig, SosPhoneNumberNormalizer sosPhoneNumberNormalizer) {
        this.f9444a = chaloConfigFeature;
        this.b = cityProvider;
        this.c = getClusterConfigForCityUseCase;
        this.d = basicInfoContract;
        this.e = chaloBuildConfig;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        GetOfficialSosContactsUseCase$getClusterConfigOrNull$1 getOfficialSosContactsUseCase$getClusterConfigOrNull$1;
        if (continuationImpl instanceof GetOfficialSosContactsUseCase$getClusterConfigOrNull$1) {
            getOfficialSosContactsUseCase$getClusterConfigOrNull$1 = (GetOfficialSosContactsUseCase$getClusterConfigOrNull$1) continuationImpl;
            int i = getOfficialSosContactsUseCase$getClusterConfigOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOfficialSosContactsUseCase$getClusterConfigOrNull$1.label = i - Integer.MIN_VALUE;
            } else {
                getOfficialSosContactsUseCase$getClusterConfigOrNull$1 = new GetOfficialSosContactsUseCase$getClusterConfigOrNull$1(this, continuationImpl);
            }
        } else {
            getOfficialSosContactsUseCase$getClusterConfigOrNull$1 = new GetOfficialSosContactsUseCase$getClusterConfigOrNull$1(this, continuationImpl);
        }
        Object objA = getOfficialSosContactsUseCase$getClusterConfigOrNull$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getOfficialSosContactsUseCase$getClusterConfigOrNull$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                GetClusterConfigForCityUseCase getClusterConfigForCityUseCase = this.c;
                getOfficialSosContactsUseCase$getClusterConfigOrNull$1.label = 1;
                objA = getClusterConfigForCityUseCase.a(str, getOfficialSosContactsUseCase$getClusterConfigOrNull$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
            }
            return (ClusterConfig) objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Object b(Continuation continuation) {
        String str;
        if (this.d.f()) {
            str = "sosOfficialContactConfigDebug";
        } else {
            int i = WhenMappings.f9447a[this.e.m().ordinal()];
            if (i == 1) {
                str = "sosOfficialContactConfigProd";
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "sosOfficialContactConfigBeta";
            }
        }
        return this.f9444a.a(str, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b3 A[Catch: CancellationException -> 0x003a, all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:13:0x0035, B:76:0x0140, B:71:0x0120, B:73:0x0126, B:79:0x014c, B:80:0x0159, B:82:0x015f, B:87:0x0180, B:85:0x0173, B:88:0x0184, B:98:0x01af, B:100:0x01b3, B:101:0x01b6, B:91:0x0199, B:93:0x019e, B:95:0x01a4, B:78:0x0148, B:20:0x0049, B:37:0x0083, B:39:0x008b, B:41:0x008e, B:44:0x00a1, B:46:0x00a5, B:48:0x00a8, B:49:0x00bd, B:51:0x00c3, B:53:0x00cb, B:54:0x00d7, B:55:0x00da, B:56:0x00db, B:58:0x00e6, B:60:0x00fb, B:62:0x00ff, B:65:0x0106, B:69:0x0110, B:70:0x0114, B:34:0x0077), top: B:108:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x01b6 A[Catch: CancellationException -> 0x003a, all -> 0x01b9, TRY_LEAVE, TryCatch #1 {all -> 0x01b9, blocks: (B:13:0x0035, B:76:0x0140, B:71:0x0120, B:73:0x0126, B:79:0x014c, B:80:0x0159, B:82:0x015f, B:87:0x0180, B:85:0x0173, B:88:0x0184, B:98:0x01af, B:100:0x01b3, B:101:0x01b6, B:91:0x0199, B:93:0x019e, B:95:0x01a4, B:78:0x0148, B:20:0x0049, B:37:0x0083, B:39:0x008b, B:41:0x008e, B:44:0x00a1, B:46:0x00a5, B:48:0x00a8, B:49:0x00bd, B:51:0x00c3, B:53:0x00cb, B:54:0x00d7, B:55:0x00da, B:56:0x00db, B:58:0x00e6, B:60:0x00fb, B:62:0x00ff, B:65:0x0106, B:69:0x0110, B:70:0x0114, B:34:0x0077), top: B:108:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01af A[EDGE_INSN: B:114:0x01af->B:98:0x01af BREAK  A[LOOP:1: B:92:0x019d->B:97:0x01ae, LOOP_LABEL: LOOP:1: B:92:0x019d->B:97:0x01ae], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0126 A[Catch: CancellationException -> 0x003a, all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:13:0x0035, B:76:0x0140, B:71:0x0120, B:73:0x0126, B:79:0x014c, B:80:0x0159, B:82:0x015f, B:87:0x0180, B:85:0x0173, B:88:0x0184, B:98:0x01af, B:100:0x01b3, B:101:0x01b6, B:91:0x0199, B:93:0x019e, B:95:0x01a4, B:78:0x0148, B:20:0x0049, B:37:0x0083, B:39:0x008b, B:41:0x008e, B:44:0x00a1, B:46:0x00a5, B:48:0x00a8, B:49:0x00bd, B:51:0x00c3, B:53:0x00cb, B:54:0x00d7, B:55:0x00da, B:56:0x00db, B:58:0x00e6, B:60:0x00fb, B:62:0x00ff, B:65:0x0106, B:69:0x0110, B:70:0x0114, B:34:0x0077), top: B:108:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x014c A[Catch: CancellationException -> 0x003a, all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:13:0x0035, B:76:0x0140, B:71:0x0120, B:73:0x0126, B:79:0x014c, B:80:0x0159, B:82:0x015f, B:87:0x0180, B:85:0x0173, B:88:0x0184, B:98:0x01af, B:100:0x01b3, B:101:0x01b6, B:91:0x0199, B:93:0x019e, B:95:0x01a4, B:78:0x0148, B:20:0x0049, B:37:0x0083, B:39:0x008b, B:41:0x008e, B:44:0x00a1, B:46:0x00a5, B:48:0x00a8, B:49:0x00bd, B:51:0x00c3, B:53:0x00cb, B:54:0x00d7, B:55:0x00da, B:56:0x00db, B:58:0x00e6, B:60:0x00fb, B:62:0x00ff, B:65:0x0106, B:69:0x0110, B:70:0x0114, B:34:0x0077), top: B:108:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x015f A[Catch: CancellationException -> 0x003a, all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:13:0x0035, B:76:0x0140, B:71:0x0120, B:73:0x0126, B:79:0x014c, B:80:0x0159, B:82:0x015f, B:87:0x0180, B:85:0x0173, B:88:0x0184, B:98:0x01af, B:100:0x01b3, B:101:0x01b6, B:91:0x0199, B:93:0x019e, B:95:0x01a4, B:78:0x0148, B:20:0x0049, B:37:0x0083, B:39:0x008b, B:41:0x008e, B:44:0x00a1, B:46:0x00a5, B:48:0x00a8, B:49:0x00bd, B:51:0x00c3, B:53:0x00cb, B:54:0x00d7, B:55:0x00da, B:56:0x00db, B:58:0x00e6, B:60:0x00fb, B:62:0x00ff, B:65:0x0106, B:69:0x0110, B:70:0x0114, B:34:0x0077), top: B:108:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0171  */
    /* JADX WARN: Code duplicated, block: B:85:0x0173 A[Catch: CancellationException -> 0x003a, all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:13:0x0035, B:76:0x0140, B:71:0x0120, B:73:0x0126, B:79:0x014c, B:80:0x0159, B:82:0x015f, B:87:0x0180, B:85:0x0173, B:88:0x0184, B:98:0x01af, B:100:0x01b3, B:101:0x01b6, B:91:0x0199, B:93:0x019e, B:95:0x01a4, B:78:0x0148, B:20:0x0049, B:37:0x0083, B:39:0x008b, B:41:0x008e, B:44:0x00a1, B:46:0x00a5, B:48:0x00a8, B:49:0x00bd, B:51:0x00c3, B:53:0x00cb, B:54:0x00d7, B:55:0x00da, B:56:0x00db, B:58:0x00e6, B:60:0x00fb, B:62:0x00ff, B:65:0x0106, B:69:0x0110, B:70:0x0114, B:34:0x0077), top: B:108:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0198  */
    /* JADX WARN: Code duplicated, block: B:91:0x0199 A[Catch: CancellationException -> 0x003a, all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:13:0x0035, B:76:0x0140, B:71:0x0120, B:73:0x0126, B:79:0x014c, B:80:0x0159, B:82:0x015f, B:87:0x0180, B:85:0x0173, B:88:0x0184, B:98:0x01af, B:100:0x01b3, B:101:0x01b6, B:91:0x0199, B:93:0x019e, B:95:0x01a4, B:78:0x0148, B:20:0x0049, B:37:0x0083, B:39:0x008b, B:41:0x008e, B:44:0x00a1, B:46:0x00a5, B:48:0x00a8, B:49:0x00bd, B:51:0x00c3, B:53:0x00cb, B:54:0x00d7, B:55:0x00da, B:56:0x00db, B:58:0x00e6, B:60:0x00fb, B:62:0x00ff, B:65:0x0106, B:69:0x0110, B:70:0x0114, B:34:0x0077), top: B:108:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01a4 A[Catch: CancellationException -> 0x003a, all -> 0x01b9, TryCatch #1 {all -> 0x01b9, blocks: (B:13:0x0035, B:76:0x0140, B:71:0x0120, B:73:0x0126, B:79:0x014c, B:80:0x0159, B:82:0x015f, B:87:0x0180, B:85:0x0173, B:88:0x0184, B:98:0x01af, B:100:0x01b3, B:101:0x01b6, B:91:0x0199, B:93:0x019e, B:95:0x01a4, B:78:0x0148, B:20:0x0049, B:37:0x0083, B:39:0x008b, B:41:0x008e, B:44:0x00a1, B:46:0x00a5, B:48:0x00a8, B:49:0x00bd, B:51:0x00c3, B:53:0x00cb, B:54:0x00d7, B:55:0x00da, B:56:0x00db, B:58:0x00e6, B:60:0x00fb, B:62:0x00ff, B:65:0x0106, B:69:0x0110, B:70:0x0114, B:34:0x0077), top: B:108:0x0021 }] */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013d, code lost:
    
        if (r13 == r1) goto L75;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x013d -> B:76:0x0140). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.sos.official.GetOfficialSosContactsUseCase.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0197  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:120:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[LOOP:0: B:94:0x015d->B:122:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:? A[LOOP:3: B:78:0x0124->B:133:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:? A[LOOP:6: B:35:0x0081->B:142:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:77:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x012a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0147  */
    /* JADX WARN: Code duplicated, block: B:93:0x0159  */
    /* JADX WARN: Code duplicated, block: B:96:0x0163  */
    public final Object d(SosOfficialContactEntryApiModel sosOfficialContactEntryApiModel, String str, ContinuationImpl continuationImpl) {
        GetOfficialSosContactsUseCase$isEligible$1 getOfficialSosContactsUseCase$isEligible$1;
        SosOfficialContactEligibilityApiModel sosOfficialContactEligibilityApiModel;
        List list;
        Iterator it;
        ClusterConfig clusterConfig;
        List list2;
        Iterator it2;
        List list3;
        Iterator it3;
        ArrayList arrayList;
        Iterator it4;
        String upperCase;
        List list4;
        Iterator it5;
        if (continuationImpl instanceof GetOfficialSosContactsUseCase$isEligible$1) {
            getOfficialSosContactsUseCase$isEligible$1 = (GetOfficialSosContactsUseCase$isEligible$1) continuationImpl;
            int i = getOfficialSosContactsUseCase$isEligible$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOfficialSosContactsUseCase$isEligible$1.label = i - Integer.MIN_VALUE;
            } else {
                getOfficialSosContactsUseCase$isEligible$1 = new GetOfficialSosContactsUseCase$isEligible$1(this, continuationImpl);
            }
        } else {
            getOfficialSosContactsUseCase$isEligible$1 = new GetOfficialSosContactsUseCase$isEligible$1(this, continuationImpl);
        }
        Object objA = getOfficialSosContactsUseCase$isEligible$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getOfficialSosContactsUseCase$isEligible$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            sosOfficialContactEligibilityApiModel = sosOfficialContactEntryApiModel.f;
            if (sosOfficialContactEligibilityApiModel == null) {
                return Boolean.FALSE;
            }
            List list5 = sosOfficialContactEligibilityApiModel.c;
            List list6 = sosOfficialContactEligibilityApiModel.b;
            List list7 = sosOfficialContactEligibilityApiModel.f9452a;
            boolean z = list7 instanceof Collection;
            if (z && list7.isEmpty()) {
                list2 = list6;
                if (!(list2 instanceof Collection)) {
                    it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            list3 = list5;
                            if (list3 instanceof Collection) {
                                it3 = list3.iterator();
                                do {
                                    if (it3.hasNext()) {
                                    }
                                } while (StringsKt.F((String) it3.next()));
                            } else {
                                it3 = list3.iterator();
                                do {
                                    if (it3.hasNext()) {
                                    }
                                } while (StringsKt.F((String) it3.next()));
                            }
                            return Boolean.FALSE;
                        }
                        if (!StringsKt.F((String) it2.next())) {
                        }
                    }
                } else {
                    it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            list3 = list5;
                            if (list3 instanceof Collection) {
                                it3 = list3.iterator();
                                do {
                                    if (it3.hasNext()) {
                                    }
                                } while (StringsKt.F((String) it3.next()));
                            } else {
                                it3 = list3.iterator();
                                do {
                                    if (it3.hasNext()) {
                                    }
                                } while (StringsKt.F((String) it3.next()));
                            }
                            return Boolean.FALSE;
                        }
                        if (!StringsKt.F((String) it2.next())) {
                        }
                    }
                }
            } else {
                Iterator it6 = list7.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        list2 = list6;
                        if (!(list2 instanceof Collection) && list2.isEmpty()) {
                            list3 = list5;
                            if (list3 instanceof Collection) {
                                it3 = list3.iterator();
                                do {
                                    if (it3.hasNext()) {
                                    }
                                } while (StringsKt.F((String) it3.next()));
                            } else {
                                it3 = list3.iterator();
                                do {
                                    if (it3.hasNext()) {
                                    }
                                } while (StringsKt.F((String) it3.next()));
                            }
                            return Boolean.FALSE;
                        }
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                list3 = list5;
                                if ((list3 instanceof Collection) || !list3.isEmpty()) {
                                    it3 = list3.iterator();
                                    do {
                                        if (it3.hasNext()) {
                                        }
                                    } while (StringsKt.F((String) it3.next()));
                                }
                                return Boolean.FALSE;
                            }
                            if (!StringsKt.F((String) it2.next())) {
                            }
                        }
                    } else if (!StringsKt.F((String) it6.next())) {
                    }
                }
            }
            if (!z || !list7.isEmpty()) {
                Iterator it7 = list7.iterator();
                while (it7.hasNext()) {
                    if (StringsKt.x(StringsKt.u0((String) it7.next()).toString(), str, true)) {
                        return Boolean.TRUE;
                    }
                }
            }
            List list8 = list6;
            if ((list8 instanceof Collection) && list8.isEmpty()) {
                list = list5;
                if (list instanceof Collection) {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!StringsKt.F((String) it.next())) {
                                getOfficialSosContactsUseCase$isEligible$1.L$0 = sosOfficialContactEligibilityApiModel;
                                getOfficialSosContactsUseCase$isEligible$1.label = 1;
                                objA = a(str, getOfficialSosContactsUseCase$isEligible$1);
                                if (objA == obj) {
                                    return obj;
                                }
                            }
                        }
                    }
                } else {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!StringsKt.F((String) it.next())) {
                                getOfficialSosContactsUseCase$isEligible$1.L$0 = sosOfficialContactEligibilityApiModel;
                                getOfficialSosContactsUseCase$isEligible$1.label = 1;
                                objA = a(str, getOfficialSosContactsUseCase$isEligible$1);
                                if (objA == obj) {
                                    return obj;
                                }
                            }
                        }
                    }
                }
                clusterConfig = null;
            } else {
                Iterator it8 = list8.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        list = list5;
                        if ((list instanceof Collection) || !list.isEmpty()) {
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!StringsKt.F((String) it.next())) {
                                    }
                                }
                            }
                        }
                        clusterConfig = null;
                    } else if (!StringsKt.F((String) it8.next())) {
                    }
                    getOfficialSosContactsUseCase$isEligible$1.L$0 = sosOfficialContactEligibilityApiModel;
                    getOfficialSosContactsUseCase$isEligible$1.label = 1;
                    objA = a(str, getOfficialSosContactsUseCase$isEligible$1);
                    if (objA == obj) {
                        return obj;
                    }
                }
            }
            if (clusterConfig != null) {
                list4 = sosOfficialContactEligibilityApiModel.b;
                if ((list4 instanceof Collection) || !list4.isEmpty()) {
                    it5 = list4.iterator();
                    while (it5.hasNext()) {
                        if (StringsKt.x(StringsKt.u0((String) it5.next()).toString(), StringsKt.u0(clusterConfig.f2346a).toString(), true)) {
                            return Boolean.TRUE;
                        }
                    }
                }
            }
            List list9 = sosOfficialContactEligibilityApiModel.c;
            arrayList = new ArrayList();
            it4 = list9.iterator();
            while (it4.hasNext()) {
                upperCase = StringsKt.u0((String) it4.next()).toString().toUpperCase(Locale.ROOT);
                Intrinsics.h(upperCase, "toUpperCase(...)");
                if (StringsKt.F(upperCase)) {
                    upperCase = null;
                }
                if (upperCase != null) {
                    arrayList.add(upperCase);
                }
            }
            return Boolean.valueOf((arrayList.contains("KSRTC") || clusterConfig == null || !clusterConfig.c) ? false : true);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sosOfficialContactEligibilityApiModel = (SosOfficialContactEligibilityApiModel) getOfficialSosContactsUseCase$isEligible$1.L$0;
        ResultKt.b(objA);
        clusterConfig = (ClusterConfig) objA;
        if (clusterConfig != null) {
            list4 = sosOfficialContactEligibilityApiModel.b;
            if (list4 instanceof Collection) {
                it5 = list4.iterator();
                while (it5.hasNext()) {
                    if (StringsKt.x(StringsKt.u0((String) it5.next()).toString(), StringsKt.u0(clusterConfig.f2346a).toString(), true)) {
                        return Boolean.TRUE;
                    }
                }
            } else {
                it5 = list4.iterator();
                while (it5.hasNext()) {
                    if (StringsKt.x(StringsKt.u0((String) it5.next()).toString(), StringsKt.u0(clusterConfig.f2346a).toString(), true)) {
                        return Boolean.TRUE;
                    }
                }
            }
        }
        List list10 = sosOfficialContactEligibilityApiModel.c;
        arrayList = new ArrayList();
        it4 = list10.iterator();
        while (it4.hasNext()) {
            upperCase = StringsKt.u0((String) it4.next()).toString().toUpperCase(Locale.ROOT);
            Intrinsics.h(upperCase, "toUpperCase(...)");
            if (StringsKt.F(upperCase)) {
                upperCase = null;
            }
            if (upperCase != null) {
                arrayList.add(upperCase);
            }
        }
        return Boolean.valueOf((arrayList.contains("KSRTC") || clusterConfig == null || !clusterConfig.c) ? false : true);
    }

    public final List e(SosOfficialContactEntryApiModel sosOfficialContactEntryApiModel) {
        String string;
        String str = sosOfficialContactEntryApiModel.f9454a;
        if (str == null || (string = StringsKt.u0(str).toString()) == null) {
            return EmptyList.f17557a;
        }
        List list = sosOfficialContactEntryApiModel.g;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            OfficialSosContactRow officialSosContactRow = null;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            SosOfficialContactNumberApiModel sosOfficialContactNumberApiModel = (SosOfficialContactNumberApiModel) obj;
            String str2 = sosOfficialContactNumberApiModel.f9456a;
            String string2 = str2 != null ? StringsKt.u0(str2).toString() : null;
            if (string2 == null) {
                string2 = "";
            }
            String str3 = sosOfficialContactNumberApiModel.b;
            String string3 = str3 != null ? StringsKt.u0(str3).toString() : null;
            String str4 = string3 != null ? string3 : "";
            String strA = SosPhoneNumberNormalizer.a(str4);
            if (!StringsKt.F(string2) && strA != null) {
                officialSosContactRow = new OfficialSosContactRow(string, uf0.k(i, string, ":"), string2, str4, strA);
            }
            if (officialSosContactRow != null) {
                arrayList.add(officialSosContactRow);
            }
            i = i2;
        }
        return CollectionsKt.x0(arrayList, 3);
    }
}
