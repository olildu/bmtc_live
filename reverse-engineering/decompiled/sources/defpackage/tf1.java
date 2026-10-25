package defpackage;

import app.chalo.constants.Source;
import app.chalo.models.SuperPassProductConfigurationProperties;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.data.SuperPassPropertiesAppModel;
import app.chalo.premiumbus.data.models.api.response.ApplicableRuleApiResponseModel$$serializer;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.PassOfferTagApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.ProductConfigFareBreakupApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.app.PassOfferTagAppModel$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductConfigFareBreakupAppModel$$serializer;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productbooking.common.data.models.app.ProductImageAppModel$$serializer;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetailsSerializable$$serializer;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsRestoredState;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionDataState;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewRestoreState;
import app.chalo.productpurchase.productselection.data.models.api.SuperPassProductConfigCategoryApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.SuperPassProductConfigFareMappingApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.api.SuperPassProductFareInfoApiResponseModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductFareInfoResponseAppModel;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import app.chalo.scenes.args.SuperPassBasicUserPurpose;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.scenes.args.SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentPostVerification$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$Renew$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithoutProof$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$EnterUserDetailsArgs$InternalArgs$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$PassengerSelectionArgs$FreshWithProof$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$ProofUploadInternalArgs$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$UserProofsOverviewArgs$InternalArgs$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails$$serializer;
import app.chalo.userprofile.Gender;
import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tf1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19653a;

    public /* synthetic */ tf1(int i) {
        this.f19653a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19653a) {
            case 0:
                SuperPassEnterUserDetailsRestoredState.Companion companion = SuperPassEnterUserDetailsRestoredState.INSTANCE;
                return Gender.INSTANCE.serializer();
            case 1:
                SuperPassEnterUserDetailsRestoredState.Companion companion2 = SuperPassEnterUserDetailsRestoredState.INSTANCE;
                return EnumsKt.b("app.chalo.scenes.args.SuperPassBasicUserPurpose", SuperPassBasicUserPurpose.values());
            case 2:
                SuperPassPassengerSelectionDataState.Companion companion3 = SuperPassPassengerSelectionDataState.INSTANCE;
                return new ArrayListSerializer(SuperPassUserDetails$$serializer.f9581a);
            case 3:
                SuperPassProductConfigCategoryApiResponseModel.Companion companion4 = SuperPassProductConfigCategoryApiResponseModel.Companion;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 4:
                SuperPassProductConfigCategoryResponseAppModel.Companion companion5 = SuperPassProductConfigCategoryResponseAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 5:
                SuperPassProductConfigFareMappingApiResponseModel.Companion companion6 = SuperPassProductConfigFareMappingApiResponseModel.Companion;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 6:
                SuperPassProductConfigFareMappingApiResponseModel.Companion companion7 = SuperPassProductConfigFareMappingApiResponseModel.Companion;
                return new ArrayListSerializer(BuiltinSerializersKt.c(StringSerializer.f18170a));
            case 7:
                SuperPassProductConfigFareMappingApiResponseModel.Companion companion8 = SuperPassProductConfigFareMappingApiResponseModel.Companion;
                return new ArrayListSerializer(PassOfferTagApiResponseModel$$serializer.f8146a);
            case 8:
                SuperPassProductConfigFareMappingApiResponseModel.Companion companion9 = SuperPassProductConfigFareMappingApiResponseModel.Companion;
                return new ArrayListSerializer(ApplicableRuleApiResponseModel$$serializer.f7015a);
            case 9:
                SuperPassProductConfigFareMappingResponseAppModel.Companion companion10 = SuperPassProductConfigFareMappingResponseAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 10:
                SuperPassProductConfigFareMappingResponseAppModel.Companion companion11 = SuperPassProductConfigFareMappingResponseAppModel.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 11:
                SuperPassProductConfigFareMappingResponseAppModel.Companion companion12 = SuperPassProductConfigFareMappingResponseAppModel.INSTANCE;
                return new ArrayListSerializer(PassOfferTagAppModel$$serializer.f8193a);
            case 12:
                SuperPassProductConfigFareMappingResponseAppModel.Companion companion13 = SuperPassProductConfigFareMappingResponseAppModel.INSTANCE;
                return new ArrayListSerializer(ApplicableRuleAppModel$$serializer.f7071a);
            case 13:
                SuperPassProductConfigurationProperties.Companion companion14 = SuperPassProductConfigurationProperties.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 14:
                SuperPassProductConfigurationProperties.Companion companion15 = SuperPassProductConfigurationProperties.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 15:
                SuperPassProductConfigurationProperties.Companion companion16 = SuperPassProductConfigurationProperties.INSTANCE;
                return new ArrayListSerializer(ProductConfigServiceType.INSTANCE.serializer());
            case 16:
                SuperPassProductConfigurationProperties.Companion companion17 = SuperPassProductConfigurationProperties.INSTANCE;
                return new ArrayListSerializer(ProductImageAppModel$$serializer.f8225a);
            case 17:
                SuperPassProductFareInfoApiResponseModel.Companion companion18 = SuperPassProductFareInfoApiResponseModel.Companion;
                return new ArrayListSerializer(ProductConfigFareBreakupApiResponseModel$$serializer.f8162a);
            case 18:
                SuperPassProductFareInfoResponseAppModel.Companion companion19 = SuperPassProductFareInfoResponseAppModel.INSTANCE;
                return new ArrayListSerializer(ProductConfigFareBreakupAppModel$$serializer.f8212a);
            case 19:
                SuperPassProofOverviewRestoreState.Companion companion20 = SuperPassProofOverviewRestoreState.Companion;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, ProofUploadDetailsSerializable$$serializer.f8319a);
            case 20:
                SuperPassPropertiesAppModel.Companion companion21 = SuperPassPropertiesAppModel.INSTANCE;
                return SuperPassSubTypes.INSTANCE.serializer();
            case 21:
                SuperPassPurchaseArgs.Companion companion22 = SuperPassPurchaseArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.scenes.args.SuperPassPurchaseArgs", Reflection.a(SuperPassPurchaseArgs.class), new KClass[]{Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof.class), Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs.class), Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification.class), Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification.class), Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew.class), Reflection.a(SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.class), Reflection.a(SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof.class), Reflection.a(SuperPassPurchaseArgs.EnterUserDetailsArgs.InternalArgs.class), Reflection.a(SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof.class), Reflection.a(SuperPassPurchaseArgs.ProofUploadInternalArgs.class), Reflection.a(SuperPassPurchaseArgs.UserProofsOverviewArgs.InternalArgs.class), Reflection.a(SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication.class)}, new KSerializer[]{SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer.f9311a, new ObjectSerializer("app.chalo.scenes.args.SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs", SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs.INSTANCE, new Annotation[0]), SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer.f9312a, SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentPostVerification$$serializer.f9313a, SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$Renew$$serializer.f9314a, SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer.f9315a, SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithoutProof$$serializer.f9316a, SuperPassPurchaseArgs$EnterUserDetailsArgs$InternalArgs$$serializer.f9317a, SuperPassPurchaseArgs$PassengerSelectionArgs$FreshWithProof$$serializer.f9318a, SuperPassPurchaseArgs$ProofUploadInternalArgs$$serializer.f9319a, SuperPassPurchaseArgs$UserProofsOverviewArgs$InternalArgs$$serializer.f9320a, SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer.f9321a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 22:
                SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Companion companion23 = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.scenes.args.SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs", Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.class), new KClass[]{Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof.class), Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs.class), Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification.class), Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification.class), Reflection.a(SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew.class)}, new KSerializer[]{SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer.f9311a, new ObjectSerializer("app.chalo.scenes.args.SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs", SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs.INSTANCE, new Annotation[0]), SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentModeChangedNoVerification$$serializer.f9312a, SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$PaymentPostVerification$$serializer.f9313a, SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$Renew$$serializer.f9314a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 23:
                SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof.Companion companion24 = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof.INSTANCE;
                return Source.INSTANCE.serializer();
            case 24:
                SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof.Companion companion25 = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof.INSTANCE;
                return EnumsKt.b("app.chalo.scenes.args.PostPassPurchaseSuccessFlowType", PostPassPurchaseSuccessFlowType.values());
            case 25:
                return new ObjectSerializer("app.chalo.scenes.args.SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs", SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.InternalArgs.INSTANCE, new Annotation[0]);
            case 26:
                SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification.Companion companion26 = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification.INSTANCE;
                return Source.INSTANCE.serializer();
            case 27:
                SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification.Companion companion27 = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentModeChangedNoVerification.INSTANCE;
                return EnumsKt.b("app.chalo.scenes.args.PostPassPurchaseSuccessFlowType", PostPassPurchaseSuccessFlowType.values());
            case 28:
                SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification.Companion companion28 = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification.INSTANCE;
                return Source.INSTANCE.serializer();
            default:
                SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification.Companion companion29 = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.PaymentPostVerification.INSTANCE;
                return EnumsKt.b("app.chalo.scenes.args.PostPassPurchaseSuccessFlowType", PostPassPurchaseSuccessFlowType.values());
        }
    }
}
