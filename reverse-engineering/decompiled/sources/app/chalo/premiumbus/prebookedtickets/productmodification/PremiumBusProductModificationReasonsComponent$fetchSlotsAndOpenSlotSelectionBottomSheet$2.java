package app.chalo.premiumbus.prebookedtickets.productmodification;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumStopDetailsAppModel;
import app.chalo.premiumbus.domain.FetchPBODPairsForGivenLocationsUseCase;
import app.chalo.premiumbus.domain.FetchPBStopPointsResult;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import defpackage.du0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent$fetchSlotsAndOpenSlotSelectionBottomSheet$2", f = "PremiumBusProductModificationReasonsComponent.kt", l = {427, 443, 447, 477}, m = "invokeSuspend", v = 1)
final class PremiumBusProductModificationReasonsComponent$fetchSlotsAndOpenSlotSelectionBottomSheet$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumReserveTicketTripPropertiesAppModel $tripProperties;
    Object L$0;
    int label;
    final /* synthetic */ PremiumBusProductModificationReasonsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusProductModificationReasonsComponent$fetchSlotsAndOpenSlotSelectionBottomSheet$2(PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent, PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusProductModificationReasonsComponent;
        this.$tripProperties = premiumReserveTicketTripPropertiesAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusProductModificationReasonsComponent$fetchSlotsAndOpenSlotSelectionBottomSheet$2(this.this$0, this.$tripProperties, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusProductModificationReasonsComponent$fetchSlotsAndOpenSlotSelectionBottomSheet$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objB;
        KotlinToastManager kotlinToastManager;
        Object next;
        Object objB2;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            FetchPBODPairsForGivenLocationsUseCase fetchPBODPairsForGivenLocationsUseCase = this.this$0.q;
            PremiumStopDetailsAppModel premiumStopDetailsAppModel = this.$tripProperties.g;
            String str = premiumStopDetailsAppModel.f7121a;
            String str2 = premiumStopDetailsAppModel.b;
            PremiumBusSelectedLocationType premiumBusSelectedLocationType = PremiumBusSelectedLocationType.STOP;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = new PBStopPlaceSelectedAppModel(str, "searchPartnerChaloStop", str2, "", null, premiumBusSelectedLocationType);
            PremiumStopDetailsAppModel premiumStopDetailsAppModel2 = this.$tripProperties.h;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = new PBStopPlaceSelectedAppModel(premiumStopDetailsAppModel2.f7121a, "searchPartnerChaloStop", premiumStopDetailsAppModel2.b, "", null, premiumBusSelectedLocationType);
            this.label = 1;
            objA = fetchPBODPairsForGivenLocationsUseCase.a(pBStopPlaceSelectedAppModel, pBStopPlaceSelectedAppModel2, this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlinToastManager2 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB2 = obj;
                KotlinToastManagerKt.a(kotlinToastManager2, (String) objB2, ToastLength.LONG);
                return unit;
            }
            if (i == 3) {
                ResultKt.b(obj);
                return unit;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            objB = obj;
            KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
            return unit;
        }
        ResultKt.b(obj);
        objA = obj;
        FetchPBStopPointsResult fetchPBStopPointsResult = (FetchPBStopPointsResult) objA;
        if (fetchPBStopPointsResult instanceof FetchPBStopPointsResult.Success) {
            List list = ((FetchPBStopPointsResult.Success) fetchPBStopPointsResult).f7192a;
            PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = this.$tripProperties;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                PBOriginDestinationAppModel pBOriginDestinationAppModel = (PBOriginDestinationAppModel) next;
                if (Intrinsics.d(pBOriginDestinationAppModel.c, premiumReserveTicketTripPropertiesAppModel.g.f7121a) && Intrinsics.d(pBOriginDestinationAppModel.h, premiumReserveTicketTripPropertiesAppModel.h.f7121a)) {
                    break;
                }
            }
            PBOriginDestinationAppModel pBOriginDestinationAppModel2 = (PBOriginDestinationAppModel) next;
            PremiumBusProductModificationReasonsComponent.K0(this.this$0, list.size(), pBOriginDestinationAppModel2 != null);
            if (pBOriginDestinationAppModel2 == null) {
                PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent = this.this$0;
                KotlinToastManager kotlinToastManager3 = premiumBusProductModificationReasonsComponent.u;
                this.L$0 = kotlinToastManager3;
                this.label = 2;
                objB2 = premiumBusProductModificationReasonsComponent.o.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (objB2 != coroutineSingletons) {
                    kotlinToastManager2 = kotlinToastManager3;
                    KotlinToastManagerKt.a(kotlinToastManager2, (String) objB2, ToastLength.LONG);
                    return unit;
                }
            } else {
                PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent2 = this.this$0;
                PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel2 = this.$tripProperties;
                this.label = 3;
                if (PremiumBusProductModificationReasonsComponent.H0(premiumBusProductModificationReasonsComponent2, pBOriginDestinationAppModel2, premiumReserveTicketTripPropertiesAppModel2, this) != coroutineSingletons) {
                    return unit;
                }
            }
        } else {
            if (Intrinsics.d(fetchPBStopPointsResult, FetchPBStopPointsResult.NoStopPointsAvailable.f7189a)) {
                PremiumBusProductModificationReasonsComponent.K0(this.this$0, 0, false);
                this.this$0.E0(new du0(2));
                return unit;
            }
            if (!Intrinsics.d(fetchPBStopPointsResult, FetchPBStopPointsResult.LocalException.f7188a) && !Intrinsics.d(fetchPBStopPointsResult, FetchPBStopPointsResult.ResponseParseException.f7190a) && !(fetchPBStopPointsResult instanceof FetchPBStopPointsResult.ServerError) && !Intrinsics.d(fetchPBStopPointsResult, FetchPBStopPointsResult.UnknownException.f7193a)) {
                throw new NoWhenBranchMatchedException();
            }
            PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent3 = this.this$0;
            int iA = fetchPBStopPointsResult.a();
            premiumBusProductModificationReasonsComponent3.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("attribute error reason", Integer.valueOf(iA));
            AnalyticsContract.DefaultImpls.a(premiumBusProductModificationReasonsComponent3.n, "pb od pair fetch failed", Source.PREMIUM_PRODUCT_BOOKING_MODIFICATION_FRAGMENT.getSourceName(), linkedHashMap, null, false, 24);
            this.this$0.E0(new du0(3));
            PremiumBusProductModificationReasonsComponent premiumBusProductModificationReasonsComponent4 = this.this$0;
            KotlinToastManager kotlinToastManager4 = premiumBusProductModificationReasonsComponent4.u;
            StringProvider stringProvider = premiumBusProductModificationReasonsComponent4.o;
            StringEnum stringEnum = StringEnum.SOMETHING_WENT_WRONG_WITH_ERROR_CODE;
            Object[] objArr = {new Integer(fetchPBStopPointsResult.a())};
            this.L$0 = kotlinToastManager4;
            this.label = 4;
            objB = stringProvider.b(stringEnum, objArr, this);
            if (objB != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager4;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
