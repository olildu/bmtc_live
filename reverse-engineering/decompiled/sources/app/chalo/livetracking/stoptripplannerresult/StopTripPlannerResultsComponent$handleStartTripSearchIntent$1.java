package app.chalo.livetracking.stoptripplannerresult;

import com.google.firebase.messaging.ServiceStarter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent$handleStartTripSearchIntent$1", f = "StopTripPlannerResultsComponent.kt", l = {439, 466, 463, 478, 473, ServiceStarter.ERROR_UNKNOWN}, m = "invokeSuspend", v = 1)
final class StopTripPlannerResultsComponent$handleStartTripSearchIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ StopTripPlannerResultsComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4564a;

        static {
            int[] iArr = new int[StopTripPlannerTabType.values().length];
            try {
                iArr[StopTripPlannerTabType.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StopTripPlannerTabType.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4564a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTripPlannerResultsComponent$handleStartTripSearchIntent$1(StopTripPlannerResultsComponent stopTripPlannerResultsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopTripPlannerResultsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StopTripPlannerResultsComponent$handleStartTripSearchIntent$1 stopTripPlannerResultsComponent$handleStartTripSearchIntent$1 = new StopTripPlannerResultsComponent$handleStartTripSearchIntent$1(this.this$0, continuation);
        stopTripPlannerResultsComponent$handleStartTripSearchIntent$1.L$0 = obj;
        return stopTripPlannerResultsComponent$handleStartTripSearchIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopTripPlannerResultsComponent$handleStartTripSearchIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:104:0x0301  */
    /* JADX WARN: Code duplicated, block: B:107:0x0310  */
    /* JADX WARN: Code duplicated, block: B:110:0x031d  */
    /* JADX WARN: Code duplicated, block: B:113:0x032b  */
    /* JADX WARN: Code duplicated, block: B:116:0x033a  */
    /* JADX WARN: Code duplicated, block: B:119:0x036f  */
    /* JADX WARN: Code duplicated, block: B:121:0x037a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0388  */
    /* JADX WARN: Code duplicated, block: B:126:0x039d  */
    /* JADX WARN: Code duplicated, block: B:128:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:131:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:134:0x03d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:138:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:140:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:18:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:19:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:22:0x011f  */
    /* JADX WARN: Code duplicated, block: B:25:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x013c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0156  */
    /* JADX WARN: Code duplicated, block: B:30:0x0168  */
    /* JADX WARN: Code duplicated, block: B:37:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:41:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:55:0x020e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0216  */
    /* JADX WARN: Code duplicated, block: B:58:0x021a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0222  */
    /* JADX WARN: Code duplicated, block: B:66:0x0233  */
    /* JADX WARN: Code duplicated, block: B:67:0x0238  */
    /* JADX WARN: Code duplicated, block: B:69:0x023b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0240  */
    /* JADX WARN: Code duplicated, block: B:73:0x0249  */
    /* JADX WARN: Code duplicated, block: B:75:0x0253  */
    /* JADX WARN: Code duplicated, block: B:78:0x026f  */
    /* JADX WARN: Code duplicated, block: B:83:0x029d  */
    /* JADX WARN: Code duplicated, block: B:87:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:91:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e5  */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03d1, code lost:
    
        if (app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent.H0(r8.this$0, (app.chalo.utils.ChaloUseCaseResult.Success) r0, r8) == r13) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0180, code lost:
    
        if (r2 == r13) goto L133;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent$handleStartTripSearchIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
