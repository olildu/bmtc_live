package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.livetracking.routedetails.data.model.app.RouteAvailabilityBannerDetails;
import app.chalo.livetracking.routedetails.data.model.ui.SelectedStopEtaUiModelKt;
import app.chalo.livetracking.routedetails.data.model.ui.StopCtaActionType;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.c41;
import defpackage.p01;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteStopCardUIStateFactory;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteStopCardUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f4937a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4938a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[StopEtaStatus.values().length];
            try {
                iArr[StopEtaStatus.FETCHING_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StopEtaStatus.ETA_NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StopEtaStatus.FETCHING_SUCCESS_AND_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4938a = iArr;
            int[] iArr2 = new int[StopCtaActionType.values().length];
            try {
                iArr2[StopCtaActionType.ViewTimeTable.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[StopCtaActionType.ViewMoreBuses.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    public RouteStopCardUIStateFactory(StringProvider stringProvider) {
        this.f4937a = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0534  */
    /* JADX WARN: Code duplicated, block: B:101:0x0537  */
    /* JADX WARN: Code duplicated, block: B:104:0x054e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0553  */
    /* JADX WARN: Code duplicated, block: B:122:0x0673  */
    /* JADX WARN: Code duplicated, block: B:124:0x068c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x068e  */
    /* JADX WARN: Code duplicated, block: B:126:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:127:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x031b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0323  */
    /* JADX WARN: Code duplicated, block: B:71:0x0329 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x041b  */
    /* JADX WARN: Code duplicated, block: B:94:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x04ed  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x05c2 -> B:114:0x05cb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x05ea -> B:120:0x05f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0673 -> B:123:0x068a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel r56, int r57, boolean r58, boolean r59, boolean r60, boolean r61, boolean r62, kotlin.jvm.functions.Function1 r63, kotlin.coroutines.jvm.internal.ContinuationImpl r64) {
        /*
            Method dump skipped, instruction units count: 1874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteStopCardUIStateFactory.a(app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel, int, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r1 == r10) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel r17, app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus r18, boolean r19, boolean r20, boolean r21, boolean r22, kotlin.jvm.functions.Function1 r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            r16 = this;
            r0 = r16
            r1 = r24
            boolean r2 = r1 instanceof app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteStopCardUIStateFactory$etaStatus$1
            if (r2 == 0) goto L18
            r2 = r1
            app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteStopCardUIStateFactory$etaStatus$1 r2 = (app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteStopCardUIStateFactory$etaStatus$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.label = r3
        L16:
            r9 = r2
            goto L1e
        L18:
            app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteStopCardUIStateFactory$etaStatus$1 r2 = new app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteStopCardUIStateFactory$etaStatus$1
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r9.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r9.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.ResultKt.b(r1)
            return r1
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.ResultKt.b(r1)
            goto L7f
        L3c:
            kotlin.ResultKt.b(r1)
            int[] r1 = app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteStopCardUIStateFactory.WhenMappings.f4938a
            int r2 = r18.ordinal()
            r1 = r1[r2]
            if (r1 == r4) goto L6d
            if (r1 == r3) goto L55
            r2 = 3
            if (r1 != r2) goto L4f
            goto L55
        L4f:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L55:
            r4 = r19 ^ 1
            r9.label = r3
            r2 = 2
            r5 = r4
            r1 = r17
            r3 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            java.lang.Object r1 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r1 != r10) goto L6c
            goto L7e
        L6c:
            return r1
        L6d:
            if (r20 == 0) goto L9c
            app.chalo.providers.stringprovider.StringEnum r1 = app.chalo.providers.stringprovider.StringEnum.FETCHING
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r9.label = r4
            app.chalo.providers.stringprovider.StringProvider r3 = r0.f4937a
            java.lang.Object r1 = r3.b(r1, r2, r9)
            if (r1 != r10) goto L7f
        L7e:
            return r10
        L7f:
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            app.chalo.uistate.text.UITextStyle r4 = app.chalo.uistate.text.UITextStyle.HeadlineSmall
            app.chalo.uistate.text.TextUIState$ChaloTextUIState r2 = new app.chalo.uistate.text.TextUIState$ChaloTextUIState
            app.chalo.uistate.base.ChaloColorToken$OrangePrimary r5 = app.chalo.uistate.base.ChaloColorToken.OrangePrimary.f9835a
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 8184(0x1ff8, float:1.1468E-41)
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteEtaStatusUIState$Text r1 = new app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteEtaStatusUIState$Text
            r1.<init>(r2)
            return r1
        L9c:
            app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteEtaStatusUIState$Shimmer r1 = new app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteEtaStatusUIState$Shimmer
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteStopCardUIStateFactory.b(app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel, app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    /* JADX WARN: Code duplicated, block: B:49:0x016d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object c(StopEtaUiModel stopEtaUiModel, StopEtaStatus stopEtaStatus, boolean z, RouteAvailabilityBannerDetails routeAvailabilityBannerDetails, boolean z2, boolean z3, boolean z4, Function1 function1, ContinuationImpl continuationImpl) {
        RouteStopCardUIStateFactory$stopCard$1 routeStopCardUIStateFactory$stopCard$1;
        boolean z5;
        RouteAvailabilityBannerUIState routeAvailabilityBannerUIState;
        StopEtaUiModel stopEtaUiModel2;
        StopEtaStatus stopEtaStatus2;
        boolean z6;
        boolean z7;
        StopCardCtaUIState stopCardCtaUIState;
        boolean z8;
        String str;
        RouteAvailabilityBannerUIState routeAvailabilityBannerUIState2;
        Function1 function2 = function1;
        if (continuationImpl instanceof RouteStopCardUIStateFactory$stopCard$1) {
            routeStopCardUIStateFactory$stopCard$1 = (RouteStopCardUIStateFactory$stopCard$1) continuationImpl;
            int i = routeStopCardUIStateFactory$stopCard$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeStopCardUIStateFactory$stopCard$1.label = i - Integer.MIN_VALUE;
            } else {
                routeStopCardUIStateFactory$stopCard$1 = new RouteStopCardUIStateFactory$stopCard$1(this, continuationImpl);
            }
        } else {
            routeStopCardUIStateFactory$stopCard$1 = new RouteStopCardUIStateFactory$stopCard$1(this, continuationImpl);
        }
        Object objD = routeStopCardUIStateFactory$stopCard$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeStopCardUIStateFactory$stopCard$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z9 = routeStopCardUIStateFactory$stopCard$1.Z$4;
                boolean z10 = routeStopCardUIStateFactory$stopCard$1.Z$2;
                z5 = routeStopCardUIStateFactory$stopCard$1.Z$1;
                z8 = routeStopCardUIStateFactory$stopCard$1.Z$0;
                routeAvailabilityBannerUIState = (RouteAvailabilityBannerUIState) routeStopCardUIStateFactory$stopCard$1.L$3;
                Function1 function3 = (Function1) routeStopCardUIStateFactory$stopCard$1.L$2;
                stopEtaStatus2 = (StopEtaStatus) routeStopCardUIStateFactory$stopCard$1.L$1;
                StopEtaUiModel stopEtaUiModel3 = (StopEtaUiModel) routeStopCardUIStateFactory$stopCard$1.L$0;
                ResultKt.b(objD);
                z7 = z9;
                z6 = z10;
                function2 = function3;
                stopEtaUiModel2 = stopEtaUiModel3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                stopCardCtaUIState = (StopCardCtaUIState) routeStopCardUIStateFactory$stopCard$1.L$1;
                routeAvailabilityBannerUIState2 = (RouteAvailabilityBannerUIState) routeStopCardUIStateFactory$stopCard$1.L$0;
                ResultKt.b(objD);
            }
            return new StopCardUIState(routeAvailabilityBannerUIState2, (RouteEtaStatusUIState) objD, stopCardCtaUIState);
        }
        ResultKt.b(objD);
        z5 = false;
        if (routeAvailabilityBannerDetails != null) {
            String str2 = routeAvailabilityBannerDetails.e;
            Boolean bool = routeAvailabilityBannerDetails.f4391a;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.d(bool, bool2)) {
                String str3 = routeAvailabilityBannerDetails.d;
                UITextStyle uITextStyle = UITextStyle.BodyMedium;
                ArrayList arrayListB0 = CollectionsKt.b0(new StyledTextDataUIState(str3, null, null, uITextStyle, null, null, null, 1014));
                if (Intrinsics.d(routeAvailabilityBannerDetails.f, bool2) && str2 != null && str2.length() != 0) {
                    arrayListB0.add(new StyledTextDataUIState(" ".concat(str2), ChaloColorToken.OrangePrimary.f9835a, null, uITextStyle, null, null, null, 1012));
                }
                routeAvailabilityBannerUIState = new RouteAvailabilityBannerUIState((!Intrinsics.d(routeAvailabilityBannerDetails.c, bool2) || (str = routeAvailabilityBannerDetails.g) == null || str.length() == 0) ? null : new ImageUrlUIState(routeAvailabilityBannerDetails.g, new ImageUISize(ChaloThemeHelper.a().i), null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), new TextUIState.StyledTextUIState(arrayListB0, null, null, 30), UiEventHandler.Companion.a(new c41(function2, 5)));
            } else {
                routeAvailabilityBannerUIState = null;
            }
        } else {
            routeAvailabilityBannerUIState = null;
        }
        StopCtaActionType stopCtaActionTypeA = SelectedStopEtaUiModelKt.a(stopEtaUiModel);
        if (stopCtaActionTypeA != null) {
            Function0 p01Var = new p01(24, function2, stopCtaActionTypeA);
            stopEtaUiModel2 = stopEtaUiModel;
            routeStopCardUIStateFactory$stopCard$1.L$0 = stopEtaUiModel2;
            stopEtaStatus2 = stopEtaStatus;
            routeStopCardUIStateFactory$stopCard$1.L$1 = stopEtaStatus2;
            routeStopCardUIStateFactory$stopCard$1.L$2 = function2;
            routeStopCardUIStateFactory$stopCard$1.L$3 = routeAvailabilityBannerUIState;
            routeStopCardUIStateFactory$stopCard$1.Z$0 = z;
            routeStopCardUIStateFactory$stopCard$1.Z$1 = false;
            z6 = z2;
            routeStopCardUIStateFactory$stopCard$1.Z$2 = z6;
            routeStopCardUIStateFactory$stopCard$1.Z$3 = z3;
            z7 = z4;
            routeStopCardUIStateFactory$stopCard$1.Z$4 = z7;
            routeStopCardUIStateFactory$stopCard$1.label = 1;
            objD = d(stopCtaActionTypeA, p01Var, routeStopCardUIStateFactory$stopCard$1);
            if (objD != obj) {
                z8 = z;
            }
        } else {
            stopEtaUiModel2 = stopEtaUiModel;
            stopEtaStatus2 = stopEtaStatus;
            z6 = z2;
            z7 = z4;
            stopCardCtaUIState = null;
            z8 = z;
            routeStopCardUIStateFactory$stopCard$1.L$0 = routeAvailabilityBannerUIState;
            routeStopCardUIStateFactory$stopCard$1.L$1 = stopCardCtaUIState;
            routeStopCardUIStateFactory$stopCard$1.L$2 = null;
            routeStopCardUIStateFactory$stopCard$1.L$3 = null;
            routeStopCardUIStateFactory$stopCard$1.label = 2;
            objD = b(stopEtaUiModel2, stopEtaStatus2, z8, z5, z6, z7, function2, routeStopCardUIStateFactory$stopCard$1);
            if (objD != obj) {
                routeAvailabilityBannerUIState2 = routeAvailabilityBannerUIState;
                return new StopCardUIState(routeAvailabilityBannerUIState2, (RouteEtaStatusUIState) objD, stopCardCtaUIState);
            }
        }
        return obj;
        stopCardCtaUIState = (StopCardCtaUIState) objD;
        routeStopCardUIStateFactory$stopCard$1.L$0 = routeAvailabilityBannerUIState;
        routeStopCardUIStateFactory$stopCard$1.L$1 = stopCardCtaUIState;
        routeStopCardUIStateFactory$stopCard$1.L$2 = null;
        routeStopCardUIStateFactory$stopCard$1.L$3 = null;
        routeStopCardUIStateFactory$stopCard$1.label = 2;
        objD = b(stopEtaUiModel2, stopEtaStatus2, z8, z5, z6, z7, function2, routeStopCardUIStateFactory$stopCard$1);
        if (objD != obj) {
            routeAvailabilityBannerUIState2 = routeAvailabilityBannerUIState;
            return new StopCardUIState(routeAvailabilityBannerUIState2, (RouteEtaStatusUIState) objD, stopCardCtaUIState);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(StopCtaActionType stopCtaActionType, Function0 function0, ContinuationImpl continuationImpl) {
        RouteStopCardUIStateFactory$stopCardCta$1 routeStopCardUIStateFactory$stopCardCta$1;
        Function0 function1;
        if (continuationImpl instanceof RouteStopCardUIStateFactory$stopCardCta$1) {
            routeStopCardUIStateFactory$stopCardCta$1 = (RouteStopCardUIStateFactory$stopCardCta$1) continuationImpl;
            int i = routeStopCardUIStateFactory$stopCardCta$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeStopCardUIStateFactory$stopCardCta$1.label = i - Integer.MIN_VALUE;
            } else {
                routeStopCardUIStateFactory$stopCardCta$1 = new RouteStopCardUIStateFactory$stopCardCta$1(this, continuationImpl);
            }
        } else {
            routeStopCardUIStateFactory$stopCardCta$1 = new RouteStopCardUIStateFactory$stopCardCta$1(this, continuationImpl);
        }
        Object objB = routeStopCardUIStateFactory$stopCardCta$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeStopCardUIStateFactory$stopCardCta$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            int i3 = WhenMappings.b[stopCtaActionType.ordinal()];
            if (i3 == 1) {
                return null;
            }
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            routeStopCardUIStateFactory$stopCardCta$1.L$0 = function0;
            routeStopCardUIStateFactory$stopCardCta$1.label = 1;
            objB = this.f4937a.b(StringEnum.SEE_MORE_BUSES, new Object[0], routeStopCardUIStateFactory$stopCardCta$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            function1 = function0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function0) routeStopCardUIStateFactory$stopCardCta$1.L$0;
            ResultKt.b(objB);
        }
        return new StopCardCtaUIState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.TextFieldIndicator.f9859a, null, 4), UiEventHandler.Companion.a(function1));
    }
}
