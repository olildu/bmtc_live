package defpackage;

import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.datastore.core.CorruptionException;
import app.chalo.data.ClosedLoopWalletSetupConfig;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepAppModel;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionBottomSheetDataStateType;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchRequest;
import com.google.android.gms.maps.MapView;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import io.ktor.http.ContentType;
import io.ktor.http.FileContentTypeKt;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlinx.serialization.json.JsonBuilder;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20160a;

    public /* synthetic */ z20(int i) {
        this.f20160a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f20160a;
        boolean z = false;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -17, 31);
            case 1:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -17, 31);
            case 2:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -17, 31);
            case 3:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -17, 31);
            case 4:
                MatchResult matchResult = (MatchResult) obj;
                Intrinsics.i(matchResult, "matchResult");
                return matchResult.getValue().concat(",");
            case 5:
                ClosedLoopWalletSetupConfig it = (ClosedLoopWalletSetupConfig) obj;
                Intrinsics.i(it, "it");
                if (it.b && it.f2344a.length() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                ClosedLoopWalletSetupConfig it2 = (ClosedLoopWalletSetupConfig) obj;
                Intrinsics.i(it2, "it");
                String lowerCase = it2.f2344a.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                return lowerCase;
            case 7:
                Pair pair = (Pair) obj;
                Lazy lazy = FileContentTypeKt.f16792a;
                Intrinsics.i(pair, "<destruct>");
                return new Pair((ContentType) pair.getSecond(), (String) pair.getFirst());
            case 8:
                return FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$0((CorruptionException) obj);
            case 9:
                return FloatingActionButtonKt.FloatingActionButton_lF_WlFE$lambda$3$lambda$2((SemanticsPropertyReceiver) obj);
            case 10:
                return obj;
            case 11:
                return FontFamilyResolverImpl.preload$lambda$1$0((TypefaceResult.Immutable) obj);
            case 12:
                return FontFamilyResolverImpl.preload$lambda$1$1((TypefaceResult.Immutable) obj);
            case 13:
                return FontListFontFamilyTypefaceAdapter.preload$lambda$3$0((TypefaceRequest) obj);
            case 14:
                SeatInfoAppModel it3 = (SeatInfoAppModel) obj;
                Intrinsics.i(it3, "it");
                return it3.c;
            case 15:
                ApplicableRuleAppModel it4 = (ApplicableRuleAppModel) obj;
                Intrinsics.i(it4, "it");
                return it4.f7070a;
            case 16:
                SeatInfoAppModel it5 = (SeatInfoAppModel) obj;
                Intrinsics.i(it5, "it");
                return it5.c;
            case 17:
                Intrinsics.i((PremiumBusFareDetailsSwitchRequest) obj, "it");
                return unit;
            case 18:
                JsonBuilder Json = (JsonBuilder) obj;
                Intrinsics.i(Json, "$this$Json");
                Json.c = true;
                Json.d = true;
                Json.g = true;
                Json.b = false;
                Json.f18189a = true;
                Json.h = "type";
                return unit;
            case 19:
                return GlobalSnapshot._init_$lambda$0(obj);
            case 20:
                Intrinsics.i((MapView) obj, "it");
                return unit;
            case 21:
                GroupTicketLegSelectionDataState it6 = (GroupTicketLegSelectionDataState) obj;
                Intrinsics.i(it6, "it");
                return GroupTicketLegSelectionDataState.a(it6, null, false, GroupTicketLegSelectionBottomSheetDataStateType.None.f5928a, null, null, MapsKt.d(), 0, null, 219);
            case 22:
                GroupTicketSelectableStepAppModel it7 = (GroupTicketSelectableStepAppModel) obj;
                Intrinsics.i(it7, "it");
                return String.valueOf(it7.f5864a);
            case 23:
                GroupTicketSelectableStepAppModel it8 = (GroupTicketSelectableStepAppModel) obj;
                Intrinsics.i(it8, "it");
                return it8.c.getB().getMode();
            case 24:
                return GroupTicketLegSelectionDataState.a((GroupTicketLegSelectionDataState) obj, null, true, null, null, null, null, 0, null, 253);
            case 25:
                return GroupTicketLegSelectionDataState.a((GroupTicketLegSelectionDataState) obj, null, false, null, null, null, null, 0, null, 253);
            case 26:
                return GroupTicketLegSelectionDataState.a((GroupTicketLegSelectionDataState) obj, null, false, null, null, null, null, 0, null, 253);
            case 27:
                return GroupTicketLegSelectionDataState.a((GroupTicketLegSelectionDataState) obj, null, true, null, null, null, null, 0, null, 253);
            case 28:
                return GroupTicketLegSelectionDataState.a((GroupTicketLegSelectionDataState) obj, null, false, null, null, null, null, 0, null, 253);
            default:
                return GroupTicketLegSelectionDataState.a((GroupTicketLegSelectionDataState) obj, null, true, null, null, null, null, 0, null, 253);
        }
    }
}
