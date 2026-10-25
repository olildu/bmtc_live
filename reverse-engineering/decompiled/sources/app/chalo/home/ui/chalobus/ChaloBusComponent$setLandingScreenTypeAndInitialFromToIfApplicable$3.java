package app.chalo.home.ui.chalobus;

import app.chalo.location.LatLng;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import defpackage.tg;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$3", f = "ChaloBusComponent.kt", l = {1160, 1165, 1166}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$3(ChaloBusComponent chaloBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$setLandingScreenTypeAndInitialFromToIfApplicable$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LatLng latLng;
        String str;
        String str2;
        String str3;
        Object objB;
        String str4;
        String str5;
        String str6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FetchCurrentLocationUseCase fetchCurrentLocationUseCase = this.this$0.n;
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
                str2 = (String) this.L$2;
                str = (String) this.L$1;
                latLng = (LatLng) this.L$0;
                ResultKt.b(obj);
                str3 = (String) obj;
                this.L$0 = latLng;
                this.L$1 = str;
                this.L$2 = str2;
                this.L$3 = str3;
                this.label = 3;
                objB = this.this$0.s.b(StringEnum.MY_LOCATION, new Object[0], this);
                if (objB != coroutineSingletons) {
                    String str7 = str;
                    str4 = str3;
                    obj = objB;
                    str5 = str2;
                    str6 = str7;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str8 = (String) this.L$3;
            String str9 = (String) this.L$2;
            String str10 = (String) this.L$1;
            LatLng latLng2 = (LatLng) this.L$0;
            ResultKt.b(obj);
            str5 = str9;
            str6 = str10;
            latLng = latLng2;
            str4 = str8;
        }
        this.this$0.E0(new tg(new PBStopPlaceSelectedAppModel(str6, str5, str4, (String) obj, latLng, PremiumBusSelectedLocationType.LOCATION), 2));
        return Unit.f17538a;
        LatLng latLng3 = (LatLng) obj;
        if (latLng3 != null) {
            String str11 = latLng3.f5134a + "," + latLng3.b;
            this.L$0 = latLng3;
            this.L$1 = str11;
            this.L$2 = "";
            this.label = 2;
            Object objB2 = this.this$0.s.b(StringEnum.MY_LOCATION, new Object[0], this);
            if (objB2 != coroutineSingletons) {
                latLng = latLng3;
                obj = objB2;
                str = str11;
                str2 = "";
                str3 = (String) obj;
                this.L$0 = latLng;
                this.L$1 = str;
                this.L$2 = str2;
                this.L$3 = str3;
                this.label = 3;
                objB = this.this$0.s.b(StringEnum.MY_LOCATION, new Object[0], this);
                if (objB != coroutineSingletons) {
                    String str12 = str;
                    str4 = str3;
                    obj = objB;
                    str5 = str2;
                    str6 = str12;
                    this.this$0.E0(new tg(new PBStopPlaceSelectedAppModel(str6, str5, str4, (String) obj, latLng, PremiumBusSelectedLocationType.LOCATION), 2));
                }
            }
            return coroutineSingletons;
        }
        return Unit.f17538a;
    }
}
