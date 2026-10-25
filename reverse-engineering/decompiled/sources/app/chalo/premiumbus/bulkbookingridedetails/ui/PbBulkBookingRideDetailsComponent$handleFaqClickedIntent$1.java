package app.chalo.premiumbus.bulkbookingridedetails.ui;

import androidx.compose.runtime.ComposerKt;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.WebViewArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$handleFaqClickedIntent$1", f = "PbBulkBookingRideDetailsComponent.kt", l = {ComposerKt.providerValuesKey}, m = "invokeSuspend", v = 1)
final class PbBulkBookingRideDetailsComponent$handleFaqClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PbBulkBookingRideDetailsViewIntent.FaqClickedIntent $intent;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PbBulkBookingRideDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent$handleFaqClickedIntent$1(PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, PbBulkBookingRideDetailsViewIntent.FaqClickedIntent faqClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pbBulkBookingRideDetailsComponent;
        this.$intent = faqClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbBulkBookingRideDetailsComponent$handleFaqClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbBulkBookingRideDetailsComponent$handleFaqClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        ChaloNavigationManager chaloNavigationManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            AnalyticsContractImplKt.b(this.this$0.s, "pb pass detail screen faq btn clicked", Source.PASS_SELECTION_ACTIVITY, MapsKt.d(), false, 24);
            String str2 = this.$intent.f6921a;
            PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent = this.this$0;
            ChaloNavigationManager chaloNavigationManager2 = pbBulkBookingRideDetailsComponent.z;
            this.L$0 = chaloNavigationManager2;
            this.L$1 = str2;
            this.label = 1;
            Object objB = pbBulkBookingRideDetailsComponent.r.b(StringEnum.FAQS, new Object[0], this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str2;
            obj = objB;
            chaloNavigationManager = chaloNavigationManager2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            chaloNavigationManager = (ChaloNavigationManager) this.L$0;
            ResultKt.b(obj);
        }
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str, (String) obj, false, false), null, null, 6));
        return Unit.f17538a;
    }
}
