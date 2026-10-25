package app.chalo.instantticket.ui.faredetails;

import app.chalo.instantticket.data.model.app.response.PassengerDetailAppModel;
import app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import defpackage.hq0;
import defpackage.w20;
import java.util.LinkedHashMap;
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
@DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.FareDetailsComponent$handleDecreasePassengerCountClickedIntent$1", f = "FareDetailsComponent.kt", l = {884, 918}, m = "invokeSuspend", v = 1)
final class FareDetailsComponent$handleDecreasePassengerCountClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $passengerType;
    final /* synthetic */ int $updatedCount;
    Object L$0;
    int label;
    final /* synthetic */ FareDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FareDetailsComponent$handleDecreasePassengerCountClickedIntent$1(FareDetailsComponent fareDetailsComponent, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fareDetailsComponent;
        this.$passengerType = str;
        this.$updatedCount = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FareDetailsComponent$handleDecreasePassengerCountClickedIntent$1(this.this$0, this.$passengerType, this.$updatedCount, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FareDetailsComponent$handleDecreasePassengerCountClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinToastManager = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
            }
            hq0.s(kotlinToastManager, (String) obj);
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        FareDetailsComponent fareDetailsComponent = this.this$0;
        String str = this.$passengerType;
        int i2 = this.$updatedCount;
        this.label = 1;
        obj = fareDetailsComponent.X0(i2, str, this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        PassengerFareDetailsUiModel passengerFareDetailsUiModel = (PassengerFareDetailsUiModel) obj;
        if (passengerFareDetailsUiModel == null) {
            FareDetailsComponent fareDetailsComponent2 = this.this$0;
            KotlinToastManager kotlinToastManager2 = fareDetailsComponent2.z;
            this.L$0 = kotlinToastManager2;
            this.label = 2;
            obj = fareDetailsComponent2.m.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (obj != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager2;
                hq0.s(kotlinToastManager, (String) obj);
            }
            return coroutineSingletons;
        }
        FareDetailsComponent fareDetailsComponent3 = this.this$0;
        String str2 = this.$passengerType;
        int i3 = this.$updatedCount;
        long jI0 = FareDetailsComponent.I0(fareDetailsComponent3);
        PassengerDetailAppModel passengerDetailAppModel = (PassengerDetailAppModel) fareDetailsComponent3.P.get(str2);
        String strA = fareDetailsComponent3.n.a(jI0 - (passengerDetailAppModel != null ? passengerDetailAppModel.h : 0L), fareDetailsComponent3.Q);
        LinkedHashMap linkedHashMapU = MapsKt.u(fareDetailsComponent3.N);
        linkedHashMapU.put(str2, new Integer(i3));
        LinkedHashMap linkedHashMapU2 = MapsKt.u(fareDetailsComponent3.O);
        linkedHashMapU2.put(str2, passengerFareDetailsUiModel);
        fareDetailsComponent3.N = MapsKt.r(linkedHashMapU);
        fareDetailsComponent3.O = MapsKt.r(linkedHashMapU2);
        fareDetailsComponent3.E0(new w20(fareDetailsComponent3, strA, 1));
        return Unit.f17538a;
    }
}
