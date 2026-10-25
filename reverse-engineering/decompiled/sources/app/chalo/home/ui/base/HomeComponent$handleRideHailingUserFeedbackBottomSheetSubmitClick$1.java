package app.chalo.home.ui.base;

import app.chalo.ridehailing.data.app.RideHailingBookingFeedbackRequestAppModel;
import app.chalo.ridehailing.feedback.UserFeedbackRatingData;
import app.chalo.ridehailing.feedback.UserFeedbackReasonData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$handleRideHailingUserFeedbackBottomSheetSubmitClick$1", f = "HomeComponent.kt", l = {2686, 2688, 2702, 2715}, m = "invokeSuspend", v = 1)
final class HomeComponent$handleRideHailingUserFeedbackBottomSheetSubmitClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookingId;
    final /* synthetic */ String $city;
    final /* synthetic */ String $comment;
    final /* synthetic */ List<RideHailingBookingFeedbackRequestAppModel> $requestData;
    final /* synthetic */ UserFeedbackRatingData $selectedFeedback;
    final /* synthetic */ UserFeedbackReasonData $selectedReason;
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$handleRideHailingUserFeedbackBottomSheetSubmitClick$1(HomeComponent homeComponent, List list, String str, String str2, UserFeedbackRatingData userFeedbackRatingData, UserFeedbackReasonData userFeedbackReasonData, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeComponent;
        this.$requestData = list;
        this.$bookingId = str;
        this.$city = str2;
        this.$selectedFeedback = userFeedbackRatingData;
        this.$selectedReason = userFeedbackReasonData;
        this.$comment = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$handleRideHailingUserFeedbackBottomSheetSubmitClick$1(this.this$0, this.$requestData, this.$bookingId, this.$city, this.$selectedFeedback, this.$selectedReason, this.$comment, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$handleRideHailingUserFeedbackBottomSheetSubmitClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
    
        if (r14.c(r1, r13) == r0) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent$handleRideHailingUserFeedbackBottomSheetSubmitClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
