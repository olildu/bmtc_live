package app.chalo.livetracking.tripplanner.ui.details;

import app.chalo.livetracking.tripplanner.data.models.app.GroupTicketJourneyModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.GroupTicketLegSelectionArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent$handleCombinedBuyTicketClickedIntent$1", f = "TripPlannerDetailsComponent.kt", l = {322, 328}, m = "invokeSuspend", v = 1)
final class TripPlannerDetailsComponent$handleCombinedBuyTicketClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TripPlannerDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerDetailsComponent$handleCombinedBuyTicketClickedIntent$1(TripPlannerDetailsComponent tripPlannerDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerDetailsComponent$handleCombinedBuyTicketClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerDetailsComponent$handleCombinedBuyTicketClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strA;
        KotlinToastManager kotlinToastManager;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                kotlinToastManager2 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                KotlinToastManagerKt.a(kotlinToastManager2, (String) obj, ToastLength.LONG);
                return unit;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
            return unit;
        }
        ResultKt.b(obj);
        TripPlannerDetailsComponent tripPlannerDetailsComponent = this.this$0;
        GroupTicketJourneyModel groupTicketJourneyModel = tripPlannerDetailsComponent.M;
        if (groupTicketJourneyModel == null) {
            KotlinToastManager kotlinToastManager3 = tripPlannerDetailsComponent.B;
            this.L$0 = kotlinToastManager3;
            this.label = 1;
            obj = tripPlannerDetailsComponent.r.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (obj != coroutineSingletons) {
                kotlinToastManager2 = kotlinToastManager3;
                KotlinToastManagerKt.a(kotlinToastManager2, (String) obj, ToastLength.LONG);
                return unit;
            }
        } else {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA = json.a(GroupTicketJourneyModel.INSTANCE.serializer(), groupTicketJourneyModel);
            } catch (Exception unused) {
                strA = null;
            }
            if (strA != null) {
                this.this$0.A.b(new ChaloNavigationRequest.Navigate(new GroupTicketLegSelectionArgs(strA), null, null, 6));
                return unit;
            }
            TripPlannerDetailsComponent tripPlannerDetailsComponent2 = this.this$0;
            KotlinToastManager kotlinToastManager4 = tripPlannerDetailsComponent2.B;
            this.L$0 = kotlinToastManager4;
            this.label = 2;
            obj = tripPlannerDetailsComponent2.r.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (obj != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager4;
                KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
