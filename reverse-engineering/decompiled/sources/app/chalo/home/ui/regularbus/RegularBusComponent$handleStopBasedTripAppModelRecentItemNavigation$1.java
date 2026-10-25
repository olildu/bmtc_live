package app.chalo.home.ui.regularbus;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.recent.model.app.RecentStopBasedTripAppModel;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.scenes.args.TripPlannerArgs;
import app.chalo.usecase.IsCityEnabledForLiveTrackingUseCase;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$handleStopBasedTripAppModelRecentItemNavigation$1", f = "RegularBusComponent.kt", l = {1053}, m = "invokeSuspend", v = 1)
final class RegularBusComponent$handleStopBasedTripAppModelRecentItemNavigation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RecentStopBasedTripAppModel $recentItem;
    int label;
    final /* synthetic */ RegularBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusComponent$handleStopBasedTripAppModelRecentItemNavigation$1(RegularBusComponent regularBusComponent, RecentStopBasedTripAppModel recentStopBasedTripAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = regularBusComponent;
        this.$recentItem = recentStopBasedTripAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegularBusComponent$handleStopBasedTripAppModelRecentItemNavigation$1(this.this$0, this.$recentItem, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RegularBusComponent$handleStopBasedTripAppModelRecentItemNavigation$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strA;
        String strA2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            IsCityEnabledForLiveTrackingUseCase isCityEnabledForLiveTrackingUseCase = this.this$0.T;
            this.label = 1;
            obj = isCityEnabledForLiveTrackingUseCase.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            ChaloNavigationManager chaloNavigationManager = this.this$0.M;
            ChaloJson chaloJson = ChaloJson.f6455a;
            StopAppModel stopAppModel = this.$recentItem.g;
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel = new UniversalSearchDescriptiveLocationAppModel(stopAppModel.e, stopAppModel.b, stopAppModel.f1727a, "searchPartnerChaloStop", stopAppModel.c);
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA = json.a(UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer(), universalSearchDescriptiveLocationAppModel);
            } catch (Exception unused) {
                strA = null;
            }
            ChaloJson chaloJson2 = ChaloJson.f6455a;
            RegularBusComponent regularBusComponent = this.this$0;
            StopAppModel stopAppModel2 = this.$recentItem.h;
            regularBusComponent.getClass();
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2 = new UniversalSearchDescriptiveLocationAppModel(stopAppModel2.e, stopAppModel2.b, stopAppModel2.f1727a, "searchPartnerChaloStop", stopAppModel2.c);
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                strA2 = json2.a(UniversalSearchDescriptiveLocationAppModel.INSTANCE.serializer(), universalSearchDescriptiveLocationAppModel2);
            } catch (Exception unused2) {
                strA2 = null;
            }
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TripPlannerArgs.ResultsScreen(strA, strA2), null, null, 6));
        } else {
            try {
                ChaloNavigationManager chaloNavigationManager2 = this.this$0.M;
                StopAppModel stopAppModel3 = this.$recentItem.g;
                stopAppModel3.getClass();
                Json json3 = ChaloJson.b;
                json3.getClass();
                StopAppModel.Companion companion = StopAppModel.INSTANCE;
                String strA3 = json3.a(companion.serializer(), stopAppModel3);
                StopAppModel stopAppModel4 = this.$recentItem.h;
                stopAppModel4.getClass();
                json3.getClass();
                chaloNavigationManager2.b(new ChaloNavigationRequest.Navigate(new TicketPurchaseArgs.StopSelectionArgs.ONDC(strA3, json3.a(companion.serializer(), stopAppModel4)), null, null, 6));
            } catch (Exception e) {
                this.this$0.E.i(e);
                e.printStackTrace();
            }
        }
        return Unit.f17538a;
    }
}
