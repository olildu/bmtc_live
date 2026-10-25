package app.chalo.livetracking.search.uistate;

import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.livetracking.search.SearchTarget;
import app.chalo.livetracking.search.StopBasedSearchSelectedLocation;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchDataState;
import app.chalo.livetracking.stoptripplannerresult.uistate.RouteDetailsUiState;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopInfoUiState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.recent.model.app.RecentLocationPairAppModel;
import app.chalo.recent.model.app.RecentLocationPairEndpointAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.components.FromToStopIconUIState;
import app.chalo.uistate.components.StopSelectionUIState;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.fromto.StopBasedMetroFromToSelectionContainerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.utils.DistanceUtils;
import defpackage.da1;
import defpackage.fa1;
import defpackage.z40;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchUiStateFactory;", "", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopBasedTripPlannerSearchUiStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f4522a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/search/uistate/StopBasedTripPlannerSearchUiStateFactory$Companion;", "", "", "NEAREST_STOPS_LIMIT", "I", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4523a;

        static {
            int[] iArr = new int[SearchTarget.values().length];
            try {
                iArr[SearchTarget.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchTarget.TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4523a = iArr;
        }
    }

    public StopBasedTripPlannerSearchUiStateFactory(StringProvider stringProvider) {
        this.f4522a = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:38:0x0258  */
    /* JADX WARN: Code duplicated, block: B:40:0x025c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0287  */
    /* JADX WARN: Code duplicated, block: B:43:0x028b  */
    /* JADX WARN: Code duplicated, block: B:46:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v6, types: [app.chalo.uistate.text.TextUIState$StyledTextUIState, app.chalo.uistate.text.UITextAlign] */
    public final Object a(RecentLocationPairAppModel recentLocationPairAppModel, ContinuationImpl continuationImpl) {
        StopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1 stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1;
        RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel;
        String str;
        String str2;
        int i;
        TextUIState.StyledTextUIState styledTextUIState;
        StopInfoUiState stopInfoUiState;
        StopInfoUiState stopInfoUiState2;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        Object obj;
        int i2;
        RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel2;
        StopInfoUiState stopInfoUiState3;
        StyledTextDataUIState[] styledTextDataUIStateArr3;
        Object objB;
        Object obj2;
        StopInfoUiState stopInfoUiState4;
        StyledTextDataUIState[] styledTextDataUIStateArr4;
        int i3;
        RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel3;
        StyledTextDataUIState[] styledTextDataUIStateArr5;
        ?? r6;
        RecentLocationPairAppModel recentLocationPairAppModel2 = recentLocationPairAppModel;
        if (continuationImpl instanceof StopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1) {
            stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1 = (StopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1) continuationImpl;
            int i4 = stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.label = i4 - Integer.MIN_VALUE;
            } else {
                stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1(this, continuationImpl);
            }
        } else {
            stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1(this, continuationImpl);
        }
        Object obj3 = stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.label;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        StringProvider stringProvider = this.f4522a;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        if (i5 != 0) {
            if (i5 == 1) {
                int i6 = stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.I$0;
                StyledTextDataUIState[] styledTextDataUIStateArr6 = (StyledTextDataUIState[]) stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$3;
                StyledTextDataUIState[] styledTextDataUIStateArr7 = (StyledTextDataUIState[]) stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$2;
                recentLocationPairEndpointAppModel = (RecentLocationPairEndpointAppModel) stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$1;
                RecentLocationPairAppModel recentLocationPairAppModel3 = (RecentLocationPairAppModel) stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$0;
                ResultKt.b(obj3);
                i2 = i6;
                recentLocationPairAppModel2 = recentLocationPairAppModel3;
                styledTextDataUIStateArr = styledTextDataUIStateArr6;
                obj = obj3;
                styledTextDataUIStateArr2 = styledTextDataUIStateArr7;
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.I$0;
                styledTextDataUIStateArr4 = (StyledTextDataUIState[]) stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$3;
                StyledTextDataUIState[] styledTextDataUIStateArr8 = (StyledTextDataUIState[]) stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$2;
                RecentLocationPairEndpointAppModel recentLocationPairEndpointAppModel4 = (RecentLocationPairEndpointAppModel) stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$1;
                StopInfoUiState stopInfoUiState5 = (StopInfoUiState) stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$0;
                ResultKt.b(obj3);
                str = "toLowerCase(...)";
                i3 = i7;
                r6 = 0;
                recentLocationPairEndpointAppModel3 = recentLocationPairEndpointAppModel4;
                styledTextDataUIStateArr5 = styledTextDataUIStateArr8;
                stopInfoUiState4 = stopInfoUiState5;
                obj2 = obj3;
                str2 = " ";
            }
            String lowerCase = ((String) obj2).toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, str);
            RecentLocationPairEndpointAppModel.NearbyStopToPlace nearbyStopToPlace = (RecentLocationPairEndpointAppModel.NearbyStopToPlace) recentLocationPairEndpointAppModel3;
            styledTextDataUIStateArr4[i3] = new StyledTextDataUIState(z40.g(str2, lowerCase, str2, nearbyStopToPlace.c.g), shadyGray, null, UITextStyle.BodySmall, null, null, null, 1012);
            List listS = CollectionsKt.S(styledTextDataUIStateArr5);
            UITextOverflow uITextOverflow = UITextOverflow.Ellipsis;
            new TextUIState.StyledTextUIState(listS, r6, uITextOverflow, 18);
            stopInfoUiState3 = new StopInfoUiState(new TextUIState.ChaloTextUIState(nearbyStopToPlace.b.b, UITextStyle.BodyMedium, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow, (UIFontStyle) null, (String) null, 7152), r6);
            stopInfoUiState2 = stopInfoUiState4;
            return new RouteDetailsUiState(stopInfoUiState2, stopInfoUiState3);
        }
        ResultKt.b(obj3);
        recentLocationPairEndpointAppModel = recentLocationPairAppModel2.g;
        if (!(recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.NearbyStopToPlace)) {
            str = "toLowerCase(...)";
            str2 = " ";
            i = 0;
            styledTextUIState = null;
            if (recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.Place) {
                stopInfoUiState = new StopInfoUiState(new TextUIState.ChaloTextUIState(((RecentLocationPairEndpointAppModel.Place) recentLocationPairEndpointAppModel).b.g, UITextStyle.BodyMedium, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152), null);
            } else {
                if (!(recentLocationPairEndpointAppModel instanceof RecentLocationPairEndpointAppModel.Stop)) {
                    throw new NoWhenBranchMatchedException();
                }
                stopInfoUiState = new StopInfoUiState(new TextUIState.ChaloTextUIState(((RecentLocationPairEndpointAppModel.Stop) recentLocationPairEndpointAppModel).b.b, UITextStyle.BodyMedium, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152), null);
            }
            stopInfoUiState2 = stopInfoUiState;
            recentLocationPairEndpointAppModel2 = recentLocationPairAppModel.h;
            if (recentLocationPairEndpointAppModel2 instanceof RecentLocationPairEndpointAppModel.NearbyStopToPlace) {
                styledTextDataUIStateArr3 = new StyledTextDataUIState[2];
                ChaloColorToken.Black black2 = black;
                black = black2;
                styledTextDataUIStateArr3[i] = new StyledTextDataUIState(DistanceUtils.a(((RecentLocationPairEndpointAppModel.NearbyStopToPlace) recentLocationPairEndpointAppModel2).d / 1000.0d), black2, null, UITextStyle.TitleLarge, null, null, null, 1012);
                stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$0 = stopInfoUiState2;
                stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$1 = recentLocationPairEndpointAppModel2;
                stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$2 = styledTextDataUIStateArr3;
                stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$3 = styledTextDataUIStateArr3;
                stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.I$0 = 1;
                stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.label = 2;
                objB = stringProvider.b(StringEnum.FROM, new Object[i], stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1);
                if (objB != coroutineSingletons) {
                    obj2 = objB;
                    stopInfoUiState4 = stopInfoUiState2;
                    styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                    i3 = 1;
                    recentLocationPairEndpointAppModel3 = recentLocationPairEndpointAppModel2;
                    styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                    r6 = styledTextUIState;
                    String lowerCase2 = ((String) obj2).toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase2, str);
                    RecentLocationPairEndpointAppModel.NearbyStopToPlace nearbyStopToPlace2 = (RecentLocationPairEndpointAppModel.NearbyStopToPlace) recentLocationPairEndpointAppModel3;
                    styledTextDataUIStateArr4[i3] = new StyledTextDataUIState(z40.g(str2, lowerCase2, str2, nearbyStopToPlace2.c.g), shadyGray, null, UITextStyle.BodySmall, null, null, null, 1012);
                    List listS2 = CollectionsKt.S(styledTextDataUIStateArr5);
                    UITextOverflow uITextOverflow2 = UITextOverflow.Ellipsis;
                    new TextUIState.StyledTextUIState(listS2, r6, uITextOverflow2, 18);
                    stopInfoUiState3 = new StopInfoUiState(new TextUIState.ChaloTextUIState(nearbyStopToPlace2.b.b, UITextStyle.BodyMedium, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow2, (UIFontStyle) null, (String) null, 7152), r6);
                    stopInfoUiState2 = stopInfoUiState4;
                }
            } else if (recentLocationPairEndpointAppModel2 instanceof RecentLocationPairEndpointAppModel.Place) {
                stopInfoUiState3 = new StopInfoUiState(new TextUIState.ChaloTextUIState(((RecentLocationPairEndpointAppModel.Place) recentLocationPairEndpointAppModel2).b.g, UITextStyle.BodyMedium, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152), styledTextUIState);
            } else {
                if (recentLocationPairEndpointAppModel2 instanceof RecentLocationPairEndpointAppModel.Stop) {
                    throw new NoWhenBranchMatchedException();
                }
                stopInfoUiState3 = new StopInfoUiState(new TextUIState.ChaloTextUIState(((RecentLocationPairEndpointAppModel.Stop) recentLocationPairEndpointAppModel2).b.b, UITextStyle.BodyMedium, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152), styledTextUIState);
            }
            return new RouteDetailsUiState(stopInfoUiState2, stopInfoUiState3);
        }
        StyledTextDataUIState[] styledTextDataUIStateArr9 = new StyledTextDataUIState[2];
        styledTextDataUIStateArr9[0] = new StyledTextDataUIState(DistanceUtils.a(((RecentLocationPairEndpointAppModel.NearbyStopToPlace) recentLocationPairEndpointAppModel).d / 1000.0d), black, null, UITextStyle.TitleLarge, null, null, null, 1012);
        stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$0 = recentLocationPairAppModel2;
        stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$1 = recentLocationPairEndpointAppModel;
        stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$2 = styledTextDataUIStateArr9;
        stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$3 = styledTextDataUIStateArr9;
        stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.I$0 = 1;
        stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.label = 1;
        Object objB2 = stringProvider.b(StringEnum.FROM, new Object[0], stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1);
        if (objB2 != coroutineSingletons) {
            black = black;
            styledTextDataUIStateArr = styledTextDataUIStateArr9;
            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
            obj = objB2;
            i2 = 1;
        }
        black = black;
        return coroutineSingletons;
        String lowerCase3 = ((String) obj).toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase3, "toLowerCase(...)");
        RecentLocationPairEndpointAppModel.NearbyStopToPlace nearbyStopToPlace3 = (RecentLocationPairEndpointAppModel.NearbyStopToPlace) recentLocationPairEndpointAppModel;
        recentLocationPairAppModel = recentLocationPairAppModel2;
        str = "toLowerCase(...)";
        i = 0;
        int i8 = i2;
        str2 = " ";
        StyledTextDataUIState[] styledTextDataUIStateArr10 = styledTextDataUIStateArr;
        styledTextUIState = null;
        styledTextDataUIStateArr10[i8] = new StyledTextDataUIState(z40.g(" ", lowerCase3, " ", nearbyStopToPlace3.c.g), shadyGray, null, UITextStyle.BodySmall, null, null, null, 1012);
        List listS3 = CollectionsKt.S(styledTextDataUIStateArr2);
        UITextOverflow uITextOverflow3 = UITextOverflow.Ellipsis;
        new TextUIState.StyledTextUIState(listS3, null, uITextOverflow3, 18);
        stopInfoUiState2 = new StopInfoUiState(new TextUIState.ChaloTextUIState(nearbyStopToPlace3.b.b, UITextStyle.BodyMedium, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow3, (UIFontStyle) null, (String) null, 7152), null);
        recentLocationPairEndpointAppModel2 = recentLocationPairAppModel.h;
        if (recentLocationPairEndpointAppModel2 instanceof RecentLocationPairEndpointAppModel.NearbyStopToPlace) {
            styledTextDataUIStateArr3 = new StyledTextDataUIState[2];
            ChaloColorToken.Black black3 = black;
            black = black3;
            styledTextDataUIStateArr3[i] = new StyledTextDataUIState(DistanceUtils.a(((RecentLocationPairEndpointAppModel.NearbyStopToPlace) recentLocationPairEndpointAppModel2).d / 1000.0d), black3, null, UITextStyle.TitleLarge, null, null, null, 1012);
            stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$0 = stopInfoUiState2;
            stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$1 = recentLocationPairEndpointAppModel2;
            stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$2 = styledTextDataUIStateArr3;
            stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.L$3 = styledTextDataUIStateArr3;
            stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.I$0 = 1;
            stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1.label = 2;
            objB = stringProvider.b(StringEnum.FROM, new Object[i], stopBasedTripPlannerSearchUiStateFactory$createRecentTripItemUIState$1);
            if (objB != coroutineSingletons) {
                obj2 = objB;
                stopInfoUiState4 = stopInfoUiState2;
                styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
                i3 = 1;
                recentLocationPairEndpointAppModel3 = recentLocationPairEndpointAppModel2;
                styledTextDataUIStateArr5 = styledTextDataUIStateArr4;
                r6 = styledTextUIState;
                String lowerCase4 = ((String) obj2).toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase4, str);
                RecentLocationPairEndpointAppModel.NearbyStopToPlace nearbyStopToPlace4 = (RecentLocationPairEndpointAppModel.NearbyStopToPlace) recentLocationPairEndpointAppModel3;
                styledTextDataUIStateArr4[i3] = new StyledTextDataUIState(z40.g(str2, lowerCase4, str2, nearbyStopToPlace4.c.g), shadyGray, null, UITextStyle.BodySmall, null, null, null, 1012);
                List listS4 = CollectionsKt.S(styledTextDataUIStateArr5);
                UITextOverflow uITextOverflow4 = UITextOverflow.Ellipsis;
                new TextUIState.StyledTextUIState(listS4, r6, uITextOverflow4, 18);
                stopInfoUiState3 = new StopInfoUiState(new TextUIState.ChaloTextUIState(nearbyStopToPlace4.b.b, UITextStyle.BodyMedium, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow4, (UIFontStyle) null, (String) null, 7152), r6);
                stopInfoUiState2 = stopInfoUiState4;
            }
            black = black;
            return coroutineSingletons;
        }
        if (recentLocationPairEndpointAppModel2 instanceof RecentLocationPairEndpointAppModel.Place) {
            stopInfoUiState3 = new StopInfoUiState(new TextUIState.ChaloTextUIState(((RecentLocationPairEndpointAppModel.Place) recentLocationPairEndpointAppModel2).b.g, UITextStyle.BodyMedium, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152), styledTextUIState);
        } else {
            if (recentLocationPairEndpointAppModel2 instanceof RecentLocationPairEndpointAppModel.Stop) {
                throw new NoWhenBranchMatchedException();
            }
            stopInfoUiState3 = new StopInfoUiState(new TextUIState.ChaloTextUIState(((RecentLocationPairEndpointAppModel.Stop) recentLocationPairEndpointAppModel2).b.b, UITextStyle.BodyMedium, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152), styledTextUIState);
        }
        return new RouteDetailsUiState(stopInfoUiState2, stopInfoUiState3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r12 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.livetracking.search.StopBasedTripPlannerSearchDataState r10, kotlin.jvm.functions.Function1 r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchUiStateFactory$getBottomSheetUIStateType$1
            if (r0 == 0) goto L13
            r0 = r12
            app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchUiStateFactory$getBottomSheetUIStateType$1 r0 = (app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchUiStateFactory$getBottomSheetUIStateType$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchUiStateFactory$getBottomSheetUIStateType$1 r0 = new app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchUiStateFactory$getBottomSheetUIStateType$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r12)
            goto L99
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            java.lang.Object r10 = r0.L$0
            app.chalo.uistate.bottomsheet.BottomSheetUiState r10 = (app.chalo.uistate.bottomsheet.BottomSheetUiState) r10
            kotlin.ResultKt.b(r12)
            goto L7e
        L3a:
            kotlin.ResultKt.b(r12)
            app.chalo.livetracking.search.StopBasedTripPlannerSearchBottomSheetType r12 = r10.g
            app.chalo.livetracking.search.StopBasedTripPlannerSearchBottomSheetType$None r2 = app.chalo.livetracking.search.StopBasedTripPlannerSearchBottomSheetType.None.f4487a
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r12, r2)
            if (r2 == 0) goto L4a
            app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchBottomSheetUiStateType$None r10 = app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchBottomSheetUiStateType.None.b
            return r10
        L4a:
            boolean r2 = r12 instanceof app.chalo.livetracking.search.StopBasedTripPlannerSearchBottomSheetType.NearestStops
            if (r2 == 0) goto L86
            app.chalo.uistate.bottomsheet.BottomSheetUiState r2 = new app.chalo.uistate.bottomsheet.BottomSheetUiState
            app.chalo.uistate.bottomsheet.BottomSheetUiSpec r3 = new app.chalo.uistate.bottomsheet.BottomSheetUiSpec
            app.chalo.compose.theme.UIShape$Rectangle r5 = app.chalo.compose.theme.UIShape.d
            r6 = 14
            r3.<init>(r5, r6)
            pb1 r5 = new pb1
            r6 = 0
            r5.<init>(r11, r6)
            app.chalo.uistate.bottomsheet.BottomSheetRequestHandler$Companion$fromLambda$2 r5 = app.chalo.uistate.bottomsheet.BottomSheetRequestHandler.Companion.a(r5)
            app.chalo.uistate.bottomsheet.BottomSheetEventHandler r6 = new app.chalo.uistate.bottomsheet.BottomSheetEventHandler
            r7 = 11
            r8 = 0
            r6.<init>(r8, r8, r5, r7)
            r2.<init>(r3, r6)
            app.chalo.livetracking.search.StopBasedTripPlannerSearchBottomSheetType$NearestStops r12 = (app.chalo.livetracking.search.StopBasedTripPlannerSearchBottomSheetType.NearestStops) r12
            app.chalo.recent.model.app.RecentPlaceAppModel r12 = r12.f4486a
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r12 = r9.g(r10, r12, r11, r0)
            if (r12 != r1) goto L7d
            goto L98
        L7d:
            r10 = r2
        L7e:
            app.chalo.livetracking.search.uistate.NearestStopsBottomSheetContainerUiState r12 = (app.chalo.livetracking.search.uistate.NearestStopsBottomSheetContainerUiState) r12
            app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchBottomSheetUiStateType$NearestStops r11 = new app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchBottomSheetUiStateType$NearestStops
            r11.<init>(r10, r12)
            return r11
        L86:
            boolean r10 = r12 instanceof app.chalo.livetracking.search.StopBasedTripPlannerSearchBottomSheetType.NearestStopFetchError
            if (r10 == 0) goto La1
            app.chalo.livetracking.search.StopBasedTripPlannerSearchBottomSheetType$NearestStopFetchError r12 = (app.chalo.livetracking.search.StopBasedTripPlannerSearchBottomSheetType.NearestStopFetchError) r12
            boolean r10 = r12.f4485a
            app.chalo.recent.model.app.RecentPlaceAppModel r12 = r12.b
            r0.label = r3
            java.lang.Object r12 = r9.e(r10, r12, r11, r0)
            if (r12 != r1) goto L99
        L98:
            return r1
        L99:
            app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState r12 = (app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState) r12
            app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchBottomSheetUiStateType$NearestStopFetchError r10 = new app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchBottomSheetUiStateType$NearestStopFetchError
            r10.<init>(r12)
            return r10
        La1:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchUiStateFactory.b(app.chalo.livetracking.search.StopBasedTripPlannerSearchDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0101  */
    /* JADX WARN: Code duplicated, block: B:35:0x0121  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(StopBasedTripPlannerSearchDataState stopBasedTripPlannerSearchDataState, Function1 function1, ContinuationImpl continuationImpl) {
        StopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1 stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1;
        FromToStopIconUIState fromToStopIconUIState;
        Object objB;
        StopBasedTripPlannerSearchDataState stopBasedTripPlannerSearchDataState2;
        StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation;
        Function1 function2;
        StopBasedTripPlannerSearchUiStateFactory stopBasedTripPlannerSearchUiStateFactory;
        FromToStopIconUIState fromToStopIconUIState2;
        Function1 function3;
        StopBasedTripPlannerSearchDataState stopBasedTripPlannerSearchDataState3;
        StopSelectionUIState stopSelectionUIState;
        StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation2;
        Object objB2;
        FromToStopIconUIState fromToStopIconUIState3;
        StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation3;
        StopBasedTripPlannerSearchUiStateFactory stopBasedTripPlannerSearchUiStateFactory2;
        Object objJ;
        StopSelectionUIState stopSelectionUIState2;
        Function1 function4;
        FromToStopIconUIState fromToStopIconUIState4;
        if (continuationImpl instanceof StopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1) {
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1 = (StopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1) continuationImpl;
            int i = stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1(this, continuationImpl);
            }
        } else {
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1(this, continuationImpl);
        }
        Object obj = stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.label;
        StringProvider stringProvider = this.f4522a;
        if (i2 == 0) {
            ResultKt.b(obj);
            fromToStopIconUIState = new FromToStopIconUIState();
            StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation4 = stopBasedTripPlannerSearchDataState.f4490a;
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$0 = stopBasedTripPlannerSearchDataState;
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$1 = function1;
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$2 = fromToStopIconUIState;
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$3 = this;
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$4 = stopBasedSearchSelectedLocation4;
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.FROM, new Object[0], stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1);
            if (objB != coroutineSingletons) {
                stopBasedTripPlannerSearchDataState2 = stopBasedTripPlannerSearchDataState;
                stopBasedSearchSelectedLocation = stopBasedSearchSelectedLocation4;
                function2 = function1;
                stopBasedTripPlannerSearchUiStateFactory = this;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            stopBasedSearchSelectedLocation = (StopBasedSearchSelectedLocation) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$4;
            stopBasedTripPlannerSearchUiStateFactory = (StopBasedTripPlannerSearchUiStateFactory) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$3;
            FromToStopIconUIState fromToStopIconUIState5 = (FromToStopIconUIState) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$2;
            function2 = (Function1) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$1;
            stopBasedTripPlannerSearchDataState2 = (StopBasedTripPlannerSearchDataState) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$0;
            ResultKt.b(obj);
            objB = obj;
            fromToStopIconUIState = fromToStopIconUIState5;
        } else {
            if (i2 == 2) {
                fromToStopIconUIState2 = (FromToStopIconUIState) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$2;
                function3 = (Function1) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$1;
                stopBasedTripPlannerSearchDataState3 = (StopBasedTripPlannerSearchDataState) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$0;
                ResultKt.b(obj);
                stopSelectionUIState = (StopSelectionUIState) obj;
                stopBasedSearchSelectedLocation2 = stopBasedTripPlannerSearchDataState3.b;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$0 = function3;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$1 = fromToStopIconUIState2;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$2 = stopSelectionUIState;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$3 = this;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$4 = stopBasedSearchSelectedLocation2;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.TO, new Object[0], stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1);
                if (objB2 != coroutineSingletons) {
                    fromToStopIconUIState3 = fromToStopIconUIState2;
                    stopBasedSearchSelectedLocation3 = stopBasedSearchSelectedLocation2;
                    stopBasedTripPlannerSearchUiStateFactory2 = this;
                    fa1 fa1Var = new fa1(function3, 29);
                    stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$0 = function3;
                    stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$1 = fromToStopIconUIState3;
                    stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$2 = stopSelectionUIState;
                    stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$3 = null;
                    stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$4 = null;
                    stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.label = 4;
                    objJ = stopBasedTripPlannerSearchUiStateFactory2.j(stopBasedSearchSelectedLocation3, (String) objB2, fa1Var, stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1);
                    if (objJ != coroutineSingletons) {
                        stopSelectionUIState2 = stopSelectionUIState;
                        function4 = function3;
                        fromToStopIconUIState4 = fromToStopIconUIState3;
                        obj = objJ;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                stopBasedSearchSelectedLocation3 = (StopBasedSearchSelectedLocation) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$4;
                StopBasedTripPlannerSearchUiStateFactory stopBasedTripPlannerSearchUiStateFactory3 = (StopBasedTripPlannerSearchUiStateFactory) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$3;
                StopSelectionUIState stopSelectionUIState3 = (StopSelectionUIState) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$2;
                fromToStopIconUIState3 = (FromToStopIconUIState) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$1;
                Function1 function5 = (Function1) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$0;
                ResultKt.b(obj);
                objB2 = obj;
                stopSelectionUIState = stopSelectionUIState3;
                stopBasedTripPlannerSearchUiStateFactory2 = stopBasedTripPlannerSearchUiStateFactory3;
                function3 = function5;
                fa1 fa1Var2 = new fa1(function3, 29);
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$0 = function3;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$1 = fromToStopIconUIState3;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$2 = stopSelectionUIState;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$3 = null;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$4 = null;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.label = 4;
                objJ = stopBasedTripPlannerSearchUiStateFactory2.j(stopBasedSearchSelectedLocation3, (String) objB2, fa1Var2, stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1);
                if (objJ != coroutineSingletons) {
                    stopSelectionUIState2 = stopSelectionUIState;
                    function4 = function3;
                    fromToStopIconUIState4 = fromToStopIconUIState3;
                    obj = objJ;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            StopSelectionUIState stopSelectionUIState4 = (StopSelectionUIState) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$2;
            FromToStopIconUIState fromToStopIconUIState6 = (FromToStopIconUIState) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$1;
            function4 = (Function1) stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$0;
            ResultKt.b(obj);
            stopSelectionUIState2 = stopSelectionUIState4;
            fromToStopIconUIState4 = fromToStopIconUIState6;
        }
        return new StopBasedMetroFromToSelectionContainerUIState(null, fromToStopIconUIState4, stopSelectionUIState2, (StopSelectionUIState) obj, new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fa1(function4, 24)), WebSocketProtocol.PAYLOAD_SHORT), null);
        fa1 fa1Var3 = new fa1(function2, 28);
        stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$0 = stopBasedTripPlannerSearchDataState2;
        stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$1 = function2;
        stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$2 = fromToStopIconUIState;
        stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$3 = null;
        stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$4 = null;
        stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.label = 2;
        Object objJ2 = stopBasedTripPlannerSearchUiStateFactory.j(stopBasedSearchSelectedLocation, (String) objB, fa1Var3, stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1);
        if (objJ2 != coroutineSingletons) {
            FromToStopIconUIState fromToStopIconUIState7 = fromToStopIconUIState;
            obj = objJ2;
            fromToStopIconUIState2 = fromToStopIconUIState7;
            function3 = function2;
            stopBasedTripPlannerSearchDataState3 = stopBasedTripPlannerSearchDataState2;
            stopSelectionUIState = (StopSelectionUIState) obj;
            stopBasedSearchSelectedLocation2 = stopBasedTripPlannerSearchDataState3.b;
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$0 = function3;
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$1 = fromToStopIconUIState2;
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$2 = stopSelectionUIState;
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$3 = this;
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$4 = stopBasedSearchSelectedLocation2;
            stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.label = 3;
            objB2 = stringProvider.b(StringEnum.TO, new Object[0], stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1);
            if (objB2 != coroutineSingletons) {
                fromToStopIconUIState3 = fromToStopIconUIState2;
                stopBasedSearchSelectedLocation3 = stopBasedSearchSelectedLocation2;
                stopBasedTripPlannerSearchUiStateFactory2 = this;
                fa1 fa1Var4 = new fa1(function3, 29);
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$0 = function3;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$1 = fromToStopIconUIState3;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$2 = stopSelectionUIState;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$3 = null;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.L$4 = null;
                stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1.label = 4;
                objJ = stopBasedTripPlannerSearchUiStateFactory2.j(stopBasedSearchSelectedLocation3, (String) objB2, fa1Var4, stopBasedTripPlannerSearchUiStateFactory$getFromToSelectionContainerUIState$1);
                if (objJ != coroutineSingletons) {
                    stopSelectionUIState2 = stopSelectionUIState;
                    function4 = function3;
                    fromToStopIconUIState4 = fromToStopIconUIState3;
                    obj = objJ;
                    return new StopBasedMetroFromToSelectionContainerUIState(null, fromToStopIconUIState4, stopSelectionUIState2, (StopSelectionUIState) obj, new ImageUIState(IconType.PB_SWAP_ICON, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fa1(function4, 24)), WebSocketProtocol.PAYLOAD_SHORT), null);
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ContinuationImpl continuationImpl) {
        StopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1 stopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1;
        DialogUIStateFactory dialogUIStateFactory;
        if (continuationImpl instanceof StopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1) {
            stopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1 = (StopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1) continuationImpl;
            int i = stopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1(this, continuationImpl);
            }
        } else {
            stopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1(this, continuationImpl);
        }
        Object objB = stopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            DialogUIStateFactory dialogUIStateFactory2 = DialogUIStateFactory.f9989a;
            stopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1.L$0 = dialogUIStateFactory2;
            stopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1.label = 1;
            objB = this.f4522a.b(StringEnum.LOADING, new Object[0], stopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            dialogUIStateFactory = dialogUIStateFactory2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dialogUIStateFactory = (DialogUIStateFactory) stopBasedTripPlannerSearchUiStateFactory$getLoadingDialogUIState$1.L$0;
            ResultKt.b(objB);
        }
        dialogUIStateFactory.getClass();
        return DialogUIStateFactory.a((String) objB);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0153  */
    /* JADX WARN: Code duplicated, block: B:36:0x016c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0179  */
    /* JADX WARN: Code duplicated, block: B:42:0x0192  */
    /* JADX WARN: Code duplicated, block: B:45:0x019c  */
    /* JADX WARN: Code duplicated, block: B:50:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:55:0x01de  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:61:0x0205  */
    /* JADX WARN: Code duplicated, block: B:64:0x021f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b3, code lost:
    
        if (r2 == r4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d6, code lost:
    
        if (r2 == r4) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r31, app.chalo.recent.model.app.RecentPlaceAppModel r32, kotlin.jvm.functions.Function1 r33, kotlin.coroutines.jvm.internal.ContinuationImpl r34) {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchUiStateFactory.e(boolean, app.chalo.recent.model.app.RecentPlaceAppModel, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(NearbyStopToLocationAppModel nearbyStopToLocationAppModel, RecentPlaceAppModel recentPlaceAppModel, Function1 function1, ContinuationImpl continuationImpl) {
        StopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1 stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1;
        ImageUIState imageUIState;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        Function1 function2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        RecentPlaceAppModel recentPlaceAppModel2;
        NearbyStopToLocationAppModel nearbyStopToLocationAppModel2 = nearbyStopToLocationAppModel;
        if (continuationImpl instanceof StopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1) {
            stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1 = (StopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1) continuationImpl;
            int i = stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1(this, continuationImpl);
            }
        } else {
            stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1(this, continuationImpl);
        }
        Object obj = stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.label;
        int i3 = 1;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strA = DistanceUtils.a(nearbyStopToLocationAppModel2.g / 1000.0d);
            imageUIState = new ImageUIState(IconType.BUS_SEARCH, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            String str = nearbyStopToLocationAppModel2.f;
            UITextStyle uITextStyle = UITextStyle.BodyLarge;
            UITextOverflow uITextOverflow = UITextOverflow.Ellipsis;
            ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
            TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(str, uITextStyle, black, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow, (UIFontStyle) null, (String) null, 7152);
            styledTextDataUIStateArr = new StyledTextDataUIState[2];
            styledTextDataUIStateArr[0] = new StyledTextDataUIState(strA, black, null, UITextStyle.TitleLarge, null, null, null, 1012);
            stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$0 = nearbyStopToLocationAppModel2;
            stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$1 = recentPlaceAppModel;
            function2 = function1;
            stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$2 = function2;
            stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$3 = styledTextDataUIStateArr;
            stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$4 = imageUIState;
            stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$5 = chaloTextUIState2;
            stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$6 = styledTextDataUIStateArr;
            stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.I$0 = 1;
            stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.label = 1;
            Object objB = this.f4522a.b(StringEnum.FROM, new Object[0], stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloTextUIState = chaloTextUIState2;
            obj = objB;
            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
            recentPlaceAppModel2 = recentPlaceAppModel;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.I$0;
            StyledTextDataUIState[] styledTextDataUIStateArr3 = (StyledTextDataUIState[]) stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$6;
            TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$5;
            imageUIState = (ImageUIState) stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$4;
            StyledTextDataUIState[] styledTextDataUIStateArr4 = (StyledTextDataUIState[]) stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$3;
            Function1 function3 = (Function1) stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$2;
            recentPlaceAppModel2 = (RecentPlaceAppModel) stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$1;
            NearbyStopToLocationAppModel nearbyStopToLocationAppModel3 = (NearbyStopToLocationAppModel) stopBasedTripPlannerSearchUiStateFactory$getNearestStopItemUIState$1.L$0;
            ResultKt.b(obj);
            styledTextDataUIStateArr = styledTextDataUIStateArr3;
            nearbyStopToLocationAppModel2 = nearbyStopToLocationAppModel3;
            styledTextDataUIStateArr2 = styledTextDataUIStateArr4;
            chaloTextUIState = chaloTextUIState3;
            function2 = function3;
        }
        ImageUIState imageUIState2 = imageUIState;
        String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        styledTextDataUIStateArr[i3] = new StyledTextDataUIState(z40.g(" ", lowerCase, " ", recentPlaceAppModel2.g), ChaloColorToken.ShadyGray.f9851a, null, UITextStyle.BodySmall, null, null, null, 1012);
        return new NearestStopItemUIState(imageUIState2, chaloTextUIState, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr2), null, UITextOverflow.Ellipsis, 18), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), new DividerUIState(0.0f, null, null, 7), UiEventHandler.Companion.a(new da1(10, function2, nearbyStopToLocationAppModel2)));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0199  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01b8 -> B:51:0x01b9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(app.chalo.livetracking.search.StopBasedTripPlannerSearchDataState r31, app.chalo.recent.model.app.RecentPlaceAppModel r32, kotlin.jvm.functions.Function1 r33, kotlin.coroutines.jvm.internal.ContinuationImpl r34) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchUiStateFactory.g(app.chalo.livetracking.search.StopBasedTripPlannerSearchDataState, app.chalo.recent.model.app.RecentPlaceAppModel, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:38:0x0100  */
    /* JADX WARN: Code duplicated, block: B:39:0x0112  */
    /* JADX WARN: Code duplicated, block: B:43:0x0155  */
    /* JADX WARN: Code duplicated, block: B:46:0x0167  */
    /* JADX WARN: Code duplicated, block: B:47:0x0172  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0155 -> B:44:0x0158). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(java.util.List r27, kotlin.jvm.functions.Function1 r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchUiStateFactory.h(java.util.List, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object i(Function1 function1, ContinuationImpl continuationImpl) {
        StopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1 stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1;
        NearbyStopItemSpec nearbyStopItemSpec;
        ImageUIState imageUIState;
        Function1 function2;
        ImageUIState imageUIState2;
        NearbyStopItemSpec nearbyStopItemSpec2;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof StopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1) {
            stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1 = (StopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1) continuationImpl;
            int i = stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1(this, continuationImpl);
            }
        } else {
            stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1(this, continuationImpl);
        }
        Object objB = stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.label;
        StringProvider stringProvider = this.f4522a;
        if (i2 == 0) {
            ResultKt.b(objB);
            float f = ChaloThemeHelper.a().h;
            NearbyStopItemSpec nearbyStopItemSpec3 = new NearbyStopItemSpec(new ChaloPadding(f, f, f, f), WebSocketProtocol.PAYLOAD_SHORT);
            ImageUIState imageUIState3 = new ImageUIState(IconType.IC_FILTER_SHIFT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
            stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$0 = function1;
            stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$1 = nearbyStopItemSpec3;
            stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$2 = imageUIState3;
            stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.label = 1;
            Object objB2 = stringProvider.b(StringEnum.SHOW_ALL_NEARBY_STOPS, new Object[0], stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1);
            if (objB2 != coroutineSingletons) {
                nearbyStopItemSpec = nearbyStopItemSpec3;
                objB = objB2;
                imageUIState = imageUIState3;
                function2 = function1;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            imageUIState = (ImageUIState) stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$2;
            nearbyStopItemSpec = (NearbyStopItemSpec) stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$1;
            function2 = (Function1) stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$3;
            ImageUIState imageUIState4 = (ImageUIState) stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$2;
            NearbyStopItemSpec nearbyStopItemSpec4 = (NearbyStopItemSpec) stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$1;
            function3 = (Function1) stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$0;
            ResultKt.b(objB);
            imageUIState2 = imageUIState4;
            nearbyStopItemSpec2 = nearbyStopItemSpec4;
            chaloTextUIState = chaloTextUIState2;
        }
        return new NearestStopItemUIState(nearbyStopItemSpec2, imageUIState2, chaloTextUIState, new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB, ChaloColorToken.ShadyGray.f9851a, null, UITextStyle.BodySmall, null, null, null, 1012)), null, UITextOverflow.Ellipsis, 18), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), null, UiEventHandler.Companion.a(new fa1(function3, 27)));
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, ChaloColorToken.Black.f9759a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, UITextOverflow.Ellipsis, (UIFontStyle) null, (String) null, 7152);
        stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$0 = function2;
        stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$1 = nearbyStopItemSpec;
        stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$2 = imageUIState;
        stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.L$3 = chaloTextUIState3;
        stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.SELECT_IF_YOU_DONT_HAVE_A_PREFERRED_STOP, new Object[0], stopBasedTripPlannerSearchUiStateFactory$getShowAllNearbyStopsItemUIState$1);
        if (objB != coroutineSingletons) {
            imageUIState2 = imageUIState;
            nearbyStopItemSpec2 = nearbyStopItemSpec;
            function3 = function2;
            chaloTextUIState = chaloTextUIState3;
            return new NearestStopItemUIState(nearbyStopItemSpec2, imageUIState2, chaloTextUIState, new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB, ChaloColorToken.ShadyGray.f9851a, null, UITextStyle.BodySmall, null, null, null, 1012)), null, UITextOverflow.Ellipsis, 18), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), null, UiEventHandler.Companion.a(new fa1(function3, 27)));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0141  */
    /* JADX WARN: Code duplicated, block: B:39:0x0145  */
    /* JADX WARN: Code duplicated, block: B:41:0x0149  */
    /* JADX WARN: Code duplicated, block: B:44:0x018a  */
    /* JADX WARN: Code duplicated, block: B:46:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:50:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:52:0x0200  */
    /* JADX WARN: Code duplicated, block: B:54:0x020c  */
    /* JADX WARN: Code duplicated, block: B:56:0x022c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0230  */
    /* JADX WARN: Code duplicated, block: B:61:0x0244  */
    /* JADX WARN: Code duplicated, block: B:65:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0117, code lost:
    
        if (r2 == r4) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(app.chalo.livetracking.search.StopBasedSearchSelectedLocation r30, java.lang.String r31, kotlin.jvm.functions.Function0 r32, kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.search.uistate.StopBasedTripPlannerSearchUiStateFactory.j(app.chalo.livetracking.search.StopBasedSearchSelectedLocation, java.lang.String, kotlin.jvm.functions.Function0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object k(ContinuationImpl continuationImpl) {
        StopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1 stopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1;
        if (continuationImpl instanceof StopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1) {
            stopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1 = (StopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1) continuationImpl;
            int i = stopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1(this, continuationImpl);
            }
        } else {
            stopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1(this, continuationImpl);
        }
        Object objB = stopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            stopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1.label = 1;
            objB = this.f4522a.b(StringEnum.FIND_AND_TRACK_YOUR_BUS, new Object[0], stopBasedTripPlannerSearchUiStateFactory$getToolbarUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return new ToolbarUIState(null, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.DisplayMedium, ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, null, null, ChaloThemeHelper.c.f1917a, null, null, 221);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:41:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(StopBasedTripPlannerSearchDataState stopBasedTripPlannerSearchDataState, Function1 function1, ContinuationImpl continuationImpl) {
        StopBasedTripPlannerSearchUiStateFactory$getViewState$1 stopBasedTripPlannerSearchUiStateFactory$getViewState$1;
        Function1 function2;
        RecentSearchSectionUIState recentSearchSectionUIState;
        ToolbarUIState toolbarUIState;
        StopBasedTripPlannerSearchDataState stopBasedTripPlannerSearchDataState2;
        ToolbarUIState toolbarUIState2;
        LoadingDialogUIState loadingDialogUIState;
        Object objD;
        Object objC;
        ToolbarUIState toolbarUIState3;
        RecentSearchSectionUIState recentSearchSectionUIState2;
        LoadingDialogUIState loadingDialogUIState2;
        Function1 function3;
        StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState;
        Object objB;
        ToolbarUIState toolbarUIState4;
        StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState2;
        LoadingDialogUIState loadingDialogUIState3;
        if (continuationImpl instanceof StopBasedTripPlannerSearchUiStateFactory$getViewState$1) {
            stopBasedTripPlannerSearchUiStateFactory$getViewState$1 = (StopBasedTripPlannerSearchUiStateFactory$getViewState$1) continuationImpl;
            int i = stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = i - Integer.MIN_VALUE;
            } else {
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1 = new StopBasedTripPlannerSearchUiStateFactory$getViewState$1(this, continuationImpl);
            }
        } else {
            stopBasedTripPlannerSearchUiStateFactory$getViewState$1 = new StopBasedTripPlannerSearchUiStateFactory$getViewState$1(this, continuationImpl);
        }
        Object objH = stopBasedTripPlannerSearchUiStateFactory$getViewState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            List list = stopBasedTripPlannerSearchDataState.c;
            stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = stopBasedTripPlannerSearchDataState;
            stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = function1;
            stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 1;
            objH = h(list, function1, stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
            if (objH != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            function1 = (Function1) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1;
            stopBasedTripPlannerSearchDataState = (StopBasedTripPlannerSearchDataState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0;
            ResultKt.b(objH);
        } else {
            if (i2 == 2) {
                RecentSearchSectionUIState recentSearchSectionUIState3 = (RecentSearchSectionUIState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2;
                Function1 function4 = (Function1) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1;
                StopBasedTripPlannerSearchDataState stopBasedTripPlannerSearchDataState3 = (StopBasedTripPlannerSearchDataState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0;
                ResultKt.b(objH);
                recentSearchSectionUIState = recentSearchSectionUIState3;
                stopBasedTripPlannerSearchDataState = stopBasedTripPlannerSearchDataState3;
                function2 = function4;
                toolbarUIState = (ToolbarUIState) objH;
                if (stopBasedTripPlannerSearchDataState.f) {
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = stopBasedTripPlannerSearchDataState;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = function2;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = recentSearchSectionUIState;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3 = toolbarUIState;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 3;
                    objD = d(stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
                    if (objD != obj) {
                        stopBasedTripPlannerSearchDataState2 = stopBasedTripPlannerSearchDataState;
                        toolbarUIState2 = toolbarUIState;
                        objH = objD;
                        loadingDialogUIState = (LoadingDialogUIState) objH;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = stopBasedTripPlannerSearchDataState2;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = function2;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = recentSearchSectionUIState;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3 = toolbarUIState2;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$4 = loadingDialogUIState;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 4;
                        objC = c(stopBasedTripPlannerSearchDataState2, function2, stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
                        if (objC != obj) {
                            RecentSearchSectionUIState recentSearchSectionUIState4 = recentSearchSectionUIState;
                            toolbarUIState3 = toolbarUIState2;
                            recentSearchSectionUIState2 = recentSearchSectionUIState4;
                            Function1 function5 = function2;
                            loadingDialogUIState2 = loadingDialogUIState;
                            objH = objC;
                            function3 = function5;
                            stopBasedMetroFromToSelectionContainerUIState = (StopBasedMetroFromToSelectionContainerUIState) objH;
                            stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = toolbarUIState3;
                            stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = loadingDialogUIState2;
                            stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = stopBasedMetroFromToSelectionContainerUIState;
                            stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3 = recentSearchSectionUIState2;
                            stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$4 = null;
                            stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 5;
                            objB = b(stopBasedTripPlannerSearchDataState2, function3, stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
                            if (objB != obj) {
                                toolbarUIState4 = toolbarUIState3;
                                stopBasedMetroFromToSelectionContainerUIState2 = stopBasedMetroFromToSelectionContainerUIState;
                                objH = objB;
                                loadingDialogUIState3 = loadingDialogUIState2;
                            }
                        }
                    }
                } else {
                    stopBasedTripPlannerSearchDataState2 = stopBasedTripPlannerSearchDataState;
                    toolbarUIState2 = toolbarUIState;
                    loadingDialogUIState = null;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = stopBasedTripPlannerSearchDataState2;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = function2;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = recentSearchSectionUIState;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3 = toolbarUIState2;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$4 = loadingDialogUIState;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 4;
                    objC = c(stopBasedTripPlannerSearchDataState2, function2, stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
                    if (objC != obj) {
                        RecentSearchSectionUIState recentSearchSectionUIState5 = recentSearchSectionUIState;
                        toolbarUIState3 = toolbarUIState2;
                        recentSearchSectionUIState2 = recentSearchSectionUIState5;
                        Function1 function6 = function2;
                        loadingDialogUIState2 = loadingDialogUIState;
                        objH = objC;
                        function3 = function6;
                        stopBasedMetroFromToSelectionContainerUIState = (StopBasedMetroFromToSelectionContainerUIState) objH;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = toolbarUIState3;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = loadingDialogUIState2;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = stopBasedMetroFromToSelectionContainerUIState;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3 = recentSearchSectionUIState2;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$4 = null;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 5;
                        objB = b(stopBasedTripPlannerSearchDataState2, function3, stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
                        if (objB != obj) {
                            toolbarUIState4 = toolbarUIState3;
                            stopBasedMetroFromToSelectionContainerUIState2 = stopBasedMetroFromToSelectionContainerUIState;
                            objH = objB;
                            loadingDialogUIState3 = loadingDialogUIState2;
                        }
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                toolbarUIState2 = (ToolbarUIState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3;
                recentSearchSectionUIState = (RecentSearchSectionUIState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2;
                function2 = (Function1) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1;
                stopBasedTripPlannerSearchDataState2 = (StopBasedTripPlannerSearchDataState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0;
                ResultKt.b(objH);
                loadingDialogUIState = (LoadingDialogUIState) objH;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = stopBasedTripPlannerSearchDataState2;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = function2;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = recentSearchSectionUIState;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3 = toolbarUIState2;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$4 = loadingDialogUIState;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 4;
                objC = c(stopBasedTripPlannerSearchDataState2, function2, stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
                if (objC != obj) {
                    RecentSearchSectionUIState recentSearchSectionUIState6 = recentSearchSectionUIState;
                    toolbarUIState3 = toolbarUIState2;
                    recentSearchSectionUIState2 = recentSearchSectionUIState6;
                    Function1 function7 = function2;
                    loadingDialogUIState2 = loadingDialogUIState;
                    objH = objC;
                    function3 = function7;
                    stopBasedMetroFromToSelectionContainerUIState = (StopBasedMetroFromToSelectionContainerUIState) objH;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = toolbarUIState3;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = loadingDialogUIState2;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = stopBasedMetroFromToSelectionContainerUIState;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3 = recentSearchSectionUIState2;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$4 = null;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 5;
                    objB = b(stopBasedTripPlannerSearchDataState2, function3, stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
                    if (objB != obj) {
                        toolbarUIState4 = toolbarUIState3;
                        stopBasedMetroFromToSelectionContainerUIState2 = stopBasedMetroFromToSelectionContainerUIState;
                        objH = objB;
                        loadingDialogUIState3 = loadingDialogUIState2;
                    }
                }
                return obj;
            }
            if (i2 == 4) {
                LoadingDialogUIState loadingDialogUIState4 = (LoadingDialogUIState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$4;
                toolbarUIState3 = (ToolbarUIState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3;
                RecentSearchSectionUIState recentSearchSectionUIState7 = (RecentSearchSectionUIState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2;
                function3 = (Function1) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1;
                stopBasedTripPlannerSearchDataState2 = (StopBasedTripPlannerSearchDataState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0;
                ResultKt.b(objH);
                loadingDialogUIState2 = loadingDialogUIState4;
                recentSearchSectionUIState2 = recentSearchSectionUIState7;
                stopBasedMetroFromToSelectionContainerUIState = (StopBasedMetroFromToSelectionContainerUIState) objH;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = toolbarUIState3;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = loadingDialogUIState2;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = stopBasedMetroFromToSelectionContainerUIState;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3 = recentSearchSectionUIState2;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$4 = null;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 5;
                objB = b(stopBasedTripPlannerSearchDataState2, function3, stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
                if (objB != obj) {
                    toolbarUIState4 = toolbarUIState3;
                    stopBasedMetroFromToSelectionContainerUIState2 = stopBasedMetroFromToSelectionContainerUIState;
                    objH = objB;
                    loadingDialogUIState3 = loadingDialogUIState2;
                }
                return obj;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            recentSearchSectionUIState2 = (RecentSearchSectionUIState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3;
            StopBasedMetroFromToSelectionContainerUIState stopBasedMetroFromToSelectionContainerUIState3 = (StopBasedMetroFromToSelectionContainerUIState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2;
            LoadingDialogUIState loadingDialogUIState5 = (LoadingDialogUIState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1;
            ToolbarUIState toolbarUIState5 = (ToolbarUIState) stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0;
            ResultKt.b(objH);
            stopBasedMetroFromToSelectionContainerUIState2 = stopBasedMetroFromToSelectionContainerUIState3;
            toolbarUIState4 = toolbarUIState5;
            loadingDialogUIState3 = loadingDialogUIState5;
        }
        return new StopBasedTripPlannerSearchViewState(toolbarUIState4, loadingDialogUIState3, stopBasedMetroFromToSelectionContainerUIState2, recentSearchSectionUIState2, (StopBasedTripPlannerSearchBottomSheetUiStateType) objH, 65);
        RecentSearchSectionUIState recentSearchSectionUIState8 = (RecentSearchSectionUIState) objH;
        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = stopBasedTripPlannerSearchDataState;
        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = function1;
        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = recentSearchSectionUIState8;
        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 2;
        Object objK = k(stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
        if (objK != obj) {
            function2 = function1;
            recentSearchSectionUIState = recentSearchSectionUIState8;
            objH = objK;
            toolbarUIState = (ToolbarUIState) objH;
            if (stopBasedTripPlannerSearchDataState.f) {
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = stopBasedTripPlannerSearchDataState;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = function2;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = recentSearchSectionUIState;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3 = toolbarUIState;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 3;
                objD = d(stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
                if (objD != obj) {
                    stopBasedTripPlannerSearchDataState2 = stopBasedTripPlannerSearchDataState;
                    toolbarUIState2 = toolbarUIState;
                    objH = objD;
                    loadingDialogUIState = (LoadingDialogUIState) objH;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = stopBasedTripPlannerSearchDataState2;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = function2;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = recentSearchSectionUIState;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3 = toolbarUIState2;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$4 = loadingDialogUIState;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 4;
                    objC = c(stopBasedTripPlannerSearchDataState2, function2, stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
                    if (objC != obj) {
                        RecentSearchSectionUIState recentSearchSectionUIState9 = recentSearchSectionUIState;
                        toolbarUIState3 = toolbarUIState2;
                        recentSearchSectionUIState2 = recentSearchSectionUIState9;
                        Function1 function8 = function2;
                        loadingDialogUIState2 = loadingDialogUIState;
                        objH = objC;
                        function3 = function8;
                        stopBasedMetroFromToSelectionContainerUIState = (StopBasedMetroFromToSelectionContainerUIState) objH;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = toolbarUIState3;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = loadingDialogUIState2;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = stopBasedMetroFromToSelectionContainerUIState;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3 = recentSearchSectionUIState2;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$4 = null;
                        stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 5;
                        objB = b(stopBasedTripPlannerSearchDataState2, function3, stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
                        if (objB != obj) {
                            toolbarUIState4 = toolbarUIState3;
                            stopBasedMetroFromToSelectionContainerUIState2 = stopBasedMetroFromToSelectionContainerUIState;
                            objH = objB;
                            loadingDialogUIState3 = loadingDialogUIState2;
                            return new StopBasedTripPlannerSearchViewState(toolbarUIState4, loadingDialogUIState3, stopBasedMetroFromToSelectionContainerUIState2, recentSearchSectionUIState2, (StopBasedTripPlannerSearchBottomSheetUiStateType) objH, 65);
                        }
                    }
                }
            } else {
                stopBasedTripPlannerSearchDataState2 = stopBasedTripPlannerSearchDataState;
                toolbarUIState2 = toolbarUIState;
                loadingDialogUIState = null;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = stopBasedTripPlannerSearchDataState2;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = function2;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = recentSearchSectionUIState;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3 = toolbarUIState2;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$4 = loadingDialogUIState;
                stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 4;
                objC = c(stopBasedTripPlannerSearchDataState2, function2, stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
                if (objC != obj) {
                    RecentSearchSectionUIState recentSearchSectionUIState10 = recentSearchSectionUIState;
                    toolbarUIState3 = toolbarUIState2;
                    recentSearchSectionUIState2 = recentSearchSectionUIState10;
                    Function1 function9 = function2;
                    loadingDialogUIState2 = loadingDialogUIState;
                    objH = objC;
                    function3 = function9;
                    stopBasedMetroFromToSelectionContainerUIState = (StopBasedMetroFromToSelectionContainerUIState) objH;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$0 = toolbarUIState3;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$1 = loadingDialogUIState2;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$2 = stopBasedMetroFromToSelectionContainerUIState;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$3 = recentSearchSectionUIState2;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.L$4 = null;
                    stopBasedTripPlannerSearchUiStateFactory$getViewState$1.label = 5;
                    objB = b(stopBasedTripPlannerSearchDataState2, function3, stopBasedTripPlannerSearchUiStateFactory$getViewState$1);
                    if (objB != obj) {
                        toolbarUIState4 = toolbarUIState3;
                        stopBasedMetroFromToSelectionContainerUIState2 = stopBasedMetroFromToSelectionContainerUIState;
                        objH = objB;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        return new StopBasedTripPlannerSearchViewState(toolbarUIState4, loadingDialogUIState3, stopBasedMetroFromToSelectionContainerUIState2, recentSearchSectionUIState2, (StopBasedTripPlannerSearchBottomSheetUiStateType) objH, 65);
                    }
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object m(ContinuationImpl continuationImpl) {
        StopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1 stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1;
        RecentSearchedItemUIState[] recentSearchedItemUIStateArr;
        RecentSearchedItemSpec recentSearchedItemSpec;
        ImageUIState imageUIState;
        int i;
        RecentSearchedItemUIState[] recentSearchedItemUIStateArr2;
        ChaloPadding chaloPadding;
        ImageUIState imageUIState2;
        int i2;
        RecentSearchedItemUIState[] recentSearchedItemUIStateArr3;
        RecentSearchedItemUIState[] recentSearchedItemUIStateArr4;
        if (continuationImpl instanceof StopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1) {
            stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1 = (StopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1) continuationImpl;
            int i3 = stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1(this, continuationImpl);
            }
        } else {
            stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1 = new StopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1(this, continuationImpl);
        }
        Object objB = stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.label;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        StringProvider stringProvider = this.f4522a;
        if (i4 == 0) {
            ResultKt.b(objB);
            recentSearchedItemUIStateArr = new RecentSearchedItemUIState[2];
            recentSearchedItemSpec = new RecentSearchedItemSpec(new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8), 14);
            imageUIState = new ImageUIState(IconType.BUS_NEARBY_SELECTED, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$0 = recentSearchedItemUIStateArr;
            stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$1 = recentSearchedItemUIStateArr;
            stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$2 = recentSearchedItemSpec;
            stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$3 = imageUIState;
            stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.I$0 = 0;
            stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.TYPE_YOUR_BUS_STOP, new Object[0], stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1);
            if (objB != coroutineSingletons) {
                i = 0;
                recentSearchedItemUIStateArr2 = recentSearchedItemUIStateArr;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            i = stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.I$0;
            imageUIState = (ImageUIState) stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$3;
            recentSearchedItemSpec = (RecentSearchedItemSpec) stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$2;
            RecentSearchedItemUIState[] recentSearchedItemUIStateArr5 = (RecentSearchedItemUIState[]) stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$1;
            RecentSearchedItemUIState[] recentSearchedItemUIStateArr6 = (RecentSearchedItemUIState[]) stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$0;
            ResultKt.b(objB);
            recentSearchedItemUIStateArr2 = recentSearchedItemUIStateArr5;
            recentSearchedItemUIStateArr = recentSearchedItemUIStateArr6;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.I$0;
            imageUIState2 = (ImageUIState) stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$2;
            recentSearchedItemUIStateArr3 = (RecentSearchedItemUIState[]) stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$1;
            recentSearchedItemUIStateArr4 = (RecentSearchedItemUIState[]) stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$0;
            ResultKt.b(objB);
            chaloPadding = null;
            i2 = i5;
        }
        UITextStyle uITextStyle = UITextStyle.BodyMedium;
        recentSearchedItemUIStateArr3[i2] = new RecentSearchedItemUIState(new RecentSearchedItemSpec(chaloPadding, 15), imageUIState2, new TextUIState.ChaloTextUIState((String) objB, uITextStyle, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new TextUIState.ChaloTextUIState("E.g. Padmanabhaswamy Temple", uITextStyle, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null);
        return CollectionsKt.S(recentSearchedItemUIStateArr4);
        ImageUIState imageUIState3 = imageUIState;
        RecentSearchedItemSpec recentSearchedItemSpec2 = recentSearchedItemSpec;
        UITextStyle uITextStyle2 = UITextStyle.BodyMedium;
        RecentSearchedItemUIState[] recentSearchedItemUIStateArr7 = recentSearchedItemUIStateArr;
        chaloPadding = null;
        recentSearchedItemUIStateArr2[i] = new RecentSearchedItemUIState(recentSearchedItemSpec2, imageUIState3, new TextUIState.ChaloTextUIState((String) objB, uITextStyle2, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new TextUIState.ChaloTextUIState("E.g., East Fort Bus Station", uITextStyle2, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new DividerUIState(0.0f, null, null, 7));
        ImageUIState imageUIState4 = new ImageUIState(IconType.IC_LOCATION_PIN, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$0 = recentSearchedItemUIStateArr7;
        stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$1 = recentSearchedItemUIStateArr7;
        stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$2 = imageUIState4;
        stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.L$3 = null;
        stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.I$0 = 1;
        stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.TYPE_IN_YOUR_LOCATION, new Object[0], stopBasedTripPlannerSearchUiStateFactory$getWhatToSearchSectionUIState$1);
        if (objB2 != coroutineSingletons) {
            imageUIState2 = imageUIState4;
            i2 = 1;
            recentSearchedItemUIStateArr3 = recentSearchedItemUIStateArr7;
            objB = objB2;
            recentSearchedItemUIStateArr4 = recentSearchedItemUIStateArr3;
            UITextStyle uITextStyle3 = UITextStyle.BodyMedium;
            recentSearchedItemUIStateArr3[i2] = new RecentSearchedItemUIState(new RecentSearchedItemSpec(chaloPadding, 15), imageUIState2, new TextUIState.ChaloTextUIState((String) objB, uITextStyle3, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new TextUIState.ChaloTextUIState("E.g. Padmanabhaswamy Temple", uITextStyle3, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), null);
            return CollectionsKt.S(recentSearchedItemUIStateArr4);
        }
        return coroutineSingletons;
    }
}
