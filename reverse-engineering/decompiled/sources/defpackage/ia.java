package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Density;
import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.home.ui.chalobusrouteinfo.RouteSuggestionTimePickerUIState;
import app.chalo.livetracking.frameworklivetracking.ChaloSocketClient;
import app.chalo.livetracking.frameworklivetracking.chalosocket.ChaloSocketAndroidImpl;
import app.chalo.livetracking.frameworklivetracking.chalosocket.KSocketData;
import app.chalo.livetracking.frameworklivetracking.chalosocket.model.SocketEvent;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultIntent;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.login.ui.options.LoginOptionsComponent;
import app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsStartedAction;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.scenes.args.LoginOtpSceneArgs;
import app.chalo.utils.ChaloUseCaseResult;
import io.socket.client.Ack;
import io.socket.client.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ia implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15894a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ia(SheetState sheetState, CoroutineScope coroutineScope, Animatable animatable, Function0 function0) {
        this.f15894a = 8;
        this.d = sheetState;
        this.e = coroutineScope;
        this.b = animatable;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15894a) {
            case 0:
                return BasicTooltipKt.TooltipPopup$lambda$9$lambda$8((Function0) this.c, (TooltipState) this.d, (CoroutineScope) this.e, (MutableState) this.b);
            case 1:
                ((RouteSuggestionTimePickerUIState) this.c).i.invoke(Integer.valueOf(((MutableIntState) this.d).getIntValue()), Integer.valueOf(((MutableIntState) this.e).getIntValue()), (String) ((MutableState) this.b).getValue());
                return Unit.f17538a;
            case 2:
                ArrayList arrayList = (ArrayList) this.c;
                final Function1 function1 = (Function1) this.d;
                ChaloSocketAndroidImpl chaloSocketAndroidImpl = (ChaloSocketAndroidImpl) this.e;
                SocketEvent socketEvent = (SocketEvent) this.b;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    KSocketData kSocketData = (KSocketData) obj;
                    if (!(kSocketData instanceof KSocketData.StringData)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList2.add(((KSocketData.StringData) kSocketData).f4217a);
                }
                if (function1 != null) {
                    Ack ack = new Ack() { // from class: rl
                        @Override // io.socket.client.Ack
                        public final void call(Object[] objArr) {
                            function1.invoke(ArraysKt.h0(objArr));
                        }
                    };
                    Socket socket = chaloSocketAndroidImpl.b;
                    if (socket != null) {
                        socket.k(socketEvent.getEventName(), arrayList2.toArray(new Object[0]), ack);
                    }
                } else {
                    Socket socket2 = chaloSocketAndroidImpl.b;
                    if (socket2 != null) {
                        String eventName = socketEvent.getEventName();
                        Object[] array = arrayList2.toArray(new Object[0]);
                        socket2.a(eventName, Arrays.copyOf(array, array.length));
                    }
                }
                return Unit.f17538a;
            case 3:
                ((ChaloSocketClient) this.c).f4176a.e((SocketEvent) this.d, (Function1) this.e, (ArrayList) this.b);
                return Unit.f17538a;
            case 4:
                return ComposerImpl.insertMovableContentGuarded$lambda$0$0$0$0((ComposerImpl) this.c, (ChangeList) this.d, (SlotReader) this.e, (MovableContentStateReference) this.b);
            case 5:
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) this.c;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.d;
                cy cyVar = (cy) this.e;
                FreshPurchaseDelegate freshPurchaseDelegate = (FreshPurchaseDelegate) this.b;
                booleanRef.element = true;
                PremiumBusFareDetailsStartedAction premiumBusFareDetailsStartedAction = (PremiumBusFareDetailsStartedAction) objectRef.element;
                if (premiumBusFareDetailsStartedAction != null) {
                    freshPurchaseDelegate.x.remove(premiumBusFareDetailsStartedAction);
                }
                cyVar.invoke();
                return Unit.f17538a;
            case 6:
                return InfiniteTransitionKt.animateValue$lambda$1$0(this.c, (InfiniteTransition.TransitionAnimationState) this.d, this.e, (InfiniteRepeatableSpec) this.b);
            case 7:
                LoginOptionsComponent loginOptionsComponent = (LoginOptionsComponent) this.c;
                ChaloUseCaseResult.Success success = (ChaloUseCaseResult.Success) this.d;
                String str = (String) this.e;
                CountryPhoneNumberConfig countryPhoneNumberConfig = (CountryPhoneNumberConfig) this.b;
                ChaloNavigationManager chaloNavigationManager = loginOptionsComponent.w;
                String str2 = (String) success.f10419a;
                String str3 = countryPhoneNumberConfig.c;
                LoginOptionsArgs loginOptionsArgs = loginOptionsComponent.k;
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new LoginOtpSceneArgs(loginOptionsArgs.b, str2, str, str3, loginOptionsArgs.c), null, null, 6));
                return Unit.f17538a;
            case 8:
                return ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$11$lambda$10((SheetState) this.d, (CoroutineScope) this.e, (Animatable) this.b, (Function0) this.c);
            case 9:
                return NavigationDrawerKt.DismissibleNavigationDrawer$lambda$30$lambda$29((DrawerState) this.c, (Density) this.d, (FiniteAnimationSpec) this.e, (FiniteAnimationSpec) this.b);
            case 10:
                Integer num = (Integer) this.c;
                Function1 function2 = (Function1) this.d;
                TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel = (TripPlannerItineraryAppResponseModel) this.e;
                TripPlannerLegAppModel.Bus bus = (TripPlannerLegAppModel.Bus) this.b;
                if (num != null) {
                    function2.invoke(new StopTripPlannerResultIntent.OnStepCountClicked(tripPlannerItineraryAppResponseModel, bus, num.intValue()));
                }
                return Unit.f17538a;
            case 11:
                return SwipeToDismissBoxKt.rememberSwipeToDismissBoxState$lambda$5$lambda$4((SwipeToDismissBoxValue) this.c, (Density) this.d, (Function1) this.e, (Function1) this.b);
            default:
                ((Function3) this.c).invoke(Integer.valueOf(((MutableIntState) this.e).getIntValue()), (SnapshotStateList) this.d, (String) ((MutableState) this.b).getValue());
                return Unit.f17538a;
        }
    }

    public /* synthetic */ ia(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f15894a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }
}
