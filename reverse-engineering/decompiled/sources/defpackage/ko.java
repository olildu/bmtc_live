package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.internal.ChildSemanticsNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.chalo.citydata.data.error.CityDataRemoteException;
import app.chalo.compose.utils.ContentAnimationTransitionSpecKt;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionLayoutType;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionState;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import com.arkivanov.decompose.router.children.ChildItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ko implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17516a;

    public /* synthetic */ ko(int i) {
        this.f17516a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        switch (this.f17516a) {
            case 0:
                return Boolean.valueOf(ChildSemanticsNode.onDetach$lambda$2((TraversableNode) obj));
            case 1:
                ChildItem it = (ChildItem) obj;
                Intrinsics.i(it, "it");
                return it.getF12342a();
            case 2:
                return ChipKt.SelectableChip_u0RnIRE$lambda$21$lambda$20((SemanticsPropertyReceiver) obj);
            case 3:
                return ChipKt.Chip_nkUnTEs$lambda$17$lambda$16((SemanticsPropertyReceiver) obj);
            case 4:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse == null || (str = genericChaloErrorResponse.b) == null) {
                    str = "Something went wrong";
                }
                return new CityDataRemoteException(genericChaloErrorResponse, str);
            case 5:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse2 == null || (str2 = genericChaloErrorResponse2.b) == null) {
                    str2 = "Something went wrong";
                }
                return new CityDataRemoteException(genericChaloErrorResponse2, str2);
            case 6:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse3 == null || (str3 = genericChaloErrorResponse3.b) == null) {
                    str3 = "Something went wrong";
                }
                return new CityDataRemoteException(genericChaloErrorResponse3, str3);
            case 7:
                GenericChaloErrorResponse genericChaloErrorResponse4 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse4 == null || (str4 = genericChaloErrorResponse4.b) == null) {
                    str4 = "Something went wrong";
                }
                return new CityDataRemoteException(genericChaloErrorResponse4, str4);
            case 8:
                GenericChaloErrorResponse genericChaloErrorResponse5 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse5 == null || (str5 = genericChaloErrorResponse5.b) == null) {
                    str5 = "Something went wrong";
                }
                return new CityDataRemoteException(genericChaloErrorResponse5, str5);
            case 9:
                GenericChaloErrorResponse genericChaloErrorResponse6 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse6 == null || (str6 = genericChaloErrorResponse6.b) == null) {
                    str6 = "Something went wrong";
                }
                return new CityDataRemoteException(genericChaloErrorResponse6, str6);
            case 10:
                GenericChaloErrorResponse genericChaloErrorResponse7 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse7 == null || (str7 = genericChaloErrorResponse7.b) == null) {
                    str7 = "Something went wrong";
                }
                return new CityDataRemoteException(genericChaloErrorResponse7, str7);
            case 11:
                GenericChaloErrorResponse genericChaloErrorResponse8 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse8 == null || (str8 = genericChaloErrorResponse8.b) == null) {
                    str8 = "Something went wrong";
                }
                return new CityDataRemoteException(genericChaloErrorResponse8, str8);
            case 12:
                CityLocationSelectionState it2 = (CityLocationSelectionState) obj;
                Intrinsics.i(it2, "it");
                return CityLocationSelectionState.a(it2, false, null, null, null, null, null, null, true, null, false, 1919);
            case 13:
                CityLocationSelectionState it3 = (CityLocationSelectionState) obj;
                Intrinsics.i(it3, "it");
                return CityLocationSelectionState.a(it3, false, null, CityLocationSelectionLayoutType.NoCityAvailable, null, null, null, null, false, null, false, 2043);
            case 14:
                CityLocationSelectionState it4 = (CityLocationSelectionState) obj;
                Intrinsics.i(it4, "it");
                return CityLocationSelectionState.a(it4, false, null, CityLocationSelectionLayoutType.ConfigFetchFailed, null, null, null, null, false, null, false, 2043);
            case 15:
                CityLocationSelectionState it5 = (CityLocationSelectionState) obj;
                Intrinsics.i(it5, "it");
                return CityLocationSelectionState.a(it5, false, null, null, null, null, null, null, false, null, false, 1791);
            case 16:
                CityLocationSelectionState it6 = (CityLocationSelectionState) obj;
                Intrinsics.i(it6, "it");
                return CityLocationSelectionState.a(it6, false, null, null, null, null, null, null, false, null, false, 1919);
            case 17:
                CityLocationSelectionState it7 = (CityLocationSelectionState) obj;
                Intrinsics.i(it7, "it");
                return CityLocationSelectionState.a(it7, false, null, CityLocationSelectionLayoutType.LocationPermission, null, null, null, null, false, null, false, 2043);
            case 18:
                CityLocationSelectionState it8 = (CityLocationSelectionState) obj;
                Intrinsics.i(it8, "it");
                return CityLocationSelectionState.a(it8, false, null, null, null, null, null, null, false, null, false, 2046);
            case 19:
                CityLocationSelectionState it9 = (CityLocationSelectionState) obj;
                Intrinsics.i(it9, "it");
                return CityLocationSelectionState.a(it9, false, null, null, null, null, null, null, false, null, false, 2046);
            case 20:
                CityLocationSelectionState it10 = (CityLocationSelectionState) obj;
                Intrinsics.i(it10, "it");
                return CityLocationSelectionState.a(it10, false, null, null, null, null, null, null, false, null, false, 2046);
            case 21:
                CityLocationSelectionState it11 = (CityLocationSelectionState) obj;
                Intrinsics.i(it11, "it");
                return CityLocationSelectionState.a(it11, false, null, null, null, null, null, null, false, null, false, 1919);
            case 22:
                CityLocationSelectionState it12 = (CityLocationSelectionState) obj;
                Intrinsics.i(it12, "it");
                return CityLocationSelectionState.a(it12, true, null, null, null, null, null, null, false, null, false, 2046);
            case 23:
                return CityLocationSelectionState.a((CityLocationSelectionState) obj, true, null, null, null, null, null, null, false, null, false, 2046);
            case 24:
                return CityLocationSelectionState.a((CityLocationSelectionState) obj, false, null, CityLocationSelectionLayoutType.FetchError, null, null, null, null, false, null, false, 2042);
            case 25:
                return CityLocationSelectionState.a((CityLocationSelectionState) obj, false, null, CityLocationSelectionLayoutType.ConfigFetchFailed, null, null, null, null, false, null, false, 2043);
            case 26:
                return CityLocationSelectionState.a((CityLocationSelectionState) obj, false, null, CityLocationSelectionLayoutType.ConfigFetchFailed, null, null, null, null, false, null, false, 2043);
            case 27:
                return CityLocationSelectionState.a((CityLocationSelectionState) obj, false, null, null, null, null, null, null, false, null, false, 2046);
            case 28:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.i(AnimatedContent, "$this$AnimatedContent");
                CityLocationSelectionLayoutType layoutType = (CityLocationSelectionLayoutType) AnimatedContent.getTargetState();
                Intrinsics.i(layoutType, "layoutType");
                switch (CityLocationSelectionScreenKt.WhenMappings.f6597a[layoutType.ordinal()]) {
                    case 1:
                        return ContentAnimationTransitionSpecKt.d(AnimatedContent);
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return ContentAnimationTransitionSpecKt.b(AnimatedContent);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            default:
                CityAppModel it13 = (CityAppModel) obj;
                Intrinsics.i(it13, "it");
                return it13.f8854a;
        }
    }
}
