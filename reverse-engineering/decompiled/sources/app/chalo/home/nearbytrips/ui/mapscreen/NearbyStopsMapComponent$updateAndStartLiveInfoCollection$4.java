package app.chalo.home.nearbytrips.ui.mapscreen;

import app.chalo.extensions.FlowCollectWithStatus;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerResult;
import app.chalo.location.LatLng;
import app.chalo.stoptripdetails.data.model.StopTripDetailsDataHolder;
import app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "resultList", "", "Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataManagerResult;", "timerStatus", "Lapp/chalo/extensions/FlowCollectWithStatus$TimerStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$updateAndStartLiveInfoCollection$4", f = "NearbyStopsMapComponent.kt", l = {514}, m = "invokeSuspend", v = 1)
final class NearbyStopsMapComponent$updateAndStartLiveInfoCollection$4 extends SuspendLambda implements Function3<List<? extends NearbyTripsDataManagerResult>, FlowCollectWithStatus.TimerStatus, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $hasReceivedEtaOnce;
    final /* synthetic */ LocationSummaryPayloadResponseAppModel $payload;
    final /* synthetic */ LatLng $requestedLatLng;
    final /* synthetic */ Map<String, StopTripDetailsDataHolder> $staticInfoMap;
    int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ NearbyStopsMapComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3146a;

        static {
            int[] iArr = new int[FlowCollectWithStatus.TimerStatus.values().length];
            try {
                iArr[FlowCollectWithStatus.TimerStatus.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowCollectWithStatus.TimerStatus.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowCollectWithStatus.TimerStatus.TIME_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3146a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyStopsMapComponent$updateAndStartLiveInfoCollection$4(Ref.BooleanRef booleanRef, LatLng latLng, LocationSummaryPayloadResponseAppModel locationSummaryPayloadResponseAppModel, NearbyStopsMapComponent nearbyStopsMapComponent, Map map, Continuation continuation) {
        super(3, continuation);
        this.$hasReceivedEtaOnce = booleanRef;
        this.$requestedLatLng = latLng;
        this.$payload = locationSummaryPayloadResponseAppModel;
        this.this$0 = nearbyStopsMapComponent;
        this.$staticInfoMap = map;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NearbyStopsMapComponent$updateAndStartLiveInfoCollection$4 nearbyStopsMapComponent$updateAndStartLiveInfoCollection$4 = new NearbyStopsMapComponent$updateAndStartLiveInfoCollection$4(this.$hasReceivedEtaOnce, this.$requestedLatLng, this.$payload, this.this$0, this.$staticInfoMap, (Continuation) obj3);
        nearbyStopsMapComponent$updateAndStartLiveInfoCollection$4.L$0 = (List) obj;
        nearbyStopsMapComponent$updateAndStartLiveInfoCollection$4.L$1 = (FlowCollectWithStatus.TimerStatus) obj2;
        return nearbyStopsMapComponent$updateAndStartLiveInfoCollection$4.invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0115  */
    /* JADX WARN: Code duplicated, block: B:39:0x0124  */
    /* JADX WARN: Code duplicated, block: B:41:0x0134  */
    /* JADX WARN: Code duplicated, block: B:44:0x013d  */
    /* JADX WARN: Code duplicated, block: B:73:0x019f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c5 -> B:46:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0115 -> B:38:0x0117). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x019f -> B:74:0x01a4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$updateAndStartLiveInfoCollection$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
