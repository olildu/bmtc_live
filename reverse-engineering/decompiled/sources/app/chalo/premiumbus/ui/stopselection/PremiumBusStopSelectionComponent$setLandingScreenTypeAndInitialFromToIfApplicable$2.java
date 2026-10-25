package app.chalo.premiumbus.ui.stopselection;

import app.chalo.location.LatLng;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2", f = "PremiumBusStopSelectionComponent.kt", l = {533, 540, 541}, m = "invokeSuspend", v = 1)
final class PremiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $isCurrentLocationAvailable;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ PremiumBusStopSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2(PremiumBusStopSelectionComponent premiumBusStopSelectionComponent, Ref.BooleanRef booleanRef, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusStopSelectionComponent;
        this.$isCurrentLocationAvailable = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2(this.this$0, this.$isCurrentLocationAvailable, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusStopSelectionComponent$setLandingScreenTypeAndInitialFromToIfApplicable$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00be  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LatLng latLng;
        String str;
        PremiumBusStopSelectionComponent premiumBusStopSelectionComponent;
        String str2;
        String str3;
        Object objB;
        String str4;
        String str5;
        String str6;
        PremiumBusStopSelectionComponent premiumBusStopSelectionComponent2;
        LatLng latLng2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FetchCurrentLocationUseCase fetchCurrentLocationUseCase = this.this$0.p;
            this.label = 1;
            obj = fetchCurrentLocationUseCase.a(false, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                str2 = (String) this.L$3;
                str = (String) this.L$2;
                premiumBusStopSelectionComponent = (PremiumBusStopSelectionComponent) this.L$1;
                latLng = (LatLng) this.L$0;
                ResultKt.b(obj);
                str3 = (String) obj;
                this.L$0 = latLng;
                this.L$1 = premiumBusStopSelectionComponent;
                this.L$2 = str;
                this.L$3 = str2;
                this.L$4 = str3;
                this.label = 3;
                objB = this.this$0.u.b(StringEnum.MY_LOCATION, new Object[0], this);
                if (objB != coroutineSingletons) {
                    String str7 = str;
                    str4 = str3;
                    obj = objB;
                    str5 = str2;
                    str6 = str7;
                    premiumBusStopSelectionComponent2 = premiumBusStopSelectionComponent;
                    latLng2 = latLng;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str8 = (String) this.L$4;
            String str9 = (String) this.L$3;
            String str10 = (String) this.L$2;
            PremiumBusStopSelectionComponent premiumBusStopSelectionComponent3 = (PremiumBusStopSelectionComponent) this.L$1;
            LatLng latLng3 = (LatLng) this.L$0;
            ResultKt.b(obj);
            str5 = str9;
            str6 = str10;
            premiumBusStopSelectionComponent2 = premiumBusStopSelectionComponent3;
            latLng2 = latLng3;
            str4 = str8;
        }
        premiumBusStopSelectionComponent2.E = new PBStopPlaceSelectedAppModel(str6, str5, str4, (String) obj, latLng2, PremiumBusSelectedLocationType.LOCATION);
        return Unit.f17538a;
        LatLng latLng4 = (LatLng) obj;
        if (latLng4 != null) {
            this.$isCurrentLocationAvailable.element = true;
            PremiumBusStopSelectionComponent premiumBusStopSelectionComponent4 = this.this$0;
            String str11 = latLng4.f5134a + "," + latLng4.b;
            this.L$0 = latLng4;
            this.L$1 = premiumBusStopSelectionComponent4;
            this.L$2 = str11;
            this.L$3 = "";
            this.label = 2;
            Object objB2 = this.this$0.u.b(StringEnum.MY_LOCATION, new Object[0], this);
            if (objB2 != coroutineSingletons) {
                latLng = latLng4;
                obj = objB2;
                str = str11;
                premiumBusStopSelectionComponent = premiumBusStopSelectionComponent4;
                str2 = "";
                str3 = (String) obj;
                this.L$0 = latLng;
                this.L$1 = premiumBusStopSelectionComponent;
                this.L$2 = str;
                this.L$3 = str2;
                this.L$4 = str3;
                this.label = 3;
                objB = this.this$0.u.b(StringEnum.MY_LOCATION, new Object[0], this);
                if (objB != coroutineSingletons) {
                    String str12 = str;
                    str4 = str3;
                    obj = objB;
                    str5 = str2;
                    str6 = str12;
                    premiumBusStopSelectionComponent2 = premiumBusStopSelectionComponent;
                    latLng2 = latLng;
                    premiumBusStopSelectionComponent2.E = new PBStopPlaceSelectedAppModel(str6, str5, str4, (String) obj, latLng2, PremiumBusSelectedLocationType.LOCATION);
                }
            }
            return coroutineSingletons;
        }
        return Unit.f17538a;
    }
}
