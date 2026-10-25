package app.chalo.productbooking.pickroutelocation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteAppModelKt;
import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.instantticket.domain.FetchRouteDetailsLiveUseCase;
import app.chalo.livetracking.routedetails.domain.IsAgencyTagVisibleUseCase;
import app.chalo.livetracking.universalsearch.ui.SearchScreenLayoutType;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.recent.model.app.RecentRouteAppModel;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import app.chalo.resultstatemanager.instantticket.RouteSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.PickRouteLocationArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.card.CardUISpec;
import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.searchbar.SearchBarWithActionUISpecs;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.uistate.snackbar.SnackbarUIState;
import app.chalo.uistate.snackbar.SnackbarUIStateFactory;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper;
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import com.arkivanov.decompose.ComponentContext;
import defpackage.gf;
import defpackage.ir0;
import defpackage.py;
import defpackage.vo1;
import defpackage.wr0;
import defpackage.ym0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationIntent;", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationDataState;", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationViewState;", "Lapp/chalo/productbooking/pickroutelocation/PickRouteLocationSideEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PickRouteLocationComponent extends ChaloBaseStateMviComponent<PickRouteLocationIntent, PickRouteLocationDataState, PickRouteLocationViewState, PickRouteLocationSideEffect> {
    public final PickRouteLocationArgs k;
    public final FetchRouteDetailsLiveUseCase l;
    public final FetchRouteDataFromRemoteUseCase m;
    public final IsAgencyTagVisibleUseCase n;
    public final RecentRepositoryProvider o;
    public final RouteSearchResultStateManager p;
    public final CityProvider q;
    public final StringProvider r;
    public final ChaloNavigationManager s;
    public final AnalyticsContract t;
    public Job u;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8275a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[SearchScreenLayoutType.values().length];
            try {
                iArr[SearchScreenLayoutType.RECENT_AND_FAVORITE_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchScreenLayoutType.REMOTE_SEARCHED_ITEM_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8275a = iArr;
            int[] iArr2 = new int[PickRouteSnackBarErrorType.values().length];
            try {
                iArr2[PickRouteSnackBarErrorType.NO_INTERNET_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PickRouteSnackBarErrorType.ROUTES_API_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
            int[] iArr3 = new int[RouteNamingSchemeType.values().length];
            try {
                iArr3[RouteNamingSchemeType.VIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[RouteNamingSchemeType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            c = iArr3;
        }
    }

    public PickRouteLocationComponent(ComponentContext componentContext, PickRouteLocationArgs pickRouteLocationArgs, FetchRouteDetailsLiveUseCase fetchRouteDetailsLiveUseCase, FetchRouteDataFromRemoteUseCase fetchRouteDataFromRemoteUseCase, IsAgencyTagVisibleUseCase isAgencyTagVisibleUseCase, RecentRepositoryProvider recentRepositoryProvider, RouteSearchResultStateManager routeSearchResultStateManager, CityProvider cityProvider, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, AnalyticsContract analyticsContract) {
        super(componentContext);
        this.k = pickRouteLocationArgs;
        this.l = fetchRouteDetailsLiveUseCase;
        this.m = fetchRouteDataFromRemoteUseCase;
        this.n = isAgencyTagVisibleUseCase;
        this.o = recentRepositoryProvider;
        this.p = routeSearchResultStateManager;
        this.q = cityProvider;
        this.r = stringProvider;
        this.s = chaloNavigationManager;
        this.t = analyticsContract;
        P0(new PickRouteLocationIntent.InitialIntent(pickRouteLocationArgs.c));
    }

    public static final Object F0(PickRouteLocationComponent pickRouteLocationComponent, RouteAppModel routeAppModel, boolean z, Continuation continuation) {
        RecentRepositoryProvider recentRepositoryProvider = pickRouteLocationComponent.o;
        String strH = pickRouteLocationComponent.q.h();
        if (strH != null) {
            if (z) {
                Object objB = recentRepositoryProvider.getF8954a().b(routeAppModel.b, strH, (ContinuationImpl) continuation);
                if (objB == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objB;
                }
            } else {
                Object objF = recentRepositoryProvider.getF8954a().f(RouteAppModelKt.a(routeAppModel, strH, RecentsSpecialStatus.NONE), true, (ContinuationImpl) continuation);
                if (objF == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objF;
                }
            }
        }
        return Unit.f17538a;
    }

    public static TextUIState.ChaloTextUIState I0(String str, String str2, RouteNamingSchemeType routeNamingSchemeType, String str3) {
        String str4;
        String strN;
        int i = WhenMappings.c[routeNamingSchemeType.ordinal()];
        if (i == 1) {
            if (str3 == null) {
                strN = vo1.n(str, " - ", str2);
            } else {
                str4 = str3;
            }
            return new TextUIState.ChaloTextUIState(str4, UITextStyle.BodyMedium, ChaloColorToken.Black_87.f9768a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8176);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        strN = vo1.n(str, " - ", str2);
        str4 = strN;
        return new TextUIState.ChaloTextUIState(str4, UITextStyle.BodyMedium, ChaloColorToken.Black_87.f9768a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8176);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0086 A[PHI: r2 r14 r15
      0x0086: PHI (r2v9 app.chalo.productbooking.pickroutelocation.PickRouteLocationDataState) = 
      (r2v5 app.chalo.productbooking.pickroutelocation.PickRouteLocationDataState)
      (r2v12 app.chalo.productbooking.pickroutelocation.PickRouteLocationDataState)
     binds: [B:28:0x00cc, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r14v8 app.chalo.uistate.dialog.LoadingDialogUIState) = (r14v3 app.chalo.uistate.dialog.LoadingDialogUIState), (r14v14 app.chalo.uistate.dialog.LoadingDialogUIState) binds: [B:28:0x00cc, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0086: PHI (r15v8 java.lang.Object) = (r15v5 java.lang.Object), (r15v1 java.lang.Object) binds: [B:28:0x00cc, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0129  */
    /* JADX WARN: Code duplicated, block: B:51:0x0133  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final Object p0(PickRouteLocationDataState pickRouteLocationDataState, ContinuationImpl continuationImpl) {
        PickRouteLocationComponent$convertToUiState$1 pickRouteLocationComponent$convertToUiState$1;
        PickRouteLocationDataState pickRouteLocationDataState2;
        LoadingDialogUIState loadingDialogUIStateA;
        DialogUIStateFactory dialogUIStateFactory;
        PickRouteLocationDataState pickRouteLocationDataState3;
        LoadingDialogUIState loadingDialogUIState;
        SearchBarWithActionUIState searchBarWithActionUIState;
        int i;
        Object objK0;
        PickRouteLocationDataState pickRouteLocationDataState4;
        SearchBarWithActionUIState searchBarWithActionUIState2;
        Object objM0;
        PickRouteLocationDataState pickRouteLocationDataState5;
        SearchScreenLayoutUiType searchScreenLayoutUiType;
        Object objO0;
        SearchBarWithActionUIState searchBarWithActionUIState3;
        SearchScreenLayoutUiType searchScreenLayoutUiType2;
        SnackbarUIState snackbarUIState;
        SearchScreenLayoutUiType searchScreenLayoutUiType3;
        SnackbarUIState snackbarUIState2;
        LoadingDialogUIState loadingDialogUIState2;
        SearchBarWithActionUIState searchBarWithActionUIState4;
        RouteAppModel routeAppModel;
        SearchScreenLayoutUiType searchScreenLayoutUiType4;
        SnackbarUIState snackbarUIState3;
        LoadingDialogUIState loadingDialogUIState3;
        SearchBarWithActionUIState searchBarWithActionUIState5;
        if (continuationImpl instanceof PickRouteLocationComponent$convertToUiState$1) {
            pickRouteLocationComponent$convertToUiState$1 = (PickRouteLocationComponent$convertToUiState$1) continuationImpl;
            int i2 = pickRouteLocationComponent$convertToUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pickRouteLocationComponent$convertToUiState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                pickRouteLocationComponent$convertToUiState$1 = new PickRouteLocationComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            pickRouteLocationComponent$convertToUiState$1 = new PickRouteLocationComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objB = pickRouteLocationComponent$convertToUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        ConfirmationDialogUiState confirmationDialogUiState = null;
        switch (pickRouteLocationComponent$convertToUiState$1.label) {
            case 0:
                ResultKt.b(objB);
                if (pickRouteLocationDataState.f8279a) {
                    pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState;
                    DialogUIStateFactory dialogUIStateFactory2 = DialogUIStateFactory.f9989a;
                    pickRouteLocationComponent$convertToUiState$1.L$1 = dialogUIStateFactory2;
                    pickRouteLocationComponent$convertToUiState$1.label = 1;
                    objB = this.r.b(StringEnum.LOADING_THREE_DOTS, new Object[0], pickRouteLocationComponent$convertToUiState$1);
                    if (objB != obj) {
                        pickRouteLocationDataState2 = pickRouteLocationDataState;
                        dialogUIStateFactory = dialogUIStateFactory2;
                        dialogUIStateFactory.getClass();
                        loadingDialogUIStateA = DialogUIStateFactory.a((String) objB);
                        pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState2;
                        pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIStateA;
                        pickRouteLocationComponent$convertToUiState$1.label = 2;
                        objB = N0(pickRouteLocationComponent$convertToUiState$1);
                        if (objB != obj) {
                            pickRouteLocationDataState3 = pickRouteLocationDataState2;
                            loadingDialogUIState = loadingDialogUIStateA;
                            searchBarWithActionUIState = (SearchBarWithActionUIState) objB;
                            i = WhenMappings.f8275a[pickRouteLocationDataState3.e.ordinal()];
                            if (i != 1) {
                                pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState3;
                                pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                                pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState;
                                pickRouteLocationComponent$convertToUiState$1.label = 3;
                                objK0 = K0(pickRouteLocationComponent$convertToUiState$1);
                                if (objK0 != obj) {
                                    pickRouteLocationDataState4 = pickRouteLocationDataState3;
                                    searchBarWithActionUIState2 = searchBarWithActionUIState;
                                    objB = objK0;
                                    searchScreenLayoutUiType = (SearchScreenLayoutUiType) objB;
                                    pickRouteLocationDataState5 = pickRouteLocationDataState4;
                                    PickRouteSnackBarErrorType pickRouteSnackBarErrorType = pickRouteLocationDataState5.g;
                                    pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                                    pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                                    pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                                    pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                                    pickRouteLocationComponent$convertToUiState$1.label = 5;
                                    objO0 = O0(pickRouteSnackBarErrorType, pickRouteLocationComponent$convertToUiState$1);
                                    if (objO0 != obj) {
                                        searchBarWithActionUIState3 = searchBarWithActionUIState2;
                                        searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                                        objB = objO0;
                                        snackbarUIState = (SnackbarUIState) objB;
                                        if (pickRouteLocationDataState5.j) {
                                        }
                                        searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                                        snackbarUIState2 = snackbarUIState;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        searchBarWithActionUIState4 = searchBarWithActionUIState3;
                                        return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                                    }
                                }
                            } else if (i != 2) {
                                pickRouteLocationDataState5 = pickRouteLocationDataState3;
                                searchBarWithActionUIState2 = searchBarWithActionUIState;
                                searchScreenLayoutUiType = null;
                                PickRouteSnackBarErrorType pickRouteSnackBarErrorType2 = pickRouteLocationDataState5.g;
                                pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                                pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                                pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                                pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                                pickRouteLocationComponent$convertToUiState$1.label = 5;
                                objO0 = O0(pickRouteSnackBarErrorType2, pickRouteLocationComponent$convertToUiState$1);
                                if (objO0 != obj) {
                                    searchBarWithActionUIState3 = searchBarWithActionUIState2;
                                    searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                                    objB = objO0;
                                    snackbarUIState = (SnackbarUIState) objB;
                                    if (pickRouteLocationDataState5.j || (routeAppModel = pickRouteLocationDataState5.k) == null) {
                                        searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                                        snackbarUIState2 = snackbarUIState;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        searchBarWithActionUIState4 = searchBarWithActionUIState3;
                                    } else {
                                        String str = routeAppModel.c;
                                        pickRouteLocationComponent$convertToUiState$1.L$0 = loadingDialogUIState;
                                        pickRouteLocationComponent$convertToUiState$1.L$1 = searchBarWithActionUIState3;
                                        pickRouteLocationComponent$convertToUiState$1.L$2 = searchScreenLayoutUiType2;
                                        pickRouteLocationComponent$convertToUiState$1.L$3 = snackbarUIState;
                                        pickRouteLocationComponent$convertToUiState$1.label = 6;
                                        Object objJ0 = J0(str, pickRouteLocationComponent$convertToUiState$1);
                                        if (objJ0 != obj) {
                                            searchScreenLayoutUiType4 = searchScreenLayoutUiType2;
                                            snackbarUIState3 = snackbarUIState;
                                            objB = objJ0;
                                            loadingDialogUIState3 = loadingDialogUIState;
                                            searchBarWithActionUIState5 = searchBarWithActionUIState3;
                                            confirmationDialogUiState = (ConfirmationDialogUiState) objB;
                                            snackbarUIState2 = snackbarUIState3;
                                            loadingDialogUIState2 = loadingDialogUIState3;
                                            searchScreenLayoutUiType3 = searchScreenLayoutUiType4;
                                            searchBarWithActionUIState4 = searchBarWithActionUIState5;
                                        }
                                    }
                                    return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                                }
                            } else {
                                List list = pickRouteLocationDataState3.c;
                                pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState3;
                                pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                                pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState;
                                pickRouteLocationComponent$convertToUiState$1.label = 4;
                                objM0 = M0(list, pickRouteLocationComponent$convertToUiState$1);
                                if (objM0 != obj) {
                                    pickRouteLocationDataState4 = pickRouteLocationDataState3;
                                    searchBarWithActionUIState2 = searchBarWithActionUIState;
                                    objB = objM0;
                                    searchScreenLayoutUiType = (SearchScreenLayoutUiType) objB;
                                    pickRouteLocationDataState5 = pickRouteLocationDataState4;
                                    PickRouteSnackBarErrorType pickRouteSnackBarErrorType3 = pickRouteLocationDataState5.g;
                                    pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                                    pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                                    pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                                    pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                                    pickRouteLocationComponent$convertToUiState$1.label = 5;
                                    objO0 = O0(pickRouteSnackBarErrorType3, pickRouteLocationComponent$convertToUiState$1);
                                    if (objO0 != obj) {
                                        searchBarWithActionUIState3 = searchBarWithActionUIState2;
                                        searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                                        objB = objO0;
                                        snackbarUIState = (SnackbarUIState) objB;
                                        if (pickRouteLocationDataState5.j) {
                                        }
                                        searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                                        snackbarUIState2 = snackbarUIState;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        searchBarWithActionUIState4 = searchBarWithActionUIState3;
                                        return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    pickRouteLocationDataState2 = pickRouteLocationDataState;
                    loadingDialogUIStateA = null;
                    pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState2;
                    pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIStateA;
                    pickRouteLocationComponent$convertToUiState$1.label = 2;
                    objB = N0(pickRouteLocationComponent$convertToUiState$1);
                    if (objB != obj) {
                        pickRouteLocationDataState3 = pickRouteLocationDataState2;
                        loadingDialogUIState = loadingDialogUIStateA;
                        searchBarWithActionUIState = (SearchBarWithActionUIState) objB;
                        i = WhenMappings.f8275a[pickRouteLocationDataState3.e.ordinal()];
                        if (i != 1) {
                            pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState3;
                            pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                            pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState;
                            pickRouteLocationComponent$convertToUiState$1.label = 3;
                            objK0 = K0(pickRouteLocationComponent$convertToUiState$1);
                            if (objK0 != obj) {
                                pickRouteLocationDataState4 = pickRouteLocationDataState3;
                                searchBarWithActionUIState2 = searchBarWithActionUIState;
                                objB = objK0;
                                searchScreenLayoutUiType = (SearchScreenLayoutUiType) objB;
                                pickRouteLocationDataState5 = pickRouteLocationDataState4;
                                PickRouteSnackBarErrorType pickRouteSnackBarErrorType4 = pickRouteLocationDataState5.g;
                                pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                                pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                                pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                                pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                                pickRouteLocationComponent$convertToUiState$1.label = 5;
                                objO0 = O0(pickRouteSnackBarErrorType4, pickRouteLocationComponent$convertToUiState$1);
                                if (objO0 != obj) {
                                    searchBarWithActionUIState3 = searchBarWithActionUIState2;
                                    searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                                    objB = objO0;
                                    snackbarUIState = (SnackbarUIState) objB;
                                    if (pickRouteLocationDataState5.j) {
                                    }
                                    searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                                    snackbarUIState2 = snackbarUIState;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    searchBarWithActionUIState4 = searchBarWithActionUIState3;
                                    return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                                }
                            }
                        } else if (i != 2) {
                            pickRouteLocationDataState5 = pickRouteLocationDataState3;
                            searchBarWithActionUIState2 = searchBarWithActionUIState;
                            searchScreenLayoutUiType = null;
                            PickRouteSnackBarErrorType pickRouteSnackBarErrorType5 = pickRouteLocationDataState5.g;
                            pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                            pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                            pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                            pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                            pickRouteLocationComponent$convertToUiState$1.label = 5;
                            objO0 = O0(pickRouteSnackBarErrorType5, pickRouteLocationComponent$convertToUiState$1);
                            if (objO0 != obj) {
                                searchBarWithActionUIState3 = searchBarWithActionUIState2;
                                searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                                objB = objO0;
                                snackbarUIState = (SnackbarUIState) objB;
                                if (pickRouteLocationDataState5.j) {
                                }
                                searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                                snackbarUIState2 = snackbarUIState;
                                loadingDialogUIState2 = loadingDialogUIState;
                                searchBarWithActionUIState4 = searchBarWithActionUIState3;
                                return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                            }
                        } else {
                            List list2 = pickRouteLocationDataState3.c;
                            pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState3;
                            pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                            pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState;
                            pickRouteLocationComponent$convertToUiState$1.label = 4;
                            objM0 = M0(list2, pickRouteLocationComponent$convertToUiState$1);
                            if (objM0 != obj) {
                                pickRouteLocationDataState4 = pickRouteLocationDataState3;
                                searchBarWithActionUIState2 = searchBarWithActionUIState;
                                objB = objM0;
                                searchScreenLayoutUiType = (SearchScreenLayoutUiType) objB;
                                pickRouteLocationDataState5 = pickRouteLocationDataState4;
                                PickRouteSnackBarErrorType pickRouteSnackBarErrorType6 = pickRouteLocationDataState5.g;
                                pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                                pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                                pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                                pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                                pickRouteLocationComponent$convertToUiState$1.label = 5;
                                objO0 = O0(pickRouteSnackBarErrorType6, pickRouteLocationComponent$convertToUiState$1);
                                if (objO0 != obj) {
                                    searchBarWithActionUIState3 = searchBarWithActionUIState2;
                                    searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                                    objB = objO0;
                                    snackbarUIState = (SnackbarUIState) objB;
                                    if (pickRouteLocationDataState5.j) {
                                    }
                                    searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                                    snackbarUIState2 = snackbarUIState;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    searchBarWithActionUIState4 = searchBarWithActionUIState3;
                                    return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                dialogUIStateFactory = (DialogUIStateFactory) pickRouteLocationComponent$convertToUiState$1.L$1;
                pickRouteLocationDataState2 = (PickRouteLocationDataState) pickRouteLocationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB);
                dialogUIStateFactory.getClass();
                loadingDialogUIStateA = DialogUIStateFactory.a((String) objB);
                pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState2;
                pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIStateA;
                pickRouteLocationComponent$convertToUiState$1.label = 2;
                objB = N0(pickRouteLocationComponent$convertToUiState$1);
                if (objB != obj) {
                    pickRouteLocationDataState3 = pickRouteLocationDataState2;
                    loadingDialogUIState = loadingDialogUIStateA;
                    searchBarWithActionUIState = (SearchBarWithActionUIState) objB;
                    i = WhenMappings.f8275a[pickRouteLocationDataState3.e.ordinal()];
                    if (i != 1) {
                        pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState3;
                        pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                        pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState;
                        pickRouteLocationComponent$convertToUiState$1.label = 3;
                        objK0 = K0(pickRouteLocationComponent$convertToUiState$1);
                        if (objK0 != obj) {
                            pickRouteLocationDataState4 = pickRouteLocationDataState3;
                            searchBarWithActionUIState2 = searchBarWithActionUIState;
                            objB = objK0;
                            searchScreenLayoutUiType = (SearchScreenLayoutUiType) objB;
                            pickRouteLocationDataState5 = pickRouteLocationDataState4;
                            PickRouteSnackBarErrorType pickRouteSnackBarErrorType7 = pickRouteLocationDataState5.g;
                            pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                            pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                            pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                            pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                            pickRouteLocationComponent$convertToUiState$1.label = 5;
                            objO0 = O0(pickRouteSnackBarErrorType7, pickRouteLocationComponent$convertToUiState$1);
                            if (objO0 != obj) {
                                searchBarWithActionUIState3 = searchBarWithActionUIState2;
                                searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                                objB = objO0;
                                snackbarUIState = (SnackbarUIState) objB;
                                if (pickRouteLocationDataState5.j) {
                                    break;
                                }
                                searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                                snackbarUIState2 = snackbarUIState;
                                loadingDialogUIState2 = loadingDialogUIState;
                                searchBarWithActionUIState4 = searchBarWithActionUIState3;
                                return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                            }
                        }
                    } else if (i != 2) {
                        pickRouteLocationDataState5 = pickRouteLocationDataState3;
                        searchBarWithActionUIState2 = searchBarWithActionUIState;
                        searchScreenLayoutUiType = null;
                        PickRouteSnackBarErrorType pickRouteSnackBarErrorType8 = pickRouteLocationDataState5.g;
                        pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                        pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                        pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                        pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                        pickRouteLocationComponent$convertToUiState$1.label = 5;
                        objO0 = O0(pickRouteSnackBarErrorType8, pickRouteLocationComponent$convertToUiState$1);
                        if (objO0 != obj) {
                            searchBarWithActionUIState3 = searchBarWithActionUIState2;
                            searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                            objB = objO0;
                            snackbarUIState = (SnackbarUIState) objB;
                            if (pickRouteLocationDataState5.j) {
                                break;
                            }
                            searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                            snackbarUIState2 = snackbarUIState;
                            loadingDialogUIState2 = loadingDialogUIState;
                            searchBarWithActionUIState4 = searchBarWithActionUIState3;
                            return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                        }
                    } else {
                        List list3 = pickRouteLocationDataState3.c;
                        pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState3;
                        pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                        pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState;
                        pickRouteLocationComponent$convertToUiState$1.label = 4;
                        objM0 = M0(list3, pickRouteLocationComponent$convertToUiState$1);
                        if (objM0 != obj) {
                            pickRouteLocationDataState4 = pickRouteLocationDataState3;
                            searchBarWithActionUIState2 = searchBarWithActionUIState;
                            objB = objM0;
                            searchScreenLayoutUiType = (SearchScreenLayoutUiType) objB;
                            pickRouteLocationDataState5 = pickRouteLocationDataState4;
                            PickRouteSnackBarErrorType pickRouteSnackBarErrorType9 = pickRouteLocationDataState5.g;
                            pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                            pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                            pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                            pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                            pickRouteLocationComponent$convertToUiState$1.label = 5;
                            objO0 = O0(pickRouteSnackBarErrorType9, pickRouteLocationComponent$convertToUiState$1);
                            if (objO0 != obj) {
                                searchBarWithActionUIState3 = searchBarWithActionUIState2;
                                searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                                objB = objO0;
                                snackbarUIState = (SnackbarUIState) objB;
                                if (pickRouteLocationDataState5.j) {
                                    break;
                                }
                                searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                                snackbarUIState2 = snackbarUIState;
                                loadingDialogUIState2 = loadingDialogUIState;
                                searchBarWithActionUIState4 = searchBarWithActionUIState3;
                                return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                            }
                        }
                    }
                }
                return obj;
            case 2:
                loadingDialogUIStateA = (LoadingDialogUIState) pickRouteLocationComponent$convertToUiState$1.L$1;
                pickRouteLocationDataState2 = (PickRouteLocationDataState) pickRouteLocationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB);
                pickRouteLocationDataState3 = pickRouteLocationDataState2;
                loadingDialogUIState = loadingDialogUIStateA;
                searchBarWithActionUIState = (SearchBarWithActionUIState) objB;
                i = WhenMappings.f8275a[pickRouteLocationDataState3.e.ordinal()];
                if (i != 1) {
                    pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState3;
                    pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                    pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState;
                    pickRouteLocationComponent$convertToUiState$1.label = 3;
                    objK0 = K0(pickRouteLocationComponent$convertToUiState$1);
                    if (objK0 != obj) {
                        pickRouteLocationDataState4 = pickRouteLocationDataState3;
                        searchBarWithActionUIState2 = searchBarWithActionUIState;
                        objB = objK0;
                        searchScreenLayoutUiType = (SearchScreenLayoutUiType) objB;
                        pickRouteLocationDataState5 = pickRouteLocationDataState4;
                        PickRouteSnackBarErrorType pickRouteSnackBarErrorType10 = pickRouteLocationDataState5.g;
                        pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                        pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                        pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                        pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                        pickRouteLocationComponent$convertToUiState$1.label = 5;
                        objO0 = O0(pickRouteSnackBarErrorType10, pickRouteLocationComponent$convertToUiState$1);
                        if (objO0 != obj) {
                            searchBarWithActionUIState3 = searchBarWithActionUIState2;
                            searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                            objB = objO0;
                            snackbarUIState = (SnackbarUIState) objB;
                            if (pickRouteLocationDataState5.j) {
                                break;
                            }
                            searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                            snackbarUIState2 = snackbarUIState;
                            loadingDialogUIState2 = loadingDialogUIState;
                            searchBarWithActionUIState4 = searchBarWithActionUIState3;
                            return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                        }
                    }
                } else if (i != 2) {
                    pickRouteLocationDataState5 = pickRouteLocationDataState3;
                    searchBarWithActionUIState2 = searchBarWithActionUIState;
                    searchScreenLayoutUiType = null;
                    PickRouteSnackBarErrorType pickRouteSnackBarErrorType11 = pickRouteLocationDataState5.g;
                    pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                    pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                    pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                    pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                    pickRouteLocationComponent$convertToUiState$1.label = 5;
                    objO0 = O0(pickRouteSnackBarErrorType11, pickRouteLocationComponent$convertToUiState$1);
                    if (objO0 != obj) {
                        searchBarWithActionUIState3 = searchBarWithActionUIState2;
                        searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                        objB = objO0;
                        snackbarUIState = (SnackbarUIState) objB;
                        if (pickRouteLocationDataState5.j) {
                            break;
                        }
                        searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                        snackbarUIState2 = snackbarUIState;
                        loadingDialogUIState2 = loadingDialogUIState;
                        searchBarWithActionUIState4 = searchBarWithActionUIState3;
                        return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                    }
                } else {
                    List list4 = pickRouteLocationDataState3.c;
                    pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState3;
                    pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                    pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState;
                    pickRouteLocationComponent$convertToUiState$1.label = 4;
                    objM0 = M0(list4, pickRouteLocationComponent$convertToUiState$1);
                    if (objM0 != obj) {
                        pickRouteLocationDataState4 = pickRouteLocationDataState3;
                        searchBarWithActionUIState2 = searchBarWithActionUIState;
                        objB = objM0;
                        searchScreenLayoutUiType = (SearchScreenLayoutUiType) objB;
                        pickRouteLocationDataState5 = pickRouteLocationDataState4;
                        PickRouteSnackBarErrorType pickRouteSnackBarErrorType12 = pickRouteLocationDataState5.g;
                        pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                        pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                        pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                        pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                        pickRouteLocationComponent$convertToUiState$1.label = 5;
                        objO0 = O0(pickRouteSnackBarErrorType12, pickRouteLocationComponent$convertToUiState$1);
                        if (objO0 != obj) {
                            searchBarWithActionUIState3 = searchBarWithActionUIState2;
                            searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                            objB = objO0;
                            snackbarUIState = (SnackbarUIState) objB;
                            if (pickRouteLocationDataState5.j) {
                                break;
                            }
                            searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                            snackbarUIState2 = snackbarUIState;
                            loadingDialogUIState2 = loadingDialogUIState;
                            searchBarWithActionUIState4 = searchBarWithActionUIState3;
                            return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                        }
                    }
                }
                return obj;
            case 3:
                searchBarWithActionUIState2 = (SearchBarWithActionUIState) pickRouteLocationComponent$convertToUiState$1.L$2;
                loadingDialogUIState = (LoadingDialogUIState) pickRouteLocationComponent$convertToUiState$1.L$1;
                pickRouteLocationDataState4 = (PickRouteLocationDataState) pickRouteLocationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB);
                searchScreenLayoutUiType = (SearchScreenLayoutUiType) objB;
                pickRouteLocationDataState5 = pickRouteLocationDataState4;
                PickRouteSnackBarErrorType pickRouteSnackBarErrorType13 = pickRouteLocationDataState5.g;
                pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                pickRouteLocationComponent$convertToUiState$1.label = 5;
                objO0 = O0(pickRouteSnackBarErrorType13, pickRouteLocationComponent$convertToUiState$1);
                if (objO0 != obj) {
                    searchBarWithActionUIState3 = searchBarWithActionUIState2;
                    searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                    objB = objO0;
                    snackbarUIState = (SnackbarUIState) objB;
                    if (pickRouteLocationDataState5.j) {
                        break;
                    }
                    searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                    snackbarUIState2 = snackbarUIState;
                    loadingDialogUIState2 = loadingDialogUIState;
                    searchBarWithActionUIState4 = searchBarWithActionUIState3;
                    return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                }
                return obj;
            case 4:
                searchBarWithActionUIState2 = (SearchBarWithActionUIState) pickRouteLocationComponent$convertToUiState$1.L$2;
                loadingDialogUIState = (LoadingDialogUIState) pickRouteLocationComponent$convertToUiState$1.L$1;
                pickRouteLocationDataState4 = (PickRouteLocationDataState) pickRouteLocationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB);
                searchScreenLayoutUiType = (SearchScreenLayoutUiType) objB;
                pickRouteLocationDataState5 = pickRouteLocationDataState4;
                PickRouteSnackBarErrorType pickRouteSnackBarErrorType14 = pickRouteLocationDataState5.g;
                pickRouteLocationComponent$convertToUiState$1.L$0 = pickRouteLocationDataState5;
                pickRouteLocationComponent$convertToUiState$1.L$1 = loadingDialogUIState;
                pickRouteLocationComponent$convertToUiState$1.L$2 = searchBarWithActionUIState2;
                pickRouteLocationComponent$convertToUiState$1.L$3 = searchScreenLayoutUiType;
                pickRouteLocationComponent$convertToUiState$1.label = 5;
                objO0 = O0(pickRouteSnackBarErrorType14, pickRouteLocationComponent$convertToUiState$1);
                if (objO0 != obj) {
                    searchBarWithActionUIState3 = searchBarWithActionUIState2;
                    searchScreenLayoutUiType2 = searchScreenLayoutUiType;
                    objB = objO0;
                    snackbarUIState = (SnackbarUIState) objB;
                    if (pickRouteLocationDataState5.j) {
                        break;
                    }
                    searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                    snackbarUIState2 = snackbarUIState;
                    loadingDialogUIState2 = loadingDialogUIState;
                    searchBarWithActionUIState4 = searchBarWithActionUIState3;
                    return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
                }
                return obj;
            case 5:
                searchScreenLayoutUiType2 = (SearchScreenLayoutUiType) pickRouteLocationComponent$convertToUiState$1.L$3;
                SearchBarWithActionUIState searchBarWithActionUIState6 = (SearchBarWithActionUIState) pickRouteLocationComponent$convertToUiState$1.L$2;
                LoadingDialogUIState loadingDialogUIState4 = (LoadingDialogUIState) pickRouteLocationComponent$convertToUiState$1.L$1;
                pickRouteLocationDataState5 = (PickRouteLocationDataState) pickRouteLocationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB);
                searchBarWithActionUIState3 = searchBarWithActionUIState6;
                loadingDialogUIState = loadingDialogUIState4;
                snackbarUIState = (SnackbarUIState) objB;
                if (pickRouteLocationDataState5.j) {
                    break;
                }
                searchScreenLayoutUiType3 = searchScreenLayoutUiType2;
                snackbarUIState2 = snackbarUIState;
                loadingDialogUIState2 = loadingDialogUIState;
                searchBarWithActionUIState4 = searchBarWithActionUIState3;
                return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
            case 6:
                snackbarUIState3 = (SnackbarUIState) pickRouteLocationComponent$convertToUiState$1.L$3;
                searchScreenLayoutUiType4 = (SearchScreenLayoutUiType) pickRouteLocationComponent$convertToUiState$1.L$2;
                searchBarWithActionUIState5 = (SearchBarWithActionUIState) pickRouteLocationComponent$convertToUiState$1.L$1;
                loadingDialogUIState3 = (LoadingDialogUIState) pickRouteLocationComponent$convertToUiState$1.L$0;
                ResultKt.b(objB);
                confirmationDialogUiState = (ConfirmationDialogUiState) objB;
                snackbarUIState2 = snackbarUIState3;
                loadingDialogUIState2 = loadingDialogUIState3;
                searchScreenLayoutUiType3 = searchScreenLayoutUiType4;
                searchBarWithActionUIState4 = searchBarWithActionUIState5;
                return new PickRouteLocationViewState(loadingDialogUIState2, searchBarWithActionUIState4, searchScreenLayoutUiType3, snackbarUIState2, confirmationDialogUiState);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object H0(String str, String str2, RouteNamingSchemeType routeNamingSchemeType, ContinuationImpl continuationImpl) {
        int i = WhenMappings.c[routeNamingSchemeType.ordinal()];
        if (i == 1) {
            return this.r.b(StringEnum.TO_, new Object[]{str2}, continuationImpl);
        }
        if (i == 2) {
            return str;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J0(String str, ContinuationImpl continuationImpl) {
        PickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1 pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1;
        String str2;
        DialogUIStateFactory dialogUIStateFactory;
        String str3;
        String str4;
        Object objB;
        String str5;
        String str6;
        DialogUIStateFactory dialogUIStateFactory2;
        if (continuationImpl instanceof PickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1) {
            pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1 = (PickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1) continuationImpl;
            int i = pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.label = i - Integer.MIN_VALUE;
            } else {
                pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1 = new PickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1(this, continuationImpl);
            }
        } else {
            pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1 = new PickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1(this, continuationImpl);
        }
        Object objB2 = pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.label;
        int i3 = 0;
        StringProvider stringProvider = this.r;
        if (i2 == 0) {
            ResultKt.b(objB2);
            pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$0 = str;
            DialogUIStateFactory dialogUIStateFactory3 = DialogUIStateFactory.f9989a;
            pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$1 = dialogUIStateFactory3;
            pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.label = 1;
            objB2 = stringProvider.b(StringEnum.TITLE_DIALOG_MTICKET_DISABLED_ROUTE, new Object[0], pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1);
            if (objB2 != coroutineSingletons) {
                str2 = str;
                dialogUIStateFactory = dialogUIStateFactory3;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            dialogUIStateFactory = (DialogUIStateFactory) pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$1;
            str2 = (String) pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$0;
            ResultKt.b(objB2);
        } else {
            if (i2 == 2) {
                String str7 = (String) pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$1;
                DialogUIStateFactory dialogUIStateFactory4 = (DialogUIStateFactory) pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$0;
                ResultKt.b(objB2);
                str3 = str7;
                dialogUIStateFactory = dialogUIStateFactory4;
                str4 = (String) objB2;
                pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$0 = dialogUIStateFactory;
                pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$1 = str3;
                pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$2 = str4;
                pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.label = 3;
                objB = stringProvider.b(StringEnum.OK_CAPS, new Object[0], pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1);
                if (objB != coroutineSingletons) {
                    str5 = str4;
                    objB2 = objB;
                    str6 = str3;
                    dialogUIStateFactory2 = dialogUIStateFactory;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str8 = (String) pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$2;
            String str9 = (String) pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$1;
            dialogUIStateFactory2 = (DialogUIStateFactory) pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$0;
            ResultKt.b(objB2);
            str5 = str8;
            str6 = str9;
        }
        wr0 wr0Var = new wr0(this, i3);
        dialogUIStateFactory2.getClass();
        return DialogUIStateFactory.b(str6, str5, (String) objB2, null, wr0Var, null);
        String str10 = (String) objB2;
        pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$0 = dialogUIStateFactory;
        pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$1 = str10;
        pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.MSG_DIALOG_MTICKET_DISABLED_ROUTE, new Object[]{str2}, pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1);
        if (objB3 != coroutineSingletons) {
            str3 = str10;
            objB2 = objB3;
            str4 = (String) objB2;
            pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$0 = dialogUIStateFactory;
            pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$1 = str3;
            pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.L$2 = str4;
            pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1.label = 3;
            objB = stringProvider.b(StringEnum.OK_CAPS, new Object[0], pickRouteLocationComponent$getMobileTicketingNotAvailableDialog$1);
            if (objB != coroutineSingletons) {
                str5 = str4;
                objB2 = objB;
                str6 = str3;
                dialogUIStateFactory2 = dialogUIStateFactory;
                wr0 wr0Var2 = new wr0(this, i3);
                dialogUIStateFactory2.getClass();
                return DialogUIStateFactory.b(str6, str5, (String) objB2, null, wr0Var2, null);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0112  */
    /* JADX WARN: Code duplicated, block: B:36:0x013a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0152  */
    /* JADX WARN: Code duplicated, block: B:43:0x0163  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0161 -> B:51:0x019e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0167 -> B:51:0x019e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0184 -> B:48:0x0187). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object K0(kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent.K0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L0(RecentRouteAppModel recentRouteAppModel, ContinuationImpl continuationImpl) {
        PickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1 pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1;
        List listL;
        List list;
        RecentRouteAppModel recentRouteAppModel2;
        List list2;
        List list3;
        List list4;
        if (continuationImpl instanceof PickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1) {
            pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1 = (PickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1) continuationImpl;
            int i = pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1.label = i - Integer.MIN_VALUE;
            } else {
                pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1 = new PickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1(this, continuationImpl);
            }
        } else {
            pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1 = new PickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1(this, continuationImpl);
        }
        Object obj = pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1.label;
        if (i2 == 0) {
            listL = py.l(obj);
            if (recentRouteAppModel.k) {
                pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1.L$0 = recentRouteAppModel;
                pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1.L$1 = listL;
                pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1.L$2 = listL;
                pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1.label = 1;
                Object objB = this.r.b(StringEnum.AC, new Object[0], pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list = listL;
                obj = objB;
                recentRouteAppModel2 = recentRouteAppModel;
                list2 = list;
            }
            list3 = recentRouteAppModel.l;
            if (list3 != null) {
                list4 = list3;
            } else {
                list4 = EmptyList.f17557a;
            }
            listL.addAll(list4);
            return listL;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list2 = (List) pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1.L$2;
        list = (List) pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1.L$1;
        recentRouteAppModel2 = (RecentRouteAppModel) pickRouteLocationComponent$getRecentRoutesSpecialFeaturesList$1.L$0;
        ResultKt.b(obj);
        list2.add(obj);
        recentRouteAppModel = recentRouteAppModel2;
        listL = list;
        list3 = recentRouteAppModel.l;
        if (list3 != null) {
            list4 = list3;
        } else {
            list4 = EmptyList.f17557a;
        }
        listL.addAll(list4);
        return listL;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0121  */
    /* JADX WARN: Code duplicated, block: B:42:0x0148  */
    /* JADX WARN: Code duplicated, block: B:45:0x015d  */
    /* JADX WARN: Code duplicated, block: B:51:0x018f A[PHI: r4 r7 r8 r9 r12 r13
      0x018f: PHI (r4v13 java.util.Collection) = (r4v10 java.util.Collection), (r4v15 java.util.Collection), (r4v15 java.util.Collection) binds: [B:44:0x015b, B:49:0x017e, B:50:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r7v5 java.util.List) = (r7v2 java.util.List), (r7v12 java.util.List), (r7v12 java.util.List) binds: [B:44:0x015b, B:49:0x017e, B:50:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r8v6 java.lang.String) = (r8v3 java.lang.String), (r8v9 java.lang.String), (r8v9 java.lang.String) binds: [B:44:0x015b, B:49:0x017e, B:50:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r9v4 app.chalo.citydata.data.model.app.RouteAppModel) = 
      (r9v2 app.chalo.citydata.data.model.app.RouteAppModel)
      (r9v5 app.chalo.citydata.data.model.app.RouteAppModel)
      (r9v5 app.chalo.citydata.data.model.app.RouteAppModel)
     binds: [B:44:0x015b, B:49:0x017e, B:50:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r12v4 java.util.Iterator) = (r12v2 java.util.Iterator), (r12v6 java.util.Iterator), (r12v6 java.util.Iterator) binds: [B:44:0x015b, B:49:0x017e, B:50:0x0180] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r13v4 java.util.Collection) = (r13v2 java.util.Collection), (r13v5 java.util.Collection), (r13v5 java.util.Collection) binds: [B:44:0x015b, B:49:0x017e, B:50:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x015b -> B:51:0x018f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0175 -> B:48:0x0178). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object M0(java.util.List r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent.M0(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object N0(ContinuationImpl continuationImpl) {
        PickRouteLocationComponent$getSearchBarUIState$1 pickRouteLocationComponent$getSearchBarUIState$1;
        SearchBarWithActionUISpecs searchBarWithActionUISpecs;
        String str;
        IconButtonUIState iconButtonUIState;
        if (continuationImpl instanceof PickRouteLocationComponent$getSearchBarUIState$1) {
            pickRouteLocationComponent$getSearchBarUIState$1 = (PickRouteLocationComponent$getSearchBarUIState$1) continuationImpl;
            int i = pickRouteLocationComponent$getSearchBarUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pickRouteLocationComponent$getSearchBarUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                pickRouteLocationComponent$getSearchBarUIState$1 = new PickRouteLocationComponent$getSearchBarUIState$1(this, continuationImpl);
            }
        } else {
            pickRouteLocationComponent$getSearchBarUIState$1 = new PickRouteLocationComponent$getSearchBarUIState$1(this, continuationImpl);
        }
        Object obj = pickRouteLocationComponent$getSearchBarUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pickRouteLocationComponent$getSearchBarUIState$1.label;
        StateFlow stateFlow = this.f;
        if (i2 == 0) {
            ResultKt.b(obj);
            SearchBarWithActionUISpecs searchBarWithActionUISpecs2 = new SearchBarWithActionUISpecs(new CardUISpec(UIShape.f1926a, 0.0f, 0.0f, 6), null, TypedValues.PositionType.TYPE_POSITION_TYPE);
            String str2 = ((PickRouteLocationDataState) stateFlow.getValue()).f;
            pickRouteLocationComponent$getSearchBarUIState$1.L$0 = str2;
            pickRouteLocationComponent$getSearchBarUIState$1.L$1 = searchBarWithActionUISpecs2;
            pickRouteLocationComponent$getSearchBarUIState$1.label = 1;
            Object objB = this.r.b(StringEnum.ENTER_ROUTE_NUMBER, new Object[0], pickRouteLocationComponent$getSearchBarUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            searchBarWithActionUISpecs = searchBarWithActionUISpecs2;
            obj = objB;
            str = str2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            searchBarWithActionUISpecs = (SearchBarWithActionUISpecs) pickRouteLocationComponent$getSearchBarUIState$1.L$1;
            String str3 = (String) pickRouteLocationComponent$getSearchBarUIState$1.L$0;
            ResultKt.b(obj);
            str = str3;
        }
        BaseTextFieldUIState.TextFieldUIState textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str, TextFieldEventHandlerHelper.b(2, new ym0(this, 21), null), null, null, new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyLarge, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), null, false, null, 0, null, null, 0.0f, 131004);
        IconButtonUIState iconButtonUIState2 = new IconButtonUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), UiEventHandler.Companion.a(new wr0(this, 1)), (ChaloColorToken) null, 0.0f, 28);
        if (((PickRouteLocationDataState) stateFlow.getValue()).f.length() > 0) {
            iconButtonUIState = new IconButtonUIState(new ImageUIState(IconType.CLOSE_LOCATION_SEARCH, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), UiEventHandler.Companion.a(new wr0(this, 2)), (ChaloColorToken) null, ChaloThemeHelper.a().f1916a, 12);
        } else {
            iconButtonUIState = null;
        }
        return new SearchBarWithActionUIState(searchBarWithActionUISpecs, textFieldUIState, iconButtonUIState2, iconButtonUIState, ((PickRouteLocationDataState) stateFlow.getValue()).b ? new CircularProgressIndicatorUIState(ChaloThemeHelper.a().c, 4) : null, 32);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O0(PickRouteSnackBarErrorType pickRouteSnackBarErrorType, ContinuationImpl continuationImpl) {
        PickRouteLocationComponent$getSnackbarUIState$1 pickRouteLocationComponent$getSnackbarUIState$1;
        SnackbarUIStateFactory snackbarUIStateFactory;
        SnackbarUIStateFactory snackbarUIStateFactory2;
        String str;
        Object objB;
        SnackbarUIStateFactory snackbarUIStateFactory3;
        String str2;
        String str3;
        Object objB2;
        SnackbarUIStateFactory snackbarUIStateFactory4;
        String str4;
        if (continuationImpl instanceof PickRouteLocationComponent$getSnackbarUIState$1) {
            pickRouteLocationComponent$getSnackbarUIState$1 = (PickRouteLocationComponent$getSnackbarUIState$1) continuationImpl;
            int i = pickRouteLocationComponent$getSnackbarUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pickRouteLocationComponent$getSnackbarUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                pickRouteLocationComponent$getSnackbarUIState$1 = new PickRouteLocationComponent$getSnackbarUIState$1(this, continuationImpl);
            }
        } else {
            pickRouteLocationComponent$getSnackbarUIState$1 = new PickRouteLocationComponent$getSnackbarUIState$1(this, continuationImpl);
        }
        Object obj = pickRouteLocationComponent$getSnackbarUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pickRouteLocationComponent$getSnackbarUIState$1.label;
        StringProvider stringProvider = this.r;
        if (i2 != 0) {
            if (i2 == 1) {
                snackbarUIStateFactory = (SnackbarUIStateFactory) pickRouteLocationComponent$getSnackbarUIState$1.L$0;
                ResultKt.b(obj);
                str = (String) obj;
                pickRouteLocationComponent$getSnackbarUIState$1.L$0 = snackbarUIStateFactory;
                pickRouteLocationComponent$getSnackbarUIState$1.L$1 = str;
                pickRouteLocationComponent$getSnackbarUIState$1.label = 2;
                objB = stringProvider.b(StringEnum.DISMISS, new Object[0], pickRouteLocationComponent$getSnackbarUIState$1);
                if (objB != coroutineSingletons) {
                    snackbarUIStateFactory3 = snackbarUIStateFactory;
                    str2 = str;
                    obj = objB;
                }
                return coroutineSingletons;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    snackbarUIStateFactory2 = (SnackbarUIStateFactory) pickRouteLocationComponent$getSnackbarUIState$1.L$0;
                    ResultKt.b(obj);
                    str3 = (String) obj;
                    pickRouteLocationComponent$getSnackbarUIState$1.L$0 = snackbarUIStateFactory2;
                    pickRouteLocationComponent$getSnackbarUIState$1.L$1 = str3;
                    pickRouteLocationComponent$getSnackbarUIState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], pickRouteLocationComponent$getSnackbarUIState$1);
                    if (objB2 != coroutineSingletons) {
                        snackbarUIStateFactory4 = snackbarUIStateFactory2;
                        str4 = str3;
                        obj = objB2;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (String) pickRouteLocationComponent$getSnackbarUIState$1.L$1;
                snackbarUIStateFactory4 = (SnackbarUIStateFactory) pickRouteLocationComponent$getSnackbarUIState$1.L$0;
                ResultKt.b(obj);
                Function0 function0 = new Function0() { // from class: app.chalo.productbooking.pickroutelocation.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        PickRouteLocationComponent pickRouteLocationComponent = this.f8293a;
                        String str5 = ((PickRouteLocationDataState) pickRouteLocationComponent.f.getValue()).h;
                        if (str5 != null) {
                            pickRouteLocationComponent.E0(new ir0(16));
                            BuildersKt.d(pickRouteLocationComponent.j, null, null, new PickRouteLocationComponent$getSelectedRouteDetailsAndNavigateBack$2(pickRouteLocationComponent, str5, null), 3);
                        }
                        return Unit.f17538a;
                    }
                };
                snackbarUIStateFactory4.getClass();
                return SnackbarUIStateFactory.a(str4, (String) obj, function0);
            }
            str2 = (String) pickRouteLocationComponent$getSnackbarUIState$1.L$1;
            snackbarUIStateFactory3 = (SnackbarUIStateFactory) pickRouteLocationComponent$getSnackbarUIState$1.L$0;
            ResultKt.b(obj);
            wr0 wr0Var = new wr0(this, 3);
            snackbarUIStateFactory3.getClass();
            return SnackbarUIStateFactory.a(str2, (String) obj, wr0Var);
        }
        ResultKt.b(obj);
        if (pickRouteSnackBarErrorType == null) {
            return null;
        }
        int i3 = WhenMappings.b[pickRouteSnackBarErrorType.ordinal()];
        SnackbarUIStateFactory snackbarUIStateFactory5 = SnackbarUIStateFactory.f10071a;
        if (i3 == 1) {
            pickRouteLocationComponent$getSnackbarUIState$1.L$0 = snackbarUIStateFactory5;
            pickRouteLocationComponent$getSnackbarUIState$1.label = 1;
            Object objB3 = stringProvider.b(StringEnum.NO_INTERNET, new Object[0], pickRouteLocationComponent$getSnackbarUIState$1);
            if (objB3 != coroutineSingletons) {
                obj = objB3;
                snackbarUIStateFactory = snackbarUIStateFactory5;
                str = (String) obj;
                pickRouteLocationComponent$getSnackbarUIState$1.L$0 = snackbarUIStateFactory;
                pickRouteLocationComponent$getSnackbarUIState$1.L$1 = str;
                pickRouteLocationComponent$getSnackbarUIState$1.label = 2;
                objB = stringProvider.b(StringEnum.DISMISS, new Object[0], pickRouteLocationComponent$getSnackbarUIState$1);
                if (objB != coroutineSingletons) {
                    snackbarUIStateFactory3 = snackbarUIStateFactory;
                    str2 = str;
                    obj = objB;
                    wr0 wr0Var2 = new wr0(this, 3);
                    snackbarUIStateFactory3.getClass();
                    return SnackbarUIStateFactory.a(str2, (String) obj, wr0Var2);
                }
            }
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pickRouteLocationComponent$getSnackbarUIState$1.L$0 = snackbarUIStateFactory5;
            pickRouteLocationComponent$getSnackbarUIState$1.label = 3;
            Object objB4 = stringProvider.b(StringEnum.FETCHING_ROUTE_DETAILS_FAILED, new Object[0], pickRouteLocationComponent$getSnackbarUIState$1);
            if (objB4 != coroutineSingletons) {
                obj = objB4;
                snackbarUIStateFactory2 = snackbarUIStateFactory5;
                str3 = (String) obj;
                pickRouteLocationComponent$getSnackbarUIState$1.L$0 = snackbarUIStateFactory2;
                pickRouteLocationComponent$getSnackbarUIState$1.L$1 = str3;
                pickRouteLocationComponent$getSnackbarUIState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], pickRouteLocationComponent$getSnackbarUIState$1);
                if (objB2 != coroutineSingletons) {
                    snackbarUIStateFactory4 = snackbarUIStateFactory2;
                    str4 = str3;
                    obj = objB2;
                    Function0 function1 = new Function0() { // from class: app.chalo.productbooking.pickroutelocation.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            PickRouteLocationComponent pickRouteLocationComponent = this.f8293a;
                            String str5 = ((PickRouteLocationDataState) pickRouteLocationComponent.f.getValue()).h;
                            if (str5 != null) {
                                pickRouteLocationComponent.E0(new ir0(16));
                                BuildersKt.d(pickRouteLocationComponent.j, null, null, new PickRouteLocationComponent$getSelectedRouteDetailsAndNavigateBack$2(pickRouteLocationComponent, str5, null), 3);
                            }
                            return Unit.f17538a;
                        }
                    };
                    snackbarUIStateFactory4.getClass();
                    return SnackbarUIStateFactory.a(str4, (String) obj, function1);
                }
            }
        }
        return coroutineSingletons;
    }

    public final void P0(PickRouteLocationIntent pickRouteLocationIntent) {
        C0(pickRouteLocationIntent);
        boolean z = pickRouteLocationIntent instanceof PickRouteLocationIntent.RouteSearchedIntent;
        ContextScope contextScope = this.j;
        if (z) {
            PickRouteLocationIntent.RouteSearchedIntent routeSearchedIntent = (PickRouteLocationIntent.RouteSearchedIntent) pickRouteLocationIntent;
            String str = routeSearchedIntent.f8283a;
            if (Intrinsics.d(str, ((PickRouteLocationDataState) this.f.getValue()).f)) {
                return;
            }
            Job job = this.u;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            if (str.length() == 0) {
                E0(new ir0(13));
                return;
            } else {
                E0(new ym0(routeSearchedIntent, 20));
                this.u = BuildersKt.d(contextScope, null, null, new PickRouteLocationComponent$handleRouteSearchedIntent$3(this, routeSearchedIntent, null), 3);
                return;
            }
        }
        if (pickRouteLocationIntent instanceof PickRouteLocationIntent.RouteSelectedIntent) {
            PickRouteLocationIntent.RouteSelectedIntent routeSelectedIntent = (PickRouteLocationIntent.RouteSelectedIntent) pickRouteLocationIntent;
            E0(new ym0(routeSelectedIntent, 22));
            String str2 = routeSelectedIntent.f8284a;
            E0(new ir0(16));
            BuildersKt.d(contextScope, null, null, new PickRouteLocationComponent$getSelectedRouteDetailsAndNavigateBack$2(this, str2, null), 3);
            return;
        }
        if (pickRouteLocationIntent instanceof PickRouteLocationIntent.InitialIntent) {
            BuildersKt.d(contextScope, null, null, new PickRouteLocationComponent$handleInitialIntent$1(this, (PickRouteLocationIntent.InitialIntent) pickRouteLocationIntent, null), 3);
            return;
        }
        if (pickRouteLocationIntent.equals(PickRouteLocationIntent.BackButtonPressIntent.f8280a)) {
            gf.u(null, this.s);
        } else {
            if (!pickRouteLocationIntent.equals(PickRouteLocationIntent.ClearSearchTextFieldIntent.f8281a)) {
                throw new NoWhenBranchMatchedException();
            }
            Job job2 = this.u;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
            }
            E0(new ir0(14));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PickRouteLocationDataState(false, false, EmptyList.f17557a, null, SearchScreenLayoutType.REMOTE_SEARCHED_ITEM_SCREEN, "", null, null, false, true, null);
    }
}
