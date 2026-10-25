package app.chalo.livetracking.tripplanner.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.GroupTicketConfigEligibilityHelper;
import app.chalo.contract.MetroBookingFlowType;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.contract.ProductInfoContract;
import app.chalo.domain.GetInstantTicketFeatureConfigUseCase;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/BuildEligibleGroupTicketJourneyModelUseCase;", "", "Companion", "BookableLegCandidate", "ResolvedJourneyLegCandidate", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildEligibleGroupTicketJourneyModelUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f4691a;
    public final ProductInfoContract b;
    public final GetInstantTicketFeatureConfigUseCase c;
    public final BasicInfoContract d;
    public final ProductBookingHelper e;
    public final GroupTicketConfigEligibilityHelper f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/BuildEligibleGroupTicketJourneyModelUseCase$BookableLegCandidate;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BookableLegCandidate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloTransitMode f4692a;
        public final TripPlannerLegAppModel b;
        public final MetroBookingFlowType c;

        public BookableLegCandidate(ChaloTransitMode mode, TripPlannerLegAppModel tripPlannerLegAppModel, MetroBookingFlowType metroBookingFlowType) {
            Intrinsics.i(mode, "mode");
            this.f4692a = mode;
            this.b = tripPlannerLegAppModel;
            this.c = metroBookingFlowType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookableLegCandidate)) {
                return false;
            }
            BookableLegCandidate bookableLegCandidate = (BookableLegCandidate) obj;
            return this.f4692a == bookableLegCandidate.f4692a && Intrinsics.d(this.b, bookableLegCandidate.b) && this.c == bookableLegCandidate.c;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f4692a.hashCode() * 31)) * 31;
            MetroBookingFlowType metroBookingFlowType = this.c;
            return iHashCode + (metroBookingFlowType == null ? 0 : metroBookingFlowType.hashCode());
        }

        public final String toString() {
            return "BookableLegCandidate(mode=" + this.f4692a + ", leg=" + this.b + ", metroBookingFlowType=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/BuildEligibleGroupTicketJourneyModelUseCase$Companion;", "", "", "TAG", "Ljava/lang/String;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/BuildEligibleGroupTicketJourneyModelUseCase$ResolvedJourneyLegCandidate;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResolvedJourneyLegCandidate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4693a;
        public final String b;
        public final int c;
        public final TripPlannerLegAppModel d;

        public ResolvedJourneyLegCandidate(int i, int i2, TripPlannerLegAppModel tripPlannerLegAppModel, String str) {
            this.f4693a = i;
            this.b = str;
            this.c = i2;
            this.d = tripPlannerLegAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResolvedJourneyLegCandidate)) {
                return false;
            }
            ResolvedJourneyLegCandidate resolvedJourneyLegCandidate = (ResolvedJourneyLegCandidate) obj;
            return this.f4693a == resolvedJourneyLegCandidate.f4693a && Intrinsics.d(this.b, resolvedJourneyLegCandidate.b) && this.c == resolvedJourneyLegCandidate.c && Intrinsics.d(this.d, resolvedJourneyLegCandidate.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((nf1.e(this.f4693a * 31, 31, this.b) + this.c) * 31);
        }

        public final String toString() {
            StringBuilder sbP = nf1.p(this.f4693a, "ResolvedJourneyLegCandidate(sequenceNumber=", ", productSubType=", this.b, ", sharedTicketGroupIndex=");
            sbP.append(this.c);
            sbP.append(", leg=");
            sbP.append(this.d);
            sbP.append(")");
            return sbP.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4694a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[MetroBookingFlowType.values().length];
            try {
                iArr[MetroBookingFlowType.ONDC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MetroBookingFlowType.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4694a = iArr;
            int[] iArr2 = new int[ChaloTransitMode.values().length];
            try {
                iArr2[ChaloTransitMode.BUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ChaloTransitMode.METRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChaloTransitMode.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChaloTransitMode.CAB.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ChaloTransitMode.FERRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ChaloTransitMode.MONORAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ChaloTransitMode.TRAIN.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ChaloTransitMode.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
        }
    }

    public BuildEligibleGroupTicketJourneyModelUseCase(CityProvider cityProvider, ProductInfoContract productInfoContract, GetInstantTicketFeatureConfigUseCase getInstantTicketFeatureConfigUseCase, BasicInfoContract basicInfoContract, ProductBookingHelper productBookingHelper, GroupTicketConfigEligibilityHelper groupTicketConfigEligibilityHelper) {
        this.f4691a = cityProvider;
        this.b = productInfoContract;
        this.c = getInstantTicketFeatureConfigUseCase;
        this.d = basicInfoContract;
        this.e = productBookingHelper;
        this.f = groupTicketConfigEligibilityHelper;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ea A[LOOP:6: B:91:0x0267->B:120:0x02ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x016c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0173  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x034b, code lost:
    
        if (r2 == r4) goto L128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel r22, java.util.Map r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.tripplanner.domain.BuildEligibleGroupTicketJourneyModelUseCase.a(app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel, java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
