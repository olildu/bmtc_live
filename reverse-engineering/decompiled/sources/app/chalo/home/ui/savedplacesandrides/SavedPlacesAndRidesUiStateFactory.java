package app.chalo.home.ui.savedplacesandrides;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesIntent;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.error.StandardErrorScreenUIStateFactory;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceSavedRideAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceTag;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.c41;
import defpackage.p01;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/savedplacesandrides/SavedPlacesAndRidesUiStateFactory;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedPlacesAndRidesUiStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUtilsContract f3691a;
    public final StringProvider b;

    public SavedPlacesAndRidesUiStateFactory(StringProvider stringProvider, TimeUtilsContract timeUtilsContract) {
        this.f3691a = timeUtilsContract;
        this.b = stringProvider;
    }

    public static SavedPlaceUIState c(String str, String str2, IconType iconType, final UserCommutePreferenceStopPlaceAppModel userCommutePreferenceStopPlaceAppModel, UserCommutePreferenceTag userCommutePreferenceTag, final Function1 function1) {
        ImageUIState imageUIState;
        ImageUIState imageUIState2;
        ImageUISize imageUISize = new ImageUISize(ChaloThemeHelper.a().W);
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        ImageUIState imageUIState3 = new ImageUIState(iconType, (String) null, black, imageUISize, (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
        ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
        TextUIState.ChaloTextUIState chaloTextUIStateC = userCommutePreferenceStopPlaceAppModel != null ? ChaloTextStyleHelper.c(chaloTextStyleHelper, str, ChaloColorToken.ShadyGray.f9851a, null, null, null, null, 124) : ChaloTextStyleHelper.b(chaloTextStyleHelper, str2, black, 0, null, null, null, null, 124);
        TextUIState.ChaloTextUIState chaloTextUIStateB = userCommutePreferenceStopPlaceAppModel != null ? ChaloTextStyleHelper.b(chaloTextStyleHelper, e(userCommutePreferenceStopPlaceAppModel.d), null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT) : null;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        if (userCommutePreferenceStopPlaceAppModel != null) {
            final int i = 0;
            imageUIState = new ImageUIState(IconType.PROFILE_EDIT, (String) null, orangePrimary, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new Function0() { // from class: t41
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            function1.invoke(new SavedPlacesAndRidesIntent.AddAndEditPlaceIntent(userCommutePreferenceStopPlaceAppModel.b));
                            break;
                        default:
                            function1.invoke(new SavedPlacesAndRidesIntent.DeletePlaceIntent(userCommutePreferenceStopPlaceAppModel));
                            break;
                    }
                    return Unit.f17538a;
                }
            }), 114);
        } else {
            imageUIState = null;
        }
        if (userCommutePreferenceStopPlaceAppModel != null) {
            final int i2 = 1;
            imageUIState2 = new ImageUIState(IconType.IC_DELETE, (String) null, orangePrimary, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new Function0() { // from class: t41
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            function1.invoke(new SavedPlacesAndRidesIntent.AddAndEditPlaceIntent(userCommutePreferenceStopPlaceAppModel.b));
                            break;
                        default:
                            function1.invoke(new SavedPlacesAndRidesIntent.DeletePlaceIntent(userCommutePreferenceStopPlaceAppModel));
                            break;
                    }
                    return Unit.f17538a;
                }
            }), 114);
        } else {
            imageUIState2 = null;
        }
        return new SavedPlaceUIState(imageUIState3, chaloTextUIStateC, chaloTextUIStateB, imageUIState, imageUIState2, userCommutePreferenceStopPlaceAppModel == null ? UiEventHandler.Companion.a(new p01(26, function1, userCommutePreferenceTag)) : null);
    }

    public static String e(UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel) {
        if (userCommutePreferencePlaceLocationAppModel instanceof UserCommutePreferencePlaceLocationAppModel.Place) {
            return StringsKt.h0(((UserCommutePreferencePlaceLocationAppModel.Place) userCommutePreferencePlaceLocationAppModel).d, ",");
        }
        if (userCommutePreferencePlaceLocationAppModel instanceof UserCommutePreferencePlaceLocationAppModel.Stop) {
            return ((UserCommutePreferencePlaceLocationAppModel.Stop) userCommutePreferencePlaceLocationAppModel).d;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Function1 function1, ContinuationImpl continuationImpl) {
        SavedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1 savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1;
        ChaloColorToken.OrangePrimary orangePrimary;
        ImageUIState imageUIState;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof SavedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1) {
            savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1 = (SavedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1) continuationImpl;
            int i = savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1 = new SavedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1(this, continuationImpl);
            }
        } else {
            savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1 = new SavedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1(this, continuationImpl);
        }
        Object objB = savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1.label;
        ChaloColorToken.OrangePrimary orangePrimary2 = ChaloColorToken.OrangePrimary.f9835a;
        if (i2 == 0) {
            ResultKt.b(objB);
            orangePrimary = orangePrimary2;
            ImageUIState imageUIState2 = new ImageUIState(IconType.IC_PLUS, (String) null, orangePrimary, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250);
            savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1.L$0 = function1;
            savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1.L$1 = imageUIState2;
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1.L$2 = chaloTextStyleHelper2;
            savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1.label = 1;
            objB = this.b.b(StringEnum.SAVE_A_RIDE, new Object[0], savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            imageUIState = imageUIState2;
            chaloTextStyleHelper = chaloTextStyleHelper2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1.L$2;
            imageUIState = (ImageUIState) savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1.L$1;
            Function1 function2 = (Function1) savedPlacesAndRidesUiStateFactory$createAddRidesBtnUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextStyleHelper = chaloTextStyleHelper3;
            function1 = function2;
            orangePrimary = orangePrimary2;
        }
        return new AddRidesBtnUIState(UiEventHandler.Companion.a(new c41(function1, 10)), imageUIState, ChaloTextStyleHelper.g(chaloTextStyleHelper, (String) objB, orangePrimary, null, UIFontWeight.Bold, null, null, 108));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r2 == r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (r2 == r4) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesDataState r28, kotlin.jvm.functions.Function1 r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesUiStateFactory.b(app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x022d A[LOOP:0: B:32:0x0227->B:34:0x022d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x031a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0346  */
    /* JADX WARN: Code duplicated, block: B:49:0x0394  */
    /* JADX WARN: Code duplicated, block: B:55:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:60:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x041c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0422  */
    /* JADX WARN: Code duplicated, block: B:68:0x043d  */
    /* JADX WARN: Code duplicated, block: B:71:0x044f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0472  */
    /* JADX WARN: Code duplicated, block: B:78:0x049a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:84:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:87:0x04de  */
    /* JADX WARN: Code duplicated, block: B:90:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0520  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public final Object d(SavedPlacesAndRidesDataState savedPlacesAndRidesDataState, Function1 function1, ContinuationImpl continuationImpl) {
        SavedPlacesAndRidesUiStateFactory$createUiState$1 savedPlacesAndRidesUiStateFactory$createUiState$1;
        Object obj;
        SavedPlacesAndRidesDataState savedPlacesAndRidesDataState2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        final Function1 function2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ToolbarUIState toolbarUIState;
        Object objB;
        Object obj2;
        SavedPlacesAndRidesDataState savedPlacesAndRidesDataState3;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        List list;
        SavedPlacesAndRidesDataState savedPlacesAndRidesDataState4;
        TextUIState.ChaloTextUIState chaloTextUIStateE;
        Object objB2;
        SavedPlacesAndRidesDataState savedPlacesAndRidesDataState5;
        Function1 function3;
        ToolbarUIState toolbarUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        List list2;
        String str;
        List list3;
        ToolbarUIState toolbarUIState3;
        Function1 function4;
        SavedPlacesAndRidesDataState savedPlacesAndRidesDataState6;
        SavedPlaceUIState savedPlaceUIStateC;
        Object objB3;
        SavedPlaceUIState savedPlaceUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        List list4;
        ToolbarUIState toolbarUIState4;
        Function1 function5;
        SavedPlacesAndRidesDataState savedPlacesAndRidesDataState7;
        String str2;
        List list5;
        ToolbarUIState toolbarUIState5;
        Function1 function6;
        SavedPlacesAndRidesDataState savedPlacesAndRidesDataState8;
        LoadingShimmerUIState loadingShimmerUIState;
        WorkAndHomeUIState workAndHomeUIState;
        Object objB4;
        SavedPlacesAndRidesDataState savedPlacesAndRidesDataState9;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        WorkAndHomeUIState workAndHomeUIState2;
        Function1 function7;
        SavedPlacesAndRidesDataState savedPlacesAndRidesDataState10;
        Function1 function8;
        TextUIState.ChaloTextUIState chaloTextUIStateE2;
        LoadingShimmerUIState loadingShimmerUIState2;
        Object objA;
        SavedPlacesAndRidesDataState savedPlacesAndRidesDataState11;
        ToolbarUIState toolbarUIState6;
        Function1 function9;
        WorkAndHomeUIState workAndHomeUIState3;
        LoadingShimmerUIState loadingShimmerUIState3;
        List list6;
        RidesUIState ridesUIState;
        WorkAndHomeUIState workAndHomeUIState4;
        SavedPlacesAndRidesDataState savedPlacesAndRidesDataState12;
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetryB;
        IconType iconType;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory;
        Object objB5;
        RidesUIState ridesUIState2;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory2;
        IconType iconType2;
        String str3;
        String str4;
        LoadingDialogUIState loadingDialogUIState;
        Object objB6;
        WorkAndHomeUIState workAndHomeUIState5;
        StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry;
        RidesUIState ridesUIState3;
        ConfirmationDialogUIState confirmationDialogUIState;
        WorkAndHomeUIState workAndHomeUIState6;
        LoadingDialogUIState loadingDialogUIState2;
        ToolbarUIState toolbarUIState7;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        WorkAndHomeUIState workAndHomeUIState7;
        ChaloTextStyleHelper chaloTextStyleHelper5;
        ToolbarUIState toolbarUIState8;
        if (continuationImpl instanceof SavedPlacesAndRidesUiStateFactory$createUiState$1) {
            savedPlacesAndRidesUiStateFactory$createUiState$1 = (SavedPlacesAndRidesUiStateFactory$createUiState$1) continuationImpl;
            int i = savedPlacesAndRidesUiStateFactory$createUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                savedPlacesAndRidesUiStateFactory$createUiState$1 = new SavedPlacesAndRidesUiStateFactory$createUiState$1(this, continuationImpl);
            }
        } else {
            savedPlacesAndRidesUiStateFactory$createUiState$1 = new SavedPlacesAndRidesUiStateFactory$createUiState$1(this, continuationImpl);
        }
        Object objB7 = savedPlacesAndRidesUiStateFactory$createUiState$1.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = savedPlacesAndRidesUiStateFactory$createUiState$1.label;
        ChaloTextStyleHelper chaloTextStyleHelper6 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider = this.b;
        Object obj4 = null;
        switch (i2) {
            case 0:
                ResultKt.b(objB7);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function1;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = chaloTextStyleHelper6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 1;
                Object objB8 = stringProvider.b(StringEnum.SAVED_PLACES_AND_RIDES, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB8 == obj3) {
                    return obj3;
                }
                obj = objB8;
                savedPlacesAndRidesDataState2 = savedPlacesAndRidesDataState;
                chaloTextStyleHelper = chaloTextStyleHelper6;
                function2 = function1;
                ToolbarUIState toolbarUIState9 = new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) obj, null, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, null, null, 0.0f, null, null, 253);
                List<UserCommutePreferenceSavedRideAppModel> list7 = savedPlacesAndRidesDataState2.e;
                arrayList = new ArrayList(CollectionsKt.v(list7, 10));
                for (final UserCommutePreferenceSavedRideAppModel userCommutePreferenceSavedRideAppModel : list7) {
                    ArrayList arrayList3 = arrayList;
                    StringProvider stringProvider2 = stringProvider;
                    TextUIState.ChaloTextUIState chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper6, e(userCommutePreferenceSavedRideAppModel.b), null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    TextUIState.ChaloTextUIState chaloTextUIStateB2 = ChaloTextStyleHelper.b(chaloTextStyleHelper6, e(userCommutePreferenceSavedRideAppModel.c), null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    String strL = this.f3691a.l(userCommutePreferenceSavedRideAppModel.d);
                    final int i3 = 0;
                    TextUIState.ChaloTextUIState chaloTextUIStateB3 = ChaloTextStyleHelper.b(chaloTextStyleHelper6, strL, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    ImageUIState imageUIState = new ImageUIState(IconType.IC_SCHEDULE_CLOCK, (String) null, ChaloColorToken.Black.f9759a, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
                    IconType iconType3 = IconType.PROFILE_EDIT;
                    ImageUISize imageUISize = new ImageUISize(ChaloThemeHelper.a().h);
                    UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new Function0() { // from class: u41
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    function2.invoke(new SavedPlacesAndRidesIntent.EditRideIntent(userCommutePreferenceSavedRideAppModel));
                                    break;
                                default:
                                    function2.invoke(new SavedPlacesAndRidesIntent.DeleteRideIntent(userCommutePreferenceSavedRideAppModel));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
                    final int i4 = 1;
                    arrayList3.add(new SavedRideUIState(chaloTextUIStateB, chaloTextUIStateB2, chaloTextUIStateB3, imageUIState, new ImageUIState(iconType3, (String) null, orangePrimary, imageUISize, (UIContentScale) null, 0.0f, uiEventHandler$Companion$fromLambda$1A, 114), new ImageUIState(IconType.IC_DELETE, (String) null, orangePrimary, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new Function0() { // from class: u41
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    function2.invoke(new SavedPlacesAndRidesIntent.EditRideIntent(userCommutePreferenceSavedRideAppModel));
                                    break;
                                default:
                                    function2.invoke(new SavedPlacesAndRidesIntent.DeleteRideIntent(userCommutePreferenceSavedRideAppModel));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }), 114)));
                    arrayList = arrayList3;
                    obj3 = obj3;
                    stringProvider = stringProvider2;
                    obj4 = null;
                }
                Object obj5 = obj3;
                arrayList2 = arrayList;
                toolbarUIState = toolbarUIState9;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = arrayList2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextStyleHelper6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 2;
                stringProvider = stringProvider;
                objB = stringProvider.b(StringEnum.SAVED_PLACES, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                obj2 = obj5;
                if (objB == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState3 = savedPlacesAndRidesDataState2;
                objB7 = objB;
                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                list = arrayList2;
                String str5 = (String) objB7;
                savedPlacesAndRidesDataState4 = savedPlacesAndRidesDataState3;
                chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper2, str5, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIStateE;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.HOME, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB2 == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState5 = savedPlacesAndRidesDataState4;
                function3 = function2;
                toolbarUIState2 = toolbarUIState;
                chaloTextUIState = chaloTextUIStateE;
                objB7 = objB2;
                list2 = list;
                str = (String) objB7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = str;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 4;
                objB7 = stringProvider.b(StringEnum.ADD_HOME, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB7 == obj2) {
                    return obj2;
                }
                list3 = list2;
                toolbarUIState3 = toolbarUIState2;
                function4 = function3;
                savedPlacesAndRidesDataState6 = savedPlacesAndRidesDataState5;
                savedPlaceUIStateC = c(str, (String) objB7, IconType.FAVORITE_HOME, savedPlacesAndRidesDataState6.c, UserCommutePreferenceTag.HOME, function4);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = savedPlaceUIStateC;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 5;
                objB3 = stringProvider.b(StringEnum.WORK, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB3 == obj2) {
                    return obj2;
                }
                TextUIState.ChaloTextUIState chaloTextUIState3 = chaloTextUIState;
                savedPlaceUIState = savedPlaceUIStateC;
                objB7 = objB3;
                chaloTextUIState2 = chaloTextUIState3;
                list4 = list3;
                toolbarUIState4 = toolbarUIState3;
                function5 = function4;
                savedPlacesAndRidesDataState7 = savedPlacesAndRidesDataState6;
                str2 = (String) objB7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = str2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = savedPlaceUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 6;
                objB7 = stringProvider.b(StringEnum.ADD_WORK, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB7 == obj2) {
                    return obj2;
                }
                list5 = list4;
                toolbarUIState5 = toolbarUIState4;
                function6 = function5;
                savedPlacesAndRidesDataState8 = savedPlacesAndRidesDataState7;
                SavedPlaceUIState savedPlaceUIStateC2 = c(str2, (String) objB7, IconType.FAVORITE_WORK, savedPlacesAndRidesDataState8.d, UserCommutePreferenceTag.WORK, function6);
                if (savedPlacesAndRidesDataState8.f3680a) {
                    loadingShimmerUIState = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState = null;
                }
                workAndHomeUIState = new WorkAndHomeUIState(chaloTextUIState2, savedPlaceUIState, savedPlaceUIStateC2, loadingShimmerUIState);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = workAndHomeUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 7;
                objB4 = stringProvider.b(StringEnum.SAVED_RIDES, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB4 == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState9 = savedPlacesAndRidesDataState8;
                objB7 = objB4;
                chaloTextStyleHelper3 = chaloTextStyleHelper6;
                workAndHomeUIState2 = workAndHomeUIState;
                function7 = function6;
                String str6 = (String) objB7;
                savedPlacesAndRidesDataState10 = savedPlacesAndRidesDataState9;
                function8 = function7;
                chaloTextUIStateE2 = ChaloTextStyleHelper.e(chaloTextStyleHelper3, str6, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                if (savedPlacesAndRidesDataState10.b) {
                    loadingShimmerUIState2 = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState2 = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState10;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIStateE2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = loadingShimmerUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 8;
                objA = a(function8, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objA == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState11 = savedPlacesAndRidesDataState10;
                toolbarUIState6 = toolbarUIState5;
                function9 = function8;
                objB7 = objA;
                workAndHomeUIState3 = workAndHomeUIState2;
                loadingShimmerUIState3 = loadingShimmerUIState2;
                list6 = list5;
                ridesUIState = new RidesUIState(chaloTextUIStateE2, list6, loadingShimmerUIState3, (AddRidesBtnUIState) objB7);
                if (savedPlacesAndRidesDataState11.h) {
                    iconType = IconType.IC_ERROR_IMAGE;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState;
                    standardErrorScreenUIStateFactory = StandardErrorScreenUIStateFactory.f10025a;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 9;
                    objB5 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB5 == obj2) {
                        return obj2;
                    }
                    ridesUIState2 = ridesUIState;
                    standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
                    iconType2 = iconType;
                    objB7 = objB5;
                    str3 = (String) objB7;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = str3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 10;
                    objB7 = stringProvider.b(StringEnum.RETRY, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    WorkAndHomeUIState workAndHomeUIState8 = workAndHomeUIState3;
                    str4 = str3;
                    workAndHomeUIState4 = workAndHomeUIState8;
                    ridesUIState = ridesUIState2;
                    Function1 function10 = function9;
                    SavedPlacesAndRidesDataState savedPlacesAndRidesDataState13 = savedPlacesAndRidesDataState11;
                    IconType iconType4 = iconType2;
                    ToolbarUIState toolbarUIState10 = toolbarUIState6;
                    errorWithMsgAndRetryB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType4, str4, null, (String) objB7, new c41(function10, 6), 8);
                    toolbarUIState6 = toolbarUIState10;
                    function9 = function10;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState13;
                } else {
                    workAndHomeUIState4 = workAndHomeUIState3;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState11;
                    errorWithMsgAndRetryB = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState12;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = toolbarUIState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = workAndHomeUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = ridesUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = errorWithMsgAndRetryB;
                loadingDialogUIState = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 11;
                objB6 = b(savedPlacesAndRidesDataState12, function9, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB6 == obj2) {
                    return obj2;
                }
                workAndHomeUIState5 = workAndHomeUIState4;
                errorWithMsgAndRetry = errorWithMsgAndRetryB;
                objB7 = objB6;
                ridesUIState3 = ridesUIState;
                confirmationDialogUIState = (ConfirmationDialogUIState) objB7;
                if (savedPlacesAndRidesDataState12.g) {
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = workAndHomeUIState5;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = ridesUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = errorWithMsgAndRetry;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = confirmationDialogUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper4;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.LOADING, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    workAndHomeUIState7 = workAndHomeUIState5;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    toolbarUIState8 = toolbarUIState6;
                    toolbarUIState7 = toolbarUIState8;
                    loadingDialogUIState2 = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB7, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    workAndHomeUIState6 = workAndHomeUIState7;
                } else {
                    workAndHomeUIState6 = workAndHomeUIState5;
                    loadingDialogUIState2 = loadingDialogUIState;
                    toolbarUIState7 = toolbarUIState6;
                }
                return new SavedPlacesAndRidesViewState(toolbarUIState7, workAndHomeUIState6, ridesUIState3, confirmationDialogUIState, loadingDialogUIState2, errorWithMsgAndRetry);
            case 1:
                ChaloTextStyleHelper chaloTextStyleHelper7 = (ChaloTextStyleHelper) savedPlacesAndRidesUiStateFactory$createUiState$1.L$2;
                Function1 function11 = (Function1) savedPlacesAndRidesUiStateFactory$createUiState$1.L$1;
                SavedPlacesAndRidesDataState savedPlacesAndRidesDataState14 = (SavedPlacesAndRidesDataState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$0;
                ResultKt.b(objB7);
                chaloTextStyleHelper = chaloTextStyleHelper7;
                function2 = function11;
                obj = objB7;
                savedPlacesAndRidesDataState2 = savedPlacesAndRidesDataState14;
                ToolbarUIState toolbarUIState11 = new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) obj, null, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, null, null, 0.0f, null, null, 253);
                List<UserCommutePreferenceSavedRideAppModel> list8 = savedPlacesAndRidesDataState2.e;
                arrayList = new ArrayList(CollectionsKt.v(list8, 10));
                while (r16.hasNext()) {
                    ArrayList arrayList4 = arrayList;
                    StringProvider stringProvider3 = stringProvider;
                    TextUIState.ChaloTextUIState chaloTextUIStateB4 = ChaloTextStyleHelper.b(chaloTextStyleHelper6, e(userCommutePreferenceSavedRideAppModel.b), null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    TextUIState.ChaloTextUIState chaloTextUIStateB5 = ChaloTextStyleHelper.b(chaloTextStyleHelper6, e(userCommutePreferenceSavedRideAppModel.c), null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    String strL2 = this.f3691a.l(userCommutePreferenceSavedRideAppModel.d);
                    final int i5 = 0;
                    TextUIState.ChaloTextUIState chaloTextUIStateB6 = ChaloTextStyleHelper.b(chaloTextStyleHelper6, strL2, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    ImageUIState imageUIState2 = new ImageUIState(IconType.IC_SCHEDULE_CLOCK, (String) null, ChaloColorToken.Black.f9759a, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
                    IconType iconType5 = IconType.PROFILE_EDIT;
                    ImageUISize imageUISize2 = new ImageUISize(ChaloThemeHelper.a().h);
                    UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A2 = UiEventHandler.Companion.a(new Function0() { // from class: u41
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    function2.invoke(new SavedPlacesAndRidesIntent.EditRideIntent(userCommutePreferenceSavedRideAppModel));
                                    break;
                                default:
                                    function2.invoke(new SavedPlacesAndRidesIntent.DeleteRideIntent(userCommutePreferenceSavedRideAppModel));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    ChaloColorToken.OrangePrimary orangePrimary2 = ChaloColorToken.OrangePrimary.f9835a;
                    final int i6 = 1;
                    arrayList4.add(new SavedRideUIState(chaloTextUIStateB4, chaloTextUIStateB5, chaloTextUIStateB6, imageUIState2, new ImageUIState(iconType5, (String) null, orangePrimary2, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandler$Companion$fromLambda$1A2, 114), new ImageUIState(IconType.IC_DELETE, (String) null, orangePrimary2, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new Function0() { // from class: u41
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    function2.invoke(new SavedPlacesAndRidesIntent.EditRideIntent(userCommutePreferenceSavedRideAppModel));
                                    break;
                                default:
                                    function2.invoke(new SavedPlacesAndRidesIntent.DeleteRideIntent(userCommutePreferenceSavedRideAppModel));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }), 114)));
                    arrayList = arrayList4;
                    obj3 = obj3;
                    stringProvider = stringProvider3;
                    obj4 = null;
                }
                Object obj6 = obj3;
                arrayList2 = arrayList;
                toolbarUIState = toolbarUIState11;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = arrayList2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextStyleHelper6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 2;
                stringProvider = stringProvider;
                objB = stringProvider.b(StringEnum.SAVED_PLACES, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                obj2 = obj6;
                if (objB == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState3 = savedPlacesAndRidesDataState2;
                objB7 = objB;
                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                list = arrayList2;
                String str7 = (String) objB7;
                savedPlacesAndRidesDataState4 = savedPlacesAndRidesDataState3;
                chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper2, str7, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIStateE;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.HOME, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB2 == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState5 = savedPlacesAndRidesDataState4;
                function3 = function2;
                toolbarUIState2 = toolbarUIState;
                chaloTextUIState = chaloTextUIStateE;
                objB7 = objB2;
                list2 = list;
                str = (String) objB7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = str;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 4;
                objB7 = stringProvider.b(StringEnum.ADD_HOME, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB7 == obj2) {
                    return obj2;
                }
                list3 = list2;
                toolbarUIState3 = toolbarUIState2;
                function4 = function3;
                savedPlacesAndRidesDataState6 = savedPlacesAndRidesDataState5;
                savedPlaceUIStateC = c(str, (String) objB7, IconType.FAVORITE_HOME, savedPlacesAndRidesDataState6.c, UserCommutePreferenceTag.HOME, function4);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = savedPlaceUIStateC;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 5;
                objB3 = stringProvider.b(StringEnum.WORK, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB3 == obj2) {
                    return obj2;
                }
                TextUIState.ChaloTextUIState chaloTextUIState4 = chaloTextUIState;
                savedPlaceUIState = savedPlaceUIStateC;
                objB7 = objB3;
                chaloTextUIState2 = chaloTextUIState4;
                list4 = list3;
                toolbarUIState4 = toolbarUIState3;
                function5 = function4;
                savedPlacesAndRidesDataState7 = savedPlacesAndRidesDataState6;
                str2 = (String) objB7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = str2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = savedPlaceUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 6;
                objB7 = stringProvider.b(StringEnum.ADD_WORK, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB7 == obj2) {
                    return obj2;
                }
                list5 = list4;
                toolbarUIState5 = toolbarUIState4;
                function6 = function5;
                savedPlacesAndRidesDataState8 = savedPlacesAndRidesDataState7;
                SavedPlaceUIState savedPlaceUIStateC3 = c(str2, (String) objB7, IconType.FAVORITE_WORK, savedPlacesAndRidesDataState8.d, UserCommutePreferenceTag.WORK, function6);
                if (savedPlacesAndRidesDataState8.f3680a) {
                    loadingShimmerUIState = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState = null;
                }
                workAndHomeUIState = new WorkAndHomeUIState(chaloTextUIState2, savedPlaceUIState, savedPlaceUIStateC3, loadingShimmerUIState);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = workAndHomeUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 7;
                objB4 = stringProvider.b(StringEnum.SAVED_RIDES, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB4 == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState9 = savedPlacesAndRidesDataState8;
                objB7 = objB4;
                chaloTextStyleHelper3 = chaloTextStyleHelper6;
                workAndHomeUIState2 = workAndHomeUIState;
                function7 = function6;
                String str8 = (String) objB7;
                savedPlacesAndRidesDataState10 = savedPlacesAndRidesDataState9;
                function8 = function7;
                chaloTextUIStateE2 = ChaloTextStyleHelper.e(chaloTextStyleHelper3, str8, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                if (savedPlacesAndRidesDataState10.b) {
                    loadingShimmerUIState2 = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState2 = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState10;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIStateE2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = loadingShimmerUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 8;
                objA = a(function8, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objA == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState11 = savedPlacesAndRidesDataState10;
                toolbarUIState6 = toolbarUIState5;
                function9 = function8;
                objB7 = objA;
                workAndHomeUIState3 = workAndHomeUIState2;
                loadingShimmerUIState3 = loadingShimmerUIState2;
                list6 = list5;
                ridesUIState = new RidesUIState(chaloTextUIStateE2, list6, loadingShimmerUIState3, (AddRidesBtnUIState) objB7);
                if (savedPlacesAndRidesDataState11.h) {
                    iconType = IconType.IC_ERROR_IMAGE;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState;
                    standardErrorScreenUIStateFactory = StandardErrorScreenUIStateFactory.f10025a;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 9;
                    objB5 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB5 == obj2) {
                        return obj2;
                    }
                    ridesUIState2 = ridesUIState;
                    standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
                    iconType2 = iconType;
                    objB7 = objB5;
                    str3 = (String) objB7;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = str3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 10;
                    objB7 = stringProvider.b(StringEnum.RETRY, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    WorkAndHomeUIState workAndHomeUIState9 = workAndHomeUIState3;
                    str4 = str3;
                    workAndHomeUIState4 = workAndHomeUIState9;
                    ridesUIState = ridesUIState2;
                    Function1 function12 = function9;
                    SavedPlacesAndRidesDataState savedPlacesAndRidesDataState15 = savedPlacesAndRidesDataState11;
                    IconType iconType6 = iconType2;
                    ToolbarUIState toolbarUIState12 = toolbarUIState6;
                    errorWithMsgAndRetryB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType6, str4, null, (String) objB7, new c41(function12, 6), 8);
                    toolbarUIState6 = toolbarUIState12;
                    function9 = function12;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState15;
                } else {
                    workAndHomeUIState4 = workAndHomeUIState3;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState11;
                    errorWithMsgAndRetryB = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState12;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = toolbarUIState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = workAndHomeUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = ridesUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = errorWithMsgAndRetryB;
                loadingDialogUIState = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 11;
                objB6 = b(savedPlacesAndRidesDataState12, function9, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB6 == obj2) {
                    return obj2;
                }
                workAndHomeUIState5 = workAndHomeUIState4;
                errorWithMsgAndRetry = errorWithMsgAndRetryB;
                objB7 = objB6;
                ridesUIState3 = ridesUIState;
                confirmationDialogUIState = (ConfirmationDialogUIState) objB7;
                if (savedPlacesAndRidesDataState12.g) {
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = workAndHomeUIState5;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = ridesUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = errorWithMsgAndRetry;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = confirmationDialogUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper4;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.LOADING, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    workAndHomeUIState7 = workAndHomeUIState5;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    toolbarUIState8 = toolbarUIState6;
                    toolbarUIState7 = toolbarUIState8;
                    loadingDialogUIState2 = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB7, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    workAndHomeUIState6 = workAndHomeUIState7;
                } else {
                    workAndHomeUIState6 = workAndHomeUIState5;
                    loadingDialogUIState2 = loadingDialogUIState;
                    toolbarUIState7 = toolbarUIState6;
                }
                return new SavedPlacesAndRidesViewState(toolbarUIState7, workAndHomeUIState6, ridesUIState3, confirmationDialogUIState, loadingDialogUIState2, errorWithMsgAndRetry);
            case 2:
                ChaloTextStyleHelper chaloTextStyleHelper8 = (ChaloTextStyleHelper) savedPlacesAndRidesUiStateFactory$createUiState$1.L$4;
                List list9 = (List) savedPlacesAndRidesUiStateFactory$createUiState$1.L$3;
                ToolbarUIState toolbarUIState13 = (ToolbarUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$2;
                Function1 function13 = (Function1) savedPlacesAndRidesUiStateFactory$createUiState$1.L$1;
                savedPlacesAndRidesDataState3 = (SavedPlacesAndRidesDataState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$0;
                ResultKt.b(objB7);
                obj2 = obj3;
                list = list9;
                toolbarUIState = toolbarUIState13;
                chaloTextStyleHelper2 = chaloTextStyleHelper8;
                function2 = function13;
                String str9 = (String) objB7;
                savedPlacesAndRidesDataState4 = savedPlacesAndRidesDataState3;
                chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper2, str9, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIStateE;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.HOME, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB2 == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState5 = savedPlacesAndRidesDataState4;
                function3 = function2;
                toolbarUIState2 = toolbarUIState;
                chaloTextUIState = chaloTextUIStateE;
                objB7 = objB2;
                list2 = list;
                str = (String) objB7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = str;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 4;
                objB7 = stringProvider.b(StringEnum.ADD_HOME, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB7 == obj2) {
                    return obj2;
                }
                list3 = list2;
                toolbarUIState3 = toolbarUIState2;
                function4 = function3;
                savedPlacesAndRidesDataState6 = savedPlacesAndRidesDataState5;
                savedPlaceUIStateC = c(str, (String) objB7, IconType.FAVORITE_HOME, savedPlacesAndRidesDataState6.c, UserCommutePreferenceTag.HOME, function4);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = savedPlaceUIStateC;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 5;
                objB3 = stringProvider.b(StringEnum.WORK, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB3 == obj2) {
                    return obj2;
                }
                TextUIState.ChaloTextUIState chaloTextUIState5 = chaloTextUIState;
                savedPlaceUIState = savedPlaceUIStateC;
                objB7 = objB3;
                chaloTextUIState2 = chaloTextUIState5;
                list4 = list3;
                toolbarUIState4 = toolbarUIState3;
                function5 = function4;
                savedPlacesAndRidesDataState7 = savedPlacesAndRidesDataState6;
                str2 = (String) objB7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = str2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = savedPlaceUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 6;
                objB7 = stringProvider.b(StringEnum.ADD_WORK, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB7 == obj2) {
                    return obj2;
                }
                list5 = list4;
                toolbarUIState5 = toolbarUIState4;
                function6 = function5;
                savedPlacesAndRidesDataState8 = savedPlacesAndRidesDataState7;
                SavedPlaceUIState savedPlaceUIStateC4 = c(str2, (String) objB7, IconType.FAVORITE_WORK, savedPlacesAndRidesDataState8.d, UserCommutePreferenceTag.WORK, function6);
                if (savedPlacesAndRidesDataState8.f3680a) {
                    loadingShimmerUIState = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState = null;
                }
                workAndHomeUIState = new WorkAndHomeUIState(chaloTextUIState2, savedPlaceUIState, savedPlaceUIStateC4, loadingShimmerUIState);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = workAndHomeUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 7;
                objB4 = stringProvider.b(StringEnum.SAVED_RIDES, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB4 == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState9 = savedPlacesAndRidesDataState8;
                objB7 = objB4;
                chaloTextStyleHelper3 = chaloTextStyleHelper6;
                workAndHomeUIState2 = workAndHomeUIState;
                function7 = function6;
                String str10 = (String) objB7;
                savedPlacesAndRidesDataState10 = savedPlacesAndRidesDataState9;
                function8 = function7;
                chaloTextUIStateE2 = ChaloTextStyleHelper.e(chaloTextStyleHelper3, str10, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                if (savedPlacesAndRidesDataState10.b) {
                    loadingShimmerUIState2 = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState2 = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState10;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIStateE2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = loadingShimmerUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 8;
                objA = a(function8, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objA == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState11 = savedPlacesAndRidesDataState10;
                toolbarUIState6 = toolbarUIState5;
                function9 = function8;
                objB7 = objA;
                workAndHomeUIState3 = workAndHomeUIState2;
                loadingShimmerUIState3 = loadingShimmerUIState2;
                list6 = list5;
                ridesUIState = new RidesUIState(chaloTextUIStateE2, list6, loadingShimmerUIState3, (AddRidesBtnUIState) objB7);
                if (savedPlacesAndRidesDataState11.h) {
                    iconType = IconType.IC_ERROR_IMAGE;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState;
                    standardErrorScreenUIStateFactory = StandardErrorScreenUIStateFactory.f10025a;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 9;
                    objB5 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB5 == obj2) {
                        return obj2;
                    }
                    ridesUIState2 = ridesUIState;
                    standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
                    iconType2 = iconType;
                    objB7 = objB5;
                    str3 = (String) objB7;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = str3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 10;
                    objB7 = stringProvider.b(StringEnum.RETRY, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    WorkAndHomeUIState workAndHomeUIState10 = workAndHomeUIState3;
                    str4 = str3;
                    workAndHomeUIState4 = workAndHomeUIState10;
                    ridesUIState = ridesUIState2;
                    Function1 function14 = function9;
                    SavedPlacesAndRidesDataState savedPlacesAndRidesDataState16 = savedPlacesAndRidesDataState11;
                    IconType iconType7 = iconType2;
                    ToolbarUIState toolbarUIState14 = toolbarUIState6;
                    errorWithMsgAndRetryB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType7, str4, null, (String) objB7, new c41(function14, 6), 8);
                    toolbarUIState6 = toolbarUIState14;
                    function9 = function14;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState16;
                } else {
                    workAndHomeUIState4 = workAndHomeUIState3;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState11;
                    errorWithMsgAndRetryB = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState12;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = toolbarUIState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = workAndHomeUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = ridesUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = errorWithMsgAndRetryB;
                loadingDialogUIState = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 11;
                objB6 = b(savedPlacesAndRidesDataState12, function9, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB6 == obj2) {
                    return obj2;
                }
                workAndHomeUIState5 = workAndHomeUIState4;
                errorWithMsgAndRetry = errorWithMsgAndRetryB;
                objB7 = objB6;
                ridesUIState3 = ridesUIState;
                confirmationDialogUIState = (ConfirmationDialogUIState) objB7;
                if (savedPlacesAndRidesDataState12.g) {
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = workAndHomeUIState5;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = ridesUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = errorWithMsgAndRetry;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = confirmationDialogUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper4;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.LOADING, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    workAndHomeUIState7 = workAndHomeUIState5;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    toolbarUIState8 = toolbarUIState6;
                    toolbarUIState7 = toolbarUIState8;
                    loadingDialogUIState2 = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB7, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    workAndHomeUIState6 = workAndHomeUIState7;
                } else {
                    workAndHomeUIState6 = workAndHomeUIState5;
                    loadingDialogUIState2 = loadingDialogUIState;
                    toolbarUIState7 = toolbarUIState6;
                }
                return new SavedPlacesAndRidesViewState(toolbarUIState7, workAndHomeUIState6, ridesUIState3, confirmationDialogUIState, loadingDialogUIState2, errorWithMsgAndRetry);
            case 3:
                chaloTextUIState = (TextUIState.ChaloTextUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$4;
                List list10 = (List) savedPlacesAndRidesUiStateFactory$createUiState$1.L$3;
                ToolbarUIState toolbarUIState15 = (ToolbarUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$2;
                Function1 function15 = (Function1) savedPlacesAndRidesUiStateFactory$createUiState$1.L$1;
                SavedPlacesAndRidesDataState savedPlacesAndRidesDataState17 = (SavedPlacesAndRidesDataState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$0;
                ResultKt.b(objB7);
                obj2 = obj3;
                savedPlacesAndRidesDataState5 = savedPlacesAndRidesDataState17;
                function3 = function15;
                toolbarUIState2 = toolbarUIState15;
                list2 = list10;
                str = (String) objB7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = str;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 4;
                objB7 = stringProvider.b(StringEnum.ADD_HOME, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB7 == obj2) {
                    return obj2;
                }
                list3 = list2;
                toolbarUIState3 = toolbarUIState2;
                function4 = function3;
                savedPlacesAndRidesDataState6 = savedPlacesAndRidesDataState5;
                savedPlaceUIStateC = c(str, (String) objB7, IconType.FAVORITE_HOME, savedPlacesAndRidesDataState6.c, UserCommutePreferenceTag.HOME, function4);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = savedPlaceUIStateC;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 5;
                objB3 = stringProvider.b(StringEnum.WORK, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB3 == obj2) {
                    return obj2;
                }
                TextUIState.ChaloTextUIState chaloTextUIState6 = chaloTextUIState;
                savedPlaceUIState = savedPlaceUIStateC;
                objB7 = objB3;
                chaloTextUIState2 = chaloTextUIState6;
                list4 = list3;
                toolbarUIState4 = toolbarUIState3;
                function5 = function4;
                savedPlacesAndRidesDataState7 = savedPlacesAndRidesDataState6;
                str2 = (String) objB7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = str2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = savedPlaceUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 6;
                objB7 = stringProvider.b(StringEnum.ADD_WORK, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB7 == obj2) {
                    return obj2;
                }
                list5 = list4;
                toolbarUIState5 = toolbarUIState4;
                function6 = function5;
                savedPlacesAndRidesDataState8 = savedPlacesAndRidesDataState7;
                SavedPlaceUIState savedPlaceUIStateC5 = c(str2, (String) objB7, IconType.FAVORITE_WORK, savedPlacesAndRidesDataState8.d, UserCommutePreferenceTag.WORK, function6);
                if (savedPlacesAndRidesDataState8.f3680a) {
                    loadingShimmerUIState = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState = null;
                }
                workAndHomeUIState = new WorkAndHomeUIState(chaloTextUIState2, savedPlaceUIState, savedPlaceUIStateC5, loadingShimmerUIState);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = workAndHomeUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 7;
                objB4 = stringProvider.b(StringEnum.SAVED_RIDES, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB4 == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState9 = savedPlacesAndRidesDataState8;
                objB7 = objB4;
                chaloTextStyleHelper3 = chaloTextStyleHelper6;
                workAndHomeUIState2 = workAndHomeUIState;
                function7 = function6;
                String str11 = (String) objB7;
                savedPlacesAndRidesDataState10 = savedPlacesAndRidesDataState9;
                function8 = function7;
                chaloTextUIStateE2 = ChaloTextStyleHelper.e(chaloTextStyleHelper3, str11, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                if (savedPlacesAndRidesDataState10.b) {
                    loadingShimmerUIState2 = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState2 = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState10;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIStateE2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = loadingShimmerUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 8;
                objA = a(function8, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objA == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState11 = savedPlacesAndRidesDataState10;
                toolbarUIState6 = toolbarUIState5;
                function9 = function8;
                objB7 = objA;
                workAndHomeUIState3 = workAndHomeUIState2;
                loadingShimmerUIState3 = loadingShimmerUIState2;
                list6 = list5;
                ridesUIState = new RidesUIState(chaloTextUIStateE2, list6, loadingShimmerUIState3, (AddRidesBtnUIState) objB7);
                if (savedPlacesAndRidesDataState11.h) {
                    iconType = IconType.IC_ERROR_IMAGE;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState;
                    standardErrorScreenUIStateFactory = StandardErrorScreenUIStateFactory.f10025a;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 9;
                    objB5 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB5 == obj2) {
                        return obj2;
                    }
                    ridesUIState2 = ridesUIState;
                    standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
                    iconType2 = iconType;
                    objB7 = objB5;
                    str3 = (String) objB7;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = str3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 10;
                    objB7 = stringProvider.b(StringEnum.RETRY, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    WorkAndHomeUIState workAndHomeUIState11 = workAndHomeUIState3;
                    str4 = str3;
                    workAndHomeUIState4 = workAndHomeUIState11;
                    ridesUIState = ridesUIState2;
                    Function1 function16 = function9;
                    SavedPlacesAndRidesDataState savedPlacesAndRidesDataState18 = savedPlacesAndRidesDataState11;
                    IconType iconType8 = iconType2;
                    ToolbarUIState toolbarUIState16 = toolbarUIState6;
                    errorWithMsgAndRetryB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType8, str4, null, (String) objB7, new c41(function16, 6), 8);
                    toolbarUIState6 = toolbarUIState16;
                    function9 = function16;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState18;
                } else {
                    workAndHomeUIState4 = workAndHomeUIState3;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState11;
                    errorWithMsgAndRetryB = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState12;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = toolbarUIState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = workAndHomeUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = ridesUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = errorWithMsgAndRetryB;
                loadingDialogUIState = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 11;
                objB6 = b(savedPlacesAndRidesDataState12, function9, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB6 == obj2) {
                    return obj2;
                }
                workAndHomeUIState5 = workAndHomeUIState4;
                errorWithMsgAndRetry = errorWithMsgAndRetryB;
                objB7 = objB6;
                ridesUIState3 = ridesUIState;
                confirmationDialogUIState = (ConfirmationDialogUIState) objB7;
                if (savedPlacesAndRidesDataState12.g) {
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = workAndHomeUIState5;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = ridesUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = errorWithMsgAndRetry;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = confirmationDialogUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper4;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.LOADING, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    workAndHomeUIState7 = workAndHomeUIState5;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    toolbarUIState8 = toolbarUIState6;
                    toolbarUIState7 = toolbarUIState8;
                    loadingDialogUIState2 = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB7, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    workAndHomeUIState6 = workAndHomeUIState7;
                } else {
                    workAndHomeUIState6 = workAndHomeUIState5;
                    loadingDialogUIState2 = loadingDialogUIState;
                    toolbarUIState7 = toolbarUIState6;
                }
                return new SavedPlacesAndRidesViewState(toolbarUIState7, workAndHomeUIState6, ridesUIState3, confirmationDialogUIState, loadingDialogUIState2, errorWithMsgAndRetry);
            case 4:
                chaloTextUIState = (TextUIState.ChaloTextUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$5;
                str = (String) savedPlacesAndRidesUiStateFactory$createUiState$1.L$4;
                list2 = (List) savedPlacesAndRidesUiStateFactory$createUiState$1.L$3;
                toolbarUIState2 = (ToolbarUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$2;
                function3 = (Function1) savedPlacesAndRidesUiStateFactory$createUiState$1.L$1;
                savedPlacesAndRidesDataState5 = (SavedPlacesAndRidesDataState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$0;
                ResultKt.b(objB7);
                obj2 = obj3;
                list3 = list2;
                toolbarUIState3 = toolbarUIState2;
                function4 = function3;
                savedPlacesAndRidesDataState6 = savedPlacesAndRidesDataState5;
                savedPlaceUIStateC = c(str, (String) objB7, IconType.FAVORITE_HOME, savedPlacesAndRidesDataState6.c, UserCommutePreferenceTag.HOME, function4);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = savedPlaceUIStateC;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 5;
                objB3 = stringProvider.b(StringEnum.WORK, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB3 == obj2) {
                    return obj2;
                }
                TextUIState.ChaloTextUIState chaloTextUIState7 = chaloTextUIState;
                savedPlaceUIState = savedPlaceUIStateC;
                objB7 = objB3;
                chaloTextUIState2 = chaloTextUIState7;
                list4 = list3;
                toolbarUIState4 = toolbarUIState3;
                function5 = function4;
                savedPlacesAndRidesDataState7 = savedPlacesAndRidesDataState6;
                str2 = (String) objB7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = str2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = savedPlaceUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 6;
                objB7 = stringProvider.b(StringEnum.ADD_WORK, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB7 == obj2) {
                    return obj2;
                }
                list5 = list4;
                toolbarUIState5 = toolbarUIState4;
                function6 = function5;
                savedPlacesAndRidesDataState8 = savedPlacesAndRidesDataState7;
                SavedPlaceUIState savedPlaceUIStateC6 = c(str2, (String) objB7, IconType.FAVORITE_WORK, savedPlacesAndRidesDataState8.d, UserCommutePreferenceTag.WORK, function6);
                if (savedPlacesAndRidesDataState8.f3680a) {
                    loadingShimmerUIState = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState = null;
                }
                workAndHomeUIState = new WorkAndHomeUIState(chaloTextUIState2, savedPlaceUIState, savedPlaceUIStateC6, loadingShimmerUIState);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = workAndHomeUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 7;
                objB4 = stringProvider.b(StringEnum.SAVED_RIDES, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB4 == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState9 = savedPlacesAndRidesDataState8;
                objB7 = objB4;
                chaloTextStyleHelper3 = chaloTextStyleHelper6;
                workAndHomeUIState2 = workAndHomeUIState;
                function7 = function6;
                String str12 = (String) objB7;
                savedPlacesAndRidesDataState10 = savedPlacesAndRidesDataState9;
                function8 = function7;
                chaloTextUIStateE2 = ChaloTextStyleHelper.e(chaloTextStyleHelper3, str12, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                if (savedPlacesAndRidesDataState10.b) {
                    loadingShimmerUIState2 = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState2 = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState10;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIStateE2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = loadingShimmerUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 8;
                objA = a(function8, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objA == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState11 = savedPlacesAndRidesDataState10;
                toolbarUIState6 = toolbarUIState5;
                function9 = function8;
                objB7 = objA;
                workAndHomeUIState3 = workAndHomeUIState2;
                loadingShimmerUIState3 = loadingShimmerUIState2;
                list6 = list5;
                ridesUIState = new RidesUIState(chaloTextUIStateE2, list6, loadingShimmerUIState3, (AddRidesBtnUIState) objB7);
                if (savedPlacesAndRidesDataState11.h) {
                    iconType = IconType.IC_ERROR_IMAGE;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState;
                    standardErrorScreenUIStateFactory = StandardErrorScreenUIStateFactory.f10025a;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 9;
                    objB5 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB5 == obj2) {
                        return obj2;
                    }
                    ridesUIState2 = ridesUIState;
                    standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
                    iconType2 = iconType;
                    objB7 = objB5;
                    str3 = (String) objB7;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = str3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 10;
                    objB7 = stringProvider.b(StringEnum.RETRY, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    WorkAndHomeUIState workAndHomeUIState12 = workAndHomeUIState3;
                    str4 = str3;
                    workAndHomeUIState4 = workAndHomeUIState12;
                    ridesUIState = ridesUIState2;
                    Function1 function17 = function9;
                    SavedPlacesAndRidesDataState savedPlacesAndRidesDataState19 = savedPlacesAndRidesDataState11;
                    IconType iconType9 = iconType2;
                    ToolbarUIState toolbarUIState17 = toolbarUIState6;
                    errorWithMsgAndRetryB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType9, str4, null, (String) objB7, new c41(function17, 6), 8);
                    toolbarUIState6 = toolbarUIState17;
                    function9 = function17;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState19;
                } else {
                    workAndHomeUIState4 = workAndHomeUIState3;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState11;
                    errorWithMsgAndRetryB = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState12;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = toolbarUIState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = workAndHomeUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = ridesUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = errorWithMsgAndRetryB;
                loadingDialogUIState = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 11;
                objB6 = b(savedPlacesAndRidesDataState12, function9, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB6 == obj2) {
                    return obj2;
                }
                workAndHomeUIState5 = workAndHomeUIState4;
                errorWithMsgAndRetry = errorWithMsgAndRetryB;
                objB7 = objB6;
                ridesUIState3 = ridesUIState;
                confirmationDialogUIState = (ConfirmationDialogUIState) objB7;
                if (savedPlacesAndRidesDataState12.g) {
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = workAndHomeUIState5;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = ridesUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = errorWithMsgAndRetry;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = confirmationDialogUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper4;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.LOADING, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    workAndHomeUIState7 = workAndHomeUIState5;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    toolbarUIState8 = toolbarUIState6;
                    toolbarUIState7 = toolbarUIState8;
                    loadingDialogUIState2 = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB7, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    workAndHomeUIState6 = workAndHomeUIState7;
                } else {
                    workAndHomeUIState6 = workAndHomeUIState5;
                    loadingDialogUIState2 = loadingDialogUIState;
                    toolbarUIState7 = toolbarUIState6;
                }
                return new SavedPlacesAndRidesViewState(toolbarUIState7, workAndHomeUIState6, ridesUIState3, confirmationDialogUIState, loadingDialogUIState2, errorWithMsgAndRetry);
            case 5:
                savedPlaceUIState = (SavedPlaceUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$5;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$4;
                List list11 = (List) savedPlacesAndRidesUiStateFactory$createUiState$1.L$3;
                ToolbarUIState toolbarUIState18 = (ToolbarUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$2;
                Function1 function18 = (Function1) savedPlacesAndRidesUiStateFactory$createUiState$1.L$1;
                SavedPlacesAndRidesDataState savedPlacesAndRidesDataState20 = (SavedPlacesAndRidesDataState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$0;
                ResultKt.b(objB7);
                obj2 = obj3;
                savedPlacesAndRidesDataState7 = savedPlacesAndRidesDataState20;
                function5 = function18;
                toolbarUIState4 = toolbarUIState18;
                list4 = list11;
                str2 = (String) objB7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = str2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = savedPlaceUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 6;
                objB7 = stringProvider.b(StringEnum.ADD_WORK, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB7 == obj2) {
                    return obj2;
                }
                list5 = list4;
                toolbarUIState5 = toolbarUIState4;
                function6 = function5;
                savedPlacesAndRidesDataState8 = savedPlacesAndRidesDataState7;
                SavedPlaceUIState savedPlaceUIStateC7 = c(str2, (String) objB7, IconType.FAVORITE_WORK, savedPlacesAndRidesDataState8.d, UserCommutePreferenceTag.WORK, function6);
                if (savedPlacesAndRidesDataState8.f3680a) {
                    loadingShimmerUIState = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState = null;
                }
                workAndHomeUIState = new WorkAndHomeUIState(chaloTextUIState2, savedPlaceUIState, savedPlaceUIStateC7, loadingShimmerUIState);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = workAndHomeUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 7;
                objB4 = stringProvider.b(StringEnum.SAVED_RIDES, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB4 == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState9 = savedPlacesAndRidesDataState8;
                objB7 = objB4;
                chaloTextStyleHelper3 = chaloTextStyleHelper6;
                workAndHomeUIState2 = workAndHomeUIState;
                function7 = function6;
                String str13 = (String) objB7;
                savedPlacesAndRidesDataState10 = savedPlacesAndRidesDataState9;
                function8 = function7;
                chaloTextUIStateE2 = ChaloTextStyleHelper.e(chaloTextStyleHelper3, str13, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                if (savedPlacesAndRidesDataState10.b) {
                    loadingShimmerUIState2 = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState2 = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState10;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIStateE2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = loadingShimmerUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 8;
                objA = a(function8, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objA == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState11 = savedPlacesAndRidesDataState10;
                toolbarUIState6 = toolbarUIState5;
                function9 = function8;
                objB7 = objA;
                workAndHomeUIState3 = workAndHomeUIState2;
                loadingShimmerUIState3 = loadingShimmerUIState2;
                list6 = list5;
                ridesUIState = new RidesUIState(chaloTextUIStateE2, list6, loadingShimmerUIState3, (AddRidesBtnUIState) objB7);
                if (savedPlacesAndRidesDataState11.h) {
                    iconType = IconType.IC_ERROR_IMAGE;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState;
                    standardErrorScreenUIStateFactory = StandardErrorScreenUIStateFactory.f10025a;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 9;
                    objB5 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB5 == obj2) {
                        return obj2;
                    }
                    ridesUIState2 = ridesUIState;
                    standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
                    iconType2 = iconType;
                    objB7 = objB5;
                    str3 = (String) objB7;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = str3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 10;
                    objB7 = stringProvider.b(StringEnum.RETRY, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    WorkAndHomeUIState workAndHomeUIState13 = workAndHomeUIState3;
                    str4 = str3;
                    workAndHomeUIState4 = workAndHomeUIState13;
                    ridesUIState = ridesUIState2;
                    Function1 function19 = function9;
                    SavedPlacesAndRidesDataState savedPlacesAndRidesDataState110 = savedPlacesAndRidesDataState11;
                    IconType iconType10 = iconType2;
                    ToolbarUIState toolbarUIState19 = toolbarUIState6;
                    errorWithMsgAndRetryB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType10, str4, null, (String) objB7, new c41(function19, 6), 8);
                    toolbarUIState6 = toolbarUIState19;
                    function9 = function19;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState110;
                } else {
                    workAndHomeUIState4 = workAndHomeUIState3;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState11;
                    errorWithMsgAndRetryB = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState12;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = toolbarUIState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = workAndHomeUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = ridesUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = errorWithMsgAndRetryB;
                loadingDialogUIState = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 11;
                objB6 = b(savedPlacesAndRidesDataState12, function9, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB6 == obj2) {
                    return obj2;
                }
                workAndHomeUIState5 = workAndHomeUIState4;
                errorWithMsgAndRetry = errorWithMsgAndRetryB;
                objB7 = objB6;
                ridesUIState3 = ridesUIState;
                confirmationDialogUIState = (ConfirmationDialogUIState) objB7;
                if (savedPlacesAndRidesDataState12.g) {
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = workAndHomeUIState5;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = ridesUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = errorWithMsgAndRetry;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = confirmationDialogUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper4;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.LOADING, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    workAndHomeUIState7 = workAndHomeUIState5;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    toolbarUIState8 = toolbarUIState6;
                    toolbarUIState7 = toolbarUIState8;
                    loadingDialogUIState2 = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB7, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    workAndHomeUIState6 = workAndHomeUIState7;
                } else {
                    workAndHomeUIState6 = workAndHomeUIState5;
                    loadingDialogUIState2 = loadingDialogUIState;
                    toolbarUIState7 = toolbarUIState6;
                }
                return new SavedPlacesAndRidesViewState(toolbarUIState7, workAndHomeUIState6, ridesUIState3, confirmationDialogUIState, loadingDialogUIState2, errorWithMsgAndRetry);
            case 6:
                savedPlaceUIState = (SavedPlaceUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$6;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$5;
                str2 = (String) savedPlacesAndRidesUiStateFactory$createUiState$1.L$4;
                list4 = (List) savedPlacesAndRidesUiStateFactory$createUiState$1.L$3;
                toolbarUIState4 = (ToolbarUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$2;
                function5 = (Function1) savedPlacesAndRidesUiStateFactory$createUiState$1.L$1;
                savedPlacesAndRidesDataState7 = (SavedPlacesAndRidesDataState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$0;
                ResultKt.b(objB7);
                obj2 = obj3;
                list5 = list4;
                toolbarUIState5 = toolbarUIState4;
                function6 = function5;
                savedPlacesAndRidesDataState8 = savedPlacesAndRidesDataState7;
                SavedPlaceUIState savedPlaceUIStateC8 = c(str2, (String) objB7, IconType.FAVORITE_WORK, savedPlacesAndRidesDataState8.d, UserCommutePreferenceTag.WORK, function6);
                if (savedPlacesAndRidesDataState8.f3680a) {
                    loadingShimmerUIState = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState = null;
                }
                workAndHomeUIState = new WorkAndHomeUIState(chaloTextUIState2, savedPlaceUIState, savedPlaceUIStateC8, loadingShimmerUIState);
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = workAndHomeUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 7;
                objB4 = stringProvider.b(StringEnum.SAVED_RIDES, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB4 == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState9 = savedPlacesAndRidesDataState8;
                objB7 = objB4;
                chaloTextStyleHelper3 = chaloTextStyleHelper6;
                workAndHomeUIState2 = workAndHomeUIState;
                function7 = function6;
                String str14 = (String) objB7;
                savedPlacesAndRidesDataState10 = savedPlacesAndRidesDataState9;
                function8 = function7;
                chaloTextUIStateE2 = ChaloTextStyleHelper.e(chaloTextStyleHelper3, str14, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                if (savedPlacesAndRidesDataState10.b) {
                    loadingShimmerUIState2 = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState2 = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState10;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIStateE2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = loadingShimmerUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 8;
                objA = a(function8, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objA == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState11 = savedPlacesAndRidesDataState10;
                toolbarUIState6 = toolbarUIState5;
                function9 = function8;
                objB7 = objA;
                workAndHomeUIState3 = workAndHomeUIState2;
                loadingShimmerUIState3 = loadingShimmerUIState2;
                list6 = list5;
                ridesUIState = new RidesUIState(chaloTextUIStateE2, list6, loadingShimmerUIState3, (AddRidesBtnUIState) objB7);
                if (savedPlacesAndRidesDataState11.h) {
                    iconType = IconType.IC_ERROR_IMAGE;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState;
                    standardErrorScreenUIStateFactory = StandardErrorScreenUIStateFactory.f10025a;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 9;
                    objB5 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB5 == obj2) {
                        return obj2;
                    }
                    ridesUIState2 = ridesUIState;
                    standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
                    iconType2 = iconType;
                    objB7 = objB5;
                    str3 = (String) objB7;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = str3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 10;
                    objB7 = stringProvider.b(StringEnum.RETRY, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    WorkAndHomeUIState workAndHomeUIState14 = workAndHomeUIState3;
                    str4 = str3;
                    workAndHomeUIState4 = workAndHomeUIState14;
                    ridesUIState = ridesUIState2;
                    Function1 function110 = function9;
                    SavedPlacesAndRidesDataState savedPlacesAndRidesDataState111 = savedPlacesAndRidesDataState11;
                    IconType iconType11 = iconType2;
                    ToolbarUIState toolbarUIState110 = toolbarUIState6;
                    errorWithMsgAndRetryB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType11, str4, null, (String) objB7, new c41(function110, 6), 8);
                    toolbarUIState6 = toolbarUIState110;
                    function9 = function110;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState111;
                } else {
                    workAndHomeUIState4 = workAndHomeUIState3;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState11;
                    errorWithMsgAndRetryB = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState12;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = toolbarUIState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = workAndHomeUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = ridesUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = errorWithMsgAndRetryB;
                loadingDialogUIState = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 11;
                objB6 = b(savedPlacesAndRidesDataState12, function9, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB6 == obj2) {
                    return obj2;
                }
                workAndHomeUIState5 = workAndHomeUIState4;
                errorWithMsgAndRetry = errorWithMsgAndRetryB;
                objB7 = objB6;
                ridesUIState3 = ridesUIState;
                confirmationDialogUIState = (ConfirmationDialogUIState) objB7;
                if (savedPlacesAndRidesDataState12.g) {
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = workAndHomeUIState5;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = ridesUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = errorWithMsgAndRetry;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = confirmationDialogUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper4;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.LOADING, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    workAndHomeUIState7 = workAndHomeUIState5;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    toolbarUIState8 = toolbarUIState6;
                    toolbarUIState7 = toolbarUIState8;
                    loadingDialogUIState2 = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB7, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    workAndHomeUIState6 = workAndHomeUIState7;
                } else {
                    workAndHomeUIState6 = workAndHomeUIState5;
                    loadingDialogUIState2 = loadingDialogUIState;
                    toolbarUIState7 = toolbarUIState6;
                }
                return new SavedPlacesAndRidesViewState(toolbarUIState7, workAndHomeUIState6, ridesUIState3, confirmationDialogUIState, loadingDialogUIState2, errorWithMsgAndRetry);
            case 7:
                ChaloTextStyleHelper chaloTextStyleHelper9 = (ChaloTextStyleHelper) savedPlacesAndRidesUiStateFactory$createUiState$1.L$5;
                WorkAndHomeUIState workAndHomeUIState15 = (WorkAndHomeUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$4;
                List list12 = (List) savedPlacesAndRidesUiStateFactory$createUiState$1.L$3;
                ToolbarUIState toolbarUIState20 = (ToolbarUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$2;
                Function1 function20 = (Function1) savedPlacesAndRidesUiStateFactory$createUiState$1.L$1;
                SavedPlacesAndRidesDataState savedPlacesAndRidesDataState21 = (SavedPlacesAndRidesDataState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$0;
                ResultKt.b(objB7);
                chaloTextStyleHelper3 = chaloTextStyleHelper9;
                workAndHomeUIState2 = workAndHomeUIState15;
                obj2 = obj3;
                list5 = list12;
                toolbarUIState5 = toolbarUIState20;
                savedPlacesAndRidesDataState9 = savedPlacesAndRidesDataState21;
                function7 = function20;
                String str15 = (String) objB7;
                savedPlacesAndRidesDataState10 = savedPlacesAndRidesDataState9;
                function8 = function7;
                chaloTextUIStateE2 = ChaloTextStyleHelper.e(chaloTextStyleHelper3, str15, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                if (savedPlacesAndRidesDataState10.b) {
                    loadingShimmerUIState2 = new LoadingShimmerUIState();
                } else {
                    loadingShimmerUIState2 = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState10;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function8;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = chaloTextUIStateE2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = list5;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = loadingShimmerUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 8;
                objA = a(function8, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objA == obj2) {
                    return obj2;
                }
                savedPlacesAndRidesDataState11 = savedPlacesAndRidesDataState10;
                toolbarUIState6 = toolbarUIState5;
                function9 = function8;
                objB7 = objA;
                workAndHomeUIState3 = workAndHomeUIState2;
                loadingShimmerUIState3 = loadingShimmerUIState2;
                list6 = list5;
                ridesUIState = new RidesUIState(chaloTextUIStateE2, list6, loadingShimmerUIState3, (AddRidesBtnUIState) objB7);
                if (savedPlacesAndRidesDataState11.h) {
                    iconType = IconType.IC_ERROR_IMAGE;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState;
                    standardErrorScreenUIStateFactory = StandardErrorScreenUIStateFactory.f10025a;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 9;
                    objB5 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB5 == obj2) {
                        return obj2;
                    }
                    ridesUIState2 = ridesUIState;
                    standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
                    iconType2 = iconType;
                    objB7 = objB5;
                    str3 = (String) objB7;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = str3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 10;
                    objB7 = stringProvider.b(StringEnum.RETRY, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    WorkAndHomeUIState workAndHomeUIState16 = workAndHomeUIState3;
                    str4 = str3;
                    workAndHomeUIState4 = workAndHomeUIState16;
                    ridesUIState = ridesUIState2;
                    Function1 function111 = function9;
                    SavedPlacesAndRidesDataState savedPlacesAndRidesDataState112 = savedPlacesAndRidesDataState11;
                    IconType iconType12 = iconType2;
                    ToolbarUIState toolbarUIState111 = toolbarUIState6;
                    errorWithMsgAndRetryB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType12, str4, null, (String) objB7, new c41(function111, 6), 8);
                    toolbarUIState6 = toolbarUIState111;
                    function9 = function111;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState112;
                } else {
                    workAndHomeUIState4 = workAndHomeUIState3;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState11;
                    errorWithMsgAndRetryB = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState12;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = toolbarUIState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = workAndHomeUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = ridesUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = errorWithMsgAndRetryB;
                loadingDialogUIState = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 11;
                objB6 = b(savedPlacesAndRidesDataState12, function9, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB6 == obj2) {
                    return obj2;
                }
                workAndHomeUIState5 = workAndHomeUIState4;
                errorWithMsgAndRetry = errorWithMsgAndRetryB;
                objB7 = objB6;
                ridesUIState3 = ridesUIState;
                confirmationDialogUIState = (ConfirmationDialogUIState) objB7;
                if (savedPlacesAndRidesDataState12.g) {
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = workAndHomeUIState5;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = ridesUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = errorWithMsgAndRetry;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = confirmationDialogUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper4;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.LOADING, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    workAndHomeUIState7 = workAndHomeUIState5;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    toolbarUIState8 = toolbarUIState6;
                    toolbarUIState7 = toolbarUIState8;
                    loadingDialogUIState2 = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB7, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    workAndHomeUIState6 = workAndHomeUIState7;
                } else {
                    workAndHomeUIState6 = workAndHomeUIState5;
                    loadingDialogUIState2 = loadingDialogUIState;
                    toolbarUIState7 = toolbarUIState6;
                }
                return new SavedPlacesAndRidesViewState(toolbarUIState7, workAndHomeUIState6, ridesUIState3, confirmationDialogUIState, loadingDialogUIState2, errorWithMsgAndRetry);
            case 8:
                loadingShimmerUIState3 = (LoadingShimmerUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$6;
                list6 = (List) savedPlacesAndRidesUiStateFactory$createUiState$1.L$5;
                chaloTextUIStateE2 = (TextUIState.ChaloTextUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$4;
                workAndHomeUIState3 = (WorkAndHomeUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$3;
                toolbarUIState6 = (ToolbarUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$2;
                function9 = (Function1) savedPlacesAndRidesUiStateFactory$createUiState$1.L$1;
                savedPlacesAndRidesDataState11 = (SavedPlacesAndRidesDataState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$0;
                ResultKt.b(objB7);
                obj2 = obj3;
                ridesUIState = new RidesUIState(chaloTextUIStateE2, list6, loadingShimmerUIState3, (AddRidesBtnUIState) objB7);
                if (savedPlacesAndRidesDataState11.h) {
                    iconType = IconType.IC_ERROR_IMAGE;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState;
                    standardErrorScreenUIStateFactory = StandardErrorScreenUIStateFactory.f10025a;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 9;
                    objB5 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB5 == obj2) {
                        return obj2;
                    }
                    ridesUIState2 = ridesUIState;
                    standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
                    iconType2 = iconType;
                    objB7 = objB5;
                    str3 = (String) objB7;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType2;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = str3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 10;
                    objB7 = stringProvider.b(StringEnum.RETRY, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    WorkAndHomeUIState workAndHomeUIState17 = workAndHomeUIState3;
                    str4 = str3;
                    workAndHomeUIState4 = workAndHomeUIState17;
                    ridesUIState = ridesUIState2;
                    Function1 function112 = function9;
                    SavedPlacesAndRidesDataState savedPlacesAndRidesDataState113 = savedPlacesAndRidesDataState11;
                    IconType iconType13 = iconType2;
                    ToolbarUIState toolbarUIState112 = toolbarUIState6;
                    errorWithMsgAndRetryB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType13, str4, null, (String) objB7, new c41(function112, 6), 8);
                    toolbarUIState6 = toolbarUIState112;
                    function9 = function112;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState113;
                } else {
                    workAndHomeUIState4 = workAndHomeUIState3;
                    savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState11;
                    errorWithMsgAndRetryB = null;
                }
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState12;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = toolbarUIState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = workAndHomeUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = ridesUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = errorWithMsgAndRetryB;
                loadingDialogUIState = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 11;
                objB6 = b(savedPlacesAndRidesDataState12, function9, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB6 == obj2) {
                    return obj2;
                }
                workAndHomeUIState5 = workAndHomeUIState4;
                errorWithMsgAndRetry = errorWithMsgAndRetryB;
                objB7 = objB6;
                ridesUIState3 = ridesUIState;
                confirmationDialogUIState = (ConfirmationDialogUIState) objB7;
                if (savedPlacesAndRidesDataState12.g) {
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = workAndHomeUIState5;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = ridesUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = errorWithMsgAndRetry;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = confirmationDialogUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper4;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.LOADING, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    workAndHomeUIState7 = workAndHomeUIState5;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    toolbarUIState8 = toolbarUIState6;
                    toolbarUIState7 = toolbarUIState8;
                    loadingDialogUIState2 = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB7, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    workAndHomeUIState6 = workAndHomeUIState7;
                } else {
                    workAndHomeUIState6 = workAndHomeUIState5;
                    loadingDialogUIState2 = loadingDialogUIState;
                    toolbarUIState7 = toolbarUIState6;
                }
                return new SavedPlacesAndRidesViewState(toolbarUIState7, workAndHomeUIState6, ridesUIState3, confirmationDialogUIState, loadingDialogUIState2, errorWithMsgAndRetry);
            case 9:
                IconType iconType14 = (IconType) savedPlacesAndRidesUiStateFactory$createUiState$1.L$6;
                standardErrorScreenUIStateFactory2 = (StandardErrorScreenUIStateFactory) savedPlacesAndRidesUiStateFactory$createUiState$1.L$5;
                ridesUIState2 = (RidesUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$4;
                workAndHomeUIState3 = (WorkAndHomeUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$3;
                toolbarUIState6 = (ToolbarUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$2;
                function9 = (Function1) savedPlacesAndRidesUiStateFactory$createUiState$1.L$1;
                savedPlacesAndRidesDataState11 = (SavedPlacesAndRidesDataState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$0;
                ResultKt.b(objB7);
                obj2 = obj3;
                iconType2 = iconType14;
                chaloTextStyleHelper6 = chaloTextStyleHelper6;
                str3 = (String) objB7;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState11;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = function9;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = toolbarUIState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = workAndHomeUIState3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = ridesUIState2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = standardErrorScreenUIStateFactory2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = iconType2;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = str3;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 10;
                objB7 = stringProvider.b(StringEnum.RETRY, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB7 == obj2) {
                    return obj2;
                }
                WorkAndHomeUIState workAndHomeUIState18 = workAndHomeUIState3;
                str4 = str3;
                workAndHomeUIState4 = workAndHomeUIState18;
                ridesUIState = ridesUIState2;
                Function1 function113 = function9;
                SavedPlacesAndRidesDataState savedPlacesAndRidesDataState114 = savedPlacesAndRidesDataState11;
                IconType iconType15 = iconType2;
                ToolbarUIState toolbarUIState113 = toolbarUIState6;
                errorWithMsgAndRetryB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType15, str4, null, (String) objB7, new c41(function113, 6), 8);
                toolbarUIState6 = toolbarUIState113;
                function9 = function113;
                savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState114;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState12;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = toolbarUIState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = workAndHomeUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = ridesUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = errorWithMsgAndRetryB;
                loadingDialogUIState = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 11;
                objB6 = b(savedPlacesAndRidesDataState12, function9, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB6 == obj2) {
                    return obj2;
                }
                workAndHomeUIState5 = workAndHomeUIState4;
                errorWithMsgAndRetry = errorWithMsgAndRetryB;
                objB7 = objB6;
                ridesUIState3 = ridesUIState;
                confirmationDialogUIState = (ConfirmationDialogUIState) objB7;
                if (savedPlacesAndRidesDataState12.g) {
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = workAndHomeUIState5;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = ridesUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = errorWithMsgAndRetry;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = confirmationDialogUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper4;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.LOADING, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    workAndHomeUIState7 = workAndHomeUIState5;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    toolbarUIState8 = toolbarUIState6;
                    toolbarUIState7 = toolbarUIState8;
                    loadingDialogUIState2 = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB7, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    workAndHomeUIState6 = workAndHomeUIState7;
                } else {
                    workAndHomeUIState6 = workAndHomeUIState5;
                    loadingDialogUIState2 = loadingDialogUIState;
                    toolbarUIState7 = toolbarUIState6;
                }
                return new SavedPlacesAndRidesViewState(toolbarUIState7, workAndHomeUIState6, ridesUIState3, confirmationDialogUIState, loadingDialogUIState2, errorWithMsgAndRetry);
            case 10:
                String str16 = (String) savedPlacesAndRidesUiStateFactory$createUiState$1.L$7;
                iconType2 = (IconType) savedPlacesAndRidesUiStateFactory$createUiState$1.L$6;
                standardErrorScreenUIStateFactory2 = (StandardErrorScreenUIStateFactory) savedPlacesAndRidesUiStateFactory$createUiState$1.L$5;
                ridesUIState2 = (RidesUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$4;
                WorkAndHomeUIState workAndHomeUIState19 = (WorkAndHomeUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$3;
                toolbarUIState6 = (ToolbarUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$2;
                function9 = (Function1) savedPlacesAndRidesUiStateFactory$createUiState$1.L$1;
                savedPlacesAndRidesDataState11 = (SavedPlacesAndRidesDataState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$0;
                ResultKt.b(objB7);
                str4 = str16;
                workAndHomeUIState4 = workAndHomeUIState19;
                obj2 = obj3;
                chaloTextStyleHelper6 = chaloTextStyleHelper6;
                ridesUIState = ridesUIState2;
                Function1 function114 = function9;
                SavedPlacesAndRidesDataState savedPlacesAndRidesDataState115 = savedPlacesAndRidesDataState11;
                IconType iconType16 = iconType2;
                ToolbarUIState toolbarUIState114 = toolbarUIState6;
                errorWithMsgAndRetryB = StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType16, str4, null, (String) objB7, new c41(function114, 6), 8);
                toolbarUIState6 = toolbarUIState114;
                function9 = function114;
                savedPlacesAndRidesDataState12 = savedPlacesAndRidesDataState115;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = savedPlacesAndRidesDataState12;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = toolbarUIState6;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = workAndHomeUIState4;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = ridesUIState;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = errorWithMsgAndRetryB;
                loadingDialogUIState = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$6 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.L$7 = null;
                savedPlacesAndRidesUiStateFactory$createUiState$1.label = 11;
                objB6 = b(savedPlacesAndRidesDataState12, function9, savedPlacesAndRidesUiStateFactory$createUiState$1);
                if (objB6 == obj2) {
                    return obj2;
                }
                workAndHomeUIState5 = workAndHomeUIState4;
                errorWithMsgAndRetry = errorWithMsgAndRetryB;
                objB7 = objB6;
                ridesUIState3 = ridesUIState;
                confirmationDialogUIState = (ConfirmationDialogUIState) objB7;
                if (savedPlacesAndRidesDataState12.g) {
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = workAndHomeUIState5;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = ridesUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = errorWithMsgAndRetry;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = confirmationDialogUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper4;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.LOADING, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    workAndHomeUIState7 = workAndHomeUIState5;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    toolbarUIState8 = toolbarUIState6;
                    toolbarUIState7 = toolbarUIState8;
                    loadingDialogUIState2 = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB7, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    workAndHomeUIState6 = workAndHomeUIState7;
                } else {
                    workAndHomeUIState6 = workAndHomeUIState5;
                    loadingDialogUIState2 = loadingDialogUIState;
                    toolbarUIState7 = toolbarUIState6;
                }
                return new SavedPlacesAndRidesViewState(toolbarUIState7, workAndHomeUIState6, ridesUIState3, confirmationDialogUIState, loadingDialogUIState2, errorWithMsgAndRetry);
            case 11:
                errorWithMsgAndRetry = (StandardErrorScreenUIState.ErrorWithMsgAndRetry) savedPlacesAndRidesUiStateFactory$createUiState$1.L$4;
                ridesUIState3 = (RidesUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$3;
                workAndHomeUIState5 = (WorkAndHomeUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$2;
                ToolbarUIState toolbarUIState21 = (ToolbarUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$1;
                savedPlacesAndRidesDataState12 = (SavedPlacesAndRidesDataState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$0;
                ResultKt.b(objB7);
                chaloTextStyleHelper6 = chaloTextStyleHelper6;
                toolbarUIState6 = toolbarUIState21;
                loadingDialogUIState = null;
                obj2 = obj3;
                confirmationDialogUIState = (ConfirmationDialogUIState) objB7;
                if (savedPlacesAndRidesDataState12.g) {
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$0 = toolbarUIState6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$1 = workAndHomeUIState5;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$2 = ridesUIState3;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$3 = errorWithMsgAndRetry;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$4 = confirmationDialogUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.L$5 = chaloTextStyleHelper4;
                    savedPlacesAndRidesUiStateFactory$createUiState$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.LOADING, new Object[0], savedPlacesAndRidesUiStateFactory$createUiState$1);
                    if (objB7 == obj2) {
                        return obj2;
                    }
                    workAndHomeUIState7 = workAndHomeUIState5;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    toolbarUIState8 = toolbarUIState6;
                    toolbarUIState7 = toolbarUIState8;
                    loadingDialogUIState2 = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB7, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                    workAndHomeUIState6 = workAndHomeUIState7;
                } else {
                    workAndHomeUIState6 = workAndHomeUIState5;
                    loadingDialogUIState2 = loadingDialogUIState;
                    toolbarUIState7 = toolbarUIState6;
                }
                return new SavedPlacesAndRidesViewState(toolbarUIState7, workAndHomeUIState6, ridesUIState3, confirmationDialogUIState, loadingDialogUIState2, errorWithMsgAndRetry);
            case 12:
                chaloTextStyleHelper5 = (ChaloTextStyleHelper) savedPlacesAndRidesUiStateFactory$createUiState$1.L$5;
                confirmationDialogUIState = (ConfirmationDialogUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$4;
                errorWithMsgAndRetry = (StandardErrorScreenUIState.ErrorWithMsgAndRetry) savedPlacesAndRidesUiStateFactory$createUiState$1.L$3;
                ridesUIState3 = (RidesUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$2;
                WorkAndHomeUIState workAndHomeUIState20 = (WorkAndHomeUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$1;
                toolbarUIState8 = (ToolbarUIState) savedPlacesAndRidesUiStateFactory$createUiState$1.L$0;
                ResultKt.b(objB7);
                workAndHomeUIState7 = workAndHomeUIState20;
                toolbarUIState7 = toolbarUIState8;
                loadingDialogUIState2 = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB7, null, 0, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT));
                workAndHomeUIState6 = workAndHomeUIState7;
                return new SavedPlacesAndRidesViewState(toolbarUIState7, workAndHomeUIState6, ridesUIState3, confirmationDialogUIState, loadingDialogUIState2, errorWithMsgAndRetry);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
