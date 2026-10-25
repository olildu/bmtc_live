package app.chalo.home.ui.selectride;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.home.ui.selectridescreen.RideSavedSuccessFailureState;
import app.chalo.home.ui.selectridescreen.ScreenType;
import app.chalo.home.ui.selectridescreen.SelectRideDataState;
import app.chalo.home.ui.selectridescreen.SelectedTime;
import app.chalo.premiumbus.ui.passpurchaselanding.SearchFieldComponentUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.SearchFieldWithSwapButtonCardUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.SearchItemUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDateAndTimePickerUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceAppModelKt;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferencePlaceLocationAppModel;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.c41;
import defpackage.w31;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.datetime.Instant;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.TimeZoneKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/selectride/SelectRideUiStateFactory;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectRideUiStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f3698a;
    public final TimeUtilsContract b;
    public final SystemHelper c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3699a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ScreenType.values().length];
            try {
                iArr[ScreenType.RIDE_SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenType.SUCCESS_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3699a = iArr;
            int[] iArr2 = new int[RideSavedSuccessFailureState.values().length];
            try {
                iArr2[RideSavedSuccessFailureState.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RideSavedSuccessFailureState.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RideSavedSuccessFailureState.RIDE_ALREADY_SAVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    public SelectRideUiStateFactory(StringProvider stringProvider, TimeUtilsContract timeUtilsContract, SystemHelper systemHelper) {
        this.f3698a = stringProvider;
        this.b = timeUtilsContract;
        this.c = systemHelper;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0193  */
    /* JADX WARN: Code duplicated, block: B:39:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x020c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0212  */
    /* JADX WARN: Code duplicated, block: B:50:0x024a  */
    /* JADX WARN: Code duplicated, block: B:54:0x028d  */
    /* JADX WARN: Code duplicated, block: B:58:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:62:0x033d  */
    /* JADX WARN: Code duplicated, block: B:65:0x035a  */
    /* JADX WARN: Code duplicated, block: B:73:0x036c  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v1, types: [app.chalo.uistate.text.TextUIState$ChaloTextUIState] */
    /* JADX WARN: Type inference failed for: r4v4, types: [app.chalo.uistate.text.UITextAlign, app.chalo.uistate.text.UITextOverflow] */
    public final Object a(ScreenType screenType, String str, String str2, Function1 function1, ContinuationImpl continuationImpl) {
        SelectRideUiStateFactory$createFromAndToStopCardUIState$1 selectRideUiStateFactory$createFromAndToStopCardUIState$1;
        Object obj;
        int i;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        String str3;
        Function1 function2;
        Object obj2;
        String str4;
        ?? r4;
        ArrayList arrayListB0;
        String str5;
        ArrayList arrayList;
        ?? A;
        TextUIState.StyledTextUIState styledTextUIState;
        int i2;
        Object objB;
        String str6;
        TextUIState.StyledTextUIState styledTextUIState2;
        Function1 function3;
        ChaloTextStyleHelper chaloTextStyleHelper;
        ?? r12;
        Function1 function4;
        String str7;
        String str8;
        int i3;
        SearchItemUIState searchItemUIState;
        String str9;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        TextUIState.ChaloTextUIState chaloTextUIStateA;
        Object objB2;
        CoroutineSingletons coroutineSingletons;
        SearchItemUIState searchItemUIState2;
        Function1 function5;
        TextUIState.ChaloTextUIState chaloTextUIState;
        StringProvider stringProvider;
        TextUIState.StyledTextUIState styledTextUIState3;
        Object objB3;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        Function1 function6;
        TextUIState.StyledTextUIState styledTextUIState4;
        String str10;
        SearchItemUIState searchItemUIState3;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        Function1 function7;
        String str11;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        String str12;
        SearchItemUIState searchItemUIState4;
        IconType iconType;
        ImageUISize imageUISize;
        StringProvider stringProvider2;
        Object objB4;
        CoroutineSingletons coroutineSingletons2;
        IconType iconType2;
        Function1 function8;
        ImageUISize imageUISize2;
        String str13;
        SearchFieldComponentUIState searchFieldComponentUIState;
        boolean z;
        boolean z2;
        ButtonUIStateFactory buttonUIStateFactory;
        ChaloTextStyleHelper chaloTextStyleHelper5;
        Object objB5;
        String str14;
        ButtonUIStateFactory buttonUIStateFactory2;
        ChaloTextStyleHelper chaloTextStyleHelper6;
        Function1 function9;
        boolean z3;
        if (continuationImpl instanceof SelectRideUiStateFactory$createFromAndToStopCardUIState$1) {
            selectRideUiStateFactory$createFromAndToStopCardUIState$1 = (SelectRideUiStateFactory$createFromAndToStopCardUIState$1) continuationImpl;
            int i4 = selectRideUiStateFactory$createFromAndToStopCardUIState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = i4 - Integer.MIN_VALUE;
            } else {
                selectRideUiStateFactory$createFromAndToStopCardUIState$1 = new SelectRideUiStateFactory$createFromAndToStopCardUIState$1(this, continuationImpl);
            }
        } else {
            selectRideUiStateFactory$createFromAndToStopCardUIState$1 = new SelectRideUiStateFactory$createFromAndToStopCardUIState$1(this, continuationImpl);
        }
        Object obj3 = selectRideUiStateFactory$createFromAndToStopCardUIState$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = selectRideUiStateFactory$createFromAndToStopCardUIState$1.label;
        ChaloColorToken.Black_40 black_40 = ChaloColorToken.Black_40.f9764a;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        ChaloTextStyleHelper chaloTextStyleHelper7 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider3 = this.f3698a;
        switch (i5) {
            case 0:
                obj = null;
                ResultKt.b(obj3);
                int i6 = WhenMappings.f3699a[screenType.ordinal()];
                if (i6 != 1) {
                    if (i6 == 2) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                StyledTextDataUIState[] styledTextDataUIStateArr3 = new StyledTextDataUIState[1];
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str2;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function1;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = styledTextDataUIStateArr3;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = styledTextDataUIStateArr3;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.I$0 = 0;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 1;
                Object objB6 = stringProvider3.b(StringEnum.FROM, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                if (objB6 != coroutineSingletons3) {
                    i = 0;
                    styledTextDataUIStateArr = styledTextDataUIStateArr3;
                    styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                    str3 = str;
                    function2 = function1;
                    obj2 = objB6;
                    str4 = str2;
                    r4 = obj;
                    styledTextDataUIStateArr[i] = new StyledTextDataUIState((String) obj2, shadyGray, null, UITextStyle.BodySmall, null, null, null, 1012);
                    arrayListB0 = CollectionsKt.b0(styledTextDataUIStateArr2);
                    if (str3 != null || str3.length() == 0) {
                        str5 = str3;
                        arrayList = arrayListB0;
                        A = r4;
                    } else {
                        str5 = str3;
                        arrayList = arrayListB0;
                        A = ChaloTextStyleHelper.a(chaloTextStyleHelper7, str5, black_87, null, UITextOverflow.Ellipsis, 56);
                    }
                    styledTextUIState = new TextUIState.StyledTextUIState(arrayList, r4, r4, 30);
                    i2 = 0;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str5;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str4;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function2;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = A;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = styledTextUIState;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper7;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 2;
                    objB = stringProvider3.b(StringEnum.ENTER_ORIGIN_LOCATION, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                    if (objB != coroutineSingletons3) {
                        Function1 function10 = function2;
                        str6 = str4;
                        obj3 = objB;
                        styledTextUIState2 = styledTextUIState;
                        function3 = function10;
                        chaloTextStyleHelper = chaloTextStyleHelper7;
                        r12 = A;
                        function4 = function3;
                        str7 = str6;
                        str8 = str5;
                        i3 = i2;
                        searchItemUIState = new SearchItemUIState(r12, styledTextUIState2, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) obj3, black_40, 1, null, null, null, null, 120), new c41(function4, 19));
                        if (str7 != null || str7.length() == 0) {
                            str9 = str7;
                            chaloTextStyleHelper2 = chaloTextStyleHelper7;
                            chaloTextUIStateA = null;
                        } else {
                            str9 = str7;
                            chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper7, str9, black_87, null, UITextOverflow.Ellipsis, 56);
                            chaloTextStyleHelper2 = chaloTextStyleHelper7;
                        }
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str8;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str9;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function4;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = searchItemUIState;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = chaloTextUIStateA;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = null;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 3;
                        objB2 = stringProvider3.b(StringEnum.TO, new Object[i3], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                        coroutineSingletons = coroutineSingletons3;
                        if (objB2 != coroutineSingletons) {
                            searchItemUIState2 = searchItemUIState;
                            obj3 = objB2;
                            function5 = function4;
                            chaloTextUIState = chaloTextUIStateA;
                            stringProvider = stringProvider3;
                            styledTextUIState3 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) obj3, shadyGray, null, UITextStyle.BodySmall, null, null, null, 1012)), null, null, 30);
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str8;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str9;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function5;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = searchItemUIState2;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = chaloTextUIState;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = styledTextUIState3;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = chaloTextStyleHelper2;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 4;
                            objB3 = stringProvider.b(StringEnum.ENTER_DESTINATION_LOCATION, new Object[i3], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                            if (objB3 != coroutineSingletons) {
                                chaloTextUIState2 = chaloTextUIState;
                                function6 = function5;
                                styledTextUIState4 = styledTextUIState3;
                                str10 = str8;
                                searchItemUIState3 = searchItemUIState2;
                                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                function7 = function6;
                                CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
                                str11 = str9;
                                chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                str12 = str10;
                                searchItemUIState4 = new SearchItemUIState(chaloTextUIState2, styledTextUIState4, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB3, black_40, 1, null, null, null, null, 120), new c41(function7, 20));
                                iconType = IconType.PB_SWAP_ICON;
                                imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str12;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str11;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function7;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = iconType;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = imageUISize;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = searchItemUIState3;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = searchItemUIState4;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 5;
                                stringProvider2 = stringProvider;
                                objB4 = stringProvider2.b(StringEnum.SWAP_STOPS, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                                coroutineSingletons2 = coroutineSingletons4;
                                if (objB4 == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                iconType2 = iconType;
                                function8 = function7;
                                imageUISize2 = imageUISize;
                                str13 = str11;
                                obj3 = objB4;
                                ImageUIState imageUIState = new ImageUIState(iconType2, (String) obj3, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new c41(function8, 21)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                                z = true;
                                searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState4, imageUIState, 1);
                                z2 = false;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str12;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str13;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function8;
                                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = buttonUIStateFactory;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = searchFieldComponentUIState;
                                chaloTextStyleHelper5 = chaloTextStyleHelper4;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper5;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = null;
                                selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 6;
                                objB5 = stringProvider2.b(StringEnum.CONTINUE, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                                if (objB5 == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                str14 = str12;
                                buttonUIStateFactory2 = buttonUIStateFactory;
                                chaloTextStyleHelper6 = chaloTextStyleHelper5;
                                function9 = function8;
                                TextUIState.ChaloTextUIState chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objB5, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                                UIShape.Rectangle rectangle = UIShape.d;
                                if (str14 != null || str14.length() == 0 || str13 == null || str13.length() == 0) {
                                    z3 = z2;
                                } else {
                                    z3 = z;
                                }
                                return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB, new w31(3, str14, str13, function9), rectangle, z3, 0.0f, 36));
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                return coroutineSingletons3;
            case 1:
                obj = null;
                int i7 = selectRideUiStateFactory$createFromAndToStopCardUIState$1.I$0;
                StyledTextDataUIState[] styledTextDataUIStateArr4 = (StyledTextDataUIState[]) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4;
                StyledTextDataUIState[] styledTextDataUIStateArr5 = (StyledTextDataUIState[]) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3;
                Function1 function11 = (Function1) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2;
                String str15 = (String) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1;
                str3 = (String) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0;
                ResultKt.b(obj3);
                i = i7;
                styledTextDataUIStateArr = styledTextDataUIStateArr4;
                styledTextDataUIStateArr2 = styledTextDataUIStateArr5;
                function2 = function11;
                obj2 = obj3;
                str4 = str15;
                r4 = obj;
                styledTextDataUIStateArr[i] = new StyledTextDataUIState((String) obj2, shadyGray, null, UITextStyle.BodySmall, null, null, null, 1012);
                arrayListB0 = CollectionsKt.b0(styledTextDataUIStateArr2);
                if (str3 != null) {
                    str5 = str3;
                    arrayList = arrayListB0;
                    A = r4;
                } else {
                    str5 = str3;
                    arrayList = arrayListB0;
                    A = r4;
                }
                styledTextUIState = new TextUIState.StyledTextUIState(arrayList, r4, r4, 30);
                i2 = 0;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str5;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str4;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function2;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = A;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = styledTextUIState;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper7;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 2;
                objB = stringProvider3.b(StringEnum.ENTER_ORIGIN_LOCATION, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                if (objB != coroutineSingletons3) {
                    Function1 function12 = function2;
                    str6 = str4;
                    obj3 = objB;
                    styledTextUIState2 = styledTextUIState;
                    function3 = function12;
                    chaloTextStyleHelper = chaloTextStyleHelper7;
                    r12 = A;
                    function4 = function3;
                    str7 = str6;
                    str8 = str5;
                    i3 = i2;
                    searchItemUIState = new SearchItemUIState(r12, styledTextUIState2, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) obj3, black_40, 1, null, null, null, null, 120), new c41(function4, 19));
                    if (str7 != null) {
                        str9 = str7;
                        chaloTextStyleHelper2 = chaloTextStyleHelper7;
                        chaloTextUIStateA = null;
                    } else {
                        str9 = str7;
                        chaloTextStyleHelper2 = chaloTextStyleHelper7;
                        chaloTextUIStateA = null;
                    }
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str8;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str9;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function4;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = searchItemUIState;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = chaloTextUIStateA;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = null;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 3;
                    objB2 = stringProvider3.b(StringEnum.TO, new Object[i3], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                    coroutineSingletons = coroutineSingletons3;
                    if (objB2 != coroutineSingletons) {
                        searchItemUIState2 = searchItemUIState;
                        obj3 = objB2;
                        function5 = function4;
                        chaloTextUIState = chaloTextUIStateA;
                        stringProvider = stringProvider3;
                        styledTextUIState3 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) obj3, shadyGray, null, UITextStyle.BodySmall, null, null, null, 1012)), null, null, 30);
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str8;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str9;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function5;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = searchItemUIState2;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = chaloTextUIState;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = styledTextUIState3;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = chaloTextStyleHelper2;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 4;
                        objB3 = stringProvider.b(StringEnum.ENTER_DESTINATION_LOCATION, new Object[i3], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                        if (objB3 != coroutineSingletons) {
                            chaloTextUIState2 = chaloTextUIState;
                            function6 = function5;
                            styledTextUIState4 = styledTextUIState3;
                            str10 = str8;
                            searchItemUIState3 = searchItemUIState2;
                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                            function7 = function6;
                            CoroutineSingletons coroutineSingletons5 = coroutineSingletons;
                            str11 = str9;
                            chaloTextStyleHelper4 = chaloTextStyleHelper2;
                            str12 = str10;
                            searchItemUIState4 = new SearchItemUIState(chaloTextUIState2, styledTextUIState4, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB3, black_40, 1, null, null, null, null, 120), new c41(function7, 20));
                            iconType = IconType.PB_SWAP_ICON;
                            imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str12;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str11;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function7;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = iconType;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = imageUISize;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = searchItemUIState3;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = searchItemUIState4;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 5;
                            stringProvider2 = stringProvider;
                            objB4 = stringProvider2.b(StringEnum.SWAP_STOPS, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                            coroutineSingletons2 = coroutineSingletons5;
                            if (objB4 == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            iconType2 = iconType;
                            function8 = function7;
                            imageUISize2 = imageUISize;
                            str13 = str11;
                            obj3 = objB4;
                            ImageUIState imageUIState2 = new ImageUIState(iconType2, (String) obj3, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new c41(function8, 21)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                            z = true;
                            searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState4, imageUIState2, 1);
                            z2 = false;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str12;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str13;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function8;
                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = buttonUIStateFactory;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = searchFieldComponentUIState;
                            chaloTextStyleHelper5 = chaloTextStyleHelper4;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper5;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = null;
                            selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 6;
                            objB5 = stringProvider2.b(StringEnum.CONTINUE, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                            if (objB5 == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            str14 = str12;
                            buttonUIStateFactory2 = buttonUIStateFactory;
                            chaloTextStyleHelper6 = chaloTextStyleHelper5;
                            function9 = function8;
                            TextUIState.ChaloTextUIState chaloTextUIStateB2 = ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objB5, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                            UIShape.Rectangle rectangle2 = UIShape.d;
                            if (str14 != null) {
                                z3 = z2;
                            } else {
                                z3 = z2;
                            }
                            return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB2, new w31(3, str14, str13, function9), rectangle2, z3, 0.0f, 36));
                        }
                    }
                    return coroutineSingletons;
                }
                return coroutineSingletons3;
            case 2:
                ChaloTextStyleHelper chaloTextStyleHelper8 = (ChaloTextStyleHelper) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5;
                styledTextUIState2 = (TextUIState.StyledTextUIState) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3;
                Function1 function13 = (Function1) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2;
                str6 = (String) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1;
                String str16 = (String) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0;
                ResultKt.b(obj3);
                chaloTextStyleHelper = chaloTextStyleHelper8;
                black_87 = black_87;
                function3 = function13;
                stringProvider3 = stringProvider3;
                str5 = str16;
                i2 = 0;
                r12 = chaloTextUIState3;
                function4 = function3;
                str7 = str6;
                str8 = str5;
                i3 = i2;
                searchItemUIState = new SearchItemUIState(r12, styledTextUIState2, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) obj3, black_40, 1, null, null, null, null, 120), new c41(function4, 19));
                if (str7 != null) {
                    str9 = str7;
                    chaloTextStyleHelper2 = chaloTextStyleHelper7;
                    chaloTextUIStateA = null;
                } else {
                    str9 = str7;
                    chaloTextStyleHelper2 = chaloTextStyleHelper7;
                    chaloTextUIStateA = null;
                }
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str8;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str9;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function4;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = searchItemUIState;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = chaloTextUIStateA;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = null;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 3;
                objB2 = stringProvider3.b(StringEnum.TO, new Object[i3], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                coroutineSingletons = coroutineSingletons3;
                if (objB2 != coroutineSingletons) {
                    searchItemUIState2 = searchItemUIState;
                    obj3 = objB2;
                    function5 = function4;
                    chaloTextUIState = chaloTextUIStateA;
                    stringProvider = stringProvider3;
                    styledTextUIState3 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) obj3, shadyGray, null, UITextStyle.BodySmall, null, null, null, 1012)), null, null, 30);
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str8;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str9;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function5;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = searchItemUIState2;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = chaloTextUIState;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = styledTextUIState3;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = chaloTextStyleHelper2;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 4;
                    objB3 = stringProvider.b(StringEnum.ENTER_DESTINATION_LOCATION, new Object[i3], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                    if (objB3 != coroutineSingletons) {
                        chaloTextUIState2 = chaloTextUIState;
                        function6 = function5;
                        styledTextUIState4 = styledTextUIState3;
                        str10 = str8;
                        searchItemUIState3 = searchItemUIState2;
                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                        function7 = function6;
                        CoroutineSingletons coroutineSingletons6 = coroutineSingletons;
                        str11 = str9;
                        chaloTextStyleHelper4 = chaloTextStyleHelper2;
                        str12 = str10;
                        searchItemUIState4 = new SearchItemUIState(chaloTextUIState2, styledTextUIState4, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB3, black_40, 1, null, null, null, null, 120), new c41(function7, 20));
                        iconType = IconType.PB_SWAP_ICON;
                        imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str12;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str11;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function7;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = iconType;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = imageUISize;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = searchItemUIState3;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = searchItemUIState4;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 5;
                        stringProvider2 = stringProvider;
                        objB4 = stringProvider2.b(StringEnum.SWAP_STOPS, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                        coroutineSingletons2 = coroutineSingletons6;
                        if (objB4 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        iconType2 = iconType;
                        function8 = function7;
                        imageUISize2 = imageUISize;
                        str13 = str11;
                        obj3 = objB4;
                        ImageUIState imageUIState3 = new ImageUIState(iconType2, (String) obj3, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new c41(function8, 21)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                        z = true;
                        searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState4, imageUIState3, 1);
                        z2 = false;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str12;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str13;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function8;
                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = buttonUIStateFactory;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = searchFieldComponentUIState;
                        chaloTextStyleHelper5 = chaloTextStyleHelper4;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper5;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = null;
                        selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 6;
                        objB5 = stringProvider2.b(StringEnum.CONTINUE, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                        if (objB5 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        str14 = str12;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        chaloTextStyleHelper6 = chaloTextStyleHelper5;
                        function9 = function8;
                        TextUIState.ChaloTextUIState chaloTextUIStateB3 = ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objB5, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                        UIShape.Rectangle rectangle3 = UIShape.d;
                        if (str14 != null) {
                            z3 = z2;
                        } else {
                            z3 = z2;
                        }
                        return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB3, new w31(3, str14, str13, function9), rectangle3, z3, 0.0f, 36));
                    }
                }
                return coroutineSingletons;
            case 3:
                TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4;
                searchItemUIState2 = (SearchItemUIState) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3;
                function5 = (Function1) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2;
                String str17 = (String) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1;
                String str18 = (String) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0;
                ResultKt.b(obj3);
                coroutineSingletons = coroutineSingletons3;
                chaloTextUIState = chaloTextUIState4;
                chaloTextStyleHelper2 = chaloTextStyleHelper7;
                shadyGray = shadyGray;
                str8 = str18;
                i3 = 0;
                stringProvider3 = stringProvider3;
                str9 = str17;
                stringProvider = stringProvider3;
                styledTextUIState3 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) obj3, shadyGray, null, UITextStyle.BodySmall, null, null, null, 1012)), null, null, 30);
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str8;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str9;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function5;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = searchItemUIState2;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = chaloTextUIState;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = styledTextUIState3;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = chaloTextStyleHelper2;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 4;
                objB3 = stringProvider.b(StringEnum.ENTER_DESTINATION_LOCATION, new Object[i3], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                if (objB3 != coroutineSingletons) {
                    chaloTextUIState2 = chaloTextUIState;
                    function6 = function5;
                    styledTextUIState4 = styledTextUIState3;
                    str10 = str8;
                    searchItemUIState3 = searchItemUIState2;
                    chaloTextStyleHelper3 = chaloTextStyleHelper2;
                    function7 = function6;
                    CoroutineSingletons coroutineSingletons7 = coroutineSingletons;
                    str11 = str9;
                    chaloTextStyleHelper4 = chaloTextStyleHelper2;
                    str12 = str10;
                    searchItemUIState4 = new SearchItemUIState(chaloTextUIState2, styledTextUIState4, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB3, black_40, 1, null, null, null, null, 120), new c41(function7, 20));
                    iconType = IconType.PB_SWAP_ICON;
                    imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str12;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str11;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function7;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = iconType;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = imageUISize;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = searchItemUIState3;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = searchItemUIState4;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 5;
                    stringProvider2 = stringProvider;
                    objB4 = stringProvider2.b(StringEnum.SWAP_STOPS, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                    coroutineSingletons2 = coroutineSingletons7;
                    if (objB4 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    iconType2 = iconType;
                    function8 = function7;
                    imageUISize2 = imageUISize;
                    str13 = str11;
                    obj3 = objB4;
                    ImageUIState imageUIState4 = new ImageUIState(iconType2, (String) obj3, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new c41(function8, 21)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                    z = true;
                    searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState4, imageUIState4, 1);
                    z2 = false;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str12;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str13;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function8;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = buttonUIStateFactory;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = searchFieldComponentUIState;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper5;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = null;
                    selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 6;
                    objB5 = stringProvider2.b(StringEnum.CONTINUE, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                    if (objB5 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    str14 = str12;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    chaloTextStyleHelper6 = chaloTextStyleHelper5;
                    function9 = function8;
                    TextUIState.ChaloTextUIState chaloTextUIStateB4 = ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objB5, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                    UIShape.Rectangle rectangle4 = UIShape.d;
                    if (str14 != null) {
                        z3 = z2;
                    } else {
                        z3 = z2;
                    }
                    return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB4, new w31(3, str14, str13, function9), rectangle4, z3, 0.0f, 36));
                }
                return coroutineSingletons;
            case 4:
                ChaloTextStyleHelper chaloTextStyleHelper9 = (ChaloTextStyleHelper) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6;
                TextUIState.StyledTextUIState styledTextUIState5 = (TextUIState.StyledTextUIState) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4;
                SearchItemUIState searchItemUIState5 = (SearchItemUIState) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3;
                function6 = (Function1) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2;
                String str19 = (String) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1;
                str10 = (String) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0;
                ResultKt.b(obj3);
                objB3 = obj3;
                stringProvider = stringProvider3;
                str9 = str19;
                chaloTextUIState2 = chaloTextUIState5;
                chaloTextStyleHelper3 = chaloTextStyleHelper9;
                chaloTextStyleHelper2 = chaloTextStyleHelper7;
                coroutineSingletons = coroutineSingletons3;
                styledTextUIState4 = styledTextUIState5;
                searchItemUIState3 = searchItemUIState5;
                function7 = function6;
                CoroutineSingletons coroutineSingletons8 = coroutineSingletons;
                str11 = str9;
                chaloTextStyleHelper4 = chaloTextStyleHelper2;
                str12 = str10;
                searchItemUIState4 = new SearchItemUIState(chaloTextUIState2, styledTextUIState4, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB3, black_40, 1, null, null, null, null, 120), new c41(function7, 20));
                iconType = IconType.PB_SWAP_ICON;
                imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str12;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str11;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function7;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = iconType;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = imageUISize;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = searchItemUIState3;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = searchItemUIState4;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 5;
                stringProvider2 = stringProvider;
                objB4 = stringProvider2.b(StringEnum.SWAP_STOPS, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                coroutineSingletons2 = coroutineSingletons8;
                if (objB4 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                iconType2 = iconType;
                function8 = function7;
                imageUISize2 = imageUISize;
                str13 = str11;
                obj3 = objB4;
                ImageUIState imageUIState5 = new ImageUIState(iconType2, (String) obj3, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new c41(function8, 21)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                z = true;
                searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState4, imageUIState5, 1);
                z2 = false;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str12;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str13;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function8;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = buttonUIStateFactory;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = searchFieldComponentUIState;
                chaloTextStyleHelper5 = chaloTextStyleHelper4;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper5;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = null;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 6;
                objB5 = stringProvider2.b(StringEnum.CONTINUE, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                if (objB5 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                str14 = str12;
                buttonUIStateFactory2 = buttonUIStateFactory;
                chaloTextStyleHelper6 = chaloTextStyleHelper5;
                function9 = function8;
                TextUIState.ChaloTextUIState chaloTextUIStateB5 = ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objB5, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                UIShape.Rectangle rectangle5 = UIShape.d;
                if (str14 != null) {
                    z3 = z2;
                } else {
                    z3 = z2;
                }
                return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB5, new w31(3, str14, str13, function9), rectangle5, z3, 0.0f, 36));
            case 5:
                SearchItemUIState searchItemUIState6 = (SearchItemUIState) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6;
                searchItemUIState3 = (SearchItemUIState) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5;
                ImageUISize imageUISize3 = (ImageUISize) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4;
                IconType iconType3 = (IconType) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3;
                function8 = (Function1) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2;
                String str20 = (String) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1;
                String str21 = (String) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0;
                ResultKt.b(obj3);
                imageUISize2 = imageUISize3;
                iconType2 = iconType3;
                chaloTextStyleHelper4 = chaloTextStyleHelper7;
                str13 = str20;
                coroutineSingletons2 = coroutineSingletons3;
                searchItemUIState4 = searchItemUIState6;
                str12 = str21;
                stringProvider2 = stringProvider3;
                ImageUIState imageUIState6 = new ImageUIState(iconType2, (String) obj3, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new c41(function8, 21)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                z = true;
                searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState4, imageUIState6, 1);
                z2 = false;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0 = str12;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1 = str13;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2 = function8;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3 = buttonUIStateFactory;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4 = searchFieldComponentUIState;
                chaloTextStyleHelper5 = chaloTextStyleHelper4;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper5;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$6 = null;
                selectRideUiStateFactory$createFromAndToStopCardUIState$1.label = 6;
                objB5 = stringProvider2.b(StringEnum.CONTINUE, new Object[0], selectRideUiStateFactory$createFromAndToStopCardUIState$1);
                if (objB5 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                str14 = str12;
                buttonUIStateFactory2 = buttonUIStateFactory;
                chaloTextStyleHelper6 = chaloTextStyleHelper5;
                function9 = function8;
                TextUIState.ChaloTextUIState chaloTextUIStateB6 = ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objB5, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                UIShape.Rectangle rectangle6 = UIShape.d;
                if (str14 != null) {
                    z3 = z2;
                } else {
                    z3 = z2;
                }
                return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB6, new w31(3, str14, str13, function9), rectangle6, z3, 0.0f, 36));
            case 6:
                ChaloTextStyleHelper chaloTextStyleHelper10 = (ChaloTextStyleHelper) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$5;
                searchFieldComponentUIState = (SearchFieldComponentUIState) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$4;
                buttonUIStateFactory2 = (ButtonUIStateFactory) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$3;
                function9 = (Function1) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$2;
                str13 = (String) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$1;
                str14 = (String) selectRideUiStateFactory$createFromAndToStopCardUIState$1.L$0;
                ResultKt.b(obj3);
                objB5 = obj3;
                z = true;
                chaloTextStyleHelper6 = chaloTextStyleHelper10;
                z2 = false;
                TextUIState.ChaloTextUIState chaloTextUIStateB7 = ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objB5, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                UIShape.Rectangle rectangle7 = UIShape.d;
                if (str14 != null) {
                    z3 = z2;
                } else {
                    z3 = z2;
                }
                return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB7, new w31(3, str14, str13, function9), rectangle7, z3, 0.0f, 36));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01db  */
    /* JADX WARN: Code duplicated, block: B:44:0x020e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0254  */
    /* JADX WARN: Code duplicated, block: B:52:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:56:0x0330  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(SelectedTime selectedTime, Function1 function1, ContinuationImpl continuationImpl) throws Exception {
        SelectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1 selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1;
        int iR;
        String str;
        Function1 function2;
        String str2;
        int i;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        Function1 function4;
        String str3;
        TextUIState.ChaloTextUIState chaloTextUIStateF;
        Object objB;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        String str4;
        Function1 function5;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        TextUIState.ChaloTextUIState chaloTextUIStateF2;
        UIShape.Rectangle rectangle;
        Object objB2;
        CoroutineSingletons coroutineSingletons;
        Function1 function6;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        ButtonUIStateFactory buttonUIStateFactory;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        TextUIState.ChaloTextUIState chaloTextUIState9;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        Function1 function7;
        TextUIState.ChaloTextUIState chaloTextUIState10;
        ButtonUIState buttonUIStateF;
        Object objB3;
        TextUIState.ChaloTextUIState chaloTextUIState11;
        TextUIState.ChaloTextUIState chaloTextUIState12;
        ButtonUIState buttonUIState;
        TextUIState.ChaloTextUIState chaloTextUIState13;
        int i2;
        Function1 function8;
        String str5;
        ButtonUIStateFactory buttonUIStateFactory2;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        ChaloColorToken.Black black;
        ButtonUIState buttonUIStateD;
        UiEventHandler uiEventHandlerA;
        IconType iconType;
        ImageUISize imageUISize;
        CoroutineSingletons coroutineSingletons2;
        TextUIState.ChaloTextUIState chaloTextUIState14;
        Object objB4;
        ButtonUIState buttonUIState2;
        String str6;
        TextUIState.ChaloTextUIState chaloTextUIState15;
        if (continuationImpl instanceof SelectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1) {
            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1 = (SelectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1) continuationImpl;
            int i3 = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = i3 - Integer.MIN_VALUE;
            } else {
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1 = new SelectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1(this, continuationImpl);
            }
        } else {
            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1 = new SelectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1(this, continuationImpl);
        }
        Object objB5 = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label;
        ButtonUIStateFactory buttonUIStateFactory3 = ButtonUIStateFactory.f9921a;
        ChaloTextStyleHelper chaloTextStyleHelper5 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider = this.f3698a;
        switch (i4) {
            case 0:
                ResultKt.b(objB5);
                long j = this.c.j();
                TimeZone.Companion companion = TimeZone.INSTANCE;
                TimeUtilsContract timeUtilsContract = this.b;
                String strB = timeUtilsContract.b();
                companion.getClass();
                TimeZone timeZoneA = TimeZone.Companion.a(strB);
                Instant.INSTANCE.getClass();
                LocalDateTime localDateTimeC = TimeZoneKt.c(Instant.Companion.a(j), timeZoneA);
                iR = selectedTime != null ? selectedTime.f3715a : timeUtilsContract.r(localDateTimeC.g());
                int iH = selectedTime != null ? selectedTime.b : localDateTimeC.h();
                if (selectedTime == null || (str = selectedTime.c) == null) {
                    str = localDateTimeC.g() < 12 ? "AM" : "PM";
                }
                function2 = function1;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function2;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = iH;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 1;
                objB5 = stringProvider.b(StringEnum.WHEN_DO_YOU_WANT_THIS_RIDE, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                if (objB5 != coroutineSingletons3) {
                    str2 = str;
                    i = iH;
                    chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.DisplayMedium, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7996);
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function2;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str2;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextStyleHelper5;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 2;
                    objB5 = stringProvider.b(StringEnum.SELECT_DATE, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                    if (objB5 != coroutineSingletons3) {
                        function3 = function2;
                        chaloTextUIState2 = chaloTextUIState;
                        chaloTextStyleHelper = chaloTextStyleHelper5;
                        function4 = function3;
                        str3 = str2;
                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function4;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str3;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState2;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIStateF;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = chaloTextStyleHelper5;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 3;
                        objB = stringProvider.b(StringEnum.SELECT_TIME, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                        if (objB != coroutineSingletons3) {
                            chaloTextUIState3 = chaloTextUIState2;
                            chaloTextUIState4 = chaloTextUIStateF;
                            str4 = str3;
                            function5 = function4;
                            chaloTextStyleHelper2 = chaloTextStyleHelper5;
                            objB5 = objB;
                            chaloTextUIState5 = chaloTextUIState4;
                            chaloTextUIState6 = chaloTextUIState3;
                            chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                            rectangle = UIShape.e;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function5;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str4;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState6;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState5;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = chaloTextUIStateF2;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = rectangle;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = chaloTextStyleHelper5;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 4;
                            objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                            coroutineSingletons = coroutineSingletons3;
                            if (objB2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            function6 = function5;
                            chaloTextUIState7 = chaloTextUIState6;
                            buttonUIStateFactory = buttonUIStateFactory3;
                            objB5 = objB2;
                            chaloTextUIState8 = chaloTextUIState5;
                            chaloTextUIState9 = chaloTextUIStateF2;
                            chaloTextStyleHelper3 = chaloTextStyleHelper5;
                            function7 = function6;
                            ButtonUIStateFactory buttonUIStateFactory4 = buttonUIStateFactory;
                            chaloTextUIState10 = chaloTextUIState7;
                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory4, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new c41(function7, 16), rectangle, false, 0.0f, 52);
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function7;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str4;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState8;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = chaloTextUIState9;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateF;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = buttonUIStateFactory3;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = chaloTextStyleHelper5;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 5;
                            objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                            if (objB3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            chaloTextUIState11 = chaloTextUIState10;
                            chaloTextUIState12 = chaloTextUIState8;
                            buttonUIState = buttonUIStateF;
                            chaloTextUIState13 = chaloTextUIState9;
                            i2 = iR;
                            function8 = function7;
                            objB5 = objB3;
                            str5 = str4;
                            buttonUIStateFactory2 = buttonUIStateFactory3;
                            chaloTextStyleHelper4 = chaloTextStyleHelper5;
                            ChaloColorToken.Black black2 = ChaloColorToken.Black.f9759a;
                            black = black2;
                            buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) objB5, black2, null, null, null, null, 124), new c41(function8, 17), UIShape.e, false, 52);
                            uiEventHandlerA = UiEventHandler.Companion.a(new c41(function8, 18));
                            iconType = IconType.IC_RED_CROSS;
                            imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                            coroutineSingletons2 = coroutineSingletons;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = str5;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState12;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState13;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = buttonUIState;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = uiEventHandlerA;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = iconType;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$8 = black;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$9 = imageUISize;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = i2;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                            chaloTextUIState14 = chaloTextUIState12;
                            selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 6;
                            objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                            if (objB4 == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            buttonUIState2 = buttonUIStateD;
                            str6 = str5;
                            chaloTextUIState15 = chaloTextUIState14;
                            objB5 = objB4;
                            return new PremiumBusSlotSelectionDateAndTimePickerUIState(i2, i, str6, chaloTextUIState11, chaloTextUIState15, chaloTextUIState13, buttonUIState, buttonUIState2, new ImageUIState(iconType, (String) objB5, black, imageUISize, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
                        }
                    }
                }
                return coroutineSingletons3;
            case 1:
                i = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1;
                iR = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0;
                String str7 = (String) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1;
                function2 = (Function1) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                str2 = str7;
                chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB5, UITextStyle.DisplayMedium, (ChaloColorToken) null, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7996);
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function2;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str2;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextStyleHelper5;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 2;
                objB5 = stringProvider.b(StringEnum.SELECT_DATE, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                if (objB5 != coroutineSingletons3) {
                    function3 = function2;
                    chaloTextUIState2 = chaloTextUIState;
                    chaloTextStyleHelper = chaloTextStyleHelper5;
                    function4 = function3;
                    str3 = str2;
                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function4;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str3;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState2;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIStateF;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = chaloTextStyleHelper5;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 3;
                    objB = stringProvider.b(StringEnum.SELECT_TIME, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                    if (objB != coroutineSingletons3) {
                        chaloTextUIState3 = chaloTextUIState2;
                        chaloTextUIState4 = chaloTextUIStateF;
                        str4 = str3;
                        function5 = function4;
                        chaloTextStyleHelper2 = chaloTextStyleHelper5;
                        objB5 = objB;
                        chaloTextUIState5 = chaloTextUIState4;
                        chaloTextUIState6 = chaloTextUIState3;
                        chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        rectangle = UIShape.e;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function5;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str4;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState6;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState5;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = chaloTextUIStateF2;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = rectangle;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = chaloTextStyleHelper5;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                        coroutineSingletons = coroutineSingletons3;
                        if (objB2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        function6 = function5;
                        chaloTextUIState7 = chaloTextUIState6;
                        buttonUIStateFactory = buttonUIStateFactory3;
                        objB5 = objB2;
                        chaloTextUIState8 = chaloTextUIState5;
                        chaloTextUIState9 = chaloTextUIStateF2;
                        chaloTextStyleHelper3 = chaloTextStyleHelper5;
                        function7 = function6;
                        ButtonUIStateFactory buttonUIStateFactory5 = buttonUIStateFactory;
                        chaloTextUIState10 = chaloTextUIState7;
                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory5, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new c41(function7, 16), rectangle, false, 0.0f, 52);
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function7;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str4;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState8;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = chaloTextUIState9;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateF;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = buttonUIStateFactory3;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = chaloTextStyleHelper5;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 5;
                        objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                        if (objB3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        chaloTextUIState11 = chaloTextUIState10;
                        chaloTextUIState12 = chaloTextUIState8;
                        buttonUIState = buttonUIStateF;
                        chaloTextUIState13 = chaloTextUIState9;
                        i2 = iR;
                        function8 = function7;
                        objB5 = objB3;
                        str5 = str4;
                        buttonUIStateFactory2 = buttonUIStateFactory3;
                        chaloTextStyleHelper4 = chaloTextStyleHelper5;
                        ChaloColorToken.Black black3 = ChaloColorToken.Black.f9759a;
                        black = black3;
                        buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) objB5, black3, null, null, null, null, 124), new c41(function8, 17), UIShape.e, false, 52);
                        uiEventHandlerA = UiEventHandler.Companion.a(new c41(function8, 18));
                        iconType = IconType.IC_RED_CROSS;
                        imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                        coroutineSingletons2 = coroutineSingletons;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = str5;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState12;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState13;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = buttonUIState;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = uiEventHandlerA;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = iconType;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$8 = black;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$9 = imageUISize;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = i2;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                        chaloTextUIState14 = chaloTextUIState12;
                        selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 6;
                        objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                        if (objB4 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        buttonUIState2 = buttonUIStateD;
                        str6 = str5;
                        chaloTextUIState15 = chaloTextUIState14;
                        objB5 = objB4;
                        return new PremiumBusSlotSelectionDateAndTimePickerUIState(i2, i, str6, chaloTextUIState11, chaloTextUIState15, chaloTextUIState13, buttonUIState, buttonUIState2, new ImageUIState(iconType, (String) objB5, black, imageUISize, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
                    }
                }
                return coroutineSingletons3;
            case 2:
                i = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1;
                iR = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0;
                ChaloTextStyleHelper chaloTextStyleHelper6 = (ChaloTextStyleHelper) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState16 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2;
                str2 = (String) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1;
                Function1 function9 = (Function1) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                chaloTextStyleHelper = chaloTextStyleHelper6;
                chaloTextUIState2 = chaloTextUIState16;
                function3 = function9;
                function4 = function3;
                str3 = str2;
                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function4;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str3;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState2;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIStateF;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = chaloTextStyleHelper5;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 3;
                objB = stringProvider.b(StringEnum.SELECT_TIME, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                if (objB != coroutineSingletons3) {
                    chaloTextUIState3 = chaloTextUIState2;
                    chaloTextUIState4 = chaloTextUIStateF;
                    str4 = str3;
                    function5 = function4;
                    chaloTextStyleHelper2 = chaloTextStyleHelper5;
                    objB5 = objB;
                    chaloTextUIState5 = chaloTextUIState4;
                    chaloTextUIState6 = chaloTextUIState3;
                    chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                    rectangle = UIShape.e;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function5;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str4;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState6;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState5;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = chaloTextUIStateF2;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = rectangle;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = chaloTextStyleHelper5;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                    coroutineSingletons = coroutineSingletons3;
                    if (objB2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    function6 = function5;
                    chaloTextUIState7 = chaloTextUIState6;
                    buttonUIStateFactory = buttonUIStateFactory3;
                    objB5 = objB2;
                    chaloTextUIState8 = chaloTextUIState5;
                    chaloTextUIState9 = chaloTextUIStateF2;
                    chaloTextStyleHelper3 = chaloTextStyleHelper5;
                    function7 = function6;
                    ButtonUIStateFactory buttonUIStateFactory6 = buttonUIStateFactory;
                    chaloTextUIState10 = chaloTextUIState7;
                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory6, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new c41(function7, 16), rectangle, false, 0.0f, 52);
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function7;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str4;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState8;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = chaloTextUIState9;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateF;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = buttonUIStateFactory3;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = chaloTextStyleHelper5;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 5;
                    objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                    if (objB3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    chaloTextUIState11 = chaloTextUIState10;
                    chaloTextUIState12 = chaloTextUIState8;
                    buttonUIState = buttonUIStateF;
                    chaloTextUIState13 = chaloTextUIState9;
                    i2 = iR;
                    function8 = function7;
                    objB5 = objB3;
                    str5 = str4;
                    buttonUIStateFactory2 = buttonUIStateFactory3;
                    chaloTextStyleHelper4 = chaloTextStyleHelper5;
                    ChaloColorToken.Black black4 = ChaloColorToken.Black.f9759a;
                    black = black4;
                    buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) objB5, black4, null, null, null, null, 124), new c41(function8, 17), UIShape.e, false, 52);
                    uiEventHandlerA = UiEventHandler.Companion.a(new c41(function8, 18));
                    iconType = IconType.IC_RED_CROSS;
                    imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                    coroutineSingletons2 = coroutineSingletons;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = str5;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState12;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState13;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = buttonUIState;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = uiEventHandlerA;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = iconType;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$8 = black;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$9 = imageUISize;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = i2;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                    chaloTextUIState14 = chaloTextUIState12;
                    selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 6;
                    objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                    if (objB4 == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                    buttonUIState2 = buttonUIStateD;
                    str6 = str5;
                    chaloTextUIState15 = chaloTextUIState14;
                    objB5 = objB4;
                    return new PremiumBusSlotSelectionDateAndTimePickerUIState(i2, i, str6, chaloTextUIState11, chaloTextUIState15, chaloTextUIState13, buttonUIState, buttonUIState2, new ImageUIState(iconType, (String) objB5, black, imageUISize, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
                }
                return coroutineSingletons3;
            case 3:
                i = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1;
                iR = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0;
                ChaloTextStyleHelper chaloTextStyleHelper7 = (ChaloTextStyleHelper) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState17 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState18 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2;
                String str8 = (String) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1;
                Function1 function10 = (Function1) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                chaloTextUIState4 = chaloTextUIState17;
                chaloTextUIState3 = chaloTextUIState18;
                function5 = function10;
                chaloTextStyleHelper2 = chaloTextStyleHelper7;
                str4 = str8;
                chaloTextUIState5 = chaloTextUIState4;
                chaloTextUIState6 = chaloTextUIState3;
                chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB5, null, UIFontWeight.Bold, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                rectangle = UIShape.e;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function5;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str4;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState6;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState5;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = chaloTextUIStateF2;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateFactory3;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = rectangle;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = chaloTextStyleHelper5;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 4;
                objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                coroutineSingletons = coroutineSingletons3;
                if (objB2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                function6 = function5;
                chaloTextUIState7 = chaloTextUIState6;
                buttonUIStateFactory = buttonUIStateFactory3;
                objB5 = objB2;
                chaloTextUIState8 = chaloTextUIState5;
                chaloTextUIState9 = chaloTextUIStateF2;
                chaloTextStyleHelper3 = chaloTextStyleHelper5;
                function7 = function6;
                ButtonUIStateFactory buttonUIStateFactory7 = buttonUIStateFactory;
                chaloTextUIState10 = chaloTextUIState7;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory7, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new c41(function7, 16), rectangle, false, 0.0f, 52);
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function7;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str4;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState8;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = chaloTextUIState9;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateF;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = buttonUIStateFactory3;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = chaloTextStyleHelper5;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 5;
                objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                if (objB3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chaloTextUIState11 = chaloTextUIState10;
                chaloTextUIState12 = chaloTextUIState8;
                buttonUIState = buttonUIStateF;
                chaloTextUIState13 = chaloTextUIState9;
                i2 = iR;
                function8 = function7;
                objB5 = objB3;
                str5 = str4;
                buttonUIStateFactory2 = buttonUIStateFactory3;
                chaloTextStyleHelper4 = chaloTextStyleHelper5;
                ChaloColorToken.Black black5 = ChaloColorToken.Black.f9759a;
                black = black5;
                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) objB5, black5, null, null, null, null, 124), new c41(function8, 17), UIShape.e, false, 52);
                uiEventHandlerA = UiEventHandler.Companion.a(new c41(function8, 18));
                iconType = IconType.IC_RED_CROSS;
                imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                coroutineSingletons2 = coroutineSingletons;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = str5;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState12;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState13;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = buttonUIState;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = uiEventHandlerA;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = iconType;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$8 = black;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$9 = imageUISize;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = i2;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                chaloTextUIState14 = chaloTextUIState12;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 6;
                objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                if (objB4 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                buttonUIState2 = buttonUIStateD;
                str6 = str5;
                chaloTextUIState15 = chaloTextUIState14;
                objB5 = objB4;
                return new PremiumBusSlotSelectionDateAndTimePickerUIState(i2, i, str6, chaloTextUIState11, chaloTextUIState15, chaloTextUIState13, buttonUIState, buttonUIState2, new ImageUIState(iconType, (String) objB5, black, imageUISize, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
            case 4:
                int i5 = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1;
                iR = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0;
                ChaloTextStyleHelper chaloTextStyleHelper8 = (ChaloTextStyleHelper) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7;
                rectangle = (UIShape.Rectangle) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6;
                ButtonUIStateFactory buttonUIStateFactory8 = (ButtonUIStateFactory) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState19 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState20 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState21 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2;
                str4 = (String) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1;
                Function1 function11 = (Function1) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                buttonUIStateFactory = buttonUIStateFactory8;
                coroutineSingletons = coroutineSingletons3;
                chaloTextUIState9 = chaloTextUIState19;
                chaloTextStyleHelper3 = chaloTextStyleHelper8;
                chaloTextUIState8 = chaloTextUIState20;
                chaloTextUIState7 = chaloTextUIState21;
                function6 = function11;
                i = i5;
                function7 = function6;
                ButtonUIStateFactory buttonUIStateFactory9 = buttonUIStateFactory;
                chaloTextUIState10 = chaloTextUIState7;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory9, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB5, ChaloColorToken.White.f9870a, null, null, null, null, 124), new c41(function7, 16), rectangle, false, 0.0f, 52);
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = function7;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = str4;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState10;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState8;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = chaloTextUIState9;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateF;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = buttonUIStateFactory3;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = chaloTextStyleHelper5;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = iR;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 5;
                objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                if (objB3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chaloTextUIState11 = chaloTextUIState10;
                chaloTextUIState12 = chaloTextUIState8;
                buttonUIState = buttonUIStateF;
                chaloTextUIState13 = chaloTextUIState9;
                i2 = iR;
                function8 = function7;
                objB5 = objB3;
                str5 = str4;
                buttonUIStateFactory2 = buttonUIStateFactory3;
                chaloTextStyleHelper4 = chaloTextStyleHelper5;
                ChaloColorToken.Black black6 = ChaloColorToken.Black.f9759a;
                black = black6;
                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) objB5, black6, null, null, null, null, 124), new c41(function8, 17), UIShape.e, false, 52);
                uiEventHandlerA = UiEventHandler.Companion.a(new c41(function8, 18));
                iconType = IconType.IC_RED_CROSS;
                imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                coroutineSingletons2 = coroutineSingletons;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = str5;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState12;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState13;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = buttonUIState;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = uiEventHandlerA;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = iconType;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$8 = black;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$9 = imageUISize;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = i2;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                chaloTextUIState14 = chaloTextUIState12;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 6;
                objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                if (objB4 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                buttonUIState2 = buttonUIStateD;
                str6 = str5;
                chaloTextUIState15 = chaloTextUIState14;
                objB5 = objB4;
                return new PremiumBusSlotSelectionDateAndTimePickerUIState(i2, i, str6, chaloTextUIState11, chaloTextUIState15, chaloTextUIState13, buttonUIState, buttonUIState2, new ImageUIState(iconType, (String) objB5, black, imageUISize, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
            case 5:
                i = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1;
                int i6 = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0;
                ChaloTextStyleHelper chaloTextStyleHelper9 = (ChaloTextStyleHelper) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7;
                ButtonUIStateFactory buttonUIStateFactory10 = (ButtonUIStateFactory) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6;
                buttonUIState = (ButtonUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5;
                chaloTextUIState13 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState22 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3;
                chaloTextUIState11 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2;
                str5 = (String) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1;
                Function1 function12 = (Function1) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                chaloTextUIState12 = chaloTextUIState22;
                coroutineSingletons = coroutineSingletons3;
                i2 = i6;
                function8 = function12;
                chaloTextStyleHelper4 = chaloTextStyleHelper9;
                buttonUIStateFactory2 = buttonUIStateFactory10;
                ChaloColorToken.Black black7 = ChaloColorToken.Black.f9759a;
                black = black7;
                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) objB5, black7, null, null, null, null, 124), new c41(function8, 17), UIShape.e, false, 52);
                uiEventHandlerA = UiEventHandler.Companion.a(new c41(function8, 18));
                iconType = IconType.IC_RED_CROSS;
                imageUISize = new ImageUISize(ChaloThemeHelper.a().i);
                coroutineSingletons2 = coroutineSingletons;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0 = str5;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1 = chaloTextUIState11;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2 = chaloTextUIState12;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3 = chaloTextUIState13;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4 = buttonUIState;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5 = buttonUIStateD;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6 = uiEventHandlerA;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7 = iconType;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$8 = black;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$9 = imageUISize;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0 = i2;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1 = i;
                chaloTextUIState14 = chaloTextUIState12;
                selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.label = 6;
                objB4 = stringProvider.b(StringEnum.CROSS_TO_CLOSE, new Object[0], selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1);
                if (objB4 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                buttonUIState2 = buttonUIStateD;
                str6 = str5;
                chaloTextUIState15 = chaloTextUIState14;
                objB5 = objB4;
                return new PremiumBusSlotSelectionDateAndTimePickerUIState(i2, i, str6, chaloTextUIState11, chaloTextUIState15, chaloTextUIState13, buttonUIState, buttonUIState2, new ImageUIState(iconType, (String) objB5, black, imageUISize, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
            case 6:
                i = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$1;
                i2 = selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.I$0;
                imageUISize = (ImageUISize) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$9;
                black = (ChaloColorToken.Black) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$8;
                iconType = (IconType) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$7;
                uiEventHandlerA = (UiEventHandler) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$6;
                ButtonUIState buttonUIState3 = (ButtonUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$5;
                buttonUIState = (ButtonUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$4;
                chaloTextUIState13 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState23 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$2;
                chaloTextUIState11 = (TextUIState.ChaloTextUIState) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$1;
                String str9 = (String) selectRideUiStateFactory$createPremiumBusTimePickerBottomSheet$1.L$0;
                ResultKt.b(objB5);
                str6 = str9;
                buttonUIState2 = buttonUIState3;
                chaloTextUIState15 = chaloTextUIState23;
                return new PremiumBusSlotSelectionDateAndTimePickerUIState(i2, i, str6, chaloTextUIState11, chaloTextUIState15, chaloTextUIState13, buttonUIState, buttonUIState2, new ImageUIState(iconType, (String) objB5, black, imageUISize, (UIContentScale) null, 0.0f, uiEventHandlerA, 112), 8);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0301  */
    /* JADX WARN: Code duplicated, block: B:47:0x0185  */
    /* JADX WARN: Code duplicated, block: B:48:0x0187 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x0193 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:54:0x0196  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0220 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0224  */
    /* JADX WARN: Code duplicated, block: B:74:0x0240  */
    /* JADX WARN: Code duplicated, block: B:77:0x024e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0254  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0270  */
    /* JADX WARN: Code duplicated, block: B:84:0x0278  */
    /* JADX WARN: Code duplicated, block: B:87:0x0293  */
    /* JADX WARN: Code duplicated, block: B:91:0x02be  */
    /* JADX WARN: Code duplicated, block: B:92:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x02e5  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0140, code lost:
    
        if (r3 == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015d, code lost:
    
        if (r3 == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0172, code lost:
    
        if (r3 == r5) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.home.ui.selectridescreen.SelectRideDataState r30, kotlin.jvm.functions.Function1 r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.selectride.SelectRideUiStateFactory.c(app.chalo.home.ui.selectridescreen.SelectRideDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r14 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r14 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(boolean r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof app.chalo.home.ui.selectride.SelectRideUiStateFactory$createToolbarState$1
            if (r0 == 0) goto L13
            r0 = r14
            app.chalo.home.ui.selectride.SelectRideUiStateFactory$createToolbarState$1 r0 = (app.chalo.home.ui.selectride.SelectRideUiStateFactory$createToolbarState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.home.ui.selectride.SelectRideUiStateFactory$createToolbarState$1 r0 = new app.chalo.home.ui.selectride.SelectRideUiStateFactory$createToolbarState$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r14)
            goto L5c
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            kotlin.ResultKt.b(r14)
            goto L4b
        L36:
            kotlin.ResultKt.b(r14)
            r14 = 0
            app.chalo.providers.stringprovider.StringProvider r2 = r12.f3698a
            if (r13 == 0) goto L4f
            app.chalo.providers.stringprovider.StringEnum r13 = app.chalo.providers.stringprovider.StringEnum.EDIT_RIDE
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r0.label = r4
            java.lang.Object r14 = r2.b(r13, r14, r0)
            if (r14 != r1) goto L4b
            goto L5b
        L4b:
            java.lang.String r14 = (java.lang.String) r14
        L4d:
            r1 = r14
            goto L5f
        L4f:
            app.chalo.providers.stringprovider.StringEnum r13 = app.chalo.providers.stringprovider.StringEnum.SAVE_A_RIDE
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r0.label = r3
            java.lang.Object r14 = r2.b(r13, r14, r0)
            if (r14 != r1) goto L5c
        L5b:
            return r1
        L5c:
            java.lang.String r14 = (java.lang.String) r14
            goto L4d
        L5f:
            app.chalo.uistate.toolbar.ToolbarUIState r13 = new app.chalo.uistate.toolbar.ToolbarUIState
            app.chalo.uistate.text.UIFontWeight r4 = app.chalo.uistate.text.UIFontWeight.Bold
            r5 = 0
            r6 = 110(0x6e, float:1.54E-43)
            app.chalo.uistate.text.ChaloTextStyleHelper r0 = app.chalo.uistate.text.ChaloTextStyleHelper.f10078a
            r2 = 0
            r3 = 0
            app.chalo.uistate.text.TextUIState$ChaloTextUIState r4 = app.chalo.uistate.text.ChaloTextStyleHelper.e(r0, r1, r2, r3, r4, r5, r6)
            r10 = 0
            r11 = 253(0xfd, float:3.55E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.selectride.SelectRideUiStateFactory.d(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0125  */
    /* JADX WARN: Code duplicated, block: B:46:0x014b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0160  */
    /* JADX WARN: Code duplicated, block: B:53:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x017e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0184  */
    /* JADX WARN: Code duplicated, block: B:60:0x0188  */
    /* JADX WARN: Code duplicated, block: B:63:0x019d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object e(SelectRideDataState selectRideDataState, Function1 function1, ContinuationImpl continuationImpl) throws Exception {
        SelectRideUiStateFactory$createUiState$1 selectRideUiStateFactory$createUiState$1;
        SelectRideDataState selectRideDataState2;
        String str;
        String str2;
        Function1 function2;
        ToolbarUIState toolbarUIState;
        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState;
        LoadingDialogUIState loadingDialogUIState;
        SelectRideDataState selectRideDataState3;
        Object objC;
        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState2;
        ToolbarUIState toolbarUIState2;
        LoadingDialogUIState loadingDialogUIState2;
        Function1 function3;
        RideSavedSuccessFailureScreenUIState rideSavedSuccessFailureScreenUIState;
        int i;
        Object objB;
        ToolbarUIState toolbarUIState3;
        RideSavedSuccessFailureScreenUIState rideSavedSuccessFailureScreenUIState2;
        ToolbarUIState toolbarUIState4;
        RideSavedSuccessFailureScreenUIState rideSavedSuccessFailureScreenUIState3;
        LoadingDialogUIState loadingDialogUIState3;
        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState3;
        if (continuationImpl instanceof SelectRideUiStateFactory$createUiState$1) {
            selectRideUiStateFactory$createUiState$1 = (SelectRideUiStateFactory$createUiState$1) continuationImpl;
            int i2 = selectRideUiStateFactory$createUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectRideUiStateFactory$createUiState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                selectRideUiStateFactory$createUiState$1 = new SelectRideUiStateFactory$createUiState$1(this, continuationImpl);
            }
        } else {
            selectRideUiStateFactory$createUiState$1 = new SelectRideUiStateFactory$createUiState$1(this, continuationImpl);
        }
        SelectRideUiStateFactory$createUiState$1 selectRideUiStateFactory$createUiState$2 = selectRideUiStateFactory$createUiState$1;
        Object objA = selectRideUiStateFactory$createUiState$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = selectRideUiStateFactory$createUiState$2.label;
        PremiumBusSlotSelectionDateAndTimePickerUIState premiumBusSlotSelectionDateAndTimePickerUIState = null;
        if (i3 == 0) {
            ResultKt.b(objA);
            UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel = selectRideDataState.f3703a;
            String strA = userCommutePreferencePlaceLocationAppModel != null ? UserCommutePreferenceAppModelKt.a(userCommutePreferencePlaceLocationAppModel) : null;
            UserCommutePreferencePlaceLocationAppModel userCommutePreferencePlaceLocationAppModel2 = selectRideDataState.b;
            String strA2 = userCommutePreferencePlaceLocationAppModel2 != null ? UserCommutePreferenceAppModelKt.a(userCommutePreferencePlaceLocationAppModel2) : null;
            boolean z = selectRideDataState.e;
            selectRideUiStateFactory$createUiState$2.L$0 = selectRideDataState;
            selectRideUiStateFactory$createUiState$2.L$1 = function1;
            selectRideUiStateFactory$createUiState$2.L$2 = strA;
            selectRideUiStateFactory$createUiState$2.L$3 = strA2;
            selectRideUiStateFactory$createUiState$2.label = 1;
            Object objD = d(z, selectRideUiStateFactory$createUiState$2);
            if (objD != obj) {
                selectRideDataState2 = selectRideDataState;
                str = strA;
                str2 = strA2;
                objA = objD;
                function2 = function1;
            }
            return obj;
        }
        if (i3 == 1) {
            String str3 = (String) selectRideUiStateFactory$createUiState$2.L$3;
            String str4 = (String) selectRideUiStateFactory$createUiState$2.L$2;
            function2 = (Function1) selectRideUiStateFactory$createUiState$2.L$1;
            selectRideDataState2 = (SelectRideDataState) selectRideUiStateFactory$createUiState$2.L$0;
            ResultKt.b(objA);
            str2 = str3;
            str = str4;
        } else {
            if (i3 == 2) {
                ToolbarUIState toolbarUIState5 = (ToolbarUIState) selectRideUiStateFactory$createUiState$2.L$2;
                Function1 function4 = (Function1) selectRideUiStateFactory$createUiState$2.L$1;
                SelectRideDataState selectRideDataState4 = (SelectRideDataState) selectRideUiStateFactory$createUiState$2.L$0;
                ResultKt.b(objA);
                selectRideDataState2 = selectRideDataState4;
                function2 = function4;
                toolbarUIState = toolbarUIState5;
                searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) objA;
                if (selectRideDataState2.g) {
                    selectRideUiStateFactory$createUiState$2.L$0 = selectRideDataState2;
                    selectRideUiStateFactory$createUiState$2.L$1 = function2;
                    selectRideUiStateFactory$createUiState$2.L$2 = toolbarUIState;
                    selectRideUiStateFactory$createUiState$2.L$3 = searchFieldWithSwapButtonCardUIState;
                    selectRideUiStateFactory$createUiState$2.label = 3;
                    objA = this.f3698a.b(StringEnum.LOADING_THREE_DOTS, new Object[0], selectRideUiStateFactory$createUiState$2);
                    if (objA != obj) {
                        selectRideDataState3 = selectRideDataState2;
                        loadingDialogUIState = new LoadingDialogUIState(new TextUIState.ChaloTextUIState((String) objA, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190));
                        selectRideUiStateFactory$createUiState$2.L$0 = selectRideDataState3;
                        selectRideUiStateFactory$createUiState$2.L$1 = function2;
                        selectRideUiStateFactory$createUiState$2.L$2 = toolbarUIState;
                        selectRideUiStateFactory$createUiState$2.L$3 = searchFieldWithSwapButtonCardUIState;
                        selectRideUiStateFactory$createUiState$2.L$4 = loadingDialogUIState;
                        selectRideUiStateFactory$createUiState$2.label = 4;
                        objC = c(selectRideDataState3, function2, selectRideUiStateFactory$createUiState$2);
                        if (objC != obj) {
                            Function1 function5 = function2;
                            searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                            toolbarUIState2 = toolbarUIState;
                            loadingDialogUIState2 = loadingDialogUIState;
                            objA = objC;
                            function3 = function5;
                            rideSavedSuccessFailureScreenUIState = (RideSavedSuccessFailureScreenUIState) objA;
                            i = WhenMappings.f3699a[selectRideDataState3.i.ordinal()];
                            if (i != 1) {
                                if (selectRideDataState3.d) {
                                    SelectedTime selectedTime = selectRideDataState3.c;
                                    selectRideUiStateFactory$createUiState$2.L$0 = toolbarUIState2;
                                    selectRideUiStateFactory$createUiState$2.L$1 = searchFieldWithSwapButtonCardUIState2;
                                    selectRideUiStateFactory$createUiState$2.L$2 = loadingDialogUIState2;
                                    selectRideUiStateFactory$createUiState$2.L$3 = rideSavedSuccessFailureScreenUIState;
                                    selectRideUiStateFactory$createUiState$2.L$4 = null;
                                    selectRideUiStateFactory$createUiState$2.label = 5;
                                    objB = b(selectedTime, function3, selectRideUiStateFactory$createUiState$2);
                                    if (objB != obj) {
                                        toolbarUIState3 = toolbarUIState2;
                                        rideSavedSuccessFailureScreenUIState2 = rideSavedSuccessFailureScreenUIState;
                                        objA = objB;
                                    }
                                }
                                return new SelectRideViewState(toolbarUIState4, searchFieldWithSwapButtonCardUIState3, rideSavedSuccessFailureScreenUIState3, loadingDialogUIState3, premiumBusSlotSelectionDateAndTimePickerUIState);
                            }
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            toolbarUIState4 = toolbarUIState2;
                            rideSavedSuccessFailureScreenUIState3 = rideSavedSuccessFailureScreenUIState;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState2;
                            return new SelectRideViewState(toolbarUIState4, searchFieldWithSwapButtonCardUIState3, rideSavedSuccessFailureScreenUIState3, loadingDialogUIState3, premiumBusSlotSelectionDateAndTimePickerUIState);
                        }
                    }
                } else {
                    loadingDialogUIState = null;
                    selectRideDataState3 = selectRideDataState2;
                    selectRideUiStateFactory$createUiState$2.L$0 = selectRideDataState3;
                    selectRideUiStateFactory$createUiState$2.L$1 = function2;
                    selectRideUiStateFactory$createUiState$2.L$2 = toolbarUIState;
                    selectRideUiStateFactory$createUiState$2.L$3 = searchFieldWithSwapButtonCardUIState;
                    selectRideUiStateFactory$createUiState$2.L$4 = loadingDialogUIState;
                    selectRideUiStateFactory$createUiState$2.label = 4;
                    objC = c(selectRideDataState3, function2, selectRideUiStateFactory$createUiState$2);
                    if (objC != obj) {
                        Function1 function6 = function2;
                        searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                        toolbarUIState2 = toolbarUIState;
                        loadingDialogUIState2 = loadingDialogUIState;
                        objA = objC;
                        function3 = function6;
                        rideSavedSuccessFailureScreenUIState = (RideSavedSuccessFailureScreenUIState) objA;
                        i = WhenMappings.f3699a[selectRideDataState3.i.ordinal()];
                        if (i != 1) {
                            if (selectRideDataState3.d) {
                                SelectedTime selectedTime2 = selectRideDataState3.c;
                                selectRideUiStateFactory$createUiState$2.L$0 = toolbarUIState2;
                                selectRideUiStateFactory$createUiState$2.L$1 = searchFieldWithSwapButtonCardUIState2;
                                selectRideUiStateFactory$createUiState$2.L$2 = loadingDialogUIState2;
                                selectRideUiStateFactory$createUiState$2.L$3 = rideSavedSuccessFailureScreenUIState;
                                selectRideUiStateFactory$createUiState$2.L$4 = null;
                                selectRideUiStateFactory$createUiState$2.label = 5;
                                objB = b(selectedTime2, function3, selectRideUiStateFactory$createUiState$2);
                                if (objB != obj) {
                                    toolbarUIState3 = toolbarUIState2;
                                    rideSavedSuccessFailureScreenUIState2 = rideSavedSuccessFailureScreenUIState;
                                    objA = objB;
                                }
                            }
                            return new SelectRideViewState(toolbarUIState4, searchFieldWithSwapButtonCardUIState3, rideSavedSuccessFailureScreenUIState3, loadingDialogUIState3, premiumBusSlotSelectionDateAndTimePickerUIState);
                        }
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        toolbarUIState4 = toolbarUIState2;
                        rideSavedSuccessFailureScreenUIState3 = rideSavedSuccessFailureScreenUIState;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState2;
                        return new SelectRideViewState(toolbarUIState4, searchFieldWithSwapButtonCardUIState3, rideSavedSuccessFailureScreenUIState3, loadingDialogUIState3, premiumBusSlotSelectionDateAndTimePickerUIState);
                    }
                }
                return obj;
            }
            if (i3 == 3) {
                searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) selectRideUiStateFactory$createUiState$2.L$3;
                toolbarUIState = (ToolbarUIState) selectRideUiStateFactory$createUiState$2.L$2;
                function2 = (Function1) selectRideUiStateFactory$createUiState$2.L$1;
                selectRideDataState3 = (SelectRideDataState) selectRideUiStateFactory$createUiState$2.L$0;
                ResultKt.b(objA);
                loadingDialogUIState = new LoadingDialogUIState(new TextUIState.ChaloTextUIState((String) objA, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190));
                selectRideUiStateFactory$createUiState$2.L$0 = selectRideDataState3;
                selectRideUiStateFactory$createUiState$2.L$1 = function2;
                selectRideUiStateFactory$createUiState$2.L$2 = toolbarUIState;
                selectRideUiStateFactory$createUiState$2.L$3 = searchFieldWithSwapButtonCardUIState;
                selectRideUiStateFactory$createUiState$2.L$4 = loadingDialogUIState;
                selectRideUiStateFactory$createUiState$2.label = 4;
                objC = c(selectRideDataState3, function2, selectRideUiStateFactory$createUiState$2);
                if (objC != obj) {
                    Function1 function7 = function2;
                    searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                    toolbarUIState2 = toolbarUIState;
                    loadingDialogUIState2 = loadingDialogUIState;
                    objA = objC;
                    function3 = function7;
                    rideSavedSuccessFailureScreenUIState = (RideSavedSuccessFailureScreenUIState) objA;
                    i = WhenMappings.f3699a[selectRideDataState3.i.ordinal()];
                    if (i != 1) {
                        if (selectRideDataState3.d) {
                            SelectedTime selectedTime3 = selectRideDataState3.c;
                            selectRideUiStateFactory$createUiState$2.L$0 = toolbarUIState2;
                            selectRideUiStateFactory$createUiState$2.L$1 = searchFieldWithSwapButtonCardUIState2;
                            selectRideUiStateFactory$createUiState$2.L$2 = loadingDialogUIState2;
                            selectRideUiStateFactory$createUiState$2.L$3 = rideSavedSuccessFailureScreenUIState;
                            selectRideUiStateFactory$createUiState$2.L$4 = null;
                            selectRideUiStateFactory$createUiState$2.label = 5;
                            objB = b(selectedTime3, function3, selectRideUiStateFactory$createUiState$2);
                            if (objB != obj) {
                                toolbarUIState3 = toolbarUIState2;
                                rideSavedSuccessFailureScreenUIState2 = rideSavedSuccessFailureScreenUIState;
                                objA = objB;
                            }
                        }
                        return new SelectRideViewState(toolbarUIState4, searchFieldWithSwapButtonCardUIState3, rideSavedSuccessFailureScreenUIState3, loadingDialogUIState3, premiumBusSlotSelectionDateAndTimePickerUIState);
                    }
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    toolbarUIState4 = toolbarUIState2;
                    rideSavedSuccessFailureScreenUIState3 = rideSavedSuccessFailureScreenUIState;
                    loadingDialogUIState3 = loadingDialogUIState2;
                    searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState2;
                    return new SelectRideViewState(toolbarUIState4, searchFieldWithSwapButtonCardUIState3, rideSavedSuccessFailureScreenUIState3, loadingDialogUIState3, premiumBusSlotSelectionDateAndTimePickerUIState);
                }
                return obj;
            }
            if (i3 == 4) {
                LoadingDialogUIState loadingDialogUIState4 = (LoadingDialogUIState) selectRideUiStateFactory$createUiState$2.L$4;
                SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState4 = (SearchFieldWithSwapButtonCardUIState) selectRideUiStateFactory$createUiState$2.L$3;
                ToolbarUIState toolbarUIState6 = (ToolbarUIState) selectRideUiStateFactory$createUiState$2.L$2;
                function3 = (Function1) selectRideUiStateFactory$createUiState$2.L$1;
                selectRideDataState3 = (SelectRideDataState) selectRideUiStateFactory$createUiState$2.L$0;
                ResultKt.b(objA);
                loadingDialogUIState2 = loadingDialogUIState4;
                toolbarUIState2 = toolbarUIState6;
                searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState4;
                rideSavedSuccessFailureScreenUIState = (RideSavedSuccessFailureScreenUIState) objA;
                i = WhenMappings.f3699a[selectRideDataState3.i.ordinal()];
                if (i != 1) {
                    if (selectRideDataState3.d) {
                        SelectedTime selectedTime4 = selectRideDataState3.c;
                        selectRideUiStateFactory$createUiState$2.L$0 = toolbarUIState2;
                        selectRideUiStateFactory$createUiState$2.L$1 = searchFieldWithSwapButtonCardUIState2;
                        selectRideUiStateFactory$createUiState$2.L$2 = loadingDialogUIState2;
                        selectRideUiStateFactory$createUiState$2.L$3 = rideSavedSuccessFailureScreenUIState;
                        selectRideUiStateFactory$createUiState$2.L$4 = null;
                        selectRideUiStateFactory$createUiState$2.label = 5;
                        objB = b(selectedTime4, function3, selectRideUiStateFactory$createUiState$2);
                        if (objB != obj) {
                            toolbarUIState3 = toolbarUIState2;
                            rideSavedSuccessFailureScreenUIState2 = rideSavedSuccessFailureScreenUIState;
                            objA = objB;
                        }
                        return obj;
                    }
                    return new SelectRideViewState(toolbarUIState4, searchFieldWithSwapButtonCardUIState3, rideSavedSuccessFailureScreenUIState3, loadingDialogUIState3, premiumBusSlotSelectionDateAndTimePickerUIState);
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                toolbarUIState4 = toolbarUIState2;
                rideSavedSuccessFailureScreenUIState3 = rideSavedSuccessFailureScreenUIState;
                loadingDialogUIState3 = loadingDialogUIState2;
                searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState2;
                return new SelectRideViewState(toolbarUIState4, searchFieldWithSwapButtonCardUIState3, rideSavedSuccessFailureScreenUIState3, loadingDialogUIState3, premiumBusSlotSelectionDateAndTimePickerUIState);
            }
            if (i3 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rideSavedSuccessFailureScreenUIState2 = (RideSavedSuccessFailureScreenUIState) selectRideUiStateFactory$createUiState$2.L$3;
            loadingDialogUIState2 = (LoadingDialogUIState) selectRideUiStateFactory$createUiState$2.L$2;
            searchFieldWithSwapButtonCardUIState2 = (SearchFieldWithSwapButtonCardUIState) selectRideUiStateFactory$createUiState$2.L$1;
            toolbarUIState3 = (ToolbarUIState) selectRideUiStateFactory$createUiState$2.L$0;
            ResultKt.b(objA);
        }
        premiumBusSlotSelectionDateAndTimePickerUIState = (PremiumBusSlotSelectionDateAndTimePickerUIState) objA;
        rideSavedSuccessFailureScreenUIState3 = rideSavedSuccessFailureScreenUIState2;
        loadingDialogUIState3 = loadingDialogUIState2;
        searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState2;
        toolbarUIState4 = toolbarUIState3;
        return new SelectRideViewState(toolbarUIState4, searchFieldWithSwapButtonCardUIState3, rideSavedSuccessFailureScreenUIState3, loadingDialogUIState3, premiumBusSlotSelectionDateAndTimePickerUIState);
        ToolbarUIState toolbarUIState7 = (ToolbarUIState) objA;
        String str5 = str;
        ScreenType screenType = selectRideDataState2.i;
        selectRideUiStateFactory$createUiState$2.L$0 = selectRideDataState2;
        selectRideUiStateFactory$createUiState$2.L$1 = function2;
        selectRideUiStateFactory$createUiState$2.L$2 = toolbarUIState7;
        selectRideUiStateFactory$createUiState$2.L$3 = null;
        selectRideUiStateFactory$createUiState$2.label = 2;
        objA = a(screenType, str5, str2, function2, selectRideUiStateFactory$createUiState$2);
        if (objA != obj) {
            toolbarUIState = toolbarUIState7;
            searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) objA;
            if (selectRideDataState2.g) {
                selectRideUiStateFactory$createUiState$2.L$0 = selectRideDataState2;
                selectRideUiStateFactory$createUiState$2.L$1 = function2;
                selectRideUiStateFactory$createUiState$2.L$2 = toolbarUIState;
                selectRideUiStateFactory$createUiState$2.L$3 = searchFieldWithSwapButtonCardUIState;
                selectRideUiStateFactory$createUiState$2.label = 3;
                objA = this.f3698a.b(StringEnum.LOADING_THREE_DOTS, new Object[0], selectRideUiStateFactory$createUiState$2);
                if (objA != obj) {
                    selectRideDataState3 = selectRideDataState2;
                    loadingDialogUIState = new LoadingDialogUIState(new TextUIState.ChaloTextUIState((String) objA, (UITextStyle) null, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190));
                    selectRideUiStateFactory$createUiState$2.L$0 = selectRideDataState3;
                    selectRideUiStateFactory$createUiState$2.L$1 = function2;
                    selectRideUiStateFactory$createUiState$2.L$2 = toolbarUIState;
                    selectRideUiStateFactory$createUiState$2.L$3 = searchFieldWithSwapButtonCardUIState;
                    selectRideUiStateFactory$createUiState$2.L$4 = loadingDialogUIState;
                    selectRideUiStateFactory$createUiState$2.label = 4;
                    objC = c(selectRideDataState3, function2, selectRideUiStateFactory$createUiState$2);
                    if (objC != obj) {
                        Function1 function8 = function2;
                        searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                        toolbarUIState2 = toolbarUIState;
                        loadingDialogUIState2 = loadingDialogUIState;
                        objA = objC;
                        function3 = function8;
                        rideSavedSuccessFailureScreenUIState = (RideSavedSuccessFailureScreenUIState) objA;
                        i = WhenMappings.f3699a[selectRideDataState3.i.ordinal()];
                        if (i != 1) {
                            if (selectRideDataState3.d) {
                                SelectedTime selectedTime5 = selectRideDataState3.c;
                                selectRideUiStateFactory$createUiState$2.L$0 = toolbarUIState2;
                                selectRideUiStateFactory$createUiState$2.L$1 = searchFieldWithSwapButtonCardUIState2;
                                selectRideUiStateFactory$createUiState$2.L$2 = loadingDialogUIState2;
                                selectRideUiStateFactory$createUiState$2.L$3 = rideSavedSuccessFailureScreenUIState;
                                selectRideUiStateFactory$createUiState$2.L$4 = null;
                                selectRideUiStateFactory$createUiState$2.label = 5;
                                objB = b(selectedTime5, function3, selectRideUiStateFactory$createUiState$2);
                                if (objB != obj) {
                                    toolbarUIState3 = toolbarUIState2;
                                    rideSavedSuccessFailureScreenUIState2 = rideSavedSuccessFailureScreenUIState;
                                    objA = objB;
                                    premiumBusSlotSelectionDateAndTimePickerUIState = (PremiumBusSlotSelectionDateAndTimePickerUIState) objA;
                                    rideSavedSuccessFailureScreenUIState3 = rideSavedSuccessFailureScreenUIState2;
                                    loadingDialogUIState3 = loadingDialogUIState2;
                                    searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState2;
                                    toolbarUIState4 = toolbarUIState3;
                                }
                            }
                            return new SelectRideViewState(toolbarUIState4, searchFieldWithSwapButtonCardUIState3, rideSavedSuccessFailureScreenUIState3, loadingDialogUIState3, premiumBusSlotSelectionDateAndTimePickerUIState);
                        }
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        toolbarUIState4 = toolbarUIState2;
                        rideSavedSuccessFailureScreenUIState3 = rideSavedSuccessFailureScreenUIState;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState2;
                        return new SelectRideViewState(toolbarUIState4, searchFieldWithSwapButtonCardUIState3, rideSavedSuccessFailureScreenUIState3, loadingDialogUIState3, premiumBusSlotSelectionDateAndTimePickerUIState);
                    }
                }
            } else {
                loadingDialogUIState = null;
                selectRideDataState3 = selectRideDataState2;
                selectRideUiStateFactory$createUiState$2.L$0 = selectRideDataState3;
                selectRideUiStateFactory$createUiState$2.L$1 = function2;
                selectRideUiStateFactory$createUiState$2.L$2 = toolbarUIState;
                selectRideUiStateFactory$createUiState$2.L$3 = searchFieldWithSwapButtonCardUIState;
                selectRideUiStateFactory$createUiState$2.L$4 = loadingDialogUIState;
                selectRideUiStateFactory$createUiState$2.label = 4;
                objC = c(selectRideDataState3, function2, selectRideUiStateFactory$createUiState$2);
                if (objC != obj) {
                    Function1 function9 = function2;
                    searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                    toolbarUIState2 = toolbarUIState;
                    loadingDialogUIState2 = loadingDialogUIState;
                    objA = objC;
                    function3 = function9;
                    rideSavedSuccessFailureScreenUIState = (RideSavedSuccessFailureScreenUIState) objA;
                    i = WhenMappings.f3699a[selectRideDataState3.i.ordinal()];
                    if (i != 1) {
                        if (selectRideDataState3.d) {
                            SelectedTime selectedTime6 = selectRideDataState3.c;
                            selectRideUiStateFactory$createUiState$2.L$0 = toolbarUIState2;
                            selectRideUiStateFactory$createUiState$2.L$1 = searchFieldWithSwapButtonCardUIState2;
                            selectRideUiStateFactory$createUiState$2.L$2 = loadingDialogUIState2;
                            selectRideUiStateFactory$createUiState$2.L$3 = rideSavedSuccessFailureScreenUIState;
                            selectRideUiStateFactory$createUiState$2.L$4 = null;
                            selectRideUiStateFactory$createUiState$2.label = 5;
                            objB = b(selectedTime6, function3, selectRideUiStateFactory$createUiState$2);
                            if (objB != obj) {
                                toolbarUIState3 = toolbarUIState2;
                                rideSavedSuccessFailureScreenUIState2 = rideSavedSuccessFailureScreenUIState;
                                objA = objB;
                                premiumBusSlotSelectionDateAndTimePickerUIState = (PremiumBusSlotSelectionDateAndTimePickerUIState) objA;
                                rideSavedSuccessFailureScreenUIState3 = rideSavedSuccessFailureScreenUIState2;
                                loadingDialogUIState3 = loadingDialogUIState2;
                                searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState2;
                                toolbarUIState4 = toolbarUIState3;
                            }
                        }
                        return new SelectRideViewState(toolbarUIState4, searchFieldWithSwapButtonCardUIState3, rideSavedSuccessFailureScreenUIState3, loadingDialogUIState3, premiumBusSlotSelectionDateAndTimePickerUIState);
                    }
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    toolbarUIState4 = toolbarUIState2;
                    rideSavedSuccessFailureScreenUIState3 = rideSavedSuccessFailureScreenUIState;
                    loadingDialogUIState3 = loadingDialogUIState2;
                    searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState2;
                    return new SelectRideViewState(toolbarUIState4, searchFieldWithSwapButtonCardUIState3, rideSavedSuccessFailureScreenUIState3, loadingDialogUIState3, premiumBusSlotSelectionDateAndTimePickerUIState);
                }
            }
        }
        return obj;
    }
}
