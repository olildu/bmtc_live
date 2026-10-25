package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.CoroutineLiveData;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.chalo.chalobususerprofile.ui.compose.TimingVariabilityChipUIState;
import app.chalo.checkout.ui.screen.payment.IndividualModeUiState;
import app.chalo.checkout.ui.screen.upi.CheckoutUpiAppsComponent;
import app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent;
import app.chalo.compose.components.ChaloSnackbarKt;
import app.chalo.compose.components.chalomap.AndroidCameraMoveReason;
import app.chalo.compose.components.chalomap.AndroidMapCameraPosition;
import app.chalo.compose.components.chalomap.AndroidMapProjection;
import app.chalo.compose.components.chalomap.ChaloMapCameraPositionStateData;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.core.navigation.checkout.CheckoutParentComponent;
import app.chalo.core.navigation.root.DefaultRootComponent;
import app.chalo.core.navigation.root.RootComponent;
import app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenComponent;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkRestoredState;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState;
import app.chalo.network.logging.ChaloInternalNetworkInspector;
import app.chalo.network.logging.ChaloInternalNetworkInspectorKt;
import app.chalo.onboarding.citydiscontinued.CityDiscontinuedComponent;
import app.chalo.onboarding.citydiscontinued.CityDiscontinuedIntent;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.cardwithtextleftandrighticon.CardWithTextLeftAndRightIconUiState;
import app.chalo.uistate.components.StopSelectionUIState;
import app.chalo.uistate.dialog.CalendarDateUIState;
import app.chalo.uistate.dialog.DatePickerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.utils.CommonHtmlParserImpl;
import app.chalo.vault.chalo_vault;
import app.chalo.vault.db.ChaloCoreDatabase;
import app.chalo.vault.vault.Chalo_vaultImplKt;
import com.arkivanov.decompose.Relay;
import com.arkivanov.decompose.router.children.NavEvent;
import com.arkivanov.essenty.backhandler.BackDispatcher;
import com.arkivanov.essenty.backhandler.BackHandler;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.maps.android.compose.CameraMoveStartedReason;
import com.google.maps.android.compose.CameraPositionState;
import io.ktor.util.AttributeKey;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.Handshake;
import okhttp3.internal.connection.ConnectPlan;
import org.koin.core.parameter.ParametersHolderKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fi implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15643a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fi(Object obj, int i) {
        this.f15643a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f15643a;
        Unit unit = Unit.f17538a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((TimingVariabilityChipUIState) obj).d.a();
                return unit;
            case 1:
                ChaloCardLinkViewState chaloCardLinkViewState = (ChaloCardLinkViewState) ((ChaloCardLinkCardComponent) obj).f.getValue();
                Intrinsics.i(chaloCardLinkViewState, "<this>");
                return new ChaloCardLinkRestoredState(chaloCardLinkViewState.i, chaloCardLinkViewState.j, chaloCardLinkViewState.k, chaloCardLinkViewState.l, chaloCardLinkViewState.f6279a, chaloCardLinkViewState.b, chaloCardLinkViewState.h);
            case 2:
                ((CardWithTextLeftAndRightIconUiState) obj).e.invoke();
                return unit;
            case 3:
                ChaloCoreDatabase chaloCoreDatabase = (ChaloCoreDatabase) obj;
                chaloCoreDatabase.h();
                AndroidSqliteDriver androidSqliteDriverB = chaloCoreDatabase.b();
                try {
                    chalo_vault chalo_vaultVarA = Chalo_vaultImplKt.a(Reflection.a(chalo_vault.class), androidSqliteDriverB);
                    ChaloCoreDatabase.a(chalo_vaultVarA);
                    return chalo_vaultVarA;
                } catch (Throwable unused) {
                    androidSqliteDriverB.close();
                    chaloCoreDatabase.c();
                    try {
                        return Chalo_vaultImplKt.a(Reflection.a(chalo_vault.class), chaloCoreDatabase.b());
                    } catch (Throwable unused2) {
                        chaloCoreDatabase.d();
                        throw null;
                    }
                }
            case 4:
                PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
                ((DatePickerUIState) obj).b.a();
                return unit;
            case 5:
                ((ClickableTextUiState) obj).d.a();
                return unit;
            case 6:
                ChaloInternalNetworkInspector chaloInternalNetworkInspector = (ChaloInternalNetworkInspector) obj;
                AttributeKey attributeKey = ChaloInternalNetworkInspectorKt.f6465a;
                return chaloInternalNetworkInspector;
            case 7:
                CameraPositionState cameraPositionState = (CameraPositionState) obj;
                boolean zBooleanValue = ((Boolean) cameraPositionState.f14589a.getValue()).booleanValue();
                AndroidCameraMoveReason androidCameraMoveReason = new AndroidCameraMoveReason((CameraMoveStartedReason) cameraPositionState.b.getValue());
                GoogleMap googleMapB = cameraPositionState.b();
                Projection projection = googleMapB != null ? googleMapB.getProjection() : null;
                return new ChaloMapCameraPositionStateData(zBooleanValue, androidCameraMoveReason, projection != null ? new AndroidMapProjection(projection) : null, new AndroidMapCameraPosition((CameraPosition) cameraPositionState.c.getValue()));
            case 8:
                ((CalendarDateUIState) obj).e.a();
                return unit;
            case 9:
                ((SearchBarWithActionUIState) obj).c.b.a();
                return unit;
            case 10:
                float f = ChaloSnackbarKt.f1826a;
                UiEventHandler uiEventHandler = ((SnackbarUIState) obj).c;
                if (uiEventHandler != null) {
                    uiEventHandler.a();
                }
                return unit;
            case 11:
                return Boolean.valueOf(!((SnapshotStateList) obj).isEmpty());
            case 12:
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = ((IndividualModeUiState) obj).d;
                if (uiEventHandler$Companion$fromLambda$1 != null) {
                    uiEventHandler$Companion$fromLambda$1.a();
                }
                return unit;
            case 13:
                CheckoutParentComponent checkoutParentComponent = (CheckoutParentComponent) obj;
                return ParametersHolderKt.a(checkoutParentComponent.d, checkoutParentComponent.e);
            case 14:
                gf.u(null, ((CheckoutUpiAppsComponent) obj).p);
                return unit;
            case 15:
                gf.u(null, ((CheckoutWalletAppsComponent) obj).u);
                return unit;
            case 16:
                ((Relay) obj).a(NavEvent.Back.f12355a);
                return unit;
            case 17:
                ((CityDiscontinuedComponent) obj).G0(CityDiscontinuedIntent.OnBackPressed.f6555a);
                return unit;
            case 18:
                CommonHtmlParserImpl commonHtmlParserImpl = (CommonHtmlParserImpl) obj;
                commonHtmlParserImpl.d.reset();
                commonHtmlParserImpl.f10420a.clear();
                return unit;
            case 19:
                ((ImageUIState) obj).h.a();
                return unit;
            case 20:
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$2 = ((StopSelectionUIState) obj).f;
                if (uiEventHandler$Companion$fromLambda$2 != null) {
                    uiEventHandler$Companion$fromLambda$2.a();
                }
                return unit;
            case 21:
                return CollectionsKt.R((Pair) obj);
            case 22:
                String str = ((ConfirmBookingScreenComponent) obj).u;
                if (str != null) {
                    return new ResultStateKeeperMeta(str);
                }
                return null;
            case 23:
                ((ps) obj).invoke();
                return unit;
            case 24:
                return ConnectPlan.connectTls$lambda$6((Handshake) obj);
            case 25:
                return CoreTextFieldKt.CoreTextField$lambda$4$0((Orientation) obj);
            case 26:
                return ((LegacyTextFieldState) obj).getLayoutResult();
            case 27:
                return CoroutineLiveData._init_$lambda$0((CoroutineLiveData) obj);
            case 28:
                return ((DatePickerColors) obj).dateTextFieldColors;
            default:
                RootComponent rootComponent = (RootComponent) obj;
                Intrinsics.g(rootComponent, "null cannot be cast to non-null type app.chalo.core.navigation.root.DefaultRootComponent");
                DefaultRootComponent defaultRootComponent = (DefaultRootComponent) rootComponent;
                BackHandler d = defaultRootComponent.f2181a.getD();
                if (!(d instanceof BackDispatcher) || !((BackDispatcher) d).b()) {
                    defaultRootComponent.k();
                }
                return unit;
        }
    }
}
