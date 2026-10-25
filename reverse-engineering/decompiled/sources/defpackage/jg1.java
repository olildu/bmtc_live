package defpackage;

import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.material3.SurfaceKt;
import app.chalo.behaviour.policy.ReportProblemPathOverride;
import app.chalo.behaviour.policy.SupportPolicyOverride;
import app.chalo.chalobususerprofile.data.model.SurveyStep;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$fareBreakupListAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$passApplicationActionRequiredAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$premiumBusMetaAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$profileRejectionReasonListAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$proofRejectionReasonListAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$proofsMapAdapter$2$1;
import app.chalo.core.database.tableadapters.SuperPassTableAdapters$serviceTypeListAdapter$2$1;
import app.chalo.home.data.model.api.TabMetaDataApiModel;
import app.chalo.homescreen.data.model.app.BgHighlightType;
import app.chalo.homescreen.data.model.app.HeaderItemType;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.premiumbus.data.SuperPassProofPropertiesAppModel$$serializer;
import app.chalo.premiumbus.data.SuperPassTripPreferencesAppModel;
import app.chalo.premiumbus.data.SuperPassUiPropertiesAppModel;
import app.chalo.premiumbus.data.SuperPassUserDetailsAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.superpass.data.models.SuperPassTripReceiptApiResponseModel;
import app.chalo.superpass.data.models.entities.SuperPassProofProperties$$serializer;
import app.chalo.superpass.data.models.entities.SuperPassUIProperties;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.titoridedetail.data.app.TITOProductDetailAppModel;
import app.chalo.userprofile.Gender;
import io.github.alexzhirkevich.compottie.internal.helpers.text.TextData;
import io.github.alexzhirkevich.compottie.internal.helpers.text.TextDocument;
import io.github.alexzhirkevich.compottie.internal.helpers.text.TextRange$$serializer;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jg1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17404a;

    public /* synthetic */ jg1(int i) {
        this.f17404a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17404a) {
            case 0:
                return SuperPassSubTypes._init_$_anonymous_();
            case 1:
                Lazy lazy = SuperPassTableAdapters.f2123a;
                return new SuperPassTableAdapters$serviceTypeListAdapter$2$1();
            case 2:
                Lazy lazy2 = SuperPassTableAdapters.f2123a;
                return new SuperPassTableAdapters$proofsMapAdapter$2$1();
            case 3:
                Lazy lazy3 = SuperPassTableAdapters.f2123a;
                return new SuperPassTableAdapters$fareBreakupListAdapter$2$1();
            case 4:
                Lazy lazy4 = SuperPassTableAdapters.f2123a;
                return new SuperPassTableAdapters$proofRejectionReasonListAdapter$2$1();
            case 5:
                Lazy lazy5 = SuperPassTableAdapters.f2123a;
                return new SuperPassTableAdapters$profileRejectionReasonListAdapter$2$1();
            case 6:
                Lazy lazy6 = SuperPassTableAdapters.f2123a;
                return new SuperPassTableAdapters$passApplicationActionRequiredAdapter$2$1();
            case 7:
                Lazy lazy7 = SuperPassTableAdapters.f2123a;
                return new SuperPassTableAdapters$premiumBusMetaAdapter$2$1();
            case 8:
                SuperPassTripPreferencesAppModel.Companion companion = SuperPassTripPreferencesAppModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 9:
                SuperPassTripReceiptApiResponseModel.Companion companion2 = SuperPassTripReceiptApiResponseModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 10:
                SuperPassTripReceiptApiResponseModel.Companion companion3 = SuperPassTripReceiptApiResponseModel.Companion;
                return EnumsKt.b("app.chalo.providers.RouteNamingSchemeType", RouteNamingSchemeType.values());
            case 11:
                SuperPassUIProperties.Companion companion4 = SuperPassUIProperties.INSTANCE;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 12:
                SuperPassUIProperties.Companion companion5 = SuperPassUIProperties.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, SuperPassProofProperties$$serializer.f9568a);
            case 13:
                SuperPassUiPropertiesAppModel.Companion companion6 = SuperPassUiPropertiesAppModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 14:
                SuperPassUiPropertiesAppModel.Companion companion7 = SuperPassUiPropertiesAppModel.Companion;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, SuperPassProofPropertiesAppModel$$serializer.f6966a);
            case 15:
                SuperPassUserDetails.Companion companion8 = SuperPassUserDetails.INSTANCE;
                return Gender.INSTANCE.serializer();
            case 16:
                SuperPassUserDetailsAppModel.Companion companion9 = SuperPassUserDetailsAppModel.Companion;
                return Gender.INSTANCE.serializer();
            case 17:
                SupportPolicyOverride.Companion companion10 = SupportPolicyOverride.Companion;
                return ReportProblemPathOverride.INSTANCE.serializer();
            case 18:
                return SurfaceKt.LocalAbsoluteTonalElevation$lambda$3();
            case 19:
                return SurveyStep._init_$_anonymous_();
            case 20:
                TITOProductDetailAppModel.Companion companion11 = TITOProductDetailAppModel.INSTANCE;
                return ValidationProduct.INSTANCE.serializer();
            case 21:
                TabMetaDataApiModel.Companion companion12 = TabMetaDataApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 22:
                TabMetaDataAppModel.Companion companion13 = TabMetaDataAppModel.Companion;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.BgHighlightType", BgHighlightType.values());
            case 23:
                TabMetaDataAppModel.Companion companion14 = TabMetaDataAppModel.Companion;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 24:
                TabMetaDataAppModel.Companion companion15 = TabMetaDataAppModel.Companion;
                return new ArrayListSerializer(EnumsKt.b("app.chalo.homescreen.data.model.app.HeaderItemType", HeaderItemType.values()));
            case 25:
                return TextContextMenuProviderKt.LocalTextContextMenuDropdownProvider$lambda$0();
            case 26:
                return TextContextMenuProviderKt.LocalTextContextMenuToolbarProvider$lambda$0();
            case 27:
                TextData.Companion companion16 = TextData.Companion;
                return new ArrayListSerializer(TextRange$$serializer.f16267a);
            case 28:
                TextDocument.Companion companion17 = TextDocument.Companion;
                return new ArrayListSerializer(FloatSerializer.f18142a);
            default:
                TextDocument.Companion companion18 = TextDocument.Companion;
                return new ArrayListSerializer(FloatSerializer.f18142a);
        }
    }
}
