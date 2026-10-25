package defpackage;

import android.content.Context;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.AnimatedShapeKt;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent;
import app.chalo.appsupport.BookingHelpScreenViewIntent;
import app.chalo.ble_communication.BLECommunicationRange;
import app.chalo.ble_communication.BLEDataReceivingDistance;
import app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid;
import app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2$receiver$1;
import app.chalo.ble_communication.model.BLETransferData;
import app.chalo.ble_communication.passengerside.PassengerSideBLEOperationsMapperKt;
import app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeatureImpl;
import app.chalo.busesaroundyou.BusesAroundYouComponent;
import app.chalo.busesaroundyou.BusesAroundYouIntent;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyDataState;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyIntent;
import app.chalo.chalobususerprofile.ui.compose.TimePickerType;
import app.chalo.chalobususerprofile.ui.compose.TravelFrequency;
import app.chalo.geoquery.data.GeoFireEvent;
import app.chalo.geoquery.data.LiveTripInfoDataModel;
import app.chalo.home.ui.chalobus.ChaloBusPageDisplayItemData;
import app.chalo.home.ui.chalobus.ChaloBusScreenHeaderLayout_androidKt;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.home.ui.chalobus.ChaloBusViewIntent;
import app.chalo.home.ui.chalobus.PremiumBusTutorialConfigUiModel;
import app.chalo.home.ui.chalobus.ProductPurchaseNudgeDisplayInfo;
import app.chalo.home.ui.chalobus.ProductPurchaseNudgeInfoCtaType;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoViewIntent;
import app.chalo.home.ui.chalobusrouteinfo.CorridorUiModel;
import app.chalo.home.ui.chalobusrouteinfo.Filters;
import app.chalo.home.ui.chalobusrouteinfo.RouteInfoTabUiModel;
import app.chalo.home.ui.chalobusrouteinfo.RouteUiModel;
import app.chalo.models.bookinghelp.BookingHelpFaq;
import app.chalo.ncmc.ui.landing.ChaloCardOptionUiModel;
import app.chalo.onboarding.languageselection.splitinstallhandler.AndroidSplitInstallHandler;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.UserConsentScreenArgs;
import app.chalo.userconsent.UserConsentFlowType;
import coil3.gif.AnimatedImageDecoder;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import com.arkivanov.essenty.statekeeper.Utils_javaKt;
import com.silencelaboratories.silentride.components.Passenger;
import com.silencelaboratories.silentride.components.SilentRideComponent;
import com.silencelaboratories.silentride.states.SilentRideState;
import defpackage.vo1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.serialization.SerializationStrategy;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18275a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l3(int i, Object obj, Object obj2) {
        this.f18275a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [app.chalo.ble_communication.passengerside.feature.b] */
    /* JADX WARN: Type inference failed for: r3v2, types: [app.chalo.ble_communication.passengerside.feature.b] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SupportSQLiteDatabase writableDatabase;
        switch (this.f18275a) {
            case 0:
                return AnchoredDraggableState.trySnapTo$lambda$9((AnchoredDraggableState) this.b, this.c);
            case 1:
                ((AndroidSplitInstallHandler) this.b).f6664a.c((c5) this.c);
                return Unit.f17538a;
            case 2:
                AndroidSqliteDriver androidSqliteDriver = (AndroidSqliteDriver) this.b;
                SupportSQLiteDatabase supportSQLiteDatabase = (SupportSQLiteDatabase) this.c;
                SupportSQLiteOpenHelper supportSQLiteOpenHelper = androidSqliteDriver.f711a;
                if (supportSQLiteOpenHelper != null && (writableDatabase = supportSQLiteOpenHelper.getWritableDatabase()) != null) {
                    return writableDatabase;
                }
                Intrinsics.f(supportSQLiteDatabase);
                return supportSQLiteDatabase;
            case 3:
                return AndroidTextContextMenuToolbarProvider.observeReadsAndGet$lambda$0((Ref.ObjectRef) this.b, (Function0) this.c);
            case 4:
                return AnimateAsStateKt.animateValueAsState$lambda$7$0((Channel) this.b, this.c);
            case 5:
                return AnimatedImageDecoder.b((AnimatedImageDecoder) this.b, (Ref.BooleanRef) this.c);
            case 6:
                return AnimatedShapeKt.rememberAnimatedShape$lambda$4$lambda$3((Channel) this.b, (RoundedCornerShape) this.c);
            case 7:
                ((AppMigrationPreconditionsComponent) this.b).m.b(new ChaloNavigationRequest.Navigate(new UserConsentScreenArgs(UserConsentFlowType.FreshLogin.INSTANCE, (String) this.c), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                return Unit.f17538a;
            case 8:
                Context context = (Context) this.b;
                final BLEPassengerSideCommunicationFeatureImpl bLEPassengerSideCommunicationFeatureImpl = (BLEPassengerSideCommunicationFeatureImpl) this.c;
                final int i = 0;
                final int i2 = 1;
                return new Passenger(context, new Function1() { // from class: app.chalo.ble_communication.passengerside.feature.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        BLEDataReceivingDistance bLEDataReceivingDistance;
                        switch (i) {
                            case 0:
                                SilentRideComponent.Passenger.ActiveModeDriverDevice activeModeDriverDevice = (SilentRideComponent.Passenger.ActiveModeDriverDevice) obj;
                                Intrinsics.i(activeModeDriverDevice, "activeModeDriverDevice");
                                byte[] bArrE = activeModeDriverDevice.e();
                                vo1.x("BLECommPassengerSideActiveMode onBroadcastDataReceivedFromDriverDevice data = ", bArrE != null ? bArrE.toString() : null, "message");
                                if (bArrE != null) {
                                    BLECommunicationRange bLECommunicationRange = BLECommunicationRange.LONG;
                                    SilentRideState.Passenger.ActiveModeDriverDevice activeModeDriverDeviceA = activeModeDriverDevice.a();
                                    if (activeModeDriverDeviceA.equals(SilentRideState.Passenger.ActiveModeDriverDevice.Tapped.c)) {
                                        bLEDataReceivingDistance = BLEDataReceivingDistance.TAPPED;
                                    } else if (activeModeDriverDeviceA.equals(SilentRideState.Passenger.ActiveModeDriverDevice.InRange.c)) {
                                        bLEDataReceivingDistance = BLEDataReceivingDistance.IN_RANGE;
                                    } else {
                                        if (!activeModeDriverDeviceA.equals(SilentRideState.Passenger.ActiveModeDriverDevice.OutOfRange.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bLEDataReceivingDistance = BLEDataReceivingDistance.OUT_OF_RANGE;
                                    }
                                    BLEDataReceivingDistance bLEDataReceivingDistance2 = bLEDataReceivingDistance;
                                    BLEPassengerSideCommunicationFeatureImpl bLEPassengerSideCommunicationFeatureImpl2 = bLEPassengerSideCommunicationFeatureImpl;
                                    BuildersKt.d(bLEPassengerSideCommunicationFeatureImpl2.i, null, null, new BLEPassengerSideCommunicationFeatureImpl$onBroadcastDataReceivedFromDriverDevice$1(bLEPassengerSideCommunicationFeatureImpl2, new BLETransferData.OneWayBroadcastBLETransferData(bArrE, bLECommunicationRange, 15000L, bLEDataReceivingDistance2, bLEPassengerSideCommunicationFeatureImpl2.f1139a.e()), null), 3);
                                }
                                return Unit.f17538a;
                            default:
                                SilentRideComponent.Passenger.PassiveModeDriverDevice passiveModeDriverDevice = (SilentRideComponent.Passenger.PassiveModeDriverDevice) obj;
                                Intrinsics.i(passiveModeDriverDevice, "passiveModeDriverDevice");
                                String message = "BLECommConnectionDataExchange driver device state changed, state = " + PassengerSideBLEOperationsMapperKt.a(passiveModeDriverDevice.a());
                                Intrinsics.i(message, "message");
                                BLEPassengerSideCommunicationFeatureImpl bLEPassengerSideCommunicationFeatureImpl3 = bLEPassengerSideCommunicationFeatureImpl;
                                BuildersKt.d(bLEPassengerSideCommunicationFeatureImpl3.i, null, null, new BLEPassengerSideCommunicationFeatureImpl$onConnectedDriverDeviceStateChanged$1(bLEPassengerSideCommunicationFeatureImpl3, passiveModeDriverDevice, null), 3);
                                return Unit.f17538a;
                        }
                    }
                }, new Function1() { // from class: app.chalo.ble_communication.passengerside.feature.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        BLEDataReceivingDistance bLEDataReceivingDistance;
                        switch (i2) {
                            case 0:
                                SilentRideComponent.Passenger.ActiveModeDriverDevice activeModeDriverDevice = (SilentRideComponent.Passenger.ActiveModeDriverDevice) obj;
                                Intrinsics.i(activeModeDriverDevice, "activeModeDriverDevice");
                                byte[] bArrE = activeModeDriverDevice.e();
                                vo1.x("BLECommPassengerSideActiveMode onBroadcastDataReceivedFromDriverDevice data = ", bArrE != null ? bArrE.toString() : null, "message");
                                if (bArrE != null) {
                                    BLECommunicationRange bLECommunicationRange = BLECommunicationRange.LONG;
                                    SilentRideState.Passenger.ActiveModeDriverDevice activeModeDriverDeviceA = activeModeDriverDevice.a();
                                    if (activeModeDriverDeviceA.equals(SilentRideState.Passenger.ActiveModeDriverDevice.Tapped.c)) {
                                        bLEDataReceivingDistance = BLEDataReceivingDistance.TAPPED;
                                    } else if (activeModeDriverDeviceA.equals(SilentRideState.Passenger.ActiveModeDriverDevice.InRange.c)) {
                                        bLEDataReceivingDistance = BLEDataReceivingDistance.IN_RANGE;
                                    } else {
                                        if (!activeModeDriverDeviceA.equals(SilentRideState.Passenger.ActiveModeDriverDevice.OutOfRange.c)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bLEDataReceivingDistance = BLEDataReceivingDistance.OUT_OF_RANGE;
                                    }
                                    BLEDataReceivingDistance bLEDataReceivingDistance2 = bLEDataReceivingDistance;
                                    BLEPassengerSideCommunicationFeatureImpl bLEPassengerSideCommunicationFeatureImpl2 = bLEPassengerSideCommunicationFeatureImpl;
                                    BuildersKt.d(bLEPassengerSideCommunicationFeatureImpl2.i, null, null, new BLEPassengerSideCommunicationFeatureImpl$onBroadcastDataReceivedFromDriverDevice$1(bLEPassengerSideCommunicationFeatureImpl2, new BLETransferData.OneWayBroadcastBLETransferData(bArrE, bLECommunicationRange, 15000L, bLEDataReceivingDistance2, bLEPassengerSideCommunicationFeatureImpl2.f1139a.e()), null), 3);
                                }
                                return Unit.f17538a;
                            default:
                                SilentRideComponent.Passenger.PassiveModeDriverDevice passiveModeDriverDevice = (SilentRideComponent.Passenger.PassiveModeDriverDevice) obj;
                                Intrinsics.i(passiveModeDriverDevice, "passiveModeDriverDevice");
                                String message = "BLECommConnectionDataExchange driver device state changed, state = " + PassengerSideBLEOperationsMapperKt.a(passiveModeDriverDevice.a());
                                Intrinsics.i(message, "message");
                                BLEPassengerSideCommunicationFeatureImpl bLEPassengerSideCommunicationFeatureImpl3 = bLEPassengerSideCommunicationFeatureImpl;
                                BuildersKt.d(bLEPassengerSideCommunicationFeatureImpl3.i, null, null, new BLEPassengerSideCommunicationFeatureImpl$onConnectedDriverDeviceStateChanged$1(bLEPassengerSideCommunicationFeatureImpl3, passiveModeDriverDevice, null), 3);
                                return Unit.f17538a;
                        }
                    }
                });
            case 9:
                return BasicTextFieldKt.BasicTextField$lambda$20$0((TextFieldValue) this.b, (MutableState) this.c);
            case 10:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$1$0((TextLinkScope) this.b, (AnnotatedString) this.c);
            case 11:
                return Boolean.valueOf(BasicTooltipKt.anchorSemantics$lambda$12$lambda$11((CoroutineScope) this.b, (TooltipState) this.c));
            case 12:
                BluetoothHardwareOperationsFeatureAndroid bluetoothHardwareOperationsFeatureAndroid = (BluetoothHardwareOperationsFeatureAndroid) this.b;
                BluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2$receiver$1 bluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2$receiver$1 = (BluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2$receiver$1) this.c;
                bluetoothHardwareOperationsFeatureAndroid.getClass();
                bluetoothHardwareOperationsFeatureAndroid.f1117a.unregisterReceiver(bluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2$receiver$1);
                return Unit.f17538a;
            case 13:
                ((Function1) this.b).invoke(new BookingHelpScreenViewIntent.OnFaqActionClicked(((BookingHelpFaq) this.c).c));
                return Unit.f17538a;
            case 14:
                SerializationStrategy serializationStrategy = (SerializationStrategy) this.b;
                Object obj = this.c;
                if (obj != null) {
                    return Utils_javaKt.b(serializationStrategy, obj);
                }
                return null;
            case 15:
                GeoFireEvent geoFireEvent = (GeoFireEvent) this.b;
                BusesAroundYouComponent busesAroundYouComponent = (BusesAroundYouComponent) this.c;
                LiveTripInfoDataModel liveTripInfoDataModel = geoFireEvent.b;
                if (liveTripInfoDataModel != null) {
                    busesAroundYouComponent.K0(new BusesAroundYouIntent.BusMarkerClicked(liveTripInfoDataModel));
                }
                return Boolean.FALSE;
            case 16:
                MutableState mutableState = (MutableState) this.b;
                MutableIntState mutableIntState = (MutableIntState) this.c;
                mutableState.setValue(Boolean.FALSE);
                mutableIntState.setIntValue(0);
                return Unit.f17538a;
            case 17:
                ((Function1) this.b).invoke(((ChaloCardOptionUiModel) this.c).f6375a);
                return Unit.f17538a;
            case 18:
                ((Function1) this.b).invoke(new ChaloBusRouteInfoViewIntent.ExpandCorridorIntent(((CorridorUiModel) this.c).f3365a));
                return Unit.f17538a;
            case 19:
                ((Function1) this.b).invoke(new ChaloBusRouteInfoViewIntent.FilterSelectedIntent(((Filters) this.c).f3366a));
                return Unit.f17538a;
            case 20:
                ((Function1) this.b).invoke(new ChaloBusRouteInfoViewIntent.TabSelectedIntent(((RouteInfoTabUiModel) this.c).f3367a));
                return Unit.f17538a;
            case 21:
                ((Function1) this.b).invoke(new ChaloBusRouteInfoViewIntent.OnViewRouteClickIntent(((RouteUiModel) this.c).f3374a));
                return Unit.f17538a;
            case 22:
                return ChaloBusScreenHeaderLayout_androidKt.a((int) MathKt.g(((Number) ((Animatable) this.b).getValue()).floatValue()), (String) this.c);
            case 23:
                ChaloBusPageDisplayItemData chaloBusPageDisplayItemData = (ChaloBusPageDisplayItemData) this.b;
                Function1 function1 = (Function1) this.c;
                switch (ChaloBusScreenUIKt.WhenMappings.c[chaloBusPageDisplayItemData.h.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        function1.invoke(new ChaloBusViewIntent.ChaloBusPageItemClickedIntent(chaloBusPageDisplayItemData.h, ""));
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Unit.f17538a;
            case 24:
                ((Function1) this.b).invoke((ProductPurchaseNudgeDisplayInfo) this.c);
                return Unit.f17538a;
            case 25:
                ((Function1) this.b).invoke((ProductPurchaseNudgeInfoCtaType) this.c);
                return Unit.f17538a;
            case 26:
                ((Function1) this.b).invoke((PremiumBusTutorialConfigUiModel) this.c);
                return Unit.f17538a;
            case 27:
                ((Function1) this.b).invoke(new ChaloBusUserProfileSurveyIntent.TimeFieldClicked((TimePickerType) this.c));
                return Unit.f17538a;
            case 28:
                ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState = (ChaloBusUserProfileSurveyDataState) this.b;
                Function1 function2 = (Function1) this.c;
                if (chaloBusUserProfileSurveyDataState.h) {
                    function2.invoke(ChaloBusUserProfileSurveyIntent.RetryBtnClickedIntent.f1213a);
                } else {
                    function2.invoke(ChaloBusUserProfileSurveyIntent.SuccessBackToHomeClicked.f1215a);
                }
                return Unit.f17538a;
            default:
                ((Function1) this.b).invoke(new ChaloBusUserProfileSurveyIntent.FrequencySelected((TravelFrequency) this.c));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ l3(SerializableContainer serializableContainer, SerializationStrategy serializationStrategy) {
        this.f18275a = 14;
        this.c = serializableContainer;
        this.b = serializationStrategy;
    }
}
