package app.chalo.compose.components.dialogs;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory$createPBSlotSelectionScreenBottomSheetTypeUIState$7;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.AvailabilityStatusLineUIState;
import app.chalo.uistate.dialog.CalendarDateUISpec;
import app.chalo.uistate.dialog.CalendarDateUIState;
import app.chalo.uistate.dialog.CalendarMonthUIState;
import app.chalo.uistate.dialog.DateAvailabilityStatus;
import app.chalo.uistate.dialog.DateDataState;
import app.chalo.uistate.dialog.DatesLoadingUIState;
import app.chalo.uistate.dialog.DotUIState;
import app.chalo.uistate.dialog.LegendItemDataState;
import app.chalo.uistate.dialog.LegendUIState;
import app.chalo.uistate.dialog.MultiSelectDatePickerConfig;
import app.chalo.uistate.dialog.MultiSelectDatePickerEventHandler;
import app.chalo.uistate.dialog.MultiSelectDatePickerUIState;
import app.chalo.uistate.dialog.MultiSelectDatePickerUIStateKt;
import app.chalo.uistate.dialog.MultiSelectionCalendarDataState;
import app.chalo.uistate.dialog.WeekDayHeaderUIState;
import app.chalo.uistate.dialog.WeekDayNameDisplayStyle;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import defpackage.c41;
import defpackage.m;
import defpackage.p80;
import defpackage.wb;
import defpackage.wi0;
import defpackage.zf0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlinx.datetime.DatePeriod;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.datetime.DayOfWeek;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateJvmKt;
import kotlinx.datetime.LocalDateKt;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.Month;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/dialogs/MultiSelectDatePickerUIStateFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiSelectDatePickerUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f1894a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1895a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[DayOfWeek.values().length];
            try {
                iArr[DayOfWeek.SUNDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayOfWeek.MONDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DayOfWeek.TUESDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DayOfWeek.WEDNESDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DayOfWeek.THURSDAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DayOfWeek.FRIDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DayOfWeek.SATURDAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f1895a = iArr;
            int[] iArr2 = new int[WeekDayNameDisplayStyle.values().length];
            try {
                iArr2[WeekDayNameDisplayStyle.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[WeekDayNameDisplayStyle.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[WeekDayNameDisplayStyle.SINGLE_LETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
        }
    }

    public MultiSelectDatePickerUIStateFactory(StringProvider stringProvider) {
        this.f1894a = stringProvider;
    }

    public static ArrayList c(WeekDayNameDisplayStyle weekDayNameDisplayStyle) {
        String str;
        String str2;
        List<DayOfWeek> listS = CollectionsKt.S(DayOfWeek.SUNDAY, DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY);
        ArrayList arrayList = new ArrayList(CollectionsKt.v(listS, 10));
        for (DayOfWeek dayOfWeek : listS) {
            int i = WhenMappings.b[weekDayNameDisplayStyle.ordinal()];
            if (i == 1) {
                switch (WhenMappings.f1895a[dayOfWeek.ordinal()]) {
                    case 1:
                        str = "Sunday";
                        break;
                    case 2:
                        str = "Monday";
                        break;
                    case 3:
                        str = "Tuesday";
                        break;
                    case 4:
                        str = "Wednesday";
                        break;
                    case 5:
                        str = "Thursday";
                        break;
                    case 6:
                        str = "Friday";
                        break;
                    case 7:
                        str = "Saturday";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else if (i == 2) {
                switch (WhenMappings.f1895a[dayOfWeek.ordinal()]) {
                    case 1:
                        str = "Sun";
                        break;
                    case 2:
                        str = "Mon";
                        break;
                    case 3:
                        str = "Tue";
                        break;
                    case 4:
                        str = "Wed";
                        break;
                    case 5:
                        str = "Thu";
                        break;
                    case 6:
                        str = "Fri";
                        break;
                    case 7:
                        str = "Sat";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "T";
                switch (WhenMappings.f1895a[dayOfWeek.ordinal()]) {
                    case 1:
                    case 7:
                        str2 = ExifInterface.LATITUDE_SOUTH;
                        continue;
                        arrayList.add(ChaloTextStyleHelper.b(ChaloTextStyleHelper.f10078a, str2, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, null, null, null, 124));
                        break;
                    case 2:
                        str = "M";
                        break;
                    case 3:
                    case 5:
                        break;
                    case 4:
                        str = ExifInterface.LONGITUDE_WEST;
                        break;
                    case 6:
                        str = "F";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            str2 = str;
            arrayList.add(ChaloTextStyleHelper.b(ChaloTextStyleHelper.f10078a, str2, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, null, null, null, 124));
        }
        return arrayList;
    }

    public static LocalDate d(LocalDate localDate) {
        DayOfWeek dayOfWeekE = localDate.e();
        if (dayOfWeekE == DayOfWeek.SUNDAY) {
            return localDate;
        }
        DatePeriod datePeriod = new DatePeriod(MultiSelectDatePickerUIStateKt.b(dayOfWeekE), 3);
        int i = datePeriod.b;
        if (i != Integer.MIN_VALUE && datePeriod.d() != Integer.MIN_VALUE) {
            return LocalDateJvmKt.b(localDate, new DatePeriod(-datePeriod.i(), -datePeriod.d(), -i));
        }
        int i2 = datePeriod.i();
        DateTimeUnit.INSTANCE.getClass();
        return LocalDateKt.b(LocalDateKt.b(LocalDateKt.b(localDate, i2, DateTimeUnit.c), datePeriod.d(), DateTimeUnit.b), i, DateTimeUnit.f17929a);
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0591 A[LOOP:0: B:150:0x058b->B:152:0x0591, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:156:0x05be  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(String str, String str2, WeekDayNameDisplayStyle weekDayNameDisplayStyle, MultiSelectionCalendarDataState multiSelectionCalendarDataState, SlotSelectionScreenUiStateFactory$createPBSlotSelectionScreenBottomSheetTypeUIState$7 slotSelectionScreenUiStateFactory$createPBSlotSelectionScreenBottomSheetTypeUIState$7, ContinuationImpl continuationImpl) {
        MultiSelectDatePickerUIStateFactory$build$1 multiSelectDatePickerUIStateFactory$build$1;
        TextUIState.ChaloTextUIState chaloTextUIStateE;
        TextUIState.ChaloTextUIState chaloTextUIStateB;
        ImageUIState imageUIState;
        WeekDayNameDisplayStyle weekDayNameDisplayStyle2;
        MultiSelectionCalendarDataState multiSelectionCalendarDataState2;
        ButtonUIStateFactory buttonUIStateFactory;
        StringProvider stringProvider;
        CoroutineSingletons coroutineSingletons;
        TextUIState.ChaloTextUIState chaloTextUIState;
        List list;
        ButtonUIStateFactory buttonUIStateFactory2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        DateAvailabilityStatus availabilityStatus;
        wi0 wi0Var;
        Month month;
        ChaloColorToken chaloColorToken;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        CalendarDateUIState calendarDateUIState;
        boolean z;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        final MultiSelectDatePickerEventHandler multiSelectDatePickerEventHandler;
        ButtonUIState buttonUIState;
        ImageUIState imageUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        List list2;
        WeekDayNameDisplayStyle weekDayNameDisplayStyle3;
        ButtonUIStateFactory buttonUIStateFactory3;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ArrayList arrayList;
        ArrayList arrayList2;
        final MultiSelectDatePickerEventHandler multiSelectDatePickerEventHandler2 = slotSelectionScreenUiStateFactory$createPBSlotSelectionScreenBottomSheetTypeUIState$7;
        if (continuationImpl instanceof MultiSelectDatePickerUIStateFactory$build$1) {
            multiSelectDatePickerUIStateFactory$build$1 = (MultiSelectDatePickerUIStateFactory$build$1) continuationImpl;
            int i = multiSelectDatePickerUIStateFactory$build$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiSelectDatePickerUIStateFactory$build$1.label = i - Integer.MIN_VALUE;
            } else {
                multiSelectDatePickerUIStateFactory$build$1 = new MultiSelectDatePickerUIStateFactory$build$1(this, continuationImpl);
            }
        } else {
            multiSelectDatePickerUIStateFactory$build$1 = new MultiSelectDatePickerUIStateFactory$build$1(this, continuationImpl);
        }
        Object obj = multiSelectDatePickerUIStateFactory$build$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiSelectDatePickerUIStateFactory$build$1.label;
        StringProvider stringProvider2 = this.f1894a;
        ButtonUIStateFactory buttonUIStateFactory4 = ButtonUIStateFactory.f9921a;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        ChaloTextStyleHelper chaloTextStyleHelper4 = ChaloTextStyleHelper.f10078a;
        if (i2 != 0) {
            if (i2 == 1) {
                ButtonUIStateFactory buttonUIStateFactory5 = (ButtonUIStateFactory) multiSelectDatePickerUIStateFactory$build$1.L$7;
                ImageUIState imageUIState3 = (ImageUIState) multiSelectDatePickerUIStateFactory$build$1.L$6;
                chaloTextUIState = (TextUIState.ChaloTextUIState) multiSelectDatePickerUIStateFactory$build$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) multiSelectDatePickerUIStateFactory$build$1.L$4;
                List list3 = (List) multiSelectDatePickerUIStateFactory$build$1.L$3;
                MultiSelectDatePickerEventHandler multiSelectDatePickerEventHandler3 = (MultiSelectDatePickerEventHandler) multiSelectDatePickerUIStateFactory$build$1.L$2;
                multiSelectionCalendarDataState2 = (MultiSelectionCalendarDataState) multiSelectDatePickerUIStateFactory$build$1.L$1;
                weekDayNameDisplayStyle2 = (WeekDayNameDisplayStyle) multiSelectDatePickerUIStateFactory$build$1.L$0;
                ResultKt.b(obj);
                imageUIState = imageUIState3;
                multiSelectDatePickerEventHandler2 = multiSelectDatePickerEventHandler3;
                buttonUIStateFactory = buttonUIStateFactory4;
                list = list3;
                coroutineSingletons = coroutineSingletons2;
                buttonUIStateFactory2 = buttonUIStateFactory5;
                chaloTextUIStateE = chaloTextUIState4;
                stringProvider = stringProvider2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                buttonUIStateFactory3 = (ButtonUIStateFactory) multiSelectDatePickerUIStateFactory$build$1.L$8;
                ButtonUIState buttonUIState2 = (ButtonUIState) multiSelectDatePickerUIStateFactory$build$1.L$7;
                ImageUIState imageUIState4 = (ImageUIState) multiSelectDatePickerUIStateFactory$build$1.L$6;
                TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) multiSelectDatePickerUIStateFactory$build$1.L$5;
                TextUIState.ChaloTextUIState chaloTextUIState6 = (TextUIState.ChaloTextUIState) multiSelectDatePickerUIStateFactory$build$1.L$4;
                List list4 = (List) multiSelectDatePickerUIStateFactory$build$1.L$3;
                multiSelectDatePickerEventHandler = (MultiSelectDatePickerEventHandler) multiSelectDatePickerUIStateFactory$build$1.L$2;
                multiSelectionCalendarDataState2 = (MultiSelectionCalendarDataState) multiSelectDatePickerUIStateFactory$build$1.L$1;
                weekDayNameDisplayStyle3 = (WeekDayNameDisplayStyle) multiSelectDatePickerUIStateFactory$build$1.L$0;
                ResultKt.b(obj);
                buttonUIState = buttonUIState2;
                imageUIState2 = imageUIState4;
                chaloTextUIState2 = chaloTextUIState5;
                chaloTextUIState3 = chaloTextUIState6;
                list2 = list4;
                chaloTextStyleHelper3 = chaloTextStyleHelper4;
            }
            final int i3 = 1;
            ButtonUIState buttonUIStateB = ButtonUIStateFactory.b(buttonUIStateFactory3, (String) obj, new Function0() { // from class: hk0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            multiSelectDatePickerEventHandler.a();
                            break;
                        default:
                            multiSelectDatePickerEventHandler.a();
                            break;
                    }
                    return Unit.f17538a;
                }
            }, UIShape.e, false, 52);
            List<LegendItemDataState> list5 = multiSelectionCalendarDataState2.e;
            arrayList = new ArrayList(CollectionsKt.v(list5, 10));
            for (LegendItemDataState legendItemDataState : list5) {
                ChaloTextStyleHelper chaloTextStyleHelper5 = chaloTextStyleHelper3;
                arrayList.add(new LegendUIState(legendItemDataState.f10003a, ChaloTextStyleHelper.c(chaloTextStyleHelper5, legendItemDataState.b, shadyGray, null, null, null, null, 124)));
                chaloTextStyleHelper3 = chaloTextStyleHelper5;
            }
            if (arrayList.isEmpty()) {
                arrayList2 = null;
            } else {
                arrayList2 = arrayList;
            }
            return new MultiSelectDatePickerUIState(chaloTextUIState3, chaloTextUIState2, list2, arrayList2, imageUIState2, buttonUIState, buttonUIStateB, null, new WeekDayHeaderUIState(c(weekDayNameDisplayStyle3)), 896);
        }
        ResultKt.b(obj);
        MultiSelectDatePickerConfig multiSelectDatePickerConfig = multiSelectionCalendarDataState.b;
        LocalDate localDateA = multiSelectionCalendarDataState.c.a();
        LocalDate localDateD = d(localDateA);
        LocalDate localDateB = (LocalDate) CollectionsKt.U(multiSelectDatePickerConfig.f10007a);
        if (localDateB == null) {
            localDateB = localDateA;
        }
        DayOfWeek dayOfWeekE = localDateB.e();
        if (dayOfWeekE != DayOfWeek.SATURDAY) {
            localDateB = LocalDateJvmKt.b(localDateB, new DatePeriod(6 - MultiSelectDatePickerUIStateKt.b(dayOfWeekE), 3));
        }
        List list6 = multiSelectionCalendarDataState.f10011a;
        int iG = MapsKt.g(CollectionsKt.v(list6, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (Object obj2 : list6) {
            linkedHashMap.put(((DateDataState) obj2).f9976a.a(), obj2);
        }
        LocalDate localDateA2 = multiSelectionCalendarDataState.d.a();
        wi0 wi0Var2 = new wi0(multiSelectDatePickerEventHandler2, 11);
        ArrayList arrayList3 = new ArrayList();
        Month monthG = localDateD.g();
        int iJ = localDateD.j();
        ArrayList arrayList4 = arrayList3;
        Month monthG2 = monthG;
        ChaloTextStyleHelper chaloTextStyleHelper6 = chaloTextStyleHelper4;
        LocalDate localDate = localDateD;
        while (true) {
            int iCompareTo = localDate.compareTo(localDateB);
            ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
            if (iCompareTo > 0) {
                CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                StringProvider stringProvider3 = stringProvider2;
                ButtonUIStateFactory buttonUIStateFactory6 = buttonUIStateFactory4;
                chaloTextStyleHelper4 = chaloTextStyleHelper6;
                ArrayList arrayList5 = arrayList4;
                chaloTextUIStateE = str != null ? ChaloTextStyleHelper.e(chaloTextStyleHelper4, str, ChaloColorToken.Black.f9759a, null, UIFontWeight.Bold, null, 108) : null;
                if (str2 != null) {
                    shadyGray = shadyGray;
                    chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper4, str2, shadyGray, 0, null, null, null, null, 124);
                    chaloTextStyleHelper4 = chaloTextStyleHelper4;
                } else {
                    shadyGray = shadyGray;
                    chaloTextUIStateB = null;
                }
                final int i4 = 0;
                imageUIState = new ImageUIState(IconType.IC_CLOSE, "", almostBlackColor, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new Function0() { // from class: hk0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                multiSelectDatePickerEventHandler2.a();
                                break;
                            default:
                                multiSelectDatePickerEventHandler2.a();
                                break;
                        }
                        return Unit.f17538a;
                    }
                }), 112);
                weekDayNameDisplayStyle2 = weekDayNameDisplayStyle;
                multiSelectDatePickerUIStateFactory$build$1.L$0 = weekDayNameDisplayStyle2;
                multiSelectionCalendarDataState2 = multiSelectionCalendarDataState;
                multiSelectDatePickerUIStateFactory$build$1.L$1 = multiSelectionCalendarDataState2;
                multiSelectDatePickerUIStateFactory$build$1.L$2 = multiSelectDatePickerEventHandler2;
                multiSelectDatePickerUIStateFactory$build$1.L$3 = arrayList5;
                multiSelectDatePickerUIStateFactory$build$1.L$4 = chaloTextUIStateE;
                multiSelectDatePickerUIStateFactory$build$1.L$5 = chaloTextUIStateB;
                multiSelectDatePickerUIStateFactory$build$1.L$6 = imageUIState;
                buttonUIStateFactory = buttonUIStateFactory6;
                multiSelectDatePickerUIStateFactory$build$1.L$7 = buttonUIStateFactory;
                multiSelectDatePickerUIStateFactory$build$1.label = 1;
                stringProvider = stringProvider3;
                Object objB = stringProvider.b(StringEnum.SELECT_DATES, new Object[0], multiSelectDatePickerUIStateFactory$build$1);
                coroutineSingletons = coroutineSingletons3;
                if (objB != coroutineSingletons) {
                    chaloTextUIState = chaloTextUIStateB;
                    obj = objB;
                    list = arrayList5;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                }
                return coroutineSingletons;
            }
            ArrayList arrayList6 = new ArrayList();
            LocalDate localDate2 = new LocalDate(iJ, monthG2);
            LocalDate localDate3 = new LocalDate(iJ, monthG2);
            DateTimeUnit.INSTANCE.getClass();
            wi0 wi0Var3 = wi0Var2;
            DateTimeUnit.MonthBased unit = DateTimeUnit.b;
            Intrinsics.i(unit, "unit");
            StringProvider stringProvider4 = stringProvider2;
            ButtonUIStateFactory buttonUIStateFactory7 = buttonUIStateFactory4;
            int i5 = 1;
            LocalDate localDateB2 = LocalDateKt.b(LocalDateJvmKt.a(localDate3, 1, unit), 1, DateTimeUnit.f17929a);
            LocalDate localDateD2 = d(localDate2);
            while (localDateD2.compareTo(localDateB2) <= 0) {
                LocalDate localDate4 = localDateB2;
                IntRange intRange = new IntRange(0, 6, i5);
                ArrayList arrayList7 = new ArrayList(CollectionsKt.v(intRange, 10));
                Iterator<Integer> it = intRange.iterator();
                while (((IntProgressionIterator) it).c) {
                    LocalDate localDateB3 = LocalDateJvmKt.b(localDateD2, new DatePeriod(((IntIterator) it).nextInt(), 3));
                    if (localDateB3.compareTo(localDateD) >= 0 && localDateB3.compareTo(localDateB) <= 0 && localDateB3.g() == monthG2) {
                        DateDataState dateDataState = (DateDataState) linkedHashMap.get(localDateB3);
                        if (dateDataState == null || (availabilityStatus = dateDataState.c) == null) {
                            availabilityStatus = DateAvailabilityStatus.UNKNOWN;
                        }
                        boolean z2 = dateDataState != null ? dateDataState.b : false;
                        boolean z3 = dateDataState == null || localDateB3.compareTo(localDateA) < 0 || !(dateDataState != null ? dateDataState.d : false);
                        LocalDateTime localDateTime = dateDataState != null ? dateDataState.f9976a : null;
                        boolean zEquals = localDateB3.equals(localDateA2);
                        if (localDateTime == null) {
                            localDateTime = new LocalDateTime(localDateB3.j(), localDateB3.g(), localDateB3.b(), 0, 0, 0);
                        }
                        String strValueOf = String.valueOf(localDateB3.b());
                        ChaloColorToken chaloColorToken2 = ChaloColorToken.LightGray.f9814a;
                        ChaloColorToken chaloColorToken3 = (!z2 && z3) ? chaloColorToken2 : almostBlackColor;
                        LocalDateTime localDateTime2 = localDateTime;
                        ChaloTextStyleHelper chaloTextStyleHelper7 = chaloTextStyleHelper6;
                        boolean z4 = z3;
                        wi0Var = wi0Var3;
                        month = monthG2;
                        TextUIState.ChaloTextUIState chaloTextUIStateB2 = ChaloTextStyleHelper.b(chaloTextStyleHelper7, strValueOf, chaloColorToken3, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                        DotUIState dotUIState = zEquals ? new DotUIState(ChaloThemeHelper.a().d, ChaloThemeHelper.d.f, new ChaloPadding(0.0f, 0.0f, 0.0f, ChaloThemeHelper.a().e, 7)) : null;
                        Intrinsics.i(availabilityStatus, "availabilityStatus");
                        int i6 = MultiSelectDatePickerUIStateKt.WhenMappings.f10010a[availabilityStatus.ordinal()];
                        ChaloColorToken chaloColorToken4 = ChaloColorToken.Transparent.f9864a;
                        switch (i6) {
                            case 1:
                                chaloColorToken = ChaloColorToken.Orange3.f9831a;
                                break;
                            case 2:
                                chaloColorToken = ChaloColorToken.GreyishBlue.f9808a;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                chaloColorToken = chaloColorToken4;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        AvailabilityStatusLineUIState availabilityStatusLineUIState = new AvailabilityStatusLineUIState(chaloColorToken);
                        ChaloColorToken chaloColorToken5 = z2 ? ChaloColorToken.OrangeBackground.f9832a : ChaloColorToken.White.f9870a;
                        ChaloColorToken chaloColorToken6 = (!z2 && z4) ? chaloColorToken2 : almostBlackColor;
                        chaloTextStyleHelper2 = chaloTextStyleHelper7;
                        float f = ChaloThemeHelper.a().b;
                        if (z2) {
                            chaloColorToken2 = ChaloColorToken.OrangePrimary.f9835a;
                        } else {
                            if (!z4) {
                            }
                            calendarDateUIState = new CalendarDateUIState(chaloTextUIStateB2, dotUIState, availabilityStatusLineUIState, new CalendarDateUISpec(chaloColorToken5, chaloColorToken6, new BorderUISpec(f, chaloColorToken4, UIShape.c)), UiEventHandler.Companion.a(new zf0(7, wi0Var, localDateTime2)));
                        }
                        chaloColorToken4 = chaloColorToken2;
                        calendarDateUIState = new CalendarDateUIState(chaloTextUIStateB2, dotUIState, availabilityStatusLineUIState, new CalendarDateUISpec(chaloColorToken5, chaloColorToken6, new BorderUISpec(f, chaloColorToken4, UIShape.c)), UiEventHandler.Companion.a(new zf0(7, wi0Var, localDateTime2)));
                    } else {
                        chaloTextStyleHelper2 = chaloTextStyleHelper6;
                        calendarDateUIState = null;
                        wi0Var = wi0Var3;
                        month = monthG2;
                    }
                    arrayList7.add(calendarDateUIState);
                    chaloTextStyleHelper6 = chaloTextStyleHelper2;
                    linkedHashMap = linkedHashMap;
                    monthG2 = month;
                    localDateA2 = localDateA2;
                    coroutineSingletons2 = coroutineSingletons2;
                    wi0Var3 = wi0Var;
                    arrayList4 = arrayList4;
                    localDateA = localDateA;
                    localDateB = localDateB;
                    arrayList6 = arrayList6;
                    localDateD = localDateD;
                }
                LocalDate localDate5 = localDateB;
                CoroutineSingletons coroutineSingletons4 = coroutineSingletons2;
                LocalDate localDate6 = localDateD;
                LocalDate localDate7 = localDateA2;
                ChaloTextStyleHelper chaloTextStyleHelper8 = chaloTextStyleHelper6;
                ArrayList arrayList8 = arrayList6;
                wi0 wi0Var4 = wi0Var3;
                LocalDate localDate8 = localDateA;
                Month month2 = monthG2;
                ArrayList arrayList9 = arrayList4;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                if (!arrayList7.isEmpty()) {
                    int size = arrayList7.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj3 = arrayList7.get(i7);
                        i7++;
                        if (((CalendarDateUIState) obj3) != null) {
                            arrayList8.add(arrayList7);
                            break;
                        }
                    }
                }
                localDateD2 = LocalDateJvmKt.b(localDateD2, new DatePeriod(7, 3));
                chaloTextStyleHelper6 = chaloTextStyleHelper8;
                linkedHashMap = linkedHashMap2;
                localDateB2 = localDate4;
                monthG2 = month2;
                localDateA2 = localDate7;
                coroutineSingletons2 = coroutineSingletons4;
                i5 = 1;
                wi0Var3 = wi0Var4;
                arrayList4 = arrayList9;
                localDateA = localDate8;
                localDateB = localDate5;
                arrayList6 = arrayList8;
                localDateD = localDate6;
            }
            LocalDate localDate9 = localDateB;
            CoroutineSingletons coroutineSingletons5 = coroutineSingletons2;
            LocalDate localDate10 = localDateD;
            LocalDate localDate11 = localDateA2;
            ChaloTextStyleHelper chaloTextStyleHelper9 = chaloTextStyleHelper6;
            ArrayList arrayList10 = arrayList6;
            wi0 wi0Var5 = wi0Var3;
            LocalDate localDate12 = localDateA;
            Month month3 = monthG2;
            ArrayList arrayList11 = arrayList4;
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            if (arrayList10.isEmpty()) {
                chaloTextStyleHelper = chaloTextStyleHelper9;
            } else {
                String strName = month3.name();
                Locale locale = Locale.ROOT;
                String lowerCase = strName.toLowerCase(locale);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                if (lowerCase.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    String strValueOf2 = String.valueOf(lowerCase.charAt(0));
                    Intrinsics.g(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = strValueOf2.toUpperCase(locale);
                    Intrinsics.h(upperCase, "toUpperCase(...)");
                    sb.append((Object) upperCase);
                    String strSubstring = lowerCase.substring(1);
                    Intrinsics.h(strSubstring, "substring(...)");
                    sb.append(strSubstring);
                    lowerCase = sb.toString();
                }
                chaloTextStyleHelper = chaloTextStyleHelper9;
                arrayList11.add(new CalendarMonthUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper, lowerCase, almostBlackColor, null, null, null, null, 124), arrayList10));
            }
            LocalDate localDateB4 = LocalDateJvmKt.b(new LocalDate(iJ, month3), new DatePeriod(0, 5));
            monthG2 = localDateB4.g();
            iJ = localDateB4.j();
            wi0Var2 = wi0Var5;
            chaloTextStyleHelper6 = chaloTextStyleHelper;
            linkedHashMap = linkedHashMap3;
            localDateB = localDate9;
            stringProvider2 = stringProvider4;
            buttonUIStateFactory4 = buttonUIStateFactory7;
            localDateD = localDate10;
            localDateA2 = localDate11;
            coroutineSingletons2 = coroutineSingletons5;
            localDate = localDateB4;
            arrayList4 = arrayList11;
            localDateA = localDate12;
        }
        String str3 = (String) obj;
        UIShape.Rectangle rectangle = UIShape.e;
        List list7 = multiSelectionCalendarDataState2.f10011a;
        if ((list7 instanceof Collection) && list7.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = list7.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                } else if (((DateDataState) it2.next()).b) {
                    z = true;
                }
            }
        }
        chaloTextStyleHelper3 = chaloTextStyleHelper4;
        ButtonUIState buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory2, str3, new m(20, multiSelectDatePickerEventHandler2, this, multiSelectionCalendarDataState2), null, rectangle, z, 0.0f, 36);
        multiSelectDatePickerUIStateFactory$build$1.L$0 = weekDayNameDisplayStyle2;
        multiSelectDatePickerUIStateFactory$build$1.L$1 = multiSelectionCalendarDataState2;
        multiSelectDatePickerUIStateFactory$build$1.L$2 = multiSelectDatePickerEventHandler2;
        multiSelectDatePickerUIStateFactory$build$1.L$3 = list;
        multiSelectDatePickerUIStateFactory$build$1.L$4 = chaloTextUIStateE;
        multiSelectDatePickerUIStateFactory$build$1.L$5 = chaloTextUIState;
        multiSelectDatePickerUIStateFactory$build$1.L$6 = imageUIState;
        multiSelectDatePickerUIStateFactory$build$1.L$7 = buttonUIStateG;
        multiSelectDatePickerUIStateFactory$build$1.L$8 = buttonUIStateFactory;
        TextUIState.ChaloTextUIState chaloTextUIState7 = chaloTextUIStateE;
        multiSelectDatePickerUIStateFactory$build$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.CLOSE, new Object[0], multiSelectDatePickerUIStateFactory$build$1);
        if (objB2 != coroutineSingletons) {
            multiSelectDatePickerEventHandler = multiSelectDatePickerEventHandler2;
            buttonUIState = buttonUIStateG;
            imageUIState2 = imageUIState;
            chaloTextUIState2 = chaloTextUIState;
            list2 = list;
            weekDayNameDisplayStyle3 = weekDayNameDisplayStyle2;
            buttonUIStateFactory3 = buttonUIStateFactory;
            chaloTextUIState3 = chaloTextUIState7;
            obj = objB2;
            final int i8 = 1;
            ButtonUIState buttonUIStateB2 = ButtonUIStateFactory.b(buttonUIStateFactory3, (String) obj, new Function0() { // from class: hk0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i8) {
                        case 0:
                            multiSelectDatePickerEventHandler.a();
                            break;
                        default:
                            multiSelectDatePickerEventHandler.a();
                            break;
                    }
                    return Unit.f17538a;
                }
            }, UIShape.e, false, 52);
            List<LegendItemDataState> list8 = multiSelectionCalendarDataState2.e;
            arrayList = new ArrayList(CollectionsKt.v(list8, 10));
            while (r0.hasNext()) {
                ChaloTextStyleHelper chaloTextStyleHelper10 = chaloTextStyleHelper3;
                arrayList.add(new LegendUIState(legendItemDataState.f10003a, ChaloTextStyleHelper.c(chaloTextStyleHelper10, legendItemDataState.b, shadyGray, null, null, null, null, 124)));
                chaloTextStyleHelper3 = chaloTextStyleHelper10;
            }
            if (arrayList.isEmpty()) {
                arrayList2 = arrayList;
            } else {
                arrayList2 = null;
            }
            return new MultiSelectDatePickerUIState(chaloTextUIState3, chaloTextUIState2, list2, arrayList2, imageUIState2, buttonUIState, buttonUIStateB2, null, new WeekDayHeaderUIState(c(weekDayNameDisplayStyle3)), 896);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(String str, String str2, WeekDayNameDisplayStyle weekDayNameDisplayStyle, c41 c41Var, ContinuationImpl continuationImpl) {
        MultiSelectDatePickerUIStateFactory$buildLoadingState$1 multiSelectDatePickerUIStateFactory$buildLoadingState$1;
        TextUIState.ChaloTextUIState chaloTextUIStateE;
        WeekDayNameDisplayStyle weekDayNameDisplayStyle2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ButtonUIStateFactory buttonUIStateFactory;
        ImageUIState imageUIState;
        ButtonUIState buttonUIState;
        ImageUIState imageUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        WeekDayNameDisplayStyle weekDayNameDisplayStyle3;
        if (continuationImpl instanceof MultiSelectDatePickerUIStateFactory$buildLoadingState$1) {
            multiSelectDatePickerUIStateFactory$buildLoadingState$1 = (MultiSelectDatePickerUIStateFactory$buildLoadingState$1) continuationImpl;
            int i = multiSelectDatePickerUIStateFactory$buildLoadingState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiSelectDatePickerUIStateFactory$buildLoadingState$1.label = i - Integer.MIN_VALUE;
            } else {
                multiSelectDatePickerUIStateFactory$buildLoadingState$1 = new MultiSelectDatePickerUIStateFactory$buildLoadingState$1(this, continuationImpl);
            }
        } else {
            multiSelectDatePickerUIStateFactory$buildLoadingState$1 = new MultiSelectDatePickerUIStateFactory$buildLoadingState$1(this, continuationImpl);
        }
        Object obj = multiSelectDatePickerUIStateFactory$buildLoadingState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiSelectDatePickerUIStateFactory$buildLoadingState$1.label;
        StringProvider stringProvider = this.f1894a;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        if (i2 != 0) {
            if (i2 == 1) {
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$4;
                ImageUIState imageUIState3 = (ImageUIState) multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$3;
                chaloTextUIState = (TextUIState.ChaloTextUIState) multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$2;
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$1;
                weekDayNameDisplayStyle2 = (WeekDayNameDisplayStyle) multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$0;
                ResultKt.b(obj);
                buttonUIStateFactory = buttonUIStateFactory3;
                imageUIState = imageUIState3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                buttonUIStateFactory2 = (ButtonUIStateFactory) multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$5;
                ButtonUIState buttonUIState2 = (ButtonUIState) multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$4;
                ImageUIState imageUIState4 = (ImageUIState) multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$3;
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState5 = (TextUIState.ChaloTextUIState) multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$1;
                weekDayNameDisplayStyle3 = (WeekDayNameDisplayStyle) multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$0;
                ResultKt.b(obj);
                buttonUIState = buttonUIState2;
                imageUIState2 = imageUIState4;
                chaloTextUIState4 = chaloTextUIState5;
            }
            return new MultiSelectDatePickerUIState(chaloTextUIState4, chaloTextUIState3, null, null, imageUIState2, buttonUIState, ButtonUIStateFactory.b(buttonUIStateFactory2, (String) obj, new wb(8), UIShape.e, false, 36), new DatesLoadingUIState(), new WeekDayHeaderUIState(c(weekDayNameDisplayStyle3)), 768);
        }
        ResultKt.b(obj);
        ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
        if (str != null) {
            chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, str, ChaloColorToken.Black.f9759a, null, UIFontWeight.Bold, null, 108);
        } else {
            chaloTextUIStateE = null;
        }
        ChaloColorToken.AlmostBlackColor almostBlackColor = ChaloColorToken.AlmostBlackColor.f9756a;
        TextUIState.ChaloTextUIState chaloTextUIStateB = str2 != null ? ChaloTextStyleHelper.b(chaloTextStyleHelper, str2, almostBlackColor, 0, null, null, null, null, 124) : null;
        ImageUIState imageUIState5 = new ImageUIState(IconType.IC_CLOSE, "Cancel Icon", almostBlackColor, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new p80(c41Var, 10)), 112);
        weekDayNameDisplayStyle2 = weekDayNameDisplayStyle;
        multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$0 = weekDayNameDisplayStyle2;
        multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$1 = chaloTextUIStateE;
        multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$2 = chaloTextUIStateB;
        multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$3 = imageUIState5;
        multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$4 = buttonUIStateFactory2;
        multiSelectDatePickerUIStateFactory$buildLoadingState$1.label = 1;
        Object objB = stringProvider.b(StringEnum.SELECT_DATES, new Object[0], multiSelectDatePickerUIStateFactory$buildLoadingState$1);
        if (objB != coroutineSingletons) {
            chaloTextUIState = chaloTextUIStateB;
            chaloTextUIState2 = chaloTextUIStateE;
            buttonUIStateFactory = buttonUIStateFactory2;
            obj = objB;
            imageUIState = imageUIState5;
        }
        return coroutineSingletons;
        ButtonUIState buttonUIStateG = ButtonUIStateFactory.g(buttonUIStateFactory, (String) obj, new wb(8), null, UIShape.e, false, 0.0f, 36);
        multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$0 = weekDayNameDisplayStyle2;
        multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$1 = chaloTextUIState2;
        multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$2 = chaloTextUIState;
        multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$3 = imageUIState;
        multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$4 = buttonUIStateG;
        multiSelectDatePickerUIStateFactory$buildLoadingState$1.L$5 = buttonUIStateFactory2;
        multiSelectDatePickerUIStateFactory$buildLoadingState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.CLOSE, new Object[0], multiSelectDatePickerUIStateFactory$buildLoadingState$1);
        if (objB2 != coroutineSingletons) {
            buttonUIState = buttonUIStateG;
            obj = objB2;
            imageUIState2 = imageUIState;
            chaloTextUIState3 = chaloTextUIState;
            chaloTextUIState4 = chaloTextUIState2;
            weekDayNameDisplayStyle3 = weekDayNameDisplayStyle2;
            return new MultiSelectDatePickerUIState(chaloTextUIState4, chaloTextUIState3, null, null, imageUIState2, buttonUIState, ButtonUIStateFactory.b(buttonUIStateFactory2, (String) obj, new wb(8), UIShape.e, false, 36), new DatesLoadingUIState(), new WeekDayHeaderUIState(c(weekDayNameDisplayStyle3)), 768);
        }
        return coroutineSingletons;
    }
}
