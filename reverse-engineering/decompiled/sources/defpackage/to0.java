package defpackage;

import app.chalo.compose.components.chalomap.ChaloMapMarkerUIEventHandler;
import app.chalo.constants.Source;
import app.chalo.data.PassPurchaseConfigsApplicableForRollover;
import app.chalo.data.PassPurchaseConfigsApplicableForRollover$$serializer;
import app.chalo.data.PassRollOverRidesConfig;
import app.chalo.homescreen.data.model.app.PassCardDataAppModel;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.data.SuperPassStatusAppModel;
import app.chalo.premiumbus.data.models.api.request.PBReserveTicketThroughPassRequestApiModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketCreateOrderApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketSelectedPassengerApiRequestModel$$serializer;
import app.chalo.premiumbus.data.models.api.request.PBTripDetailsApiRequestModel;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel$$serializer;
import app.chalo.premiumbus.data.models.api.response.PBTripDetailsApiResponseModel;
import app.chalo.premiumbus.data.models.api.response.SeatInfoApiModel$$serializer;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PassInfo;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsNavAppModel;
import app.chalo.productpurchase.passselection.ui.PassSelectionRestoreState;
import app.chalo.productpurchase.productselection.data.models.api.PassApplicationSubmissionRequestApiModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.scenes.args.PassLandingFlowType;
import app.chalo.scenes.args.PassLandingFlowType$WithConfigId$$serializer;
import app.chalo.scenes.args.PassSelectionArgs;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import app.chalo.superpass.data.models.PassActivationsApiRequestModel;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons;
import app.chalo.superpass.data.models.entities.ProfileRejectionReason$$serializer;
import app.chalo.superpass.data.models.entities.ProofRejectionReason$$serializer;
import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class to0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19677a;

    public /* synthetic */ to0(int i) {
        this.f19677a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19677a) {
            case 0:
                PBReserveTicketThroughPassRequestApiModel.Companion companion = PBReserveTicketThroughPassRequestApiModel.Companion;
                return new ArrayListSerializer(SeatInfoApiModel$$serializer.f7063a);
            case 1:
                ChaloMapMarkerUIEventHandler.f1869a.getClass();
                return (ChaloMapMarkerUIEventHandler) ChaloMapMarkerUIEventHandler.Companion.b.getValue();
            case 2:
                PBStopDetailsNavAppModel.Companion companion2 = PBStopDetailsNavAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 3:
                PBStopPlaceSelectedAppModel.Companion companion3 = PBStopPlaceSelectedAppModel.INSTANCE;
                return PremiumBusSelectedLocationType.INSTANCE.serializer();
            case 4:
                PBTicketCreateOrderApiRequestModel.Companion companion4 = PBTicketCreateOrderApiRequestModel.INSTANCE;
                return new ArrayListSerializer(PBTicketSelectedPassengerApiRequestModel$$serializer.f6999a);
            case 5:
                PBTicketCreateOrderApiRequestModel.Companion companion5 = PBTicketCreateOrderApiRequestModel.INSTANCE;
                return new ArrayListSerializer(ApplicableRuleApiResponseModel$$serializer.f7015a);
            case 6:
                PBTicketCreateOrderApiRequestModel.Companion companion6 = PBTicketCreateOrderApiRequestModel.INSTANCE;
                return new ArrayListSerializer(SeatInfoApiModel$$serializer.f7063a);
            case 7:
                PBTripDetailsApiRequestModel.Companion companion7 = PBTripDetailsApiRequestModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 8:
                PBTripDetailsApiResponseModel.Companion companion8 = PBTripDetailsApiResponseModel.Companion;
                return new ArrayListSerializer(IntSerializer.f18146a);
            case 9:
                PBTripDetailsApiResponseModel.Companion companion9 = PBTripDetailsApiResponseModel.Companion;
                return new ArrayListSerializer(SeatInfoApiModel$$serializer.f7063a);
            case 10:
                PassActivationsApiRequestModel.Companion companion10 = PassActivationsApiRequestModel.INSTANCE;
                return new ArrayListSerializer(LongSerializer.f18151a);
            case 11:
                return PassApplicationActionRequired._init_$_anonymous_();
            case 12:
                PassApplicationRejectionReasons.Companion companion11 = PassApplicationRejectionReasons.INSTANCE;
                return new ArrayListSerializer(ProofRejectionReason$$serializer.f9555a);
            case 13:
                PassApplicationRejectionReasons.Companion companion12 = PassApplicationRejectionReasons.INSTANCE;
                return new ArrayListSerializer(ProfileRejectionReason$$serializer.f9553a);
            case 14:
                PassApplicationRejectionReasons.Companion companion13 = PassApplicationRejectionReasons.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 15:
                PassApplicationSubmissionRequestApiModel.Companion companion14 = PassApplicationSubmissionRequestApiModel.INSTANCE;
                StringSerializer stringSerializer = StringSerializer.f18170a;
                return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
            case 16:
                PassCardDataAppModel.Companion companion15 = PassCardDataAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 17:
                PassInfo.Companion companion16 = PassInfo.Companion;
                return EnumsKt.b("app.chalo.premiumbus.data.SuperPassStatusAppModel", SuperPassStatusAppModel.values());
            case 18:
                PassInfo.Companion companion17 = PassInfo.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 19:
                PassInfo.Companion companion18 = PassInfo.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 20:
                PassInfo.Companion companion19 = PassInfo.Companion;
                return SuperPassSubTypes.INSTANCE.serializer();
            case 21:
                PassLandingFlowType.Companion companion20 = PassLandingFlowType.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.scenes.args.PassLandingFlowType", Reflection.a(PassLandingFlowType.class), new KClass[]{Reflection.a(PassLandingFlowType.WithConfigId.class), Reflection.a(PassLandingFlowType.WithoutConfigId.class)}, new KSerializer[]{PassLandingFlowType$WithConfigId$$serializer.f9278a, new ObjectSerializer("app.chalo.scenes.args.PassLandingFlowType.WithoutConfigId", PassLandingFlowType.WithoutConfigId.INSTANCE, new Annotation[0])});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 22:
                return new ObjectSerializer("app.chalo.scenes.args.PassLandingFlowType.WithoutConfigId", PassLandingFlowType.WithoutConfigId.INSTANCE, new Annotation[0]);
            case 23:
                PassPurchaseConfigsApplicableForRollover.Companion companion21 = PassPurchaseConfigsApplicableForRollover.INSTANCE;
                return new ArrayListSerializer(IntSerializer.f18146a);
            case 24:
                PassRollOverRidesConfig.Companion companion22 = PassRollOverRidesConfig.INSTANCE;
                return new ArrayListSerializer(PassPurchaseConfigsApplicableForRollover$$serializer.f2366a);
            case 25:
                PassSelectionArgs.Companion companion23 = PassSelectionArgs.Companion;
                return Source.INSTANCE.serializer();
            case 26:
                PassSelectionArgs.Companion companion24 = PassSelectionArgs.Companion;
                return Source.INSTANCE.serializer();
            case 27:
                PassSelectionArgs.Companion companion25 = PassSelectionArgs.Companion;
                return EnumsKt.b("app.chalo.scenes.args.PostPassPurchaseSuccessFlowType", PostPassPurchaseSuccessFlowType.values());
            case 28:
                PassSelectionRestoreState.Companion companion26 = PassSelectionRestoreState.Companion;
                return Source.INSTANCE.serializer();
            default:
                PassSelectionRestoreState.Companion companion27 = PassSelectionRestoreState.Companion;
                return EnumsKt.b("app.chalo.scenes.args.PostPassPurchaseSuccessFlowType", PostPassPurchaseSuccessFlowType.values());
        }
    }
}
