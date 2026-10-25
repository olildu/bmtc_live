package defpackage;

import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.material3.WideNavigationRailStateImpl;
import androidx.compose.ui.unit.IntRect;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.window.core.Version;
import app.chalo.citydata.data.model.app.RouteServiceType;
import app.chalo.livetracking.stoptripplannerresult.uistate.TabItemUiState;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModel;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerLegUiModel;
import app.chalo.ncmc.uvik.UvikSdkManagerAndroid;
import app.chalo.productsummary.ui.data.UserInfoUIState;
import app.chalo.security.encryption.utils.VaultEncryptionKeyUtils;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.components.TextWithFilledTrailingIconUIState;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsIntent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yh1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20110a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yh1(Object obj, int i) {
        this.f20110a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        switch (this.f20110a) {
            case 0:
                return TextFieldDelegate.Companion.notifyFocusedRect$lambda$0((TextDelegate) this.b);
            case 1:
                return TextLayoutState.layoutWithNewMeasureInputs__hBUhpc$lambda$0$0((TextLayoutState) this.b);
            case 2:
                return TextLinkScope.textRange$lambda$0$2((IntRect) this.b);
            case 3:
                return Boolean.valueOf(TextStringSimpleNode.applySemantics$lambda$3((TextStringSimpleNode) this.b));
            case 4:
                ((TextWithFilledTrailingIconUIState) this.b).d.a();
                return Unit.f17538a;
            case 5:
                List list = ((TripPlannerItineraryUiModel) this.b).g;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof TripPlannerLegUiModel.Bus) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == 1) {
                    TripPlannerLegUiModel.Bus bus = (TripPlannerLegUiModel.Bus) CollectionsKt.H(arrayList);
                    z = (bus != null ? bus.r : null) == RouteServiceType.PREMIUM;
                }
                return Boolean.valueOf(z);
            case 6:
                ((rj1) this.b).invoke();
                return Unit.f17538a;
            case 7:
                ((TabItemUiState) this.b).c.a();
                return Unit.f17538a;
            case 8:
                UiEventHandler uiEventHandler = ((UserInfoUIState) this.b).f8763a.f;
                if (uiEventHandler != null) {
                    uiEventHandler.a();
                }
                return Unit.f17538a;
            case 9:
                return ((UvikSdkManagerAndroid) this.b).f6447a.getApplicationContext().getPackageName();
            case 10:
                return PreferencesKeys.stringKey(((VaultEncryptionKeyUtils) this.b).f9365a + "vkey");
            case 11:
                return Version.bigInteger_delegate$lambda$0((Version) this.b);
            case 12:
                ((WalletAllTransactionsComponent) this.b).H0(WalletAllTransactionsIntent.ContactSupportDialogOkayClicked.f10817a);
                return Unit.f17538a;
            default:
                return WideNavigationRailStateImpl._currentVal$lambda$0((WideNavigationRailStateImpl) this.b);
        }
    }
}
