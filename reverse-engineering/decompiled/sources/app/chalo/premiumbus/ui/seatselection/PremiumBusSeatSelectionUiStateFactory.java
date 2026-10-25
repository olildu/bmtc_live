package app.chalo.premiumbus.ui.seatselection;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.data.GenderPreferenceSelectionStates;
import app.chalo.premiumbus.data.models.app.ReservationType;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.data.models.app.SeatStatus;
import app.chalo.premiumbus.data.models.app.SeatType;
import app.chalo.premiumbus.domain.GetSeatDisplayTypeUseCase;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.BookingInfoBannerUISpecs;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.BookingInfoBannerUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderConfirmationBottomSheetUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderPreferenceNudgeCardUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderSelectionOptionUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PassengerCountSelectionBottomSheetUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionBottomSheetUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatChangeSuccessScreenUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatSelectionDialogTypeUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatTypeInfoHeaderUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatTypeUIState;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.WomenReservedSeatsChoiceBottomSheetUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.error.StandardErrorScreenUIStateFactory;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.radiobutton.RadioButtonUIState;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import app.chalo.uistate.toolbar.ToolbarBaseActionUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.userprofile.Gender;
import defpackage.a60;
import defpackage.fr0;
import defpackage.ju0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/PremiumBusSeatSelectionUiStateFactory;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusSeatSelectionUiStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f7752a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7753a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[GenderPreferenceSelectionStates.values().length];
            try {
                iArr[GenderPreferenceSelectionStates.SHOW_PREFERENCE_NUDGE_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenderPreferenceSelectionStates.PREFERENCE_SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GenderPreferenceSelectionStates.SHOW_PREFERENCE_BOTTOM_SHEET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7753a = iArr;
            int[] iArr2 = new int[ReservationType.values().length];
            try {
                iArr2[ReservationType.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ReservationType.WOMEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[Gender.values().length];
            try {
                iArr3[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Gender.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[Gender.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            c = iArr3;
            int[] iArr4 = new int[SeatType.values().length];
            try {
                iArr4[SeatType.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[SeatType.DRIVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[SeatType.WINDOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[SeatType.AISLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[SeatType.MIDDLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            d = iArr4;
            int[] iArr5 = new int[SeatStatus.values().length];
            try {
                iArr5[SeatStatus.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[SeatStatus.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            e = iArr5;
        }
    }

    public PremiumBusSeatSelectionUiStateFactory(StringProvider stringProvider, GetSeatDisplayTypeUseCase getSeatDisplayTypeUseCase) {
        this.f7752a = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r2 == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        if (r2 == r4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.premiumbus.data.models.app.SeatInfoAppModel r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r2 instanceof app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory$createBookingInfoBannerUIState$1
            if (r3 == 0) goto L19
            r3 = r2
            app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory$createBookingInfoBannerUIState$1 r3 = (app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory$createBookingInfoBannerUIState$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.label = r4
            goto L1e
        L19:
            app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory$createBookingInfoBannerUIState$1 r3 = new app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory$createBookingInfoBannerUIState$1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r4 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r5 = r3.label
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L50
            if (r5 == r7) goto L42
            if (r5 != r6) goto L3a
            java.lang.Object r1 = r3.L$1
            app.chalo.uistate.text.ChaloTextStyleHelper r1 = (app.chalo.uistate.text.ChaloTextStyleHelper) r1
            java.lang.Object r3 = r3.L$0
            app.chalo.premiumbus.data.models.app.SeatInfoAppModel r3 = (app.chalo.premiumbus.data.models.app.SeatInfoAppModel) r3
            kotlin.ResultKt.b(r2)
            r9 = r1
            r1 = r3
            goto L87
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L42:
            java.lang.Object r1 = r3.L$1
            app.chalo.uistate.text.ChaloTextStyleHelper r1 = (app.chalo.uistate.text.ChaloTextStyleHelper) r1
            java.lang.Object r3 = r3.L$0
            app.chalo.premiumbus.data.models.app.SeatInfoAppModel r3 = (app.chalo.premiumbus.data.models.app.SeatInfoAppModel) r3
            kotlin.ResultKt.b(r2)
            r9 = r1
            r1 = r3
            goto L6d
        L50:
            kotlin.ResultKt.b(r2)
            boolean r2 = r1.j
            r5 = 0
            app.chalo.providers.stringprovider.StringProvider r8 = r0.f7752a
            app.chalo.uistate.text.ChaloTextStyleHelper r9 = app.chalo.uistate.text.ChaloTextStyleHelper.f10078a
            if (r2 == 0) goto L72
            app.chalo.providers.stringprovider.StringEnum r2 = app.chalo.providers.stringprovider.StringEnum.YOUR_SEAT_WILL_BE_BLOCKED_FOR_ALL_RIDES_BEING_BOOKED
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r3.L$0 = r1
            r3.L$1 = r9
            r3.label = r7
            java.lang.Object r2 = r8.b(r2, r5, r3)
            if (r2 != r4) goto L6d
            goto L86
        L6d:
            java.lang.String r2 = (java.lang.String) r2
        L6f:
            r3 = r2
            r2 = r9
            goto L8a
        L72:
            app.chalo.providers.stringprovider.StringEnum r2 = app.chalo.providers.stringprovider.StringEnum.SEAT_X_IS_UNAVAILABLE_ON_SOME_DAYS_MESSAGE
            java.lang.String r10 = r1.c
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r5] = r10
            r3.L$0 = r1
            r3.L$1 = r9
            r3.label = r6
            java.lang.Object r2 = r8.b(r2, r7, r3)
            if (r2 != r4) goto L87
        L86:
            return r4
        L87:
            java.lang.String r2 = (java.lang.String) r2
            goto L6f
        L8a:
            r9 = 0
            r10 = 124(0x7c, float:1.74E-43)
            app.chalo.uistate.base.ChaloColorToken$AlmostBlackColor r14 = app.chalo.uistate.base.ChaloColorToken.AlmostBlackColor.f9756a
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r14
            app.chalo.uistate.text.TextUIState$ChaloTextUIState r2 = app.chalo.uistate.text.ChaloTextStyleHelper.b(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            app.chalo.uistate.image.ImageUIState r11 = new app.chalo.uistate.image.ImageUIState
            boolean r3 = r1.j
            if (r3 == 0) goto La2
            app.chalo.providers.iconassetprovider.IconType r3 = app.chalo.providers.iconassetprovider.IconType.THUMBS_UP_BLACK
        La0:
            r12 = r3
            goto La5
        La2:
            app.chalo.providers.iconassetprovider.IconType r3 = app.chalo.providers.iconassetprovider.IconType.IC_ALERT_GREY
            goto La0
        La5:
            r18 = 0
            r19 = 250(0xfa, float:3.5E-43)
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            app.chalo.premiumbus.ui.seatselection.compose.uistate.BookingInfoBannerUISpecs r3 = new app.chalo.premiumbus.ui.seatselection.compose.uistate.BookingInfoBannerUISpecs
            boolean r1 = r1.j
            if (r1 == 0) goto Lbb
            app.chalo.uistate.base.ChaloColorToken$GreenBase r1 = app.chalo.uistate.base.ChaloColorToken.GreenBase.f9800a
            goto Lbd
        Lbb:
            app.chalo.uistate.base.ChaloColorToken$LightOrangeSpf r1 = app.chalo.uistate.base.ChaloColorToken.LightOrangeSpf.f9817a
        Lbd:
            r3.<init>(r1)
            app.chalo.premiumbus.ui.seatselection.compose.uistate.BookingInfoBannerUIState r1 = new app.chalo.premiumbus.ui.seatselection.compose.uistate.BookingInfoBannerUIState
            r1.<init>(r2, r11, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory.a(app.chalo.premiumbus.data.models.app.SeatInfoAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1 premiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1) continuationImpl;
            int i = premiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            premiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1.L$0 = chaloTextStyleHelper2;
            premiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1.label = 1;
            objB = this.f7752a.b(StringEnum.PB_THIS_SEAT_IS_OPEN_FOR_EVERYONE_CO_PASSENGER_ANY_GENDER, new Object[0], premiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloTextStyleHelper = chaloTextStyleHelper2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createBulkBookingGeneralSeatBannerUIState$1.L$0;
            ResultKt.b(objB);
        }
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        return new BookingInfoBannerUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB, almostBlackColor, 0, null, null, null, null, 124), new ImageUIState(IconType.IC_INFO_I, (String) null, almostBlackColor, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242), new BookingInfoBannerUISpecs(ChaloColorToken.VeryLightGrey.f9868a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createErrorUIState$1 premiumBusSeatSelectionUiStateFactory$createErrorUIState$1;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory;
        Object objB;
        IconType iconType;
        int i;
        Function1 function2;
        PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState2;
        String str;
        IconType iconType2;
        Function1 function3;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory2;
        PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState3 = premiumBusSeatSelectionDataState;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createErrorUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createErrorUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createErrorUIState$1) continuationImpl;
            int i2 = premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createErrorUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createErrorUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createErrorUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createErrorUIState$1(this, continuationImpl);
        }
        Object objB2 = premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.label;
        StringProvider stringProvider = this.f7752a;
        if (i3 == 0) {
            ResultKt.b(objB2);
            if (!premiumBusSeatSelectionDataState3.b) {
                return null;
            }
            IconType iconType3 = IconType.IC_ERROR_IMAGE;
            premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$0 = premiumBusSeatSelectionDataState3;
            premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$1 = function1;
            standardErrorScreenUIStateFactory = StandardErrorScreenUIStateFactory.f10025a;
            premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$2 = standardErrorScreenUIStateFactory;
            premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$3 = iconType3;
            premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.I$0 = 0;
            premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], premiumBusSeatSelectionUiStateFactory$createErrorUIState$1);
            if (objB != coroutineSingletons) {
                iconType = iconType3;
                i = 0;
                function2 = function1;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            int i4 = premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.I$0;
            IconType iconType4 = (IconType) premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$3;
            StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory3 = (StandardErrorScreenUIStateFactory) premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$2;
            function2 = (Function1) premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$1;
            PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState4 = (PremiumBusSeatSelectionDataState) premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$0;
            ResultKt.b(objB2);
            standardErrorScreenUIStateFactory = standardErrorScreenUIStateFactory3;
            iconType = iconType4;
            objB = objB2;
            i = i4;
            premiumBusSeatSelectionDataState3 = premiumBusSeatSelectionDataState4;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$4;
            IconType iconType5 = (IconType) premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$3;
            StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory4 = (StandardErrorScreenUIStateFactory) premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$2;
            function3 = (Function1) premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$1;
            premiumBusSeatSelectionDataState2 = (PremiumBusSeatSelectionDataState) premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$0;
            ResultKt.b(objB2);
            str = str2;
            iconType2 = iconType5;
            standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory4;
        }
        return StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType2, str, null, (String) objB2, new fr0(11, premiumBusSeatSelectionDataState2, function3), 10);
        String str3 = (String) objB;
        premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$0 = premiumBusSeatSelectionDataState3;
        premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$1 = function2;
        premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$2 = standardErrorScreenUIStateFactory;
        premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$3 = iconType;
        premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.L$4 = str3;
        premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.I$0 = i;
        premiumBusSeatSelectionUiStateFactory$createErrorUIState$1.label = 2;
        objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], premiumBusSeatSelectionUiStateFactory$createErrorUIState$1);
        if (objB2 != coroutineSingletons) {
            premiumBusSeatSelectionDataState2 = premiumBusSeatSelectionDataState3;
            str = str3;
            iconType2 = iconType;
            function3 = function2;
            standardErrorScreenUIStateFactory2 = standardErrorScreenUIStateFactory;
            return StandardErrorScreenUIStateFactory.b(standardErrorScreenUIStateFactory2, iconType2, str, null, (String) objB2, new fr0(11, premiumBusSeatSelectionDataState2, function3), 10);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r3 == r5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (r3 == r5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (r3 == r5) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
    
        if (r3 == r5) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType r21, kotlin.jvm.functions.Function1 r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            boolean r4 = r3 instanceof app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory$createGenderConfirmationBottomSheetUIState$1
            if (r4 == 0) goto L1b
            r4 = r3
            app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory$createGenderConfirmationBottomSheetUIState$1 r4 = (app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory$createGenderConfirmationBottomSheetUIState$1) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.label = r5
            goto L20
        L1b:
            app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory$createGenderConfirmationBottomSheetUIState$1 r4 = new app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory$createGenderConfirmationBottomSheetUIState$1
            r4.<init>(r0, r3)
        L20:
            java.lang.Object r3 = r4.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r6 = r4.label
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r6 == 0) goto L4d
            if (r6 == r10) goto L49
            if (r6 == r9) goto L45
            if (r6 == r8) goto L41
            if (r6 != r7) goto L39
            kotlin.ResultKt.b(r3)
            goto Lb9
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L41:
            kotlin.ResultKt.b(r3)
            goto La5
        L45:
            kotlin.ResultKt.b(r3)
            goto L95
        L49:
            kotlin.ResultKt.b(r3)
            goto L85
        L4d:
            kotlin.ResultKt.b(r3)
            app.chalo.providers.iconassetprovider.IconType r12 = app.chalo.providers.iconassetprovider.IconType.IC_RED_CROSS
            ju0 r3 = new ju0
            r6 = 13
            r3.<init>(r2, r6)
            app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1 r18 = app.chalo.uistate.base.UiEventHandler.Companion.a(r3)
            app.chalo.uistate.image.ImageUISize r15 = new app.chalo.uistate.image.ImageUISize
            app.chalo.compose.theme.ChaloDimens r3 = app.chalo.compose.theme.ChaloThemeHelper.a()
            float r3 = r3.i
            r15.<init>(r3)
            app.chalo.uistate.image.ImageUIState r11 = new app.chalo.uistate.image.ImageUIState
            r17 = 0
            r19 = 114(0x72, float:1.6E-43)
            r13 = 0
            app.chalo.uistate.base.ChaloColorToken$Black r14 = app.chalo.uistate.base.ChaloColorToken.Black.f9759a
            r16 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r3 = r1 instanceof app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType.PreferenceSelectionBottomSheetType
            if (r3 == 0) goto L88
            app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType$PreferenceSelectionBottomSheetType r1 = (app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType.PreferenceSelectionBottomSheetType) r1
            r4.label = r10
            java.lang.Object r3 = r0.m(r1, r11, r2, r4)
            if (r3 != r5) goto L85
            goto Lb8
        L85:
            app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderConfirmationBottomSheetUIState r3 = (app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderConfirmationBottomSheetUIState) r3
            goto Lbb
        L88:
            boolean r3 = r1 instanceof app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType.GenderPreferenceSelectionSuccess
            if (r3 == 0) goto L98
            r4.label = r9
            java.lang.Object r3 = r0.h(r11, r4)
            if (r3 != r5) goto L95
            goto Lb8
        L95:
            app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderConfirmationBottomSheetUIState r3 = (app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderConfirmationBottomSheetUIState) r3
            goto Lbb
        L98:
            boolean r3 = r1 instanceof app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType.GenderPreferenceSelectionError
            if (r3 == 0) goto La8
            r4.label = r8
            java.lang.Object r3 = r0.f(r11, r2, r4)
            if (r3 != r5) goto La5
            goto Lb8
        La5:
            app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderConfirmationBottomSheetUIState r3 = (app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderConfirmationBottomSheetUIState) r3
            goto Lbb
        La8:
            app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType$GenderPreferenceSelectionLoading r2 = app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType.GenderPreferenceSelectionLoading.f7715a
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r1 == 0) goto Lc1
            r4.label = r7
            java.lang.Object r3 = r0.g(r4)
            if (r3 != r5) goto Lb9
        Lb8:
            return r5
        Lb9:
            app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderConfirmationBottomSheetUIState r3 = (app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderConfirmationBottomSheetUIState) r3
        Lbb:
            app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionBottomSheetUIState$GenderConfirmationBottomSheet r1 = new app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionBottomSheetUIState$GenderConfirmationBottomSheet
            r1.<init>(r3)
            return r1
        Lc1:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory.d(app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1 premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1;
        Function1 function2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        TextUIState.ChaloTextUIState chaloTextUIStateB;
        Object objB;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        Function1 function3;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1) continuationImpl;
            int i = premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1(this, continuationImpl);
        }
        Object objB2 = premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.label;
        StringProvider stringProvider = this.f7752a;
        ChaloTextStyleHelper chaloTextStyleHelper3 = ChaloTextStyleHelper.f10078a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            GenderPreferenceSelectionStates genderPreferenceSelectionStates = premiumBusSeatSelectionDataState.k;
            int i3 = genderPreferenceSelectionStates == null ? -1 : WhenMappings.f7753a[genderPreferenceSelectionStates.ordinal()];
            if (i3 == -1) {
                return null;
            }
            if (i3 != 1) {
                if (i3 == 2 || i3 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$0 = function1;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$1 = chaloTextStyleHelper3;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.label = 1;
            objB2 = stringProvider.b(StringEnum.HELP_US_WITH_SEATING_PREFERENCES, new Object[0], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1);
            if (objB2 != coroutineSingletons) {
                function2 = function1;
                chaloTextStyleHelper = chaloTextStyleHelper3;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ChaloTextStyleHelper chaloTextStyleHelper4 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$1;
            function2 = (Function1) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$0;
            ResultKt.b(objB2);
            chaloTextStyleHelper = chaloTextStyleHelper4;
        } else {
            if (i2 == 2) {
                ChaloTextStyleHelper chaloTextStyleHelper5 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$1;
                function2 = (Function1) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$0;
                ResultKt.b(objB2);
                chaloTextStyleHelper2 = chaloTextStyleHelper5;
                chaloTextUIState = chaloTextUIState3;
                chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) objB2, ChaloColorToken.ShadyGray.f9851a, 0, null, null, null, null, 124);
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$0 = function2;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$1 = chaloTextUIState;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$2 = chaloTextUIStateB;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$3 = chaloTextStyleHelper3;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.UPDATE_GENDER, new Object[0], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1);
                if (objB != coroutineSingletons) {
                    chaloTextUIState2 = chaloTextUIStateB;
                    objB2 = objB;
                    function3 = function2;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextStyleHelper3 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$3;
            chaloTextUIState2 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$2;
            chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$1;
            function3 = (Function1) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$0;
            ResultKt.b(objB2);
        }
        return new GenderPreferenceNudgeCardUIState(chaloTextUIState, chaloTextUIState2, new TextWithLeftAndRightIconUIState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB2, ChaloColorToken.OrangePrimary.f9835a, null, UIFontWeight.SemiBold, null, null, 108), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().g), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), 0.0f, null, 25), UiEventHandler.Companion.a(new ju0(function3, 16)));
        TextUIState.ChaloTextUIState chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper, (String) objB2, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
        premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$0 = function2;
        premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$1 = chaloTextUIStateG;
        premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$2 = chaloTextStyleHelper3;
        premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.FOR_COMFORTABLE_SEATING_IN_CHALO_BUSES, new Object[0], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1);
        if (objB3 != coroutineSingletons) {
            chaloTextUIState = chaloTextUIStateG;
            objB2 = objB3;
            chaloTextStyleHelper2 = chaloTextStyleHelper3;
            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) objB2, ChaloColorToken.ShadyGray.f9851a, 0, null, null, null, null, 124);
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$0 = function2;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$1 = chaloTextUIState;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$2 = chaloTextUIStateB;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.L$3 = chaloTextStyleHelper3;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1.label = 3;
            objB = stringProvider.b(StringEnum.UPDATE_GENDER, new Object[0], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceNudgeCardUIState$1);
            if (objB != coroutineSingletons) {
                chaloTextUIState2 = chaloTextUIStateB;
                objB2 = objB;
                function3 = function2;
                return new GenderPreferenceNudgeCardUIState(chaloTextUIState, chaloTextUIState2, new TextWithLeftAndRightIconUIState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB2, ChaloColorToken.OrangePrimary.f9835a, null, UIFontWeight.SemiBold, null, null, 108), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().g), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), 0.0f, null, 25), UiEventHandler.Companion.a(new ju0(function3, 16)));
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0182  */
    /* JADX WARN: Code duplicated, block: B:35:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(ImageUIState imageUIState, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1 premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1;
        Object obj;
        ImageUIState imageUIState2;
        Function1 function2;
        ChaloColorToken.AlmostBlackColor almostBlackColor;
        TextUIState.ChaloTextUIState chaloTextUIState;
        int i;
        ChaloTextStyleHelper chaloTextStyleHelper;
        StringProvider stringProvider;
        ImageUIState imageUIState3;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        TextUIState.ChaloTextUIState chaloTextUIStateB;
        GifImageUIState gifImageUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        Object objB;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        Function1 function3;
        GifImageUIState gifImageUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ImageUIState imageUIState4;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        ButtonUIStateFactory buttonUIStateFactory2;
        ButtonUIState buttonUIStateF;
        Object objB2;
        ButtonUIState buttonUIState;
        ImageUIState imageUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        Function1 function4;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        ButtonUIStateFactory buttonUIStateFactory3;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1) continuationImpl;
            int i2 = premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1(this, continuationImpl);
        }
        Object obj2 = premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.label;
        ButtonUIStateFactory buttonUIStateFactory4 = ButtonUIStateFactory.f9921a;
        ChaloColorToken.AlmostBlackColor almostBlackColor2 = ChaloColorToken.AlmostBlackColor.f9756a;
        ChaloTextStyleHelper chaloTextStyleHelper5 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider2 = this.f7752a;
        if (i3 == 0) {
            ResultKt.b(obj2);
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$0 = imageUIState;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$1 = function1;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.label = 1;
            Object objB3 = stringProvider2.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1);
            if (objB3 != coroutineSingletons) {
                obj = objB3;
                imageUIState2 = imageUIState;
                function2 = function1;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            function2 = (Function1) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$1;
            ImageUIState imageUIState6 = (ImageUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$0;
            ResultKt.b(obj2);
            obj = obj2;
            imageUIState2 = imageUIState6;
        } else {
            if (i3 == 2) {
                ChaloTextStyleHelper chaloTextStyleHelper6 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$3;
                chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$2;
                Function1 function5 = (Function1) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$1;
                ImageUIState imageUIState7 = (ImageUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$0;
                ResultKt.b(obj2);
                almostBlackColor = almostBlackColor2;
                chaloTextStyleHelper = chaloTextStyleHelper5;
                i = 0;
                imageUIState3 = imageUIState7;
                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                function2 = function5;
                stringProvider = stringProvider2;
                chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) obj2, ChaloColorToken.ShadyGray.f9851a, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                gifImageUIState = new GifImageUIState(LottieType.NEW_ERROR, new ImageUISize(ChaloThemeHelper.a().M), 2);
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$0 = imageUIState3;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$1 = function2;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$2 = chaloTextUIState;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$3 = chaloTextUIStateB;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$4 = gifImageUIState;
                buttonUIStateFactory = buttonUIStateFactory4;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$5 = buttonUIStateFactory;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$6 = chaloTextStyleHelper;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.TRY_AGAIN, new Object[i], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1);
                if (objB != coroutineSingletons) {
                    ImageUIState imageUIState8 = imageUIState3;
                    chaloTextUIState2 = chaloTextUIStateB;
                    obj2 = objB;
                    function3 = function2;
                    gifImageUIState2 = gifImageUIState;
                    chaloTextUIState3 = chaloTextUIState;
                    imageUIState4 = imageUIState8;
                    chaloTextStyleHelper3 = chaloTextStyleHelper;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) obj2, ChaloColorToken.White.f9870a, null, null, null, null, 124), new ju0(function3, 9), UIShape.d, false, ChaloThemeHelper.a().n, 20);
                    premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$0 = imageUIState4;
                    premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$1 = function3;
                    premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$2 = chaloTextUIState3;
                    premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$3 = chaloTextUIState2;
                    premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$4 = gifImageUIState2;
                    premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$5 = buttonUIStateF;
                    premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$6 = buttonUIStateFactory;
                    premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$7 = chaloTextStyleHelper;
                    premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.SKIP_FOR_NOW, new Object[i], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1);
                    if (objB2 != coroutineSingletons) {
                        buttonUIState = buttonUIStateF;
                        obj2 = objB2;
                        imageUIState5 = imageUIState4;
                        chaloTextUIState4 = chaloTextUIState2;
                        chaloTextUIState5 = chaloTextUIState3;
                        function4 = function3;
                        chaloTextStyleHelper4 = chaloTextStyleHelper;
                        buttonUIStateFactory3 = buttonUIStateFactory;
                    }
                }
                return coroutineSingletons;
            }
            if (i3 == 3) {
                ChaloTextStyleHelper chaloTextStyleHelper7 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$6;
                ButtonUIStateFactory buttonUIStateFactory5 = (ButtonUIStateFactory) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$5;
                GifImageUIState gifImageUIState3 = (GifImageUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$4;
                TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState7 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$2;
                Function1 function6 = (Function1) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$1;
                imageUIState4 = (ImageUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$0;
                ResultKt.b(obj2);
                chaloTextStyleHelper = chaloTextStyleHelper5;
                function3 = function6;
                chaloTextStyleHelper3 = chaloTextStyleHelper7;
                gifImageUIState2 = gifImageUIState3;
                almostBlackColor = almostBlackColor2;
                chaloTextUIState3 = chaloTextUIState7;
                buttonUIStateFactory2 = buttonUIStateFactory5;
                chaloTextUIState2 = chaloTextUIState6;
                stringProvider = stringProvider2;
                buttonUIStateFactory = buttonUIStateFactory4;
                i = 0;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) obj2, ChaloColorToken.White.f9870a, null, null, null, null, 124), new ju0(function3, 9), UIShape.d, false, ChaloThemeHelper.a().n, 20);
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$0 = imageUIState4;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$1 = function3;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$2 = chaloTextUIState3;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$3 = chaloTextUIState2;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$4 = gifImageUIState2;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$5 = buttonUIStateF;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$6 = buttonUIStateFactory;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$7 = chaloTextStyleHelper;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.SKIP_FOR_NOW, new Object[i], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1);
                if (objB2 != coroutineSingletons) {
                    buttonUIState = buttonUIStateF;
                    obj2 = objB2;
                    imageUIState5 = imageUIState4;
                    chaloTextUIState4 = chaloTextUIState2;
                    chaloTextUIState5 = chaloTextUIState3;
                    function4 = function3;
                    chaloTextStyleHelper4 = chaloTextStyleHelper;
                    buttonUIStateFactory3 = buttonUIStateFactory;
                }
                return coroutineSingletons;
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper8 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$7;
            ButtonUIStateFactory buttonUIStateFactory6 = (ButtonUIStateFactory) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$6;
            ButtonUIState buttonUIState2 = (ButtonUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$5;
            gifImageUIState2 = (GifImageUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$4;
            TextUIState.ChaloTextUIState chaloTextUIState8 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$3;
            TextUIState.ChaloTextUIState chaloTextUIState9 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$2;
            Function1 function7 = (Function1) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$1;
            imageUIState5 = (ImageUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$0;
            ResultKt.b(obj2);
            buttonUIStateFactory3 = buttonUIStateFactory6;
            chaloTextUIState5 = chaloTextUIState9;
            function4 = function7;
            buttonUIState = buttonUIState2;
            chaloTextUIState4 = chaloTextUIState8;
            almostBlackColor = almostBlackColor2;
            chaloTextStyleHelper4 = chaloTextStyleHelper8;
        }
        GifImageUIState gifImageUIState4 = gifImageUIState2;
        return new GenderConfirmationBottomSheetUIState.FailureUIState(chaloTextUIState5, chaloTextUIState4, buttonUIState, ButtonUIStateFactory.d(buttonUIStateFactory3, ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj2, almostBlackColor, null, null, null, null, 124), new ju0(function4, 10), UIShape.d, false, 52), imageUIState5, gifImageUIState4);
        almostBlackColor = almostBlackColor2;
        i = 0;
        chaloTextStyleHelper = chaloTextStyleHelper5;
        chaloTextUIState = new TextUIState.ChaloTextUIState((String) obj, UITextStyle.DisplaySmall, almostBlackColor, 0, UITextAlign.Center, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7960);
        premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$0 = imageUIState2;
        premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$1 = function2;
        premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$2 = chaloTextUIState;
        premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$3 = chaloTextStyleHelper;
        premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.label = 2;
        stringProvider = stringProvider2;
        Object objB4 = stringProvider.b(StringEnum.WE_COULDNT_SAVE_GENDER_DETAILS_PLEASE_TRY_AGAIN, new Object[0], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1);
        if (objB4 != coroutineSingletons) {
            imageUIState3 = imageUIState2;
            obj2 = objB4;
            chaloTextStyleHelper2 = chaloTextStyleHelper;
            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) obj2, ChaloColorToken.ShadyGray.f9851a, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
            gifImageUIState = new GifImageUIState(LottieType.NEW_ERROR, new ImageUISize(ChaloThemeHelper.a().M), 2);
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$0 = imageUIState3;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$1 = function2;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$2 = chaloTextUIState;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$3 = chaloTextUIStateB;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$4 = gifImageUIState;
            buttonUIStateFactory = buttonUIStateFactory4;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$5 = buttonUIStateFactory;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$6 = chaloTextStyleHelper;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.label = 3;
            objB = stringProvider.b(StringEnum.TRY_AGAIN, new Object[i], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1);
            if (objB != coroutineSingletons) {
                ImageUIState imageUIState9 = imageUIState3;
                chaloTextUIState2 = chaloTextUIStateB;
                obj2 = objB;
                function3 = function2;
                gifImageUIState2 = gifImageUIState;
                chaloTextUIState3 = chaloTextUIState;
                imageUIState4 = imageUIState9;
                chaloTextStyleHelper3 = chaloTextStyleHelper;
                buttonUIStateFactory2 = buttonUIStateFactory;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) obj2, ChaloColorToken.White.f9870a, null, null, null, null, 124), new ju0(function3, 9), UIShape.d, false, ChaloThemeHelper.a().n, 20);
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$0 = imageUIState4;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$1 = function3;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$2 = chaloTextUIState3;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$3 = chaloTextUIState2;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$4 = gifImageUIState2;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$5 = buttonUIStateF;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$6 = buttonUIStateFactory;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.L$7 = chaloTextStyleHelper;
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.SKIP_FOR_NOW, new Object[i], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionFailureUIState$1);
                if (objB2 != coroutineSingletons) {
                    buttonUIState = buttonUIStateF;
                    obj2 = objB2;
                    imageUIState5 = imageUIState4;
                    chaloTextUIState4 = chaloTextUIState2;
                    chaloTextUIState5 = chaloTextUIState3;
                    function4 = function3;
                    chaloTextStyleHelper4 = chaloTextStyleHelper;
                    buttonUIStateFactory3 = buttonUIStateFactory;
                    GifImageUIState gifImageUIState5 = gifImageUIState2;
                    return new GenderConfirmationBottomSheetUIState.FailureUIState(chaloTextUIState5, chaloTextUIState4, buttonUIState, ButtonUIStateFactory.d(buttonUIStateFactory3, ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) obj2, almostBlackColor, null, null, null, null, 124), new ju0(function4, 10), UIShape.d, false, 52), imageUIState5, gifImageUIState5);
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1 premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1) continuationImpl;
            int i = premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1.label = 1;
            objB = this.f7752a.b(StringEnum.UPDATING_GENDER, new Object[0], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionLoadingUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        UITextStyle uITextStyle = UITextStyle.DisplaySmall;
        UIFontWeight uIFontWeight = UIFontWeight.Bold;
        return new GenderConfirmationBottomSheetUIState.LoadingUIState(new TextUIState.ChaloTextUIState((String) objB, uITextStyle, ChaloColorToken.AlmostBlackColor.f9756a, 0, UITextAlign.Center, uIFontWeight, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7960));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object h(ImageUIState imageUIState, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1 premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1;
        ImageUIState imageUIState2;
        ImageUIState imageUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1) continuationImpl;
            int i = premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.label;
        StringProvider stringProvider = this.f7752a;
        if (i2 == 0) {
            ResultKt.b(objB);
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.L$0 = imageUIState;
            premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.GENDER_UPDATED, new Object[0], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1);
            if (objB != coroutineSingletons) {
                imageUIState2 = imageUIState;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            imageUIState2 = (ImageUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper2 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.L$2;
            chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.L$1;
            imageUIState3 = (ImageUIState) premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextStyleHelper = chaloTextStyleHelper2;
        }
        return new GenderConfirmationBottomSheetUIState.SuccessUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB, ChaloColorToken.ShadyGray.f9851a, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), imageUIState3, new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, new ImageUISize(ChaloThemeHelper.a().M), 2));
        UITextStyle uITextStyle = UITextStyle.DisplaySmall;
        UIFontWeight uIFontWeight = UIFontWeight.Bold;
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, uITextStyle, ChaloColorToken.AlmostBlackColor.f9756a, 0, UITextAlign.Center, uIFontWeight, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7960);
        premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.L$0 = imageUIState2;
        premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.L$1 = chaloTextUIState2;
        ChaloTextStyleHelper chaloTextStyleHelper3 = ChaloTextStyleHelper.f10078a;
        premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.L$2 = chaloTextStyleHelper3;
        premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.YOUR_PROFILE_HAS_BEEN_UPDATED, new Object[0], premiumBusSeatSelectionUiStateFactory$createGenderPreferenceSelectionSuccessUIState$1);
        if (objB != coroutineSingletons) {
            imageUIState3 = imageUIState2;
            chaloTextUIState = chaloTextUIState2;
            chaloTextStyleHelper = chaloTextStyleHelper3;
            return new GenderConfirmationBottomSheetUIState.SuccessUIState(chaloTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB, ChaloColorToken.ShadyGray.f9851a, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), imageUIState3, new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, new ImageUISize(ChaloThemeHelper.a().M), 2));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Gender gender, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1 premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1;
        Gender gender2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        String str;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1) continuationImpl;
            int i = premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            int i3 = WhenMappings.c[gender.ordinal()];
            StringProvider stringProvider = this.f7752a;
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            if (i3 == 1) {
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$0 = gender;
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$1 = function1;
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$2 = chaloTextStyleHelper2;
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.Z$0 = z;
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.label = 1;
                objB = stringProvider.b(StringEnum.MALE, new Object[0], premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1);
                if (objB != coroutineSingletons) {
                    gender2 = gender;
                    chaloTextStyleHelper = chaloTextStyleHelper2;
                    str = (String) objB;
                }
            } else if (i3 == 2) {
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$0 = gender;
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$1 = function1;
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$2 = chaloTextStyleHelper2;
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.Z$0 = z;
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.label = 2;
                objB = stringProvider.b(StringEnum.FEMALE, new Object[0], premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1);
                if (objB != coroutineSingletons) {
                    gender2 = gender;
                    chaloTextStyleHelper = chaloTextStyleHelper2;
                    str = (String) objB;
                }
            } else {
                if (i3 != 3 && i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$0 = gender;
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$1 = function1;
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$2 = chaloTextStyleHelper2;
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.Z$0 = z;
                premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.THIRD_GENDER, new Object[0], premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1);
                if (objB != coroutineSingletons) {
                    gender2 = gender;
                    chaloTextStyleHelper = chaloTextStyleHelper2;
                    str = (String) objB;
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            z = premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.Z$0;
            chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$2;
            function1 = (Function1) premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$1;
            gender2 = (Gender) premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$0;
            ResultKt.b(objB);
            str = (String) objB;
        } else if (i2 == 2) {
            z = premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.Z$0;
            chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$2;
            function1 = (Function1) premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$1;
            gender2 = (Gender) premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$0;
            ResultKt.b(objB);
            str = (String) objB;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.Z$0;
            chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$2;
            function1 = (Function1) premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$1;
            gender2 = (Gender) premiumBusSeatSelectionUiStateFactory$createGenderSelectionOptionUIState$1.L$0;
            ResultKt.b(objB);
            str = (String) objB;
        }
        return new GenderSelectionOptionUIState(ChaloTextStyleHelper.a(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, 124), new RadioButtonUIState(z, UiEventHandler.Companion.a(new a60(function1, gender2, 2)), 60), UiEventHandler.Companion.a(new a60(function1, gender2, 3)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object j(ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1 premiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1) continuationImpl;
            int i = premiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            premiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1.L$0 = chaloTextStyleHelper2;
            premiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1.label = 1;
            objB = this.f7752a.b(StringEnum.PB_THIS_SEAT_IS_OPEN_FOR_ALL_PASSENGERS, new Object[0], premiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloTextStyleHelper = chaloTextStyleHelper2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createGeneralSeatOpenForAllBannerUIState$1.L$0;
            ResultKt.b(objB);
        }
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        return new BookingInfoBannerUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB, almostBlackColor, 0, null, null, null, null, 124), new ImageUIState(IconType.IC_INFO_I, (String) null, almostBlackColor, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242), new BookingInfoBannerUISpecs(ChaloColorToken.VeryLightGrey.f9868a));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object k(StringEnum stringEnum, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1 premiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1) continuationImpl;
            int i = premiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            premiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1.L$0 = chaloTextStyleHelper2;
            premiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1.label = 1;
            objB = this.f7752a.b(stringEnum, new Object[0], premiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloTextStyleHelper = chaloTextStyleHelper2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createInfoBannerUIState$1.L$0;
            ResultKt.b(objB);
        }
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        return new BookingInfoBannerUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB, almostBlackColor, 0, null, null, null, null, 124), new ImageUIState(IconType.IC_INFO_I, (String) null, almostBlackColor, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242), new BookingInfoBannerUISpecs(ChaloColorToken.VeryLightGrey.f9868a));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0125  */
    /* JADX WARN: Code duplicated, block: B:44:0x015d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0160  */
    /* JADX WARN: Code duplicated, block: B:48:0x0166  */
    /* JADX WARN: Code duplicated, block: B:49:0x0173  */
    /* JADX WARN: Code duplicated, block: B:52:0x0195  */
    /* JADX WARN: Code duplicated, block: B:53:0x0198  */
    /* JADX WARN: Code duplicated, block: B:55:0x019c  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object l(PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState, Function1 function1, Function1 function2, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1 premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1;
        ChaloColorToken.OrangePrimary orangePrimary;
        ChaloColorToken.Gray42 gray42;
        Function1 function3;
        int i;
        BookingInfoBannerUIState bookingInfoBannerUIState;
        int i2;
        int i3;
        ChaloColorToken.Gray42 gray43;
        Object objB;
        BookingInfoBannerUIState bookingInfoBannerUIState2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        int i4;
        ChaloColorToken.Gray42 gray44;
        Function1 function4;
        ChaloColorToken.OrangePrimary orangePrimary2;
        TextUIState.ChaloTextUIState chaloTextUIStateF;
        TextUIState.ChaloTextUIState chaloTextUIStateF2;
        ChaloColorToken chaloColorToken;
        UiEventHandler uiEventHandlerA;
        UiEventHandler uiEventHandlerA2;
        ImageUIState imageUIState;
        ChaloColorToken chaloColorToken2;
        ImageUIState imageUIState2;
        ButtonUIStateFactory buttonUIStateFactory;
        Object objB2;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ButtonUIStateFactory buttonUIStateFactory2;
        BookingInfoBannerUIState bookingInfoBannerUIState3;
        ImageUIState imageUIState3;
        ImageUIState imageUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        Function1 function5;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1) continuationImpl;
            int i5 = premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.label = i5 - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1(this, continuationImpl);
        }
        Object obj = premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.label;
        StringProvider stringProvider = this.f7752a;
        ChaloTextStyleHelper chaloTextStyleHelper3 = ChaloTextStyleHelper.f10078a;
        if (i6 != 0) {
            if (i6 == 1) {
                i2 = premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$2;
                i3 = premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$1;
                i = premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$0;
                gray43 = (ChaloColorToken.Gray42) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$2;
                ChaloColorToken.OrangePrimary orangePrimary3 = (ChaloColorToken.OrangePrimary) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$1;
                Function1 function6 = (Function1) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$0;
                ResultKt.b(obj);
                orangePrimary = orangePrimary3;
                function3 = function6;
            } else {
                if (i6 == 2) {
                    i2 = premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$2;
                    i3 = premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$1;
                    i4 = premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$0;
                    ChaloTextStyleHelper chaloTextStyleHelper4 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$4;
                    BookingInfoBannerUIState bookingInfoBannerUIState4 = (BookingInfoBannerUIState) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$3;
                    ChaloColorToken.Gray42 gray45 = (ChaloColorToken.Gray42) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$2;
                    orangePrimary = (ChaloColorToken.OrangePrimary) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$1;
                    function4 = (Function1) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$0;
                    ResultKt.b(obj);
                    chaloTextStyleHelper = chaloTextStyleHelper4;
                    bookingInfoBannerUIState2 = bookingInfoBannerUIState4;
                    gray44 = gray45;
                    orangePrimary2 = orangePrimary;
                    UIFontWeight uIFontWeight = UIFontWeight.Bold;
                    ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) obj, black, uIFontWeight, null, 108);
                    chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper3, String.valueOf(i4), black, uIFontWeight, null, 108);
                    IconType iconType = IconType.IC_MINUS;
                    ImageUISize imageUISize = new ImageUISize(ChaloThemeHelper.a().h);
                    if (i3 != 0) {
                        chaloColorToken = orangePrimary2;
                    } else {
                        chaloColorToken = gray44;
                    }
                    uiEventHandlerA = UiEventHandler.Companion.f9897a;
                    if (i3 != 0) {
                        uiEventHandlerA2 = UiEventHandler.Companion.a(new ju0(function4, 3));
                    } else {
                        uiEventHandlerA2 = uiEventHandlerA;
                    }
                    imageUIState = new ImageUIState(iconType, (String) null, chaloColorToken, imageUISize, (UIContentScale) null, 0.0f, uiEventHandlerA2, 114);
                    IconType iconType2 = IconType.IC_PLUS;
                    ImageUISize imageUISize2 = new ImageUISize(ChaloThemeHelper.a().h);
                    if (i2 != 0) {
                        chaloColorToken2 = orangePrimary2;
                    } else {
                        chaloColorToken2 = gray44;
                    }
                    if (i2 != 0) {
                        uiEventHandlerA = UiEventHandler.Companion.a(new ju0(function4, 4));
                    }
                    imageUIState2 = new ImageUIState(iconType2, (String) null, chaloColorToken2, imageUISize2, (UIContentScale) null, 0.0f, uiEventHandlerA, 114);
                    premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$0 = function4;
                    premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$1 = bookingInfoBannerUIState2;
                    premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$2 = chaloTextUIStateF;
                    premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$3 = chaloTextUIStateF2;
                    premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$4 = imageUIState;
                    premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$5 = imageUIState2;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$6 = buttonUIStateFactory;
                    premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$7 = chaloTextStyleHelper3;
                    premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.label = 3;
                    objB2 = stringProvider.b(StringEnum.SELECT_SEATS, new Object[0], premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1);
                    if (objB2 != obj2) {
                        chaloTextStyleHelper2 = chaloTextStyleHelper3;
                        chaloTextUIState = chaloTextUIStateF2;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        bookingInfoBannerUIState3 = bookingInfoBannerUIState2;
                        imageUIState3 = imageUIState2;
                        imageUIState4 = imageUIState;
                        chaloTextUIState2 = chaloTextUIStateF;
                        obj = objB2;
                        function5 = function4;
                    }
                    return obj2;
                }
                if (i6 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChaloTextStyleHelper chaloTextStyleHelper5 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$7;
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$6;
                ImageUIState imageUIState5 = (ImageUIState) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$5;
                ImageUIState imageUIState6 = (ImageUIState) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$4;
                chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$2;
                BookingInfoBannerUIState bookingInfoBannerUIState5 = (BookingInfoBannerUIState) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$1;
                function5 = (Function1) premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$0;
                ResultKt.b(obj);
                buttonUIStateFactory2 = buttonUIStateFactory3;
                chaloTextStyleHelper2 = chaloTextStyleHelper5;
                bookingInfoBannerUIState3 = bookingInfoBannerUIState5;
                imageUIState4 = imageUIState6;
                chaloTextUIState2 = chaloTextUIState3;
                imageUIState3 = imageUIState5;
            }
            return new PremiumBusSeatSelectionBottomSheetUIState.PassengerCountSelectionBottomSheet(new PassengerCountSelectionBottomSheetUIState(chaloTextUIState2, chaloTextUIState, imageUIState4, imageUIState3, ButtonUIStateFactory.f(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper2, (String) obj, ChaloColorToken.White.f9870a, null, null, null, null, 124), new ju0(function5, 5), UIShape.d, false, 0.0f, 52), bookingInfoBannerUIState3));
        }
        ResultKt.b(obj);
        Integer num = premiumBusSeatSelectionDataState.o;
        int iIntValue = num != null ? num.intValue() : 1;
        int iIntValue2 = ((Number) function1.invoke(new Integer(iIntValue))).intValue();
        int i7 = iIntValue > 1 ? 1 : 0;
        int i8 = iIntValue < iIntValue2 ? 1 : 0;
        Gender gender = premiumBusSeatSelectionDataState.m;
        Gender gender2 = Gender.FEMALE;
        orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        gray42 = ChaloColorToken.Gray42.f9797a;
        if (gender == gender2) {
            StringEnum stringEnum = StringEnum.MULTIPLE_BOOKINGS_NOT_ALLOWED_WITH_WOMEN_SEAT_SELECTION;
            function3 = function2;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$0 = function3;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$1 = orangePrimary;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$2 = gray42;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$0 = iIntValue;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$1 = i7;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$2 = i8;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.label = 1;
            Object objK = k(stringEnum, premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1);
            if (objK != obj2) {
                i = iIntValue;
                obj = objK;
                i2 = i8;
                i3 = i7;
                gray43 = gray42;
            }
        } else {
            function3 = function2;
            i = iIntValue;
            bookingInfoBannerUIState = null;
            i2 = i8;
            i3 = i7;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$0 = function3;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$1 = orangePrimary;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$2 = gray42;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$3 = bookingInfoBannerUIState;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$4 = chaloTextStyleHelper3;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$0 = i;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$1 = i3;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$2 = i2;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.label = 2;
            objB = stringProvider.b(StringEnum.HOW_MANY_SEATS, new Object[0], premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1);
            if (objB != obj2) {
                bookingInfoBannerUIState2 = bookingInfoBannerUIState;
                chaloTextStyleHelper = chaloTextStyleHelper3;
                obj = objB;
                i4 = i;
                gray44 = gray42;
                function4 = function3;
                orangePrimary2 = orangePrimary;
                UIFontWeight uIFontWeight2 = UIFontWeight.Bold;
                ChaloColorToken.Black black2 = ChaloColorToken.Black.f9759a;
                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) obj, black2, uIFontWeight2, null, 108);
                chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper3, String.valueOf(i4), black2, uIFontWeight2, null, 108);
                IconType iconType3 = IconType.IC_MINUS;
                ImageUISize imageUISize3 = new ImageUISize(ChaloThemeHelper.a().h);
                if (i3 != 0) {
                    chaloColorToken = orangePrimary2;
                } else {
                    chaloColorToken = gray44;
                }
                uiEventHandlerA = UiEventHandler.Companion.f9897a;
                if (i3 != 0) {
                    uiEventHandlerA2 = UiEventHandler.Companion.a(new ju0(function4, 3));
                } else {
                    uiEventHandlerA2 = uiEventHandlerA;
                }
                imageUIState = new ImageUIState(iconType3, (String) null, chaloColorToken, imageUISize3, (UIContentScale) null, 0.0f, uiEventHandlerA2, 114);
                IconType iconType4 = IconType.IC_PLUS;
                ImageUISize imageUISize4 = new ImageUISize(ChaloThemeHelper.a().h);
                if (i2 != 0) {
                    chaloColorToken2 = orangePrimary2;
                } else {
                    chaloColorToken2 = gray44;
                }
                if (i2 != 0) {
                    uiEventHandlerA = UiEventHandler.Companion.a(new ju0(function4, 4));
                }
                imageUIState2 = new ImageUIState(iconType4, (String) null, chaloColorToken2, imageUISize4, (UIContentScale) null, 0.0f, uiEventHandlerA, 114);
                premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$0 = function4;
                premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$1 = bookingInfoBannerUIState2;
                premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$2 = chaloTextUIStateF;
                premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$3 = chaloTextUIStateF2;
                premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$4 = imageUIState;
                premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$5 = imageUIState2;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$6 = buttonUIStateFactory;
                premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$7 = chaloTextStyleHelper3;
                premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.SELECT_SEATS, new Object[0], premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1);
                if (objB2 != obj2) {
                    chaloTextStyleHelper2 = chaloTextStyleHelper3;
                    chaloTextUIState = chaloTextUIStateF2;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    bookingInfoBannerUIState3 = bookingInfoBannerUIState2;
                    imageUIState3 = imageUIState2;
                    imageUIState4 = imageUIState;
                    chaloTextUIState2 = chaloTextUIStateF;
                    obj = objB2;
                    function5 = function4;
                    return new PremiumBusSeatSelectionBottomSheetUIState.PassengerCountSelectionBottomSheet(new PassengerCountSelectionBottomSheetUIState(chaloTextUIState2, chaloTextUIState, imageUIState4, imageUIState3, ButtonUIStateFactory.f(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper2, (String) obj, ChaloColorToken.White.f9870a, null, null, null, null, 124), new ju0(function5, 5), UIShape.d, false, 0.0f, 52), bookingInfoBannerUIState3));
                }
            }
        }
        return obj2;
        bookingInfoBannerUIState = (BookingInfoBannerUIState) obj;
        gray42 = gray43;
        premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$0 = function3;
        premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$1 = orangePrimary;
        premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$2 = gray42;
        premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$3 = bookingInfoBannerUIState;
        premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$4 = chaloTextStyleHelper3;
        premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$0 = i;
        premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$1 = i3;
        premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.I$2 = i2;
        premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.HOW_MANY_SEATS, new Object[0], premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1);
        if (objB != obj2) {
            bookingInfoBannerUIState2 = bookingInfoBannerUIState;
            chaloTextStyleHelper = chaloTextStyleHelper3;
            obj = objB;
            i4 = i;
            gray44 = gray42;
            function4 = function3;
            orangePrimary2 = orangePrimary;
            UIFontWeight uIFontWeight3 = UIFontWeight.Bold;
            ChaloColorToken.Black black3 = ChaloColorToken.Black.f9759a;
            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) obj, black3, uIFontWeight3, null, 108);
            chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper3, String.valueOf(i4), black3, uIFontWeight3, null, 108);
            IconType iconType5 = IconType.IC_MINUS;
            ImageUISize imageUISize5 = new ImageUISize(ChaloThemeHelper.a().h);
            if (i3 != 0) {
                chaloColorToken = orangePrimary2;
            } else {
                chaloColorToken = gray44;
            }
            uiEventHandlerA = UiEventHandler.Companion.f9897a;
            if (i3 != 0) {
                uiEventHandlerA2 = UiEventHandler.Companion.a(new ju0(function4, 3));
            } else {
                uiEventHandlerA2 = uiEventHandlerA;
            }
            imageUIState = new ImageUIState(iconType5, (String) null, chaloColorToken, imageUISize5, (UIContentScale) null, 0.0f, uiEventHandlerA2, 114);
            IconType iconType6 = IconType.IC_PLUS;
            ImageUISize imageUISize6 = new ImageUISize(ChaloThemeHelper.a().h);
            if (i2 != 0) {
                chaloColorToken2 = orangePrimary2;
            } else {
                chaloColorToken2 = gray44;
            }
            if (i2 != 0) {
                uiEventHandlerA = UiEventHandler.Companion.a(new ju0(function4, 4));
            }
            imageUIState2 = new ImageUIState(iconType6, (String) null, chaloColorToken2, imageUISize6, (UIContentScale) null, 0.0f, uiEventHandlerA, 114);
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$0 = function4;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$1 = bookingInfoBannerUIState2;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$2 = chaloTextUIStateF;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$3 = chaloTextUIStateF2;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$4 = imageUIState;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$5 = imageUIState2;
            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$6 = buttonUIStateFactory;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.L$7 = chaloTextStyleHelper3;
            premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1.label = 3;
            objB2 = stringProvider.b(StringEnum.SELECT_SEATS, new Object[0], premiumBusSeatSelectionUiStateFactory$createPassengerCountSelectionBottomSheetUIState$1);
            if (objB2 != obj2) {
                chaloTextStyleHelper2 = chaloTextStyleHelper3;
                chaloTextUIState = chaloTextUIStateF2;
                buttonUIStateFactory2 = buttonUIStateFactory;
                bookingInfoBannerUIState3 = bookingInfoBannerUIState2;
                imageUIState3 = imageUIState2;
                imageUIState4 = imageUIState;
                chaloTextUIState2 = chaloTextUIStateF;
                obj = objB2;
                function5 = function4;
                return new PremiumBusSeatSelectionBottomSheetUIState.PassengerCountSelectionBottomSheet(new PassengerCountSelectionBottomSheetUIState(chaloTextUIState2, chaloTextUIState, imageUIState4, imageUIState3, ButtonUIStateFactory.f(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper2, (String) obj, ChaloColorToken.White.f9870a, null, null, null, null, 124), new ju0(function5, 5), UIShape.d, false, 0.0f, 52), bookingInfoBannerUIState3));
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x025d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0267  */
    /* JADX WARN: Code duplicated, block: B:37:0x026a  */
    /* JADX WARN: Code duplicated, block: B:41:0x028e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0299  */
    /* JADX WARN: Code duplicated, block: B:46:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x0321  */
    /* JADX WARN: Code duplicated, block: B:53:0x0353  */
    /* JADX WARN: Code duplicated, block: B:54:0x0356  */
    /* JADX WARN: Code duplicated, block: B:58:0x0389  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x028e -> B:42:0x028f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType.PreferenceSelectionBottomSheetType r35, app.chalo.uistate.image.ImageUIState r36, kotlin.jvm.functions.Function1 r37, kotlin.coroutines.jvm.internal.ContinuationImpl r38) {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory.m(app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType$PreferenceSelectionBottomSheetType, app.chalo.uistate.image.ImageUIState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object n(PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1 premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1;
        Function1 function2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        Function1 function3;
        ButtonUIStateFactory buttonUIStateFactory;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1) continuationImpl;
            int i = premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.label;
        StringProvider stringProvider = this.f7752a;
        ChaloTextStyleHelper chaloTextStyleHelper3 = ChaloTextStyleHelper.f10078a;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!premiumBusSeatSelectionDataState.g) {
                return null;
            }
            premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.L$0 = function1;
            premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.L$1 = chaloTextStyleHelper3;
            premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.SEAT_CHANGED, new Object[0], premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1);
            if (objB != coroutineSingletons) {
                function2 = function1;
                chaloTextStyleHelper = chaloTextStyleHelper3;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ChaloTextStyleHelper chaloTextStyleHelper4 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.L$1;
            function2 = (Function1) premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextStyleHelper = chaloTextStyleHelper4;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper5 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.L$3;
            buttonUIStateFactory = (ButtonUIStateFactory) premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.L$2;
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.L$1;
            function3 = (Function1) premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextUIState = chaloTextUIState2;
            chaloTextStyleHelper2 = chaloTextStyleHelper5;
        }
        return new SeatChangeSuccessScreenUIState(chaloTextUIState, ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) objB, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.SemiBold, null, null, 108), new ju0(function3, 2), UIShape.d, false, 0.0f, 52));
        TextUIState.ChaloTextUIState chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB, ChaloColorToken.Black.f9759a, null, null, null, 124);
        premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.L$0 = function2;
        premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.L$1 = chaloTextUIStateE;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.L$2 = buttonUIStateFactory2;
        premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.L$3 = chaloTextStyleHelper3;
        premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.OKAY, new Object[0], premiumBusSeatSelectionUiStateFactory$createSeatChangeSuccessScreenUIState$1);
        if (objB != coroutineSingletons) {
            function3 = function2;
            buttonUIStateFactory = buttonUIStateFactory2;
            chaloTextStyleHelper2 = chaloTextStyleHelper3;
            chaloTextUIState = chaloTextUIStateE;
            return new SeatChangeSuccessScreenUIState(chaloTextUIState, ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) objB, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.SemiBold, null, null, 108), new ju0(function3, 2), UIShape.d, false, 0.0f, 52));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:206:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x018e  */
    /* JADX WARN: Code duplicated, block: B:55:0x019f A[LOOP:0: B:50:0x0188->B:55:0x019f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x0341 -> B:163:0x034e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:164:0x0378 -> B:165:0x03a4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object o(java.util.List r41, java.util.List r42, app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState r43, kotlin.jvm.functions.Function1 r44, kotlin.coroutines.jvm.internal.ContinuationImpl r45) {
        /*
            Method dump skipped, instruction units count: 1223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory.o(java.util.List, java.util.List, app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object p(PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState, Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1 premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1;
        Function1 function2;
        ChaloColorToken.AlmostBlackColor almostBlackColor;
        int i;
        StringProvider stringProvider;
        Object objB;
        Function1 function3;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        ButtonUIState buttonUIStateF;
        ButtonUIState buttonUIState;
        Function1 function4;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1) continuationImpl;
            int i2 = premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1(this, continuationImpl);
        }
        Object objB2 = premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.label;
        ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        ChaloColorToken.AlmostBlackColor almostBlackColor2 = ChaloColorToken.AlmostBlackColor.f9756a;
        StringProvider stringProvider2 = this.f7752a;
        if (i3 == 0) {
            ResultKt.b(objB2);
            SeatSelectionDialogType seatSelectionDialogType = premiumBusSeatSelectionDataState.i;
            if (!(seatSelectionDialogType instanceof SeatSelectionDialogType.SeatChangeConfirmationDialog)) {
                if (seatSelectionDialogType == null) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$0 = function1;
            premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.label = 1;
            objB2 = stringProvider2.b(StringEnum.ARE_YOU_SURE_YOU_WANT_TO_CHANGE_YOUR_SEAT, new Object[0], premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1);
            if (objB2 != coroutineSingletons) {
                function2 = function1;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            function2 = (Function1) premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$0;
            ResultKt.b(objB2);
        } else {
            if (i3 == 2) {
                ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$3;
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$1;
                function3 = (Function1) premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$0;
                ResultKt.b(objB2);
                chaloTextStyleHelper = chaloTextStyleHelper3;
                buttonUIStateFactory = buttonUIStateFactory3;
                chaloTextUIState = chaloTextUIState2;
                objB = objB2;
                almostBlackColor = almostBlackColor2;
                i = 0;
                stringProvider = stringProvider2;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper, (String) objB, ChaloColorToken.White.f9870a, null, null, null, null, 124), new ju0(function3, 1), UIShape.d, false, 0.0f, 52);
                premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$0 = function3;
                premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$1 = chaloTextUIState;
                premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$2 = buttonUIStateF;
                premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$3 = buttonUIStateFactory2;
                premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$4 = chaloTextStyleHelper2;
                premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.CANCEL, new Object[i], premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1);
                if (objB2 != coroutineSingletons) {
                    buttonUIState = buttonUIStateF;
                    function4 = function3;
                }
                return coroutineSingletons;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextStyleHelper2 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$4;
            buttonUIStateFactory2 = (ButtonUIStateFactory) premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$3;
            buttonUIState = (ButtonUIState) premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$2;
            chaloTextUIState = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$1;
            function4 = (Function1) premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$0;
            ResultKt.b(objB2);
            almostBlackColor = almostBlackColor2;
        }
        return new SeatSelectionDialogTypeUIState.SeatChangeDialogTypeUIState(buttonUIState, ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper2, (String) objB2, almostBlackColor, null, null, null, null, 124), new ju0(function4, 12), UIShape.d, false, 52), new ImageUIState(IconType.IC_RED_CROSS, (String) null, ChaloColorToken.Black.f9759a, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ju0(function4, 14)), 114), chaloTextUIState);
        almostBlackColor = almostBlackColor2;
        i = 0;
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$0 = function2;
        premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$1 = chaloTextUIState3;
        premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$2 = buttonUIStateFactory2;
        premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$3 = chaloTextStyleHelper2;
        premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.label = 2;
        stringProvider = stringProvider2;
        objB = stringProvider.b(StringEnum.PROCEED_SENTENCE_CASE, new Object[0], premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1);
        if (objB != coroutineSingletons) {
            function3 = function2;
            chaloTextStyleHelper = chaloTextStyleHelper2;
            chaloTextUIState = chaloTextUIState3;
            buttonUIStateFactory = buttonUIStateFactory2;
            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper, (String) objB, ChaloColorToken.White.f9870a, null, null, null, null, 124), new ju0(function3, 1), UIShape.d, false, 0.0f, 52);
            premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$0 = function3;
            premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$1 = chaloTextUIState;
            premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$2 = buttonUIStateF;
            premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$3 = buttonUIStateFactory2;
            premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.L$4 = chaloTextStyleHelper2;
            premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1.label = 3;
            objB2 = stringProvider.b(StringEnum.CANCEL, new Object[i], premiumBusSeatSelectionUiStateFactory$createSeatSelectionDialogTypeUIState$1);
            if (objB2 != coroutineSingletons) {
                buttonUIState = buttonUIStateF;
                function4 = function3;
                return new SeatSelectionDialogTypeUIState.SeatChangeDialogTypeUIState(buttonUIState, ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper2, (String) objB2, almostBlackColor, null, null, null, null, 124), new ju0(function4, 12), UIShape.d, false, 52), new ImageUIState(IconType.IC_RED_CROSS, (String) null, ChaloColorToken.Black.f9759a, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new ju0(function4, 14)), 114), chaloTextUIState);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object q(PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1 premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1;
        List list;
        List list2;
        Object obj;
        PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState2;
        List list3;
        StringProvider stringProvider;
        List list4;
        int i;
        List list5;
        StringProvider stringProvider2;
        List list6;
        List list7;
        List list8;
        List list9;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1) continuationImpl;
            int i2 = premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.label;
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        StringProvider stringProvider3 = this.f7752a;
        if (i3 == 0) {
            ResultKt.b(objB);
            ListBuilder listBuilderY = CollectionsKt.y();
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$0 = premiumBusSeatSelectionDataState;
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$1 = listBuilderY;
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$2 = listBuilderY;
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$3 = listBuilderY;
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.label = 1;
            Object objB2 = stringProvider3.b(StringEnum.AVAILABLE, new Object[0], premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1);
            if (objB2 != coroutineSingletons) {
                list = listBuilderY;
                list2 = list;
                obj = objB2;
                premiumBusSeatSelectionDataState2 = premiumBusSeatSelectionDataState;
                list3 = list2;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            List list10 = (List) premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$3;
            List list11 = (List) premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$2;
            List list12 = (List) premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$1;
            PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState3 = (PremiumBusSeatSelectionDataState) premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$0;
            ResultKt.b(objB);
            obj = objB;
            premiumBusSeatSelectionDataState2 = premiumBusSeatSelectionDataState3;
            list3 = list12;
            list2 = list11;
            list = list10;
        } else {
            if (i3 == 2) {
                list7 = (List) premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$2;
                List list13 = (List) premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$1;
                list6 = (List) premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$0;
                ResultKt.b(objB);
                list4 = list13;
                i = 0;
                stringProvider2 = stringProvider3;
                stringProvider = stringProvider2;
                list7.add(new SeatTypeUIState(ChaloColorToken.DarkPurple.f9785a, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
                list5 = list6;
                premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$0 = list5;
                premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$1 = list4;
                premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$2 = null;
                premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$3 = null;
                premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.label = 3;
                objB = stringProvider.b(StringEnum.SOLD_OUT, new Object[i], premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1);
                if (objB != coroutineSingletons) {
                    list8 = list5;
                    list9 = list4;
                }
                return coroutineSingletons;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list9 = (List) premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$1;
            list8 = (List) premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$0;
            ResultKt.b(objB);
        }
        list9.add(new SeatTypeUIState(ChaloColorToken.LightGray.f9814a, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
        return new SeatTypeInfoHeaderUIState(CollectionsKt.t(list8), 6);
        stringProvider = stringProvider3;
        list4 = list2;
        i = 0;
        list5 = list3;
        list.add(new SeatTypeUIState(ChaloColorToken.Green.f9799a, new TextUIState.ChaloTextUIState((String) obj, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
        List list14 = premiumBusSeatSelectionDataState2.d;
        if ((list14 instanceof Collection) && list14.isEmpty()) {
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$0 = list5;
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$1 = list4;
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$2 = null;
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$3 = null;
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.label = 3;
            objB = stringProvider.b(StringEnum.SOLD_OUT, new Object[i], premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1);
            if (objB != coroutineSingletons) {
                list8 = list5;
                list9 = list4;
                list9.add(new SeatTypeUIState(ChaloColorToken.LightGray.f9814a, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
                return new SeatTypeInfoHeaderUIState(CollectionsKt.t(list8), 6);
            }
        } else {
            Iterator it = list14.iterator();
            while (it.hasNext()) {
                if (((SeatInfoAppModel) it.next()).e == ReservationType.WOMEN) {
                    if (premiumBusSeatSelectionDataState2.m == Gender.FEMALE) {
                        premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$0 = list5;
                        premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$1 = list4;
                        premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$2 = list4;
                        premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$3 = null;
                        premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.label = 2;
                        stringProvider2 = stringProvider;
                        objB = stringProvider2.b(StringEnum.WOMEN, new Object[0], premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1);
                        if (objB != coroutineSingletons) {
                            list6 = list5;
                            list7 = list4;
                            stringProvider = stringProvider2;
                            list7.add(new SeatTypeUIState(ChaloColorToken.DarkPurple.f9785a, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
                            list5 = list6;
                            break;
                        }
                    }
                }
            }
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$0 = list5;
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$1 = list4;
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$2 = null;
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.L$3 = null;
            premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1.label = 3;
            objB = stringProvider.b(StringEnum.SOLD_OUT, new Object[i], premiumBusSeatSelectionUiStateFactory$createSeatTypeInfoHeaderUIState$1);
            if (objB != coroutineSingletons) {
                list8 = list5;
                list9 = list4;
                list9.add(new SeatTypeUIState(ChaloColorToken.LightGray.f9814a, new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, almostBlackColor, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
                return new SeatTypeInfoHeaderUIState(CollectionsKt.t(list8), 6);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object r(boolean z, boolean z2, Function1 function1, int i, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createToolBarUIState$1 premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1;
        boolean z3;
        int i2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        Function1 function2;
        boolean z4;
        List listR;
        TextUIState textUIState;
        ImageUIState imageUIState;
        ChaloColorToken.OrangePrimary orangePrimary;
        int i3;
        UiEventHandler uiEventHandler;
        String str;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createToolBarUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createToolBarUIState$1) continuationImpl;
            int i4 = premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.label = i4 - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createToolBarUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createToolBarUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.label;
        ChaloColorToken.OrangePrimary orangePrimary2 = ChaloColorToken.OrangePrimary.f9835a;
        ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider = this.f7752a;
        if (i5 == 0) {
            ResultKt.b(objB);
            premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$0 = function1;
            premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$1 = chaloTextStyleHelper2;
            z3 = z;
            premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.Z$0 = z3;
            premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.Z$1 = z2;
            premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.I$0 = i;
            premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.SELECT_SEATS, new Object[0], premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1);
            if (objB != coroutineSingletons) {
                i2 = i;
                chaloTextStyleHelper = chaloTextStyleHelper2;
                function2 = function1;
                z4 = z2;
            }
            return coroutineSingletons;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                i3 = premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.I$0;
                chaloTextStyleHelper2 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$3;
                textUIState = (TextUIState) premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$2;
                imageUIState = (ImageUIState) premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$1;
                uiEventHandler = (UiEventHandler) premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$0;
                ResultKt.b(objB);
                orangePrimary = orangePrimary2;
                str = (String) objB;
                listR = CollectionsKt.R(new ToolbarBaseActionUIState.IconAndTextUIState(imageUIState, ChaloTextStyleHelper.c(chaloTextStyleHelper2, i3 + " " + str, orangePrimary, null, UIFontWeight.SemiBold, null, null, 108), uiEventHandler, null, null, 120));
                return new ToolbarUIState(null, textUIState, null, null, listR, ChaloThemeHelper.b().f1917a, null, null, 205);
            }
            if (i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.I$0;
            chaloTextStyleHelper2 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$3;
            textUIState = (TextUIState) premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$2;
            imageUIState = (ImageUIState) premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$1;
            uiEventHandler = (UiEventHandler) premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$0;
            ResultKt.b(objB);
            orangePrimary = orangePrimary2;
            str = (String) objB;
            listR = CollectionsKt.R(new ToolbarBaseActionUIState.IconAndTextUIState(imageUIState, ChaloTextStyleHelper.c(chaloTextStyleHelper2, i3 + " " + str, orangePrimary, null, UIFontWeight.SemiBold, null, null, 108), uiEventHandler, null, null, 120));
            return new ToolbarUIState(null, textUIState, null, null, listR, ChaloThemeHelper.b().f1917a, null, null, 205);
        }
        i2 = premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.I$0;
        z4 = premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.Z$1;
        z3 = premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.Z$0;
        ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$1;
        function2 = (Function1) premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$0;
        ResultKt.b(objB);
        chaloTextStyleHelper = chaloTextStyleHelper3;
        TextUIState.ChaloTextUIState chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        if (z3 && z4) {
            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new ju0(function2, 8));
            orangePrimary = orangePrimary2;
            imageUIState = new ImageUIState(IconType.PROFILE_EDIT, (String) null, orangePrimary, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
            if (i2 == 1) {
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$0 = uiEventHandler$Companion$fromLambda$1A;
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$1 = imageUIState;
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$2 = chaloTextUIStateE;
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$3 = chaloTextStyleHelper2;
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.I$0 = i2;
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.label = 2;
                Object objB2 = stringProvider.b(StringEnum.SEAT, new Object[0], premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1);
                if (objB2 != coroutineSingletons) {
                    i3 = i2;
                    uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                    textUIState = chaloTextUIStateE;
                    objB = objB2;
                    str = (String) objB;
                    listR = CollectionsKt.R(new ToolbarBaseActionUIState.IconAndTextUIState(imageUIState, ChaloTextStyleHelper.c(chaloTextStyleHelper2, i3 + " " + str, orangePrimary, null, UIFontWeight.SemiBold, null, null, 108), uiEventHandler, null, null, 120));
                }
            } else {
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$0 = uiEventHandler$Companion$fromLambda$1A;
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$1 = imageUIState;
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$2 = chaloTextUIStateE;
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.L$3 = chaloTextStyleHelper2;
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.I$0 = i2;
                premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1.label = 3;
                Object objB3 = stringProvider.b(StringEnum.SEATS, new Object[0], premiumBusSeatSelectionUiStateFactory$createToolBarUIState$1);
                if (objB3 != coroutineSingletons) {
                    i3 = i2;
                    uiEventHandler = uiEventHandler$Companion$fromLambda$1A;
                    textUIState = chaloTextUIStateE;
                    objB = objB3;
                    str = (String) objB;
                    listR = CollectionsKt.R(new ToolbarBaseActionUIState.IconAndTextUIState(imageUIState, ChaloTextStyleHelper.c(chaloTextStyleHelper2, i3 + " " + str, orangePrimary, null, UIFontWeight.SemiBold, null, null, 108), uiEventHandler, null, null, 120));
                }
            }
            return coroutineSingletons;
        }
        listR = EmptyList.f17557a;
        textUIState = chaloTextUIStateE;
        return new ToolbarUIState(null, textUIState, null, null, listR, ChaloThemeHelper.b().f1917a, null, null, 205);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(boolean z, PremiumBusSeatSelectionDataState premiumBusSeatSelectionDataState, int i, int i2, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1 premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1;
        ChaloTextStyleHelper chaloTextStyleHelper;
        String str;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1) continuationImpl;
            int i3 = premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1(this, continuationImpl);
        }
        Object objB = premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.label) {
            case 0:
                ResultKt.b(objB);
                if (!z) {
                    return null;
                }
                PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType = premiumBusSeatSelectionDataState.c;
                boolean z2 = premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.ChangeSeat;
                StringProvider stringProvider = this.f7752a;
                ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
                if (z2) {
                    int size = ((PremiumBusSeatSelectionFlowType.ChangeSeat) premiumBusSeatSelectionFlowType).e.size();
                    if (i == 1) {
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0 = chaloTextStyleHelper2;
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.label = 1;
                        objB = stringProvider.b(StringEnum.X_SEAT_SELECTED, new Object[]{i + "/" + size}, premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1);
                        if (objB != coroutineSingletons) {
                            chaloTextStyleHelper = chaloTextStyleHelper2;
                            str = (String) objB;
                            return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
                        }
                    } else {
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0 = chaloTextStyleHelper2;
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.label = 2;
                        objB = stringProvider.b(StringEnum.X_SEATS_SELECTED, new Object[]{i + "/" + size}, premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1);
                        if (objB != coroutineSingletons) {
                            chaloTextStyleHelper = chaloTextStyleHelper2;
                            str = (String) objB;
                            return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
                        }
                    }
                } else if ((premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.BulkBooking) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchaseThroughPass) || (premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.Reschedule) || premiumBusSeatSelectionFlowType == null) {
                    if (i == 1) {
                        StringEnum stringEnum = StringEnum.X_SEAT_SELECTED;
                        Object[] objArr = {new Integer(i)};
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0 = chaloTextStyleHelper2;
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.label = 3;
                        objB = stringProvider.b(stringEnum, objArr, premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1);
                        if (objB != coroutineSingletons) {
                            chaloTextStyleHelper = chaloTextStyleHelper2;
                            str = (String) objB;
                            return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
                        }
                    } else {
                        StringEnum stringEnum2 = StringEnum.X_SEATS_SELECTED;
                        Object[] objArr2 = {new Integer(i)};
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0 = chaloTextStyleHelper2;
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.label = 4;
                        objB = stringProvider.b(stringEnum2, objArr2, premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1);
                        if (objB != coroutineSingletons) {
                            chaloTextStyleHelper = chaloTextStyleHelper2;
                            str = (String) objB;
                            return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
                        }
                    }
                } else {
                    if (!(premiumBusSeatSelectionFlowType instanceof PremiumBusSeatSelectionFlowType.FreshPurchase)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (i2 > 1) {
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0 = chaloTextStyleHelper2;
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.label = 5;
                        objB = stringProvider.b(StringEnum.X_SEAT_SELECTED, new Object[]{i + "/" + i2}, premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1);
                        if (objB != coroutineSingletons) {
                            chaloTextStyleHelper = chaloTextStyleHelper2;
                            str = (String) objB;
                            return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
                        }
                    } else if (i == 1) {
                        StringEnum stringEnum3 = StringEnum.X_SEAT_SELECTED;
                        Object[] objArr3 = {new Integer(i)};
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0 = chaloTextStyleHelper2;
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.label = 6;
                        objB = stringProvider.b(stringEnum3, objArr3, premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1);
                        if (objB != coroutineSingletons) {
                            chaloTextStyleHelper = chaloTextStyleHelper2;
                            str = (String) objB;
                            return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
                        }
                    } else {
                        StringEnum stringEnum4 = StringEnum.X_SEATS_SELECTED;
                        Object[] objArr4 = {new Integer(i)};
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0 = chaloTextStyleHelper2;
                        premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.label = 7;
                        objB = stringProvider.b(stringEnum4, objArr4, premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1);
                        if (objB != coroutineSingletons) {
                            chaloTextStyleHelper = chaloTextStyleHelper2;
                            str = (String) objB;
                            return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0;
                ResultKt.b(objB);
                str = (String) objB;
                return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
            case 2:
                chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0;
                ResultKt.b(objB);
                str = (String) objB;
                return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
            case 3:
                chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0;
                ResultKt.b(objB);
                str = (String) objB;
                return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
            case 4:
                chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0;
                ResultKt.b(objB);
                str = (String) objB;
                return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
            case 5:
                chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0;
                ResultKt.b(objB);
                str = (String) objB;
                return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
            case 6:
                chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0;
                ResultKt.b(objB);
                str = (String) objB;
                return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
            case 7:
                chaloTextStyleHelper = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createTotalSeatSelectedTextUIState$1.L$0;
                ResultKt.b(objB);
                str = (String) objB;
                return ChaloTextStyleHelper.g(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, null, null, null, 124);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:105:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:107:0x04be  */
    /* JADX WARN: Code duplicated, block: B:113:0x04cb A[PHI: r33
      0x04cb: PHI (r33v4 boolean) = (r33v1 boolean), (r33v1 boolean), (r33v6 boolean) binds: [B:147:0x0539, B:124:0x04f3, B:112:0x04c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x04cf A[PHI: r33
      0x04cf: PHI (r33v2 boolean) = (r33v1 boolean), (r33v1 boolean), (r33v1 boolean), (r33v1 boolean), (r33v6 boolean) binds: [B:144:0x0532, B:147:0x0539, B:133:0x0503, B:124:0x04f3, B:112:0x04c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:117:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:120:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:126:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:128:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:137:0x050c  */
    /* JADX WARN: Code duplicated, block: B:140:0x051d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0535  */
    /* JADX WARN: Code duplicated, block: B:150:0x054f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0558  */
    /* JADX WARN: Code duplicated, block: B:153:0x055a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0579  */
    /* JADX WARN: Code duplicated, block: B:160:0x0586  */
    /* JADX WARN: Code duplicated, block: B:161:0x058a  */
    /* JADX WARN: Code duplicated, block: B:164:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:169:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:172:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:174:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:177:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:180:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:183:0x060c A[LOOP:0: B:178:0x05f7->B:183:0x060c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x0613  */
    /* JADX WARN: Code duplicated, block: B:191:0x0642  */
    /* JADX WARN: Code duplicated, block: B:193:0x0648  */
    /* JADX WARN: Code duplicated, block: B:196:0x0657  */
    /* JADX WARN: Code duplicated, block: B:199:0x0661  */
    /* JADX WARN: Code duplicated, block: B:203:0x0687  */
    /* JADX WARN: Code duplicated, block: B:206:0x0691  */
    /* JADX WARN: Code duplicated, block: B:212:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x06af  */
    /* JADX WARN: Code duplicated, block: B:216:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:219:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:220:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:222:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:225:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:226:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:227:0x06d9 A[PHI: r18 r33
      0x06d9: PHI (r18v3 app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatLayoutUIState) = 
      (r18v1 app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatLayoutUIState)
      (r18v1 app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatLayoutUIState)
      (r18v5 app.chalo.premiumbus.ui.seatselection.compose.uistate.SeatLayoutUIState)
     binds: [B:272:0x0773, B:273:0x0775, B:226:0x06d5] A[DONT_GENERATE, DONT_INLINE]
      0x06d9: PHI (r33v9 app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderPreferenceNudgeCardUIState) = 
      (r33v7 app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderPreferenceNudgeCardUIState)
      (r33v7 app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderPreferenceNudgeCardUIState)
      (r33v11 app.chalo.premiumbus.ui.seatselection.compose.uistate.GenderPreferenceNudgeCardUIState)
     binds: [B:272:0x0773, B:273:0x0775, B:226:0x06d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:228:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:230:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:243:0x0704  */
    /* JADX WARN: Code duplicated, block: B:245:0x0713  */
    /* JADX WARN: Code duplicated, block: B:249:0x0723  */
    /* JADX WARN: Code duplicated, block: B:252:0x072e  */
    /* JADX WARN: Code duplicated, block: B:255:0x0738  */
    /* JADX WARN: Code duplicated, block: B:262:0x0751  */
    /* JADX WARN: Code duplicated, block: B:265:0x0758  */
    /* JADX WARN: Code duplicated, block: B:267:0x075f  */
    /* JADX WARN: Code duplicated, block: B:271:0x0771  */
    /* JADX WARN: Code duplicated, block: B:273:0x0775 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:280:0x0786  */
    /* JADX WARN: Code duplicated, block: B:286:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:290:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:294:0x0820  */
    /* JADX WARN: Code duplicated, block: B:298:0x085c  */
    /* JADX WARN: Code duplicated, block: B:301:0x0875  */
    /* JADX WARN: Code duplicated, block: B:303:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:304:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:306:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:309:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:312:0x0916  */
    /* JADX WARN: Code duplicated, block: B:316:0x093c  */
    /* JADX WARN: Code duplicated, block: B:318:0x0946  */
    /* JADX WARN: Code duplicated, block: B:321:0x0972  */
    /* JADX WARN: Code duplicated, block: B:323:0x097d  */
    /* JADX WARN: Code duplicated, block: B:325:0x0987  */
    /* JADX WARN: Code duplicated, block: B:328:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:330:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:332:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:335:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:337:0x060f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0642 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0651 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x066b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:? A[LOOP:1: B:197:0x065b->B:341:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x069d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x0716 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x076e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0771 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:? A[LOOP:4: B:266:0x075d->B:350:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x0744 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x072c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0732 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x04c2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0528 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:0x0517 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:65:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x043b  */
    /* JADX WARN: Code duplicated, block: B:88:0x045f  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0488  */
    /* JADX WARN: Code duplicated, block: B:94:0x048c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0491  */
    /* JADX WARN: Code duplicated, block: B:98:0x0498  */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x062e, code lost:
    
        if (r1 == r7) goto L61;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:114:0x04cf, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState r33, kotlin.jvm.functions.Function1 r34, kotlin.jvm.functions.Function1 r35, boolean r36, kotlin.coroutines.jvm.internal.ContinuationImpl r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionUiStateFactory.t(app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0137  */
    /* JADX WARN: Code duplicated, block: B:35:0x017f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object u(Function1 function1, ContinuationImpl continuationImpl) {
        PremiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1 premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1;
        Function1 function2;
        ChaloColorToken.AlmostBlackColor almostBlackColor;
        TextUIState.ChaloTextUIState chaloTextUIState;
        int i;
        ChaloTextStyleHelper chaloTextStyleHelper;
        StringProvider stringProvider;
        Object objB;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        TextUIState.ChaloTextUIState chaloTextUIStateB;
        Object objB2;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        Function1 function3;
        ButtonUIStateFactory buttonUIStateFactory;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ButtonUIState buttonUIStateF;
        Object objB3;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        ButtonUIState buttonUIState;
        Function1 function4;
        if (continuationImpl instanceof PremiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1) {
            premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1 = (PremiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1) continuationImpl;
            int i2 = premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1(this, continuationImpl);
            }
        } else {
            premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1 = new PremiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1(this, continuationImpl);
        }
        Object objB4 = premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.label;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        ChaloColorToken.AlmostBlackColor almostBlackColor2 = ChaloColorToken.AlmostBlackColor.f9756a;
        ChaloTextStyleHelper chaloTextStyleHelper5 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider2 = this.f7752a;
        if (i3 == 0) {
            ResultKt.b(objB4);
            premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$0 = function1;
            premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.label = 1;
            objB4 = stringProvider2.b(StringEnum.WOMENS_RESERVED_SEATS_WILL_BE_AUTO_ASSIGNED, new Object[0], premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1);
            if (objB4 != coroutineSingletons) {
                function2 = function1;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            function2 = (Function1) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$0;
            ResultKt.b(objB4);
        } else {
            if (i3 == 2) {
                ChaloTextStyleHelper chaloTextStyleHelper6 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$1;
                Function1 function5 = (Function1) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$0;
                ResultKt.b(objB4);
                objB = objB4;
                chaloTextUIState = chaloTextUIState4;
                chaloTextStyleHelper = chaloTextStyleHelper5;
                i = 0;
                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                almostBlackColor = almostBlackColor2;
                function2 = function5;
                stringProvider = stringProvider2;
                chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) objB, ChaloColorToken.ShadyGray.f9851a, 0, null, null, null, null, 124);
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$0 = function2;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$1 = chaloTextUIState;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$2 = chaloTextUIStateB;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$3 = buttonUIStateFactory2;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$4 = chaloTextStyleHelper;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.label = 3;
                objB2 = stringProvider.b(StringEnum.AUTO_ASSIGN_MY_SEATS, new Object[i], premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1);
                if (objB2 != coroutineSingletons) {
                    chaloTextStyleHelper3 = chaloTextStyleHelper;
                    function3 = function2;
                    buttonUIStateFactory = buttonUIStateFactory2;
                    chaloTextUIState2 = chaloTextUIStateB;
                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB2, ChaloColorToken.White.f9870a, null, UIFontWeight.Bold, null, null, 108), new ju0(function3, 6), UIShape.e, false, 0.0f, 52);
                    premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$0 = function3;
                    premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$1 = chaloTextUIState;
                    premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$2 = chaloTextUIState2;
                    premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$3 = buttonUIStateF;
                    premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$4 = buttonUIStateFactory2;
                    premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$5 = chaloTextStyleHelper;
                    premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.label = 4;
                    objB3 = stringProvider.b(StringEnum.I_WILL_PICK_MY_SEAT, new Object[i], premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1);
                    if (objB3 != coroutineSingletons) {
                        ChaloTextStyleHelper chaloTextStyleHelper7 = chaloTextStyleHelper;
                        objB4 = objB3;
                        chaloTextUIState3 = chaloTextUIState;
                        chaloTextStyleHelper4 = chaloTextStyleHelper7;
                        buttonUIState = buttonUIStateF;
                        function4 = function3;
                    }
                }
                return coroutineSingletons;
            }
            if (i3 == 3) {
                ChaloTextStyleHelper chaloTextStyleHelper8 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$4;
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$1;
                function3 = (Function1) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$0;
                ResultKt.b(objB4);
                chaloTextStyleHelper3 = chaloTextStyleHelper8;
                buttonUIStateFactory = buttonUIStateFactory3;
                chaloTextUIState2 = chaloTextUIState5;
                chaloTextUIState = chaloTextUIState6;
                i = 0;
                stringProvider = stringProvider2;
                almostBlackColor = almostBlackColor2;
                objB2 = objB4;
                chaloTextStyleHelper = chaloTextStyleHelper5;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB2, ChaloColorToken.White.f9870a, null, UIFontWeight.Bold, null, null, 108), new ju0(function3, 6), UIShape.e, false, 0.0f, 52);
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$0 = function3;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$1 = chaloTextUIState;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$2 = chaloTextUIState2;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$3 = buttonUIStateF;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$4 = buttonUIStateFactory2;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$5 = chaloTextStyleHelper;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.label = 4;
                objB3 = stringProvider.b(StringEnum.I_WILL_PICK_MY_SEAT, new Object[i], premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1);
                if (objB3 != coroutineSingletons) {
                    ChaloTextStyleHelper chaloTextStyleHelper9 = chaloTextStyleHelper;
                    objB4 = objB3;
                    chaloTextUIState3 = chaloTextUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper9;
                    buttonUIState = buttonUIStateF;
                    function4 = function3;
                }
                return coroutineSingletons;
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper10 = (ChaloTextStyleHelper) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$5;
            buttonUIStateFactory2 = (ButtonUIStateFactory) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$4;
            buttonUIState = (ButtonUIState) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$3;
            chaloTextUIState2 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$2;
            TextUIState.ChaloTextUIState chaloTextUIState7 = (TextUIState.ChaloTextUIState) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$1;
            function4 = (Function1) premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$0;
            ResultKt.b(objB4);
            chaloTextUIState3 = chaloTextUIState7;
            almostBlackColor = almostBlackColor2;
            chaloTextStyleHelper4 = chaloTextStyleHelper10;
        }
        return new PremiumBusSeatSelectionBottomSheetUIState.WomenReservedSeatsChoiceBottomSheet(new WomenReservedSeatsChoiceBottomSheetUIState(chaloTextUIState3, chaloTextUIState2, buttonUIState, ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) objB4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108), new ju0(function4, 7), UIShape.e, false, 52)));
        almostBlackColor = almostBlackColor2;
        i = 0;
        chaloTextStyleHelper = chaloTextStyleHelper5;
        chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB4, UITextStyle.DisplaySmall, almostBlackColor, 0, (UITextAlign) null, UIFontWeight.Bold, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992);
        premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$0 = function2;
        premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$1 = chaloTextUIState;
        premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$2 = chaloTextStyleHelper;
        premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.label = 2;
        stringProvider = stringProvider2;
        objB = stringProvider.b(StringEnum.IF_YOU_WANT_TO_PICK_YOUR_OWN_SEAT_WE_CANNOT_GUARANTEE_FEMALE_CO_PASSENGER, new Object[0], premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1);
        if (objB != coroutineSingletons) {
            chaloTextStyleHelper2 = chaloTextStyleHelper;
            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) objB, ChaloColorToken.ShadyGray.f9851a, 0, null, null, null, null, 124);
            premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$0 = function2;
            premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$1 = chaloTextUIState;
            premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$2 = chaloTextUIStateB;
            premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$3 = buttonUIStateFactory2;
            premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$4 = chaloTextStyleHelper;
            premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.label = 3;
            objB2 = stringProvider.b(StringEnum.AUTO_ASSIGN_MY_SEATS, new Object[i], premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1);
            if (objB2 != coroutineSingletons) {
                chaloTextStyleHelper3 = chaloTextStyleHelper;
                function3 = function2;
                buttonUIStateFactory = buttonUIStateFactory2;
                chaloTextUIState2 = chaloTextUIStateB;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper3, (String) objB2, ChaloColorToken.White.f9870a, null, UIFontWeight.Bold, null, null, 108), new ju0(function3, 6), UIShape.e, false, 0.0f, 52);
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$0 = function3;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$1 = chaloTextUIState;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$2 = chaloTextUIState2;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$3 = buttonUIStateF;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$4 = buttonUIStateFactory2;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.L$5 = chaloTextStyleHelper;
                premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1.label = 4;
                objB3 = stringProvider.b(StringEnum.I_WILL_PICK_MY_SEAT, new Object[i], premiumBusSeatSelectionUiStateFactory$createWomenReservedSeatsChoiceBottomSheetUIState$1);
                if (objB3 != coroutineSingletons) {
                    ChaloTextStyleHelper chaloTextStyleHelper11 = chaloTextStyleHelper;
                    objB4 = objB3;
                    chaloTextUIState3 = chaloTextUIState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper11;
                    buttonUIState = buttonUIStateF;
                    function4 = function3;
                    return new PremiumBusSeatSelectionBottomSheetUIState.WomenReservedSeatsChoiceBottomSheet(new WomenReservedSeatsChoiceBottomSheetUIState(chaloTextUIState3, chaloTextUIState2, buttonUIState, ButtonUIStateFactory.d(buttonUIStateFactory2, ChaloTextStyleHelper.g(chaloTextStyleHelper4, (String) objB4, almostBlackColor, null, UIFontWeight.Bold, null, null, 108), new ju0(function4, 7), UIShape.e, false, 52)));
                }
            }
        }
        return coroutineSingletons;
    }
}
