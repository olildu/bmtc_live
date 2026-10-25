package app.chalo.livetracking.frameworklivetracking;

import androidx.compose.runtime.ComposerKt;
import app.chalo.livetracking.routedetails.data.model.app.response.VehicleLiveGpsLocationResponseAppModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/livetracking/routedetails/data/model/app/response/VehicleLiveGpsLocationResponseAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getLiveGpsLocationForBus$gpsDataFlow$1", f = "LiveTrackingDataManagerImpl.kt", l = {ComposerKt.providerValuesKey, 209, 214}, m = "invokeSuspend", v = 1)
final class LiveTrackingDataManagerImpl$getLiveGpsLocationForBus$gpsDataFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super VehicleLiveGpsLocationResponseAppModel>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $agencyName;
    final /* synthetic */ String $busNumber;
    final /* synthetic */ long $delay;
    final /* synthetic */ int $repeatCount;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ LiveTrackingDataManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveTrackingDataManagerImpl$getLiveGpsLocationForBus$gpsDataFlow$1(int i, LiveTrackingDataManagerImpl liveTrackingDataManagerImpl, String str, String str2, long j, Continuation continuation) {
        super(2, continuation);
        this.$repeatCount = i;
        this.this$0 = liveTrackingDataManagerImpl;
        this.$busNumber = str;
        this.$agencyName = str2;
        this.$delay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LiveTrackingDataManagerImpl$getLiveGpsLocationForBus$gpsDataFlow$1 liveTrackingDataManagerImpl$getLiveGpsLocationForBus$gpsDataFlow$1 = new LiveTrackingDataManagerImpl$getLiveGpsLocationForBus$gpsDataFlow$1(this.$repeatCount, this.this$0, this.$busNumber, this.$agencyName, this.$delay, continuation);
        liveTrackingDataManagerImpl$getLiveGpsLocationForBus$gpsDataFlow$1.L$0 = obj;
        return liveTrackingDataManagerImpl$getLiveGpsLocationForBus$gpsDataFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LiveTrackingDataManagerImpl$getLiveGpsLocationForBus$gpsDataFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0084  */
    /* JADX WARN: Code duplicated, block: B:18:0x009d  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ef  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r6, r18) == r1) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00e1 -> B:8:0x002a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getLiveGpsLocationForBus$gpsDataFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
