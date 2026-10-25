package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBModeToReachStopType;
import app.chalo.premiumbus.data.models.app.PremiumBusSlotStatusType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.cb0;
import defpackage.da1;
import defpackage.o01;
import defpackage.py;
import defpackage.r30;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/SlotSelectionScreenUiStateFactory;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SlotSelectionScreenUiStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f7899a;
    public final TimeUtilsContract b;
    public final FormatTimeInMillisToGivenFormatUseCase c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7900a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PremiumBusSlotStatusType.values().length];
            try {
                iArr[PremiumBusSlotStatusType.SOLD_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusSlotStatusType.FEW_SEATS_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumBusSlotStatusType.CURRENTLY_BOOKED_SLOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7900a = iArr;
            int[] iArr2 = new int[PBModeToReachStopType.values().length];
            try {
                iArr2[PBModeToReachStopType.WALK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PBModeToReachStopType.BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PBModeToReachStopType.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PBModeToReachStopType.NOT_APPLICABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public SlotSelectionScreenUiStateFactory(StringProvider stringProvider, TimeUtilsContract timeUtilsContract, FormatTimeInMillisToGivenFormatUseCase formatTimeInMillisToGivenFormatUseCase) {
        this.f7899a = stringProvider;
        this.b = timeUtilsContract;
        this.c = formatTimeInMillisToGivenFormatUseCase;
    }

    public static boolean h(PBSlotSelectionScreenBottomSheetType.ViewAllSlots viewAllSlots) {
        if (viewAllSlots.b == null) {
            return false;
        }
        List list = viewAllSlots.f7826a.c;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((PBAvailableSlotsTripAppModel) it.next()).f7089a, viewAllSlots.b.f7089a)) {
                return true;
            }
        }
        return false;
    }

    public static ChaloColorToken k(PremiumBusSlotStatusType premiumBusSlotStatusType) {
        int i = WhenMappings.f7900a[premiumBusSlotStatusType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return ChaloColorToken.DarkGolden.f9782a;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return ChaloColorToken.ShadyGray.f9851a;
    }

    public static OfferTagUIState m(String str) {
        return new OfferTagUIState(new TextUIState.ChaloTextUIState(str, UITextStyle.LabelSmall, ChaloColorToken.DiscountPercentTextGreen.f9792a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), null, 13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01df  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    public final Object a(PBModeToReachStopType pBModeToReachStopType, Long l, Long l2, String str, boolean z, ContinuationImpl continuationImpl) {
        SlotSelectionScreenUiStateFactory$createModeToReachStopString$1 slotSelectionScreenUiStateFactory$createModeToReachStopString$1;
        StringProvider stringProvider;
        String strM;
        SlotSelectionScreenUiStateFactory$createModeToReachStopString$1 slotSelectionScreenUiStateFactory$createModeToReachStopString$2;
        String strH;
        String str2;
        boolean z2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String strP;
        if (continuationImpl instanceof SlotSelectionScreenUiStateFactory$createModeToReachStopString$1) {
            slotSelectionScreenUiStateFactory$createModeToReachStopString$1 = (SlotSelectionScreenUiStateFactory$createModeToReachStopString$1) continuationImpl;
            int i = slotSelectionScreenUiStateFactory$createModeToReachStopString$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                slotSelectionScreenUiStateFactory$createModeToReachStopString$1.label = i - Integer.MIN_VALUE;
            } else {
                slotSelectionScreenUiStateFactory$createModeToReachStopString$1 = new SlotSelectionScreenUiStateFactory$createModeToReachStopString$1(this, continuationImpl);
            }
        } else {
            slotSelectionScreenUiStateFactory$createModeToReachStopString$1 = new SlotSelectionScreenUiStateFactory$createModeToReachStopString$1(this, continuationImpl);
        }
        Object obj = slotSelectionScreenUiStateFactory$createModeToReachStopString$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = slotSelectionScreenUiStateFactory$createModeToReachStopString$1.label;
        StringProvider stringProvider2 = this.f7899a;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (l != null) {
                stringProvider = stringProvider2;
                long jLongValue = l.longValue() == 0 ? 1L : l.longValue();
                Long l3 = (l2 != null && l2.longValue() == 0) ? new Long(1L) : l2;
                strM = this.b.M(jLongValue);
                if (l3 != null) {
                    long jLongValue2 = l3.longValue();
                    if (jLongValue2 >= 1000) {
                        double d = jLongValue2 / 1000.0d;
                        int i3 = (int) d;
                        slotSelectionScreenUiStateFactory$createModeToReachStopString$2 = slotSelectionScreenUiStateFactory$createModeToReachStopString$1;
                        strH = d - ((double) i3) > 0.6d ? cb0.h(i3 + 1, "km") : cb0.h(i3, "km");
                    } else {
                        slotSelectionScreenUiStateFactory$createModeToReachStopString$2 = slotSelectionScreenUiStateFactory$createModeToReachStopString$1;
                        strH = jLongValue2 + ApsMetricsDataMap.APSMETRICS_FIELD_METRICS;
                    }
                } else {
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2 = slotSelectionScreenUiStateFactory$createModeToReachStopString$1;
                    strH = null;
                }
                int i4 = WhenMappings.b[pBModeToReachStopType.ordinal()];
                if (i4 == 1) {
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$0 = str;
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$1 = strM;
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$2 = strH;
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.Z$0 = z;
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.label = 1;
                    Object objB = stringProvider.b(StringEnum.WALK, new Object[0], slotSelectionScreenUiStateFactory$createModeToReachStopString$2);
                    if (objB != coroutineSingletons) {
                        str2 = str;
                        z2 = z;
                        str3 = strH;
                        obj = objB;
                        str4 = (String) obj;
                    }
                } else if (i4 == 2) {
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$0 = str;
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$1 = strM;
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$2 = strH;
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.Z$0 = z;
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.label = 2;
                    Object objB2 = stringProvider.b(StringEnum.BUS, new Object[0], slotSelectionScreenUiStateFactory$createModeToReachStopString$2);
                    if (objB2 != coroutineSingletons) {
                        str2 = str;
                        z2 = z;
                        str3 = strH;
                        obj = objB2;
                        str4 = (String) obj;
                    }
                } else if (i4 == 3) {
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$0 = str;
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$1 = strM;
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$2 = strH;
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.Z$0 = z;
                    slotSelectionScreenUiStateFactory$createModeToReachStopString$2.label = 3;
                    Object objB3 = stringProvider.b(StringEnum.AUTO, new Object[0], slotSelectionScreenUiStateFactory$createModeToReachStopString$2);
                    if (objB3 != coroutineSingletons) {
                        str2 = str;
                        z2 = z;
                        str3 = strH;
                        obj = objB3;
                        str4 = (String) obj;
                    }
                } else if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return coroutineSingletons;
            }
            return null;
        }
        if (i2 == 1) {
            z2 = slotSelectionScreenUiStateFactory$createModeToReachStopString$1.Z$0;
            str3 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$2;
            String str10 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$1;
            str2 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$0;
            ResultKt.b(obj);
            slotSelectionScreenUiStateFactory$createModeToReachStopString$2 = slotSelectionScreenUiStateFactory$createModeToReachStopString$1;
            strM = str10;
            stringProvider = stringProvider2;
            str4 = (String) obj;
        } else if (i2 == 2) {
            z2 = slotSelectionScreenUiStateFactory$createModeToReachStopString$1.Z$0;
            str3 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$2;
            String str11 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$1;
            str2 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$0;
            ResultKt.b(obj);
            slotSelectionScreenUiStateFactory$createModeToReachStopString$2 = slotSelectionScreenUiStateFactory$createModeToReachStopString$1;
            strM = str11;
            stringProvider = stringProvider2;
            str4 = (String) obj;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    str5 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$3;
                    str7 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$2;
                    str8 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$1;
                    str6 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$0;
                    ResultKt.b(obj);
                    str9 = (String) obj;
                    if (str7 != null) {
                        String lowerCase = str5.toLowerCase(Locale.ROOT);
                        Intrinsics.h(lowerCase, "toLowerCase(...)");
                        StringBuilder sb = new StringBuilder();
                        sb.append(str8);
                        sb.append(" ");
                        sb.append(lowerCase);
                        strP = r30.i(sb, " (", str7, ") ", str9);
                    } else {
                        String lowerCase2 = str5.toLowerCase(Locale.ROOT);
                        Intrinsics.h(lowerCase2, "toLowerCase(...)");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str8);
                        sb2.append(" ");
                        sb2.append(lowerCase2);
                        strP = vo1.p(sb2, " ", str9);
                    }
                    if (str6 != null) {
                        return vo1.n(strP, " ", str6);
                    }
                    return null;
                }
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$3;
                str7 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$2;
                str8 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$1;
                str6 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$0;
                ResultKt.b(obj);
                str9 = (String) obj;
                if (str7 != null) {
                    String lowerCase3 = str5.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase3, "toLowerCase(...)");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str8);
                    sb3.append(" ");
                    sb3.append(lowerCase3);
                    strP = r30.i(sb3, " (", str7, ") ", str9);
                } else {
                    String lowerCase4 = str5.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase4, "toLowerCase(...)");
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str8);
                    sb4.append(" ");
                    sb4.append(lowerCase4);
                    strP = vo1.p(sb4, " ", str9);
                }
                if (str6 != null) {
                    return vo1.n(strP, " ", str6);
                }
                return null;
            }
            z2 = slotSelectionScreenUiStateFactory$createModeToReachStopString$1.Z$0;
            str3 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$2;
            String str12 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$1;
            str2 = (String) slotSelectionScreenUiStateFactory$createModeToReachStopString$1.L$0;
            ResultKt.b(obj);
            slotSelectionScreenUiStateFactory$createModeToReachStopString$2 = slotSelectionScreenUiStateFactory$createModeToReachStopString$1;
            strM = str12;
            stringProvider = stringProvider2;
            str4 = (String) obj;
        }
        String str13 = str3;
        boolean z3 = z2;
        str5 = str4;
        str6 = str2;
        if (z3) {
            slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$0 = str6;
            slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$1 = strM;
            slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$2 = str13;
            slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$3 = str5;
            slotSelectionScreenUiStateFactory$createModeToReachStopString$2.label = 4;
            Object objB4 = stringProvider.b(StringEnum.FROM, new Object[0], slotSelectionScreenUiStateFactory$createModeToReachStopString$2);
            if (objB4 != coroutineSingletons) {
                obj = objB4;
                str7 = str13;
                str8 = strM;
                str9 = (String) obj;
                if (str7 != null) {
                    String lowerCase5 = str5.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase5, "toLowerCase(...)");
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str8);
                    sb5.append(" ");
                    sb5.append(lowerCase5);
                    strP = r30.i(sb5, " (", str7, ") ", str9);
                } else {
                    String lowerCase6 = str5.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase6, "toLowerCase(...)");
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str8);
                    sb6.append(" ");
                    sb6.append(lowerCase6);
                    strP = vo1.p(sb6, " ", str9);
                }
                if (str6 != null) {
                    return vo1.n(strP, " ", str6);
                }
                return null;
            }
        } else {
            slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$0 = str6;
            slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$1 = strM;
            slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$2 = str13;
            slotSelectionScreenUiStateFactory$createModeToReachStopString$2.L$3 = str5;
            slotSelectionScreenUiStateFactory$createModeToReachStopString$2.label = 5;
            Object objB5 = stringProvider.b(StringEnum.TO, new Object[0], slotSelectionScreenUiStateFactory$createModeToReachStopString$2);
            if (objB5 != coroutineSingletons) {
                obj = objB5;
                str7 = str13;
                str8 = strM;
                str9 = (String) obj;
                if (str7 != null) {
                    String lowerCase7 = str5.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase7, "toLowerCase(...)");
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str8);
                    sb7.append(" ");
                    sb7.append(lowerCase7);
                    strP = r30.i(sb7, " (", str7, ") ", str9);
                } else {
                    String lowerCase8 = str5.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase8, "toLowerCase(...)");
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str8);
                    sb8.append(" ");
                    sb8.append(lowerCase8);
                    strP = vo1.p(sb8, " ", str9);
                }
                if (str6 != null) {
                    return vo1.n(strP, " ", str6);
                }
                return null;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object b(List list, Function1 function1, ContinuationImpl continuationImpl) {
        SlotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1 slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1;
        Object objB;
        List list2;
        Function1 function2;
        List list3;
        List list4;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof SlotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1) {
            slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1 = (SlotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1) continuationImpl;
            int i = slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.label = i - Integer.MIN_VALUE;
            } else {
                slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1 = new SlotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1(this, continuationImpl);
            }
        } else {
            slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1 = new SlotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1(this, continuationImpl);
        }
        Object obj = slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.label;
        if (i2 == 0) {
            ArrayList arrayListL = py.l(obj);
            Iterator it = CollectionsKt.x0(list, 2).iterator();
            while (it.hasNext()) {
                arrayListL.add(c((SlotsAvailableForSelection) it.next(), function1));
            }
            if (list.size() <= 2) {
                return arrayListL;
            }
            slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.L$0 = list;
            slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.L$1 = function1;
            slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.L$2 = arrayListL;
            slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.L$3 = arrayListL;
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.L$4 = chaloTextStyleHelper2;
            slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.label = 1;
            objB = this.f7899a.b(StringEnum.VIEW_MORE, new Object[0], slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            list2 = list;
            function2 = function1;
            list3 = arrayListL;
            list4 = list3;
            chaloTextStyleHelper = chaloTextStyleHelper2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.L$4;
            List list5 = (List) slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.L$3;
            List list6 = (List) slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.L$2;
            Function1 function3 = (Function1) slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.L$1;
            List list7 = (List) slotSelectionScreenUiStateFactory$createMultipleNearByCardUIStates$1.L$0;
            ResultKt.b(obj);
            chaloTextStyleHelper = chaloTextStyleHelper3;
            list2 = list7;
            objB = obj;
            list3 = list5;
            list4 = list6;
            function2 = function3;
        }
        list3.add(new NearByCardUIState.ViewMoreUIState(ChaloTextStyleHelper.g(chaloTextStyleHelper, (String) objB, ChaloColorToken.AlmostBlackColor.f9756a, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new da1(4, function2, list2))));
        return list4;
    }

    public final NearByCardUIState.SlotUIState c(SlotsAvailableForSelection slotsAvailableForSelection, Function1 function1) {
        return new NearByCardUIState.SlotUIState(slotsAvailableForSelection.b ? ChaloColorToken.LightOrangeSpf.f9817a : ChaloColorToken.White.f9870a, ChaloTextStyleHelper.g(ChaloTextStyleHelper.f10078a, this.b.e(slotsAvailableForSelection.f7902a.c), ChaloColorToken.AlmostBlackColor.f9756a, null, UIFontWeight.SemiBold, null, null, 108), new BorderUISpec(ChaloThemeHelper.a().b, slotsAvailableForSelection.b ? ChaloColorToken.OrangePrimary.f9835a : ChaloColorToken.LightGray.f9814a, ChaloThemeHelper.d.b), UiEventHandler.Companion.a(new da1(5, function1, slotsAvailableForSelection)));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:19:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:20:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f8 -> B:24:0x00fc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(java.util.List r23, kotlin.jvm.functions.Function1 r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory.d(java.util.List, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0f8a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0f8d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0f92  */
    /* JADX WARN: Code duplicated, block: B:166:0x105b  */
    /* JADX WARN: Code duplicated, block: B:167:0x1060  */
    /* JADX WARN: Code duplicated, block: B:171:0x10d4  */
    /* JADX WARN: Code duplicated, block: B:172:0x10d9  */
    /* JADX WARN: Code duplicated, block: B:175:0x10df  */
    /* JADX WARN: Code duplicated, block: B:192:0x121d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0690  */
    /* JADX WARN: Code duplicated, block: B:33:0x069a  */
    /* JADX WARN: Code duplicated, block: B:35:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x06de  */
    /* JADX WARN: Code duplicated, block: B:39:0x0773  */
    /* JADX WARN: Code duplicated, block: B:41:0x0778  */
    /* JADX WARN: Code duplicated, block: B:44:0x0796  */
    /* JADX WARN: Code duplicated, block: B:45:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:48:0x0858  */
    /* JADX WARN: Code duplicated, block: B:49:0x085d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0874  */
    /* JADX WARN: Code duplicated, block: B:53:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x091b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0920  */
    /* JADX WARN: Code duplicated, block: B:60:0x098a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x117f -> B:188:0x1194). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:193:0x122e -> B:189:0x1203). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(java.lang.String r130, java.lang.String r131, app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel r132, java.lang.String r133, long r134, long r136, java.lang.Long r138, defpackage.ev0 r139, kotlin.coroutines.jvm.internal.ContinuationImpl r140) {
        /*
            Method dump skipped, instruction units count: 5410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory.e(java.lang.String, java.lang.String, app.chalo.premiumbus.ui.slotselection.PBODPairWithSlotSectionListUiModel, java.lang.String, long, long, java.lang.Long, ev0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0438  */
    /* JADX WARN: Code duplicated, block: B:54:0x0447  */
    /* JADX WARN: Code duplicated, block: B:57:0x0470  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v35, types: [app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory$createPBSlotSelectionScreenBottomSheetTypeUIState$7] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x07d7 -> B:138:0x07db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:148:0x0840 -> B:147:0x0839). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x059a -> B:89:0x059d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(boolean r57, app.chalo.premiumbus.ui.slotselection.PBSlotSelectionScreenBottomSheetType r58, defpackage.ev0 r59, kotlin.coroutines.jvm.internal.ContinuationImpl r60) {
        /*
            Method dump skipped, instruction units count: 3758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory.f(boolean, app.chalo.premiumbus.ui.slotselection.PBSlotSelectionScreenBottomSheetType, ev0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object g(da1 da1Var, ContinuationImpl continuationImpl) {
        SlotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1 slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1;
        Function0 function0;
        ChaloTextStyleHelper chaloTextStyleHelper;
        TextUIState.ChaloTextUIState chaloTextUIStateF;
        Function0 function1;
        ButtonUIStateFactory buttonUIStateFactory;
        if (continuationImpl instanceof SlotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1) {
            slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1 = (SlotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1) continuationImpl;
            int i = slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1 = new SlotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1(this, continuationImpl);
            }
        } else {
            slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1 = new SlotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1(this, continuationImpl);
        }
        Object objB = slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.label;
        StringProvider stringProvider = this.f7899a;
        if (i2 == 0) {
            ResultKt.b(objB);
            slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.L$0 = da1Var;
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.L$1 = chaloTextStyleHelper2;
            slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.NOW_PREBOOK_RIDES_IN_ADVANCE_WITH_CHALO_BUS_PASS, new Object[0], slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1);
            if (objB != coroutineSingletons) {
                function0 = da1Var;
                chaloTextStyleHelper = chaloTextStyleHelper2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.L$1;
            function0 = (Function0) slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.L$0;
            ResultKt.b(objB);
            chaloTextStyleHelper = chaloTextStyleHelper3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buttonUIStateFactory = (ButtonUIStateFactory) slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.L$2;
            chaloTextUIStateF = (TextUIState.ChaloTextUIState) slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.L$1;
            function1 = (Function0) slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.L$0;
            ResultKt.b(objB);
        }
        UIFontWeight uIFontWeight = UIFontWeight.SemiBold;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new o01(function1, 22));
        UITextStyle uITextStyle = UITextStyle.HeadlineSmall;
        buttonUIStateFactory.getClass();
        return new PassPurchaseNudgeCardUIState(chaloTextUIStateF, new ImageUIState(IconType.IC_CALENDAR, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().F), Dp.m7276boximpl(ChaloThemeHelper.a().r)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), ButtonUIStateFactory.a((String) objB, uITextStyle, uIFontWeight, uiEventHandler$Companion$fromLambda$1A), UiEventHandler.Companion.a(new o01(function1, 23)));
        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) objB, ChaloColorToken.Black.f9759a, UIFontWeight.Bold, null, 108);
        slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.L$0 = function0;
        slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.L$1 = chaloTextUIStateF;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.L$2 = buttonUIStateFactory2;
        slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.BTN_TEXT_BUY_PASS, new Object[0], slotSelectionScreenUiStateFactory$createPassPurchaseNudgeCardUIState$1);
        if (objB != coroutineSingletons) {
            function1 = function0;
            buttonUIStateFactory = buttonUIStateFactory2;
            UIFontWeight uIFontWeight2 = UIFontWeight.SemiBold;
            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A2 = UiEventHandler.Companion.a(new o01(function1, 22));
            UITextStyle uITextStyle2 = UITextStyle.HeadlineSmall;
            buttonUIStateFactory.getClass();
            return new PassPurchaseNudgeCardUIState(chaloTextUIStateF, new ImageUIState(IconType.IC_CALENDAR, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().F), Dp.m7276boximpl(ChaloThemeHelper.a().r)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), ButtonUIStateFactory.a((String) objB, uITextStyle2, uIFontWeight2, uiEventHandler$Companion$fromLambda$1A2), UiEventHandler.Companion.a(new o01(function1, 23)));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r11 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r11 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(int r9, java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory$getPurchaseOptionSubTitleForSuperPass$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory$getPurchaseOptionSubTitleForSuperPass$1 r0 = (app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory$getPurchaseOptionSubTitleForSuperPass$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory$getPurchaseOptionSubTitleForSuperPass$1 r0 = new app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory$getPurchaseOptionSubTitleForSuperPass$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            app.chalo.providers.stringprovider.StringProvider r7 = r8.f7899a
            if (r2 == 0) goto L4a
            if (r2 == r6) goto L41
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            kotlin.ResultKt.b(r11)
            return r11
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.L$0
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.b(r11)
            goto L66
        L41:
            java.lang.Object r9 = r0.L$0
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.b(r11)
            goto L7c
        L4a:
            kotlin.ResultKt.b(r11)
            r11 = -1
            if (r9 == r11) goto L6d
            if (r9 == 0) goto L57
            java.lang.String r9 = java.lang.String.valueOf(r9)
            goto L7f
        L57:
            app.chalo.providers.stringprovider.StringEnum r9 = app.chalo.providers.stringprovider.StringEnum.NO_SMALL
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r0.L$0 = r10
            r0.label = r5
            java.lang.Object r11 = r7.b(r9, r11, r0)
            if (r11 != r1) goto L66
            goto L92
        L66:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r9 = app.chalo.extensions.StringExtsKt.a(r11)
            goto L7f
        L6d:
            app.chalo.providers.stringprovider.StringEnum r9 = app.chalo.providers.stringprovider.StringEnum.UNLIMITED
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r0.L$0 = r10
            r0.label = r6
            java.lang.Object r11 = r7.b(r9, r11, r0)
            if (r11 != r1) goto L7c
            goto L92
        L7c:
            r9 = r11
            java.lang.String r9 = (java.lang.String) r9
        L7f:
            app.chalo.providers.stringprovider.StringEnum r11 = app.chalo.providers.stringprovider.StringEnum.CHALO_CARD_ACTIVE_PASS_DESCRIPTION
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r3] = r9
            r2[r6] = r10
            r9 = 0
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r9 = r7.b(r11, r2, r0)
            if (r9 != r1) goto L93
        L92:
            return r1
        L93:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory.i(int, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final SlotDelayTextUIState j(PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel) {
        long jLongValue;
        Long l = pBAvailableSlotsTripAppModel.m;
        if (l != null) {
            jLongValue = pBAvailableSlotsTripAppModel.g - l.longValue();
        } else {
            jLongValue = -1;
        }
        if (jLongValue >= 120000) {
            return new SlotDelayTextUIState(ChaloTextStyleHelper.h(vo1.m("+ ", this.b.w(jLongValue)), null, UIFontWeight.SemiBold, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), 14);
        }
        return null;
    }

    public final Object l(PremiumBusSlotStatusType premiumBusSlotStatusType, ContinuationImpl continuationImpl) {
        int i = WhenMappings.f7900a[premiumBusSlotStatusType.ordinal()];
        StringProvider stringProvider = this.f7899a;
        if (i == 1) {
            return stringProvider.b(StringEnum.PB_SLOTS_FULLY_BOOKED, new Object[0], continuationImpl);
        }
        if (i == 2) {
            return stringProvider.b(StringEnum.PB_SLOTS_FEW_SEATS_LEFT, new Object[0], continuationImpl);
        }
        if (i == 3) {
            return stringProvider.b(StringEnum.PB_SLOT_CURRENT_BOOKING, new Object[0], continuationImpl);
        }
        throw new NoWhenBranchMatchedException();
    }
}
