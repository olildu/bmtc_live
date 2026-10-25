package app.chalo.busesaroundyou;

import androidx.compose.runtime.ComposerKt;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.permissions.models.AppPermission;
import defpackage.sd;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.busesaroundyou.BusesAroundYouComponent$handleGoToMyLocationClickedIntent$1", f = "BusesAroundYouComponent.kt", l = {ComposerKt.providerKey}, m = "invokeSuspend", v = 1)
final class BusesAroundYouComponent$handleGoToMyLocationClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BusesAroundYouComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusesAroundYouComponent$handleGoToMyLocationClickedIntent$1(BusesAroundYouComponent busesAroundYouComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = busesAroundYouComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BusesAroundYouComponent$handleGoToMyLocationClickedIntent$1 busesAroundYouComponent$handleGoToMyLocationClickedIntent$1 = new BusesAroundYouComponent$handleGoToMyLocationClickedIntent$1(this.this$0, continuation);
        busesAroundYouComponent$handleGoToMyLocationClickedIntent$1.L$0 = obj;
        return busesAroundYouComponent$handleGoToMyLocationClickedIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BusesAroundYouComponent$handleGoToMyLocationClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ChaloLocationManager chaloLocationManager = this.this$0.k;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = chaloLocationManager.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        LocationAppModel locationAppModelA = ((LocationUpdateResult) obj).a();
        if (locationAppModelA != null) {
            this.this$0.E0(new sd(1, locationAppModelA.a()));
        } else {
            this.this$0.L0(CollectionsKt.S(AppPermission.COARSE_LOCATION, AppPermission.FINE_LOCATION));
        }
        return Unit.f17538a;
    }
}
