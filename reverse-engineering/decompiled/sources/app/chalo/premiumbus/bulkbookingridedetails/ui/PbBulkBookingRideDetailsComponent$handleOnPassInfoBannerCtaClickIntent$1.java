package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$handleOnPassInfoBannerCtaClickIntent$1", f = "PbBulkBookingRideDetailsComponent.kt", l = {Constants.MINIMAL_ERROR_STATUS_CODE}, m = "invokeSuspend", v = 1)
final class PbBulkBookingRideDetailsComponent$handleOnPassInfoBannerCtaClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PbBulkBookingRideDetailsViewIntent.OnPassInfoBannerCtaClickIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ PbBulkBookingRideDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent$handleOnPassInfoBannerCtaClickIntent$1(PbBulkBookingRideDetailsViewIntent.OnPassInfoBannerCtaClickIntent onPassInfoBannerCtaClickIntent, PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = onPassInfoBannerCtaClickIntent;
        this.this$0 = pbBulkBookingRideDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbBulkBookingRideDetailsComponent$handleOnPassInfoBannerCtaClickIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbBulkBookingRideDetailsComponent$handleOnPassInfoBannerCtaClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PbPassInfoBannerCtaType pbPassInfoBannerCtaType = this.$intent.f6926a;
            if (Intrinsics.d(pbPassInfoBannerCtaType, PbPassInfoBannerCtaType.ChangeDate.f6936a)) {
                PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent = this.this$0;
                BuildersKt.d(pbBulkBookingRideDetailsComponent.j, null, null, new PbBulkBookingRideDetailsComponent$handleDateChangeOptionClick$1(pbBulkBookingRideDetailsComponent, null), 3);
            } else if (pbPassInfoBannerCtaType instanceof PbPassInfoBannerCtaType.CustomerSupport) {
                this.this$0.y.d(((PbPassInfoBannerCtaType.CustomerSupport) this.$intent.f6926a).f6937a);
            } else {
                if (pbPassInfoBannerCtaType != null) {
                    throw new NoWhenBranchMatchedException();
                }
                PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent2 = this.this$0;
                KotlinToastManager kotlinToastManager2 = pbBulkBookingRideDetailsComponent2.x;
                this.L$0 = kotlinToastManager2;
                this.label = 1;
                obj = pbBulkBookingRideDetailsComponent2.r.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                kotlinToastManager = kotlinToastManager2;
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager = (KotlinToastManager) this.L$0;
        ResultKt.b(obj);
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        return Unit.f17538a;
    }
}
