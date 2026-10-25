package defpackage;

import app.chalo.constants.Source;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetailsSerializable$$serializer;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedRestoredState;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import app.chalo.scenes.args.SuperPassBasicUserPurpose;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.scenes.args.SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithoutProof$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$EnterUserDetailsArgs$InternalArgs$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$PassengerSelectionArgs$FreshWithProof$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$UserProofsOverviewArgs$InternalArgs$$serializer;
import app.chalo.scenes.args.SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer;
import app.chalo.superpass.data.models.app.ProofDocumentProps$$serializer;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.SuperPassProofProperties$$serializer;
import app.chalo.utils.ConcurrentMutableMap;
import app.chalo.validation.superpass.SuperPassReceiptData;
import java.lang.annotation.Annotation;
import java.util.Set;
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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gg1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15730a;

    public /* synthetic */ gg1(int i) {
        this.f15730a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15730a) {
            case 0:
                SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew.Companion companion = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew.INSTANCE;
                return Source.INSTANCE.serializer();
            case 1:
                SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew.Companion companion2 = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew.INSTANCE;
                return EnumsKt.b("app.chalo.scenes.args.PostPassPurchaseSuccessFlowType", PostPassPurchaseSuccessFlowType.values());
            case 2:
                SuperPassPurchaseArgs.EnterUserDetailsArgs.Companion companion3 = SuperPassPurchaseArgs.EnterUserDetailsArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.scenes.args.SuperPassPurchaseArgs.EnterUserDetailsArgs", Reflection.a(SuperPassPurchaseArgs.EnterUserDetailsArgs.class), new KClass[]{Reflection.a(SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.class), Reflection.a(SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof.class), Reflection.a(SuperPassPurchaseArgs.EnterUserDetailsArgs.InternalArgs.class)}, new KSerializer[]{SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer.f9315a, SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithoutProof$$serializer.f9316a, SuperPassPurchaseArgs$EnterUserDetailsArgs$InternalArgs$$serializer.f9317a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 3:
                SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.Companion companion4 = SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.INSTANCE;
                return Source.INSTANCE.serializer();
            case 4:
                SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.Companion companion5 = SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.INSTANCE;
                return EnumsKt.b("app.chalo.scenes.args.PostPassPurchaseSuccessFlowType", PostPassPurchaseSuccessFlowType.values());
            case 5:
                SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.Companion companion6 = SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.INSTANCE;
                return SuperPassBasicUserPurpose.COMPLETE_DETAILS;
            case 6:
                SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.Companion companion7 = SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.INSTANCE;
                return SuperPassBasicUserPurpose.COMPLETE_DETAILS;
            case 7:
                SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof.Companion companion8 = SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof.INSTANCE;
                return SuperPassBasicUserPurpose.ONLY_NAME;
            case 8:
                SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof.Companion companion9 = SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof.INSTANCE;
                return Source.INSTANCE.serializer();
            case 9:
                SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof.Companion companion10 = SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof.INSTANCE;
                return EnumsKt.b("app.chalo.scenes.args.PostPassPurchaseSuccessFlowType", PostPassPurchaseSuccessFlowType.values());
            case 10:
                SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof.Companion companion11 = SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithoutProof.INSTANCE;
                return SuperPassBasicUserPurpose.ONLY_NAME;
            case 11:
                SuperPassPurchaseArgs.EnterUserDetailsArgs.InternalArgs.Companion companion12 = SuperPassPurchaseArgs.EnterUserDetailsArgs.InternalArgs.INSTANCE;
                return EnumsKt.b("app.chalo.scenes.args.SuperPassBasicUserPurpose", SuperPassBasicUserPurpose.values());
            case 12:
                SuperPassPurchaseArgs.EnterUserDetailsArgs.InternalArgs.Companion companion13 = SuperPassPurchaseArgs.EnterUserDetailsArgs.InternalArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 13:
                SuperPassPurchaseArgs.PassengerSelectionArgs.Companion companion14 = SuperPassPurchaseArgs.PassengerSelectionArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.scenes.args.SuperPassPurchaseArgs.PassengerSelectionArgs", Reflection.a(SuperPassPurchaseArgs.PassengerSelectionArgs.class), new KClass[]{Reflection.a(SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof.class)}, new KSerializer[]{SuperPassPurchaseArgs$PassengerSelectionArgs$FreshWithProof$$serializer.f9318a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 14:
                SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof.Companion companion15 = SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof.INSTANCE;
                return Source.INSTANCE.serializer();
            case 15:
                SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof.Companion companion16 = SuperPassPurchaseArgs.PassengerSelectionArgs.FreshWithProof.INSTANCE;
                return EnumsKt.b("app.chalo.scenes.args.PostPassPurchaseSuccessFlowType", PostPassPurchaseSuccessFlowType.values());
            case 16:
                SuperPassPurchaseArgs.ProofUploadInternalArgs.Companion companion17 = SuperPassPurchaseArgs.ProofUploadInternalArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 17:
                SuperPassPurchaseArgs.UserProofsOverviewArgs.Companion companion18 = SuperPassPurchaseArgs.UserProofsOverviewArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.scenes.args.SuperPassPurchaseArgs.UserProofsOverviewArgs", Reflection.a(SuperPassPurchaseArgs.UserProofsOverviewArgs.class), new KClass[]{Reflection.a(SuperPassPurchaseArgs.UserProofsOverviewArgs.InternalArgs.class), Reflection.a(SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication.class)}, new KSerializer[]{SuperPassPurchaseArgs$UserProofsOverviewArgs$InternalArgs$$serializer.f9320a, SuperPassPurchaseArgs$UserProofsOverviewArgs$Reapplication$$serializer.f9321a});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
            case 18:
                SuperPassPurchaseArgs.UserProofsOverviewArgs.InternalArgs.Companion companion19 = SuperPassPurchaseArgs.UserProofsOverviewArgs.InternalArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 19:
                SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication.Companion companion20 = SuperPassPurchaseArgs.UserProofsOverviewArgs.Reapplication.INSTANCE;
                return Source.INSTANCE.serializer();
            case 20:
                SuperPassPurchaseSharedRestoredState.Companion companion21 = SuperPassPurchaseSharedRestoredState.INSTANCE;
                return Source.INSTANCE.serializer();
            case 21:
                SuperPassPurchaseSharedRestoredState.Companion companion22 = SuperPassPurchaseSharedRestoredState.INSTANCE;
                return PassApplicationActionRequired.INSTANCE.serializer();
            case 22:
                SuperPassPurchaseSharedRestoredState.Companion companion23 = SuperPassPurchaseSharedRestoredState.INSTANCE;
                return EnumsKt.b("app.chalo.scenes.args.PostPassPurchaseSuccessFlowType", PostPassPurchaseSuccessFlowType.values());
            case 23:
                SuperPassPurchaseSharedRestoredState.Companion companion24 = SuperPassPurchaseSharedRestoredState.INSTANCE;
                return new ArrayListSerializer(ProofDocumentProps$$serializer.f9540a);
            case 24:
                SuperPassPurchaseSharedRestoredState.Companion companion25 = SuperPassPurchaseSharedRestoredState.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, ProofUploadDetailsSerializable$$serializer.f8319a);
            case 25:
                SuperPassPurchaseSharedRestoredState.Companion companion26 = SuperPassPurchaseSharedRestoredState.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, SuperPassProofProperties$$serializer.f9568a);
            case 26:
                Set set = SuperPassPurchaseSharedViewModel.G;
                return new ConcurrentMutableMap();
            case 27:
                Set set2 = SuperPassPurchaseSharedViewModel.G;
                return new ConcurrentMutableMap();
            case 28:
                SuperPassReceiptData.Companion companion27 = SuperPassReceiptData.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, IntSerializer.f18146a);
            default:
                SuperPassReceiptData.Companion companion28 = SuperPassReceiptData.INSTANCE;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
        }
    }
}
