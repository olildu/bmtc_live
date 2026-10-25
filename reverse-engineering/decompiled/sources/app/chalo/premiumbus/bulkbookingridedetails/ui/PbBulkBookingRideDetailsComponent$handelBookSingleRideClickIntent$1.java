package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.SuperPassResponseAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.superpass.data.models.entities.SuperPassTripPreferences;
import java.util.List;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent$handelBookSingleRideClickIntent$1", f = "PbBulkBookingRideDetailsComponent.kt", l = {836}, m = "invokeSuspend", v = 1)
final class PbBulkBookingRideDetailsComponent$handelBookSingleRideClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SuperPassResponseAppModel $passData;
    final /* synthetic */ SuperPassTripPreferences $tripPreference;
    Object L$0;
    int label;
    final /* synthetic */ PbBulkBookingRideDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbBulkBookingRideDetailsComponent$handelBookSingleRideClickIntent$1(SuperPassResponseAppModel superPassResponseAppModel, SuperPassTripPreferences superPassTripPreferences, PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.$passData = superPassResponseAppModel;
        this.$tripPreference = superPassTripPreferences;
        this.this$0 = pbBulkBookingRideDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PbBulkBookingRideDetailsComponent$handelBookSingleRideClickIntent$1(this.$passData, this.$tripPreference, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PbBulkBookingRideDetailsComponent$handelBookSingleRideClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        KotlinToastManager kotlinToastManager;
        SuperPassTripPreferences superPassTripPreferences;
        String str;
        String str2;
        String str3;
        String str4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.$passData != null && (superPassTripPreferences = this.$tripPreference) != null && (str = superPassTripPreferences.b) != null && superPassTripPreferences.d != null) {
                String str5 = superPassTripPreferences.c;
                String str6 = str5 == null ? "" : str5;
                PremiumBusSelectedLocationType premiumBusSelectedLocationType = PremiumBusSelectedLocationType.STOP;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = new PBStopPlaceSelectedAppModel(str, "searchPartnerChaloStop", str6, null, null, premiumBusSelectedLocationType);
                SuperPassTripPreferences superPassTripPreferences2 = this.$tripPreference;
                String str7 = superPassTripPreferences2.d;
                String str8 = superPassTripPreferences2.e;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = new PBStopPlaceSelectedAppModel(str7, "searchPartnerChaloStop", str8 == null ? "" : str8, null, null, premiumBusSelectedLocationType);
                SuperPassTripPreferences superPassTripPreferences3 = this.$tripPreference;
                String str9 = superPassTripPreferences3.f9575a;
                PBOriginDestinationAppModel pBOriginDestinationAppModel = null;
                if (str9 != null) {
                    List listR = CollectionsKt.R(str9);
                    String str10 = superPassTripPreferences3.b;
                    if (str10 != null && (str2 = superPassTripPreferences3.c) != null && (str3 = superPassTripPreferences3.d) != null && (str4 = superPassTripPreferences3.e) != null) {
                        pBOriginDestinationAppModel = new PBOriginDestinationAppModel(listR, null, str10, str2, null, null, null, str3, str4, null, null, null, 32370);
                    }
                }
                if (pBOriginDestinationAppModel != null) {
                    this.this$0.R0(new PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass(this.$passData.b, pBStopPlaceSelectedAppModel, pBStopPlaceSelectedAppModel2, this.this$0.y.j()));
                    return unit;
                }
                PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent = this.this$0;
                String str11 = this.$passData.b;
                pbBulkBookingRideDetailsComponent.getClass();
                pbBulkBookingRideDetailsComponent.R0(new PremiumBusProductPurchaseFlowType.TicketPurchaseThroughPass(str11, pBStopPlaceSelectedAppModel, pBStopPlaceSelectedAppModel2, pbBulkBookingRideDetailsComponent.y.j()));
                return unit;
            }
            PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent2 = this.this$0;
            KotlinToastManager kotlinToastManager2 = pbBulkBookingRideDetailsComponent2.x;
            this.L$0 = kotlinToastManager2;
            this.label = 1;
            objB = pbBulkBookingRideDetailsComponent2.r.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            objB = obj;
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return unit;
    }
}
