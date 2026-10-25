package app.chalo.mticket.ui.passengerselection;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketPassengerInfo;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.mticket.domain.MTicketFareContainer;
import app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionIntent;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoSnackBarType;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteDetails;
import app.chalo.productbooking.common.data.models.app.ProductBookingSpecialFeature;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productpurchase.productselection.data.models.app.MTicketFareResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.MTicketPassengerFareResponseAppModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.ButtonContainerUIState;
import app.chalo.uistate.dialog.DialogUIEventHandler;
import app.chalo.uistate.dialog.TermTextUIState;
import app.chalo.uistate.dialog.TnCDialogUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.snackbar.SnackbarUIStateFactory;
import app.chalo.uistate.text.StyledTextClickHandler$Companion$create$1;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeatureBuilder;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIStateKt;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.ChaloRoundingMode;
import app.chalo.utils.KBigDecimal;
import com.google.firebase.messaging.ServiceStarter;
import defpackage.cb0;
import defpackage.q70;
import defpackage.vo1;
import defpackage.wg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionUIStateFactory;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MTicketPassengerSelectionUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f5759a;
    public final MTicketUtilsHelper b;
    public final CityProvider c;

    public MTicketPassengerSelectionUIStateFactory(StringProvider stringProvider, MTicketUtilsHelper mTicketUtilsHelper, CityProvider cityProvider) {
        this.f5759a = stringProvider;
        this.b = mTicketUtilsHelper;
        this.c = cityProvider;
    }

    public static TitleAndDescSpaceBetweenUIState c(String str, String str2) {
        UITextStyle uITextStyle = UITextStyle.BodyMedium;
        ChaloColorToken.Black_60 black_60 = ChaloColorToken.Black_60.f9766a;
        return new TitleAndDescSpaceBetweenUIState(new ChaloPadding(ChaloThemeHelper.a().g, 0.0f, 0.0f, 0.0f, 14), new TextUIState.ChaloTextUIState(str, uITextStyle, black_60, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(str2, uITextStyle, black_60, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:102:0x0606  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x031a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0355  */
    /* JADX WARN: Code duplicated, block: B:52:0x0394  */
    /* JADX WARN: Code duplicated, block: B:56:0x03af A[PHI: r0 r1 r2 r3 r4 r5 r10
      0x03af: PHI (r0v27 app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionUIStateFactory) = 
      (r0v23 app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionUIStateFactory)
      (r0v30 app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionUIStateFactory)
     binds: [B:54:0x03ab, B:22:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x03af: PHI (r1v24 app.chalo.uistate.toolbar.ToolbarUIState) = (r1v20 app.chalo.uistate.toolbar.ToolbarUIState), (r1v26 app.chalo.uistate.toolbar.ToolbarUIState) binds: [B:54:0x03ab, B:22:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x03af: PHI (r2v19 app.chalo.mticket.ui.passengerselection.MTicketRouteDetailsUIState) = 
      (r2v18 app.chalo.mticket.ui.passengerselection.MTicketRouteDetailsUIState)
      (r2v21 app.chalo.mticket.ui.passengerselection.MTicketRouteDetailsUIState)
     binds: [B:54:0x03ab, B:22:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x03af: PHI (r3v27 app.chalo.uistate.error.StandardErrorScreenUIState$ErrorWithMsgAndRetry) = 
      (r3v23 app.chalo.uistate.error.StandardErrorScreenUIState$ErrorWithMsgAndRetry)
      (r3v30 app.chalo.uistate.error.StandardErrorScreenUIState$ErrorWithMsgAndRetry)
     binds: [B:54:0x03ab, B:22:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x03af: PHI (r4v21 kotlin.jvm.functions.Function1) = (r4v17 kotlin.jvm.functions.Function1), (r4v24 kotlin.jvm.functions.Function1) binds: [B:54:0x03ab, B:22:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x03af: PHI (r5v20 app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionDataState) = 
      (r5v18 app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionDataState)
      (r5v23 app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionDataState)
     binds: [B:54:0x03ab, B:22:0x01fc] A[DONT_GENERATE, DONT_INLINE]
      0x03af: PHI (r10v9 java.lang.Object) = (r10v8 java.lang.Object), (r10v12 java.lang.Object) binds: [B:54:0x03ab, B:22:0x01fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x0406  */
    /* JADX WARN: Code duplicated, block: B:67:0x0419  */
    /* JADX WARN: Code duplicated, block: B:70:0x041f  */
    /* JADX WARN: Code duplicated, block: B:74:0x044b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0459  */
    /* JADX WARN: Code duplicated, block: B:80:0x047b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0499  */
    /* JADX WARN: Code duplicated, block: B:86:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x0505  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0534  */
    /* JADX WARN: Code duplicated, block: B:92:0x0537  */
    /* JADX WARN: Code duplicated, block: B:95:0x0576  */
    /* JADX WARN: Code duplicated, block: B:96:0x0578  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0439, code lost:
    
        if (r14 == r7) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionDataState r30, kotlin.jvm.functions.Function1 r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instruction units count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionUIStateFactory.a(app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionDataState, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x019f  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x01be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(MTicketFareContainer mTicketFareContainer, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionUIStateFactory$discountBreakup$1 mTicketPassengerSelectionUIStateFactory$discountBreakup$1;
        double d;
        List arrayList;
        Map map;
        double d2;
        MTicketPassengerSelectionUIStateFactory mTicketPassengerSelectionUIStateFactory;
        Object objPut;
        Map map2;
        ArrayList arrayList2;
        double dDoubleValue;
        String strM;
        if (continuationImpl instanceof MTicketPassengerSelectionUIStateFactory$discountBreakup$1) {
            mTicketPassengerSelectionUIStateFactory$discountBreakup$1 = (MTicketPassengerSelectionUIStateFactory$discountBreakup$1) continuationImpl;
            int i = mTicketPassengerSelectionUIStateFactory$discountBreakup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionUIStateFactory$discountBreakup$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionUIStateFactory$discountBreakup$1 = new MTicketPassengerSelectionUIStateFactory$discountBreakup$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionUIStateFactory$discountBreakup$1 = new MTicketPassengerSelectionUIStateFactory$discountBreakup$1(this, continuationImpl);
        }
        Object obj = mTicketPassengerSelectionUIStateFactory$discountBreakup$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionUIStateFactory$discountBreakup$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Map map3 = mTicketFareContainer.f5726a.h;
            if (map3 == null) {
                return EmptyList.f17557a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map3.entrySet()) {
                MTicketPassengerInfo mTicketPassengerInfo = (MTicketPassengerInfo) entry.getValue();
                Map map4 = mTicketPassengerInfo.e;
                int i3 = mTicketPassengerInfo.d;
                if (map4 != null) {
                    for (Map.Entry entry2 : map4.entrySet()) {
                        String str = (String) entry2.getKey();
                        double dDoubleValue2 = ((Number) entry2.getValue()).doubleValue();
                        if (linkedHashMap.containsKey(str)) {
                            Object obj2 = linkedHashMap.get(str);
                            Intrinsics.f(obj2);
                        }
                    }
                }
                Map map5 = mTicketPassengerInfo.f;
                if (map5 != null) {
                    for (Map.Entry entry3 : map5.entrySet()) {
                        String str2 = (String) entry3.getKey();
                        double dDoubleValue3 = ((Number) entry3.getValue()).doubleValue();
                        if (linkedHashMap.containsKey(str2)) {
                            Object obj3 = linkedHashMap.get(str2);
                            Intrinsics.f(obj3);
                            objPut = linkedHashMap.put(str2, new Double(((Number) obj3).doubleValue() - dDoubleValue3));
                        } else {
                            objPut = linkedHashMap.put(str2, new Double(((double) (-1)) * dDoubleValue3 * ((double) i3)));
                        }
                    }
                }
            }
            d = 0.0d;
            arrayList = new ArrayList();
            double dH = MTicketUtilsHelper.h(mTicketFareContainer.f5726a);
            map2 = linkedHashMap;
            if (dH != 0.0d) {
                mTicketPassengerSelectionUIStateFactory$discountBreakup$1.L$0 = linkedHashMap;
                mTicketPassengerSelectionUIStateFactory$discountBreakup$1.L$1 = arrayList;
                mTicketPassengerSelectionUIStateFactory$discountBreakup$1.L$2 = this;
                mTicketPassengerSelectionUIStateFactory$discountBreakup$1.D$0 = dH;
                mTicketPassengerSelectionUIStateFactory$discountBreakup$1.label = 1;
                Object objB = this.f5759a.b(StringEnum.MTICKET_DISCOUNT_AMOUNT, new Object[0], mTicketPassengerSelectionUIStateFactory$discountBreakup$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objB;
                map = linkedHashMap;
                d2 = dH;
                mTicketPassengerSelectionUIStateFactory = this;
            }
            arrayList2 = new ArrayList(map2.size());
            for (Map.Entry entry4 : map2.entrySet()) {
                String str3 = (String) entry4.getKey();
                dDoubleValue = ((Number) entry4.getValue()).doubleValue();
                if (dDoubleValue >= d) {
                    strM = d(dDoubleValue);
                } else {
                    strM = vo1.m("- ", d(dDoubleValue));
                }
                arrayList2.add(c(str3, strM));
            }
            arrayList.addAll(arrayList2);
            return arrayList;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d2 = mTicketPassengerSelectionUIStateFactory$discountBreakup$1.D$0;
        mTicketPassengerSelectionUIStateFactory = (MTicketPassengerSelectionUIStateFactory) mTicketPassengerSelectionUIStateFactory$discountBreakup$1.L$2;
        arrayList = (List) mTicketPassengerSelectionUIStateFactory$discountBreakup$1.L$1;
        Map map6 = (Map) mTicketPassengerSelectionUIStateFactory$discountBreakup$1.L$0;
        ResultKt.b(obj);
        d = 0.0d;
        map = map6;
        String str4 = "- " + d(d2);
        mTicketPassengerSelectionUIStateFactory.getClass();
        arrayList.add(c((String) obj, str4));
        map2 = map;
        arrayList2 = new ArrayList(map2.size());
        while (r2.hasNext()) {
            String str5 = (String) entry4.getKey();
            dDoubleValue = ((Number) entry4.getValue()).doubleValue();
            if (dDoubleValue >= d) {
                strM = d(dDoubleValue);
            } else {
                strM = vo1.m("- ", d(dDoubleValue));
            }
            arrayList2.add(c(str5, strM));
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final String d(double d) {
        String str;
        CityAppModel cityAppModel = (CityAppModel) this.c.getE().getValue();
        if (cityAppModel == null || (str = cityAppModel.r.b) == null) {
            str = "₹";
        }
        return str + new KBigDecimal(String.valueOf(Math.abs(d))).c(2, ChaloRoundingMode.HALF_UP);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(double d, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1 mTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1;
        int i;
        KBigDecimal kBigDecimalC;
        if (continuationImpl instanceof MTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1) {
            mTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1 = (MTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1) continuationImpl;
            int i2 = mTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1.label = i2 - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1 = new MTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1 = new MTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1(this, continuationImpl);
        }
        Object objB = mTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = mTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1.label;
        if (i3 == 0) {
            ResultKt.b(objB);
            KBigDecimal kBigDecimal = new KBigDecimal(String.valueOf(d));
            String str = (String) CollectionsKt.L(1, StringsKt.U(kBigDecimal.toString(), new String[]{CLConstants.DOT_SALT_DELIMETER}, 6));
            if (str == null) {
                i = 0;
            } else {
                i = 0;
                for (int i4 = 0; i4 < str.length(); i4++) {
                    char cCharAt = str.charAt(i4);
                    if (Character.isDigit(cCharAt) && cCharAt != '0') {
                        i++;
                    }
                    if (i >= 2) {
                        break;
                    }
                }
            }
            kBigDecimalC = kBigDecimal.c(Math.min(i, 2), ChaloRoundingMode.HALF_UP);
            mTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1.L$0 = kBigDecimalC;
            mTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1.label = 1;
            objB = this.f5759a.b(StringEnum.TV_PERCENTAGE_OFF_SUFFIX, new Object[0], mTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kBigDecimalC = (KBigDecimal) mTicketPassengerSelectionUIStateFactory$getDiscountPercentageString$1.L$0;
            ResultKt.b(objB);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(kBigDecimalC);
        sb.append(objB);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(MTicketPassengerFareResponseAppModel mTicketPassengerFareResponseAppModel, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1 mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1;
        TextUIState chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        TextUIState chaloTextUIState3;
        TextUIState textUIState;
        if (continuationImpl instanceof MTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1) {
            mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1 = (MTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1) continuationImpl;
            int i = mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1 = new MTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1 = new MTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1(this, continuationImpl);
        }
        Object objE = mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            double d = mTicketPassengerFareResponseAppModel.b;
            double d2 = mTicketPassengerFareResponseAppModel.d;
            chaloTextUIState = new TextUIState.ChaloTextUIState(d(d - ((d2 * d) / ((double) 100))), UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            chaloTextUIState2 = null;
            if (d2 == 0.0d) {
                chaloTextUIState3 = null;
            } else {
                chaloTextUIState3 = new TextUIState.ChaloTextUIState(d(mTicketPassengerFareResponseAppModel.b), UITextStyle.BodyLarge, ChaloColorToken.Black_60.f9766a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, UITextDecoration.LineThrough, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7672);
            }
            if (d2 != 0.0d) {
                mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1.L$0 = chaloTextUIState;
                mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1.L$1 = chaloTextUIState3;
                mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1.label = 1;
                objE = e(d2, mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1);
                if (objE == obj) {
                    return obj;
                }
                textUIState = chaloTextUIState;
            }
            return new MTicketPassengerItemFareUIState(chaloTextUIState, chaloTextUIState3, chaloTextUIState2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        chaloTextUIState3 = (TextUIState) mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1.L$1;
        textUIState = (TextUIState) mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemFare$1.L$0;
        ResultKt.b(objE);
        chaloTextUIState = textUIState;
        chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objE, UITextStyle.BodyLarge, ChaloColorToken.DiscountGreen.f9789a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        return new MTicketPassengerItemFareUIState(chaloTextUIState, chaloTextUIState3, chaloTextUIState2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object g(final MTicketPassengerItem mTicketPassengerItem, MTicketFareResponseAppModel mTicketFareResponseAppModel, final Function1 function1, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1 mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1;
        MTicketPassengerFareResponseAppModel mTicketPassengerFareResponseAppModel;
        TextUIState.ChaloTextUIState chaloTextUIState;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A2;
        MTicketPassengerItemCounterUIState mTicketPassengerItemCounterUIState;
        MTicketPassengerItemFareUIState mTicketPassengerItemFareUIState;
        MTicketPassengerItemCounterUIState mTicketPassengerItemCounterUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        List list;
        Object next;
        if (continuationImpl instanceof MTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1) {
            mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1 = (MTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1) continuationImpl;
            int i = mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1 = new MTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1 = new MTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1(this, continuationImpl);
        }
        Object objF = mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            if (mTicketFareResponseAppModel == null || (list = mTicketFareResponseAppModel.f8633a.c) == null) {
                mTicketPassengerFareResponseAppModel = null;
            } else {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((MTicketPassengerFareResponseAppModel) next).f8636a.equals(mTicketPassengerItem.f5734a));
                mTicketPassengerFareResponseAppModel = (MTicketPassengerFareResponseAppModel) next;
            }
            String str = mTicketPassengerItem.b;
            int i3 = mTicketPassengerItem.d;
            int i4 = mTicketPassengerItem.e;
            boolean z = mTicketPassengerItem.f;
            int i5 = mTicketPassengerItem.c;
            UITextStyle uITextStyle = UITextStyle.DisplaySmall;
            ChaloColorToken chaloColorToken = ChaloColorToken.Black_87.f9768a;
            chaloTextUIState = new TextUIState.ChaloTextUIState(str, uITextStyle, chaloColorToken, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            IconType iconType = (!z || i5 <= i4) ? IconType.REMOVE_TICKET_DISABLED : IconType.REMOVE_TICKET;
            if (!z || i5 <= i4) {
                uiEventHandler$Companion$fromLambda$1A = null;
            } else {
                final int i6 = 0;
                uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new Function0() { // from class: vg0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                function1.invoke(new MTicketPassengerSelectionIntent.DecrementPassengerCount(mTicketPassengerItem.f5734a));
                                break;
                            default:
                                function1.invoke(new MTicketPassengerSelectionIntent.IncrementPassengerCount(mTicketPassengerItem.f5734a));
                                break;
                        }
                        return Unit.f17538a;
                    }
                });
            }
            ImageUIState imageUIState = new ImageUIState(iconType, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, uiEventHandler$Companion$fromLambda$1A, WebSocketProtocol.PAYLOAD_SHORT);
            IconType iconType2 = (!z || i5 >= i3) ? IconType.ADD_TICKET_DISABLED : IconType.ADD_TICKET;
            if (!z || i5 >= i3) {
                uiEventHandler$Companion$fromLambda$1A2 = null;
            } else {
                final int i7 = 1;
                uiEventHandler$Companion$fromLambda$1A2 = UiEventHandler.Companion.a(new Function0() { // from class: vg0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                function1.invoke(new MTicketPassengerSelectionIntent.DecrementPassengerCount(mTicketPassengerItem.f5734a));
                                break;
                            default:
                                function1.invoke(new MTicketPassengerSelectionIntent.IncrementPassengerCount(mTicketPassengerItem.f5734a));
                                break;
                        }
                        return Unit.f17538a;
                    }
                });
            }
            ImageUIState imageUIState2 = new ImageUIState(iconType2, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, uiEventHandler$Companion$fromLambda$1A2, WebSocketProtocol.PAYLOAD_SHORT);
            String strValueOf = String.valueOf(i5);
            if (!z) {
                chaloColorToken = ChaloColorToken.Black_30.f9763a;
            }
            mTicketPassengerItemCounterUIState = new MTicketPassengerItemCounterUIState(imageUIState, new TextUIState.ChaloTextUIState(strValueOf, uITextStyle, chaloColorToken, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), imageUIState2);
            if (mTicketPassengerFareResponseAppModel != null) {
                mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1.L$0 = chaloTextUIState;
                mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1.L$1 = mTicketPassengerItemCounterUIState;
                mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1.label = 1;
                objF = f(mTicketPassengerFareResponseAppModel, mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1);
                if (objF == obj) {
                    return obj;
                }
                mTicketPassengerItemCounterUIState2 = mTicketPassengerItemCounterUIState;
                chaloTextUIState2 = chaloTextUIState;
            } else {
                mTicketPassengerItemFareUIState = null;
            }
            return new MTicketPassengerItemUIState(mTicketPassengerItemCounterUIState, chaloTextUIState, mTicketPassengerItemFareUIState);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mTicketPassengerItemCounterUIState2 = (MTicketPassengerItemCounterUIState) mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1.L$1;
        chaloTextUIState2 = (TextUIState.ChaloTextUIState) mTicketPassengerSelectionUIStateFactory$mTicketPassengerItemUIState$1.L$0;
        ResultKt.b(objF);
        mTicketPassengerItemFareUIState = (MTicketPassengerItemFareUIState) objF;
        chaloTextUIState = chaloTextUIState2;
        mTicketPassengerItemCounterUIState = mTicketPassengerItemCounterUIState2;
        return new MTicketPassengerItemUIState(mTicketPassengerItemCounterUIState, chaloTextUIState, mTicketPassengerItemFareUIState);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0184  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01a6 -> B:52:0x01ad). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel.SingleJourneyTicketAppModel r31, app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionContainer r32, app.chalo.mticket.domain.MTicketFareContainer r33, app.chalo.productpurchase.productselection.data.models.app.MTicketFareResponseAppModel r34, kotlin.jvm.functions.Function1 r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instruction units count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionUIStateFactory.h(app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel$SingleJourneyTicketAppModel, app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionContainer, app.chalo.mticket.domain.MTicketFareContainer, app.chalo.productpurchase.productselection.data.models.app.MTicketFareResponseAppModel, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object i(boolean z, MTicketFareContainer mTicketFareContainer, Function1 function1, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionUIStateFactory$payBtn$1 mTicketPassengerSelectionUIStateFactory$payBtn$1;
        ButtonUIStateFactory buttonUIStateFactory;
        String str;
        Function1 function2 = function1;
        if (continuationImpl instanceof MTicketPassengerSelectionUIStateFactory$payBtn$1) {
            mTicketPassengerSelectionUIStateFactory$payBtn$1 = (MTicketPassengerSelectionUIStateFactory$payBtn$1) continuationImpl;
            int i = mTicketPassengerSelectionUIStateFactory$payBtn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionUIStateFactory$payBtn$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionUIStateFactory$payBtn$1 = new MTicketPassengerSelectionUIStateFactory$payBtn$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionUIStateFactory$payBtn$1 = new MTicketPassengerSelectionUIStateFactory$payBtn$1(this, continuationImpl);
        }
        Object objB = mTicketPassengerSelectionUIStateFactory$payBtn$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionUIStateFactory$payBtn$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!z || mTicketFareContainer == null) {
                return null;
            }
            MTicket mTicket = mTicketFareContainer.f5726a;
            double dI = this.b.i(mTicket);
            Boolean bool = mTicket.s;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            StringProvider stringProvider = this.f5759a;
            ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
            if (zBooleanValue && dI == 0.0d) {
                mTicketPassengerSelectionUIStateFactory$payBtn$1.L$0 = function2;
                mTicketPassengerSelectionUIStateFactory$payBtn$1.L$1 = buttonUIStateFactory2;
                mTicketPassengerSelectionUIStateFactory$payBtn$1.label = 1;
                objB = stringProvider.b(StringEnum.BTN_TXT_GET_FREE_TICKET, new Object[0], mTicketPassengerSelectionUIStateFactory$payBtn$1);
                if (objB != coroutineSingletons) {
                    buttonUIStateFactory = buttonUIStateFactory2;
                    str = (String) objB;
                }
            } else {
                String strD = d(dI);
                mTicketPassengerSelectionUIStateFactory$payBtn$1.L$0 = function2;
                mTicketPassengerSelectionUIStateFactory$payBtn$1.L$1 = buttonUIStateFactory2;
                mTicketPassengerSelectionUIStateFactory$payBtn$1.label = 2;
                objB = stringProvider.b(StringEnum.BTN_TXT_BOOK_MTICKET, new Object[]{strD}, mTicketPassengerSelectionUIStateFactory$payBtn$1);
                if (objB != coroutineSingletons) {
                    buttonUIStateFactory = buttonUIStateFactory2;
                    str = (String) objB;
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            buttonUIStateFactory = (ButtonUIStateFactory) mTicketPassengerSelectionUIStateFactory$payBtn$1.L$1;
            function2 = (Function1) mTicketPassengerSelectionUIStateFactory$payBtn$1.L$0;
            ResultKt.b(objB);
            str = (String) objB;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buttonUIStateFactory = (ButtonUIStateFactory) mTicketPassengerSelectionUIStateFactory$payBtn$1.L$1;
            function2 = (Function1) mTicketPassengerSelectionUIStateFactory$payBtn$1.L$0;
            ResultKt.b(objB);
            str = (String) objB;
        }
        return ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState(str, UITextStyle.HeadlineMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new q70(function2, 26), UIShape.f1926a, false, ChaloThemeHelper.a().p, 20);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object j(ProductBookingRouteDetails productBookingRouteDetails, ProductBookingStopDetails productBookingStopDetails, ProductBookingStopDetails productBookingStopDetails2, boolean z, Function1 function1, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionUIStateFactory$routeDetails$1 mTicketPassengerSelectionUIStateFactory$routeDetails$1;
        Function1 function2;
        final ProductBookingRouteDetails productBookingRouteDetails2;
        ProductBookingStopDetails productBookingStopDetails3;
        ProductBookingStopDetails productBookingStopDetails4;
        boolean z2;
        if (continuationImpl instanceof MTicketPassengerSelectionUIStateFactory$routeDetails$1) {
            mTicketPassengerSelectionUIStateFactory$routeDetails$1 = (MTicketPassengerSelectionUIStateFactory$routeDetails$1) continuationImpl;
            int i = mTicketPassengerSelectionUIStateFactory$routeDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionUIStateFactory$routeDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionUIStateFactory$routeDetails$1 = new MTicketPassengerSelectionUIStateFactory$routeDetails$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionUIStateFactory$routeDetails$1 = new MTicketPassengerSelectionUIStateFactory$routeDetails$1(this, continuationImpl);
        }
        Object objB = mTicketPassengerSelectionUIStateFactory$routeDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionUIStateFactory$routeDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            mTicketPassengerSelectionUIStateFactory$routeDetails$1.L$0 = productBookingRouteDetails;
            mTicketPassengerSelectionUIStateFactory$routeDetails$1.L$1 = productBookingStopDetails;
            mTicketPassengerSelectionUIStateFactory$routeDetails$1.L$2 = productBookingStopDetails2;
            function2 = function1;
            mTicketPassengerSelectionUIStateFactory$routeDetails$1.L$3 = function2;
            mTicketPassengerSelectionUIStateFactory$routeDetails$1.Z$0 = z;
            mTicketPassengerSelectionUIStateFactory$routeDetails$1.label = 1;
            objB = this.f5759a.b(StringEnum.TITLE_TRIP_DETAILS, new Object[0], mTicketPassengerSelectionUIStateFactory$routeDetails$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            productBookingRouteDetails2 = productBookingRouteDetails;
            productBookingStopDetails3 = productBookingStopDetails;
            productBookingStopDetails4 = productBookingStopDetails2;
            z2 = z;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = mTicketPassengerSelectionUIStateFactory$routeDetails$1.Z$0;
            Function1 function3 = (Function1) mTicketPassengerSelectionUIStateFactory$routeDetails$1.L$3;
            productBookingStopDetails4 = (ProductBookingStopDetails) mTicketPassengerSelectionUIStateFactory$routeDetails$1.L$2;
            productBookingStopDetails3 = (ProductBookingStopDetails) mTicketPassengerSelectionUIStateFactory$routeDetails$1.L$1;
            productBookingRouteDetails2 = (ProductBookingRouteDetails) mTicketPassengerSelectionUIStateFactory$routeDetails$1.L$0;
            ResultKt.b(objB);
            z2 = z3;
            function2 = function3;
        }
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        ImageUIState imageUIState = new ImageUIState(IconType.STOPS_LESS, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, z2 ? 0.0f : 180.0f, UiEventHandler.Companion.a(new wg0(function2, 0)), 62);
        if (productBookingRouteDetails2 == null) {
            return null;
        }
        TextWithSpecialFeaturesTagsUIState textWithSpecialFeaturesTagsUIStateC = TextWithSpecialFeaturesTagsUIStateKt.c(0.0f, new Function1<TextWithSpecialFeatureBuilder, Unit>() { // from class: app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionUIStateFactory$routeDetails$3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ArrayList arrayList = ((TextWithSpecialFeatureBuilder) obj).f10091a;
                ProductBookingRouteDetails productBookingRouteDetails3 = productBookingRouteDetails2;
                TextWithSpecialFeatureBuilder.b(arrayList, productBookingRouteDetails3.b, UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, UIFontWeight.SemiBold, 104);
                List list = productBookingRouteDetails3.d;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ProductBookingSpecialFeature) it.next()).f8197a);
                }
                TextWithSpecialFeaturesTagsUIStateKt.a(arrayList, arrayList2);
                return Unit.f17538a;
            }
        }, 3);
        if (productBookingStopDetails3 == null) {
            return null;
        }
        String str = productBookingStopDetails3.b;
        UITextStyle uITextStyle = UITextStyle.HeadlineMedium;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(str, uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        if (productBookingStopDetails4 == null) {
            return null;
        }
        return new MTicketRouteDetailsUIState(chaloTextUIState, imageUIState, textWithSpecialFeaturesTagsUIStateC, chaloTextUIState2, new TextUIState.ChaloTextUIState(productBookingStopDetails4.b, uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), z2);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0105  */
    /* JADX WARN: Code duplicated, block: B:59:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(MTicketTripInfoSnackBarType mTicketTripInfoSnackBarType, Function1 function1, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionUIStateFactory$snackBarUIState$1 mTicketPassengerSelectionUIStateFactory$snackBarUIState$1;
        SnackbarUIStateFactory snackbarUIStateFactory;
        Function1 function2;
        SnackbarUIStateFactory snackbarUIStateFactory2;
        Function1 function3;
        SnackbarUIStateFactory snackbarUIStateFactory3;
        SnackbarUIStateFactory snackbarUIStateFactory4;
        SnackbarUIStateFactory snackbarUIStateFactory5;
        String str;
        Object objB;
        Function1 function4;
        String str2;
        String str3;
        Object objB2;
        Function1 function5;
        String str4;
        if (continuationImpl instanceof MTicketPassengerSelectionUIStateFactory$snackBarUIState$1) {
            mTicketPassengerSelectionUIStateFactory$snackBarUIState$1 = (MTicketPassengerSelectionUIStateFactory$snackBarUIState$1) continuationImpl;
            int i = mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionUIStateFactory$snackBarUIState$1 = new MTicketPassengerSelectionUIStateFactory$snackBarUIState$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionUIStateFactory$snackBarUIState$1 = new MTicketPassengerSelectionUIStateFactory$snackBarUIState$1(this, continuationImpl);
        }
        Object objB3 = mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.label;
        StringProvider stringProvider = this.f5759a;
        switch (i2) {
            case 0:
                ResultKt.b(objB3);
                boolean zD = Intrinsics.d(mTicketTripInfoSnackBarType, MTicketTripInfoSnackBarType.FetchingRouteDetails.f5780a);
                SnackbarUIStateFactory snackbarUIStateFactory6 = SnackbarUIStateFactory.f10071a;
                if (zD) {
                    mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0 = snackbarUIStateFactory6;
                    mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.label = 1;
                    objB3 = stringProvider.b(StringEnum.FETCHING_ROUTE_DETAILS, new Object[0], mTicketPassengerSelectionUIStateFactory$snackBarUIState$1);
                    if (objB3 != coroutineSingletons) {
                        snackbarUIStateFactory5 = snackbarUIStateFactory6;
                        snackbarUIStateFactory5.getClass();
                        return SnackbarUIStateFactory.a((String) objB3, null, null);
                    }
                } else if (Intrinsics.d(mTicketTripInfoSnackBarType, MTicketTripInfoSnackBarType.FetchingUserFreeRideCount.f5781a)) {
                    mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0 = snackbarUIStateFactory6;
                    mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.label = 2;
                    objB3 = stringProvider.b(StringEnum.FETCHING_MTICKET_DATA, new Object[0], mTicketPassengerSelectionUIStateFactory$snackBarUIState$1);
                    if (objB3 != coroutineSingletons) {
                        snackbarUIStateFactory4 = snackbarUIStateFactory6;
                        snackbarUIStateFactory4.getClass();
                        return SnackbarUIStateFactory.a((String) objB3, null, null);
                    }
                } else if (mTicketTripInfoSnackBarType instanceof MTicketTripInfoSnackBarType.ProductFetchFailed) {
                    mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0 = function1;
                    mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$1 = snackbarUIStateFactory6;
                    mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.label = 3;
                    objB3 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], mTicketPassengerSelectionUIStateFactory$snackBarUIState$1);
                    if (objB3 != coroutineSingletons) {
                        function3 = function1;
                        snackbarUIStateFactory3 = snackbarUIStateFactory6;
                        str = (String) objB3;
                        mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0 = function3;
                        mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$1 = snackbarUIStateFactory3;
                        mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$2 = str;
                        mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.label = 4;
                        objB = stringProvider.b(StringEnum.RETRY, new Object[0], mTicketPassengerSelectionUIStateFactory$snackBarUIState$1);
                        if (objB != coroutineSingletons) {
                            function4 = function3;
                            str2 = str;
                            objB3 = objB;
                            q70 q70Var = new q70(function4, 28);
                            snackbarUIStateFactory3.getClass();
                            return SnackbarUIStateFactory.a(str2, (String) objB3, q70Var);
                        }
                    }
                } else {
                    if (Intrinsics.d(mTicketTripInfoSnackBarType, MTicketTripInfoSnackBarType.UserFreeRideCountFailed.f5783a)) {
                        return null;
                    }
                    if (Intrinsics.d(mTicketTripInfoSnackBarType, MTicketTripInfoSnackBarType.FareFetchFailed.f5778a)) {
                        mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0 = function1;
                        mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$1 = snackbarUIStateFactory6;
                        mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.label = 5;
                        objB3 = stringProvider.b(StringEnum.FETCHING_FARE_DETAILS_FAILED, new Object[0], mTicketPassengerSelectionUIStateFactory$snackBarUIState$1);
                        if (objB3 != coroutineSingletons) {
                            function2 = function1;
                            snackbarUIStateFactory2 = snackbarUIStateFactory6;
                            str3 = (String) objB3;
                            mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0 = function2;
                            mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$1 = snackbarUIStateFactory2;
                            mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$2 = str3;
                            mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.label = 6;
                            objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], mTicketPassengerSelectionUIStateFactory$snackBarUIState$1);
                            if (objB2 != coroutineSingletons) {
                                function5 = function2;
                                str4 = str3;
                                objB3 = objB2;
                                q70 q70Var2 = new q70(function5, 29);
                                snackbarUIStateFactory2.getClass();
                                return SnackbarUIStateFactory.a(str4, (String) objB3, q70Var2);
                            }
                        }
                    } else {
                        if (!Intrinsics.d(mTicketTripInfoSnackBarType, MTicketTripInfoSnackBarType.FetchingFareDetails.f5779a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0 = snackbarUIStateFactory6;
                        mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.label = 7;
                        objB3 = stringProvider.b(StringEnum.FETCHING_FARE_DETAILS, new Object[0], mTicketPassengerSelectionUIStateFactory$snackBarUIState$1);
                        if (objB3 != coroutineSingletons) {
                            snackbarUIStateFactory = snackbarUIStateFactory6;
                            snackbarUIStateFactory.getClass();
                            return SnackbarUIStateFactory.a((String) objB3, null, null);
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                snackbarUIStateFactory5 = (SnackbarUIStateFactory) mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0;
                ResultKt.b(objB3);
                snackbarUIStateFactory5.getClass();
                return SnackbarUIStateFactory.a((String) objB3, null, null);
            case 2:
                snackbarUIStateFactory4 = (SnackbarUIStateFactory) mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0;
                ResultKt.b(objB3);
                snackbarUIStateFactory4.getClass();
                return SnackbarUIStateFactory.a((String) objB3, null, null);
            case 3:
                SnackbarUIStateFactory snackbarUIStateFactory7 = (SnackbarUIStateFactory) mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$1;
                Function1 function6 = (Function1) mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0;
                ResultKt.b(objB3);
                snackbarUIStateFactory3 = snackbarUIStateFactory7;
                function3 = function6;
                str = (String) objB3;
                mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0 = function3;
                mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$1 = snackbarUIStateFactory3;
                mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$2 = str;
                mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.label = 4;
                objB = stringProvider.b(StringEnum.RETRY, new Object[0], mTicketPassengerSelectionUIStateFactory$snackBarUIState$1);
                if (objB != coroutineSingletons) {
                    function4 = function3;
                    str2 = str;
                    objB3 = objB;
                    q70 q70Var3 = new q70(function4, 28);
                    snackbarUIStateFactory3.getClass();
                    return SnackbarUIStateFactory.a(str2, (String) objB3, q70Var3);
                }
                return coroutineSingletons;
            case 4:
                str2 = (String) mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$2;
                snackbarUIStateFactory3 = (SnackbarUIStateFactory) mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$1;
                function4 = (Function1) mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0;
                ResultKt.b(objB3);
                q70 q70Var4 = new q70(function4, 28);
                snackbarUIStateFactory3.getClass();
                return SnackbarUIStateFactory.a(str2, (String) objB3, q70Var4);
            case 5:
                SnackbarUIStateFactory snackbarUIStateFactory8 = (SnackbarUIStateFactory) mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$1;
                Function1 function7 = (Function1) mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0;
                ResultKt.b(objB3);
                snackbarUIStateFactory2 = snackbarUIStateFactory8;
                function2 = function7;
                str3 = (String) objB3;
                mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0 = function2;
                mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$1 = snackbarUIStateFactory2;
                mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$2 = str3;
                mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.label = 6;
                objB2 = stringProvider.b(StringEnum.RETRY, new Object[0], mTicketPassengerSelectionUIStateFactory$snackBarUIState$1);
                if (objB2 != coroutineSingletons) {
                    function5 = function2;
                    str4 = str3;
                    objB3 = objB2;
                    q70 q70Var5 = new q70(function5, 29);
                    snackbarUIStateFactory2.getClass();
                    return SnackbarUIStateFactory.a(str4, (String) objB3, q70Var5);
                }
                return coroutineSingletons;
            case 6:
                str4 = (String) mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$2;
                snackbarUIStateFactory2 = (SnackbarUIStateFactory) mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$1;
                function5 = (Function1) mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0;
                ResultKt.b(objB3);
                q70 q70Var6 = new q70(function5, 29);
                snackbarUIStateFactory2.getClass();
                return SnackbarUIStateFactory.a(str4, (String) objB3, q70Var6);
            case 7:
                snackbarUIStateFactory = (SnackbarUIStateFactory) mTicketPassengerSelectionUIStateFactory$snackBarUIState$1.L$0;
                ResultKt.b(objB3);
                snackbarUIStateFactory.getClass();
                return SnackbarUIStateFactory.a((String) objB3, null, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(Function1 function1, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionUIStateFactory$termsText$1 mTicketPassengerSelectionUIStateFactory$termsText$1;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        Function1 function2;
        int i;
        if (continuationImpl instanceof MTicketPassengerSelectionUIStateFactory$termsText$1) {
            mTicketPassengerSelectionUIStateFactory$termsText$1 = (MTicketPassengerSelectionUIStateFactory$termsText$1) continuationImpl;
            int i2 = mTicketPassengerSelectionUIStateFactory$termsText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionUIStateFactory$termsText$1.label = i2 - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionUIStateFactory$termsText$1 = new MTicketPassengerSelectionUIStateFactory$termsText$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionUIStateFactory$termsText$1 = new MTicketPassengerSelectionUIStateFactory$termsText$1(this, continuationImpl);
        }
        Object obj = mTicketPassengerSelectionUIStateFactory$termsText$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = mTicketPassengerSelectionUIStateFactory$termsText$1.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            StyledTextDataUIState[] styledTextDataUIStateArr3 = new StyledTextDataUIState[3];
            UITextStyle uITextStyle = UITextStyle.BodyLarge;
            styledTextDataUIStateArr3[0] = new StyledTextDataUIState("Non Refundable.", ChaloColorToken.Black_60.f9766a, null, uITextStyle, null, null, null, 1012);
            styledTextDataUIStateArr3[1] = new StyledTextDataUIState("  ", ChaloColorToken.Black_87.f9768a, null, uITextStyle, null, null, null, 1012);
            mTicketPassengerSelectionUIStateFactory$termsText$1.L$0 = function1;
            mTicketPassengerSelectionUIStateFactory$termsText$1.L$1 = styledTextDataUIStateArr3;
            mTicketPassengerSelectionUIStateFactory$termsText$1.L$2 = styledTextDataUIStateArr3;
            mTicketPassengerSelectionUIStateFactory$termsText$1.I$0 = 2;
            mTicketPassengerSelectionUIStateFactory$termsText$1.label = 1;
            Object objB = this.f5759a.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], mTicketPassengerSelectionUIStateFactory$termsText$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            styledTextDataUIStateArr = styledTextDataUIStateArr3;
            styledTextDataUIStateArr2 = styledTextDataUIStateArr;
            obj = objB;
            function2 = function1;
            i = 2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = mTicketPassengerSelectionUIStateFactory$termsText$1.I$0;
            styledTextDataUIStateArr = (StyledTextDataUIState[]) mTicketPassengerSelectionUIStateFactory$termsText$1.L$2;
            styledTextDataUIStateArr2 = (StyledTextDataUIState[]) mTicketPassengerSelectionUIStateFactory$termsText$1.L$1;
            function2 = (Function1) mTicketPassengerSelectionUIStateFactory$termsText$1.L$0;
            ResultKt.b(obj);
        }
        styledTextDataUIStateArr[i] = new StyledTextDataUIState((String) obj, ChaloColorToken.OrangePrimary.f9835a, null, UITextStyle.BodyLarge, null, null, new StyledTextClickHandler$Companion$create$1("TNC", "TNC", new q70(function2, 27)), ServiceStarter.ERROR_UNKNOWN);
        return new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr2), null, null, 30);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0178  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object m(ShowTncDialogData showTncDialogData, Function1 function1, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionUIStateFactory$tncDialog$1 mTicketPassengerSelectionUIStateFactory$tncDialog$1;
        Function1 function2;
        ShowTncDialogData showTncDialogData2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        List list;
        ButtonUIState buttonUIState;
        Object objB;
        ButtonUIState buttonUIState2;
        Function1 function3;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        List list2;
        if (continuationImpl instanceof MTicketPassengerSelectionUIStateFactory$tncDialog$1) {
            mTicketPassengerSelectionUIStateFactory$tncDialog$1 = (MTicketPassengerSelectionUIStateFactory$tncDialog$1) continuationImpl;
            int i = mTicketPassengerSelectionUIStateFactory$tncDialog$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionUIStateFactory$tncDialog$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionUIStateFactory$tncDialog$1 = new MTicketPassengerSelectionUIStateFactory$tncDialog$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionUIStateFactory$tncDialog$1 = new MTicketPassengerSelectionUIStateFactory$tncDialog$1(this, continuationImpl);
        }
        Object objB2 = mTicketPassengerSelectionUIStateFactory$tncDialog$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionUIStateFactory$tncDialog$1.label;
        StringProvider stringProvider = this.f5759a;
        if (i2 == 0) {
            ResultKt.b(objB2);
            mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$0 = showTncDialogData;
            function2 = function1;
            mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$1 = function2;
            mTicketPassengerSelectionUIStateFactory$tncDialog$1.label = 1;
            objB2 = stringProvider.b(StringEnum.TERMS_AND_CONDITIONS, new Object[0], mTicketPassengerSelectionUIStateFactory$tncDialog$1);
            if (objB2 != coroutineSingletons) {
                showTncDialogData2 = showTncDialogData;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            Function1 function4 = (Function1) mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$1;
            showTncDialogData2 = (ShowTncDialogData) mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$0;
            ResultKt.b(objB2);
            function2 = function4;
        } else {
            if (i2 == 2) {
                List list3 = (List) mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState3 = (TextUIState.ChaloTextUIState) mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$1;
                Function1 function5 = (Function1) mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$0;
                ResultKt.b(objB2);
                chaloTextUIState = chaloTextUIState3;
                function2 = function5;
                list = list3;
                buttonUIState = new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.Black.f9759a, 0, UITextAlign.Right, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new q70(function2, 23)), 0.0f, null, 222);
                mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$0 = function2;
                mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$1 = chaloTextUIState;
                mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$2 = list;
                mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$3 = buttonUIState;
                mTicketPassengerSelectionUIStateFactory$tncDialog$1.label = 3;
                objB = stringProvider.b(StringEnum.ACCEPT_CAPS, new Object[0], mTicketPassengerSelectionUIStateFactory$tncDialog$1);
                if (objB != coroutineSingletons) {
                    buttonUIState2 = buttonUIState;
                    objB2 = objB;
                    function3 = function2;
                    chaloTextUIState2 = chaloTextUIState;
                    list2 = list;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            buttonUIState2 = (ButtonUIState) mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$3;
            List list4 = (List) mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$2;
            TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$1;
            function3 = (Function1) mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$0;
            ResultKt.b(objB2);
            chaloTextUIState2 = chaloTextUIState4;
            list2 = list4;
        }
        return new TnCDialogUIState(DialogUIEventHandler.d, chaloTextUIState2, list2, new ButtonContainerUIState(null, buttonUIState2, new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Right, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new q70(function3, 25)), 0.0f, null, 222), 9), 33);
        chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156);
        List list5 = showTncDialogData2.f5763a;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list5, 10));
        int i3 = 0;
        for (Object obj : list5) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.z0();
                throw null;
            }
            String strH = cb0.h(i4, ") ");
            UITextStyle uITextStyle = UITextStyle.BodyMedium;
            ChaloColorToken.Black_60 black_60 = ChaloColorToken.Black_60.f9766a;
            arrayList.add(new TermTextUIState(new TextUIState.ChaloTextUIState(strH, uITextStyle, black_60, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState((String) obj, uITextStyle, black_60, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)));
            i3 = i4;
        }
        mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$0 = function2;
        mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$1 = chaloTextUIState;
        mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$2 = arrayList;
        mTicketPassengerSelectionUIStateFactory$tncDialog$1.label = 2;
        objB2 = stringProvider.b(StringEnum.CANCEL_CAPS, new Object[0], mTicketPassengerSelectionUIStateFactory$tncDialog$1);
        list = arrayList;
        if (objB2 != coroutineSingletons) {
            buttonUIState = new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.Black.f9759a, 0, UITextAlign.Right, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new q70(function2, 23)), 0.0f, null, 222);
            mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$0 = function2;
            mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$1 = chaloTextUIState;
            mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$2 = list;
            mTicketPassengerSelectionUIStateFactory$tncDialog$1.L$3 = buttonUIState;
            mTicketPassengerSelectionUIStateFactory$tncDialog$1.label = 3;
            objB = stringProvider.b(StringEnum.ACCEPT_CAPS, new Object[0], mTicketPassengerSelectionUIStateFactory$tncDialog$1);
            if (objB != coroutineSingletons) {
                buttonUIState2 = buttonUIState;
                objB2 = objB;
                function3 = function2;
                chaloTextUIState2 = chaloTextUIState;
                list2 = list;
                return new TnCDialogUIState(DialogUIEventHandler.d, chaloTextUIState2, list2, new ButtonContainerUIState(null, buttonUIState2, new ButtonUIState(new TextUIState.ChaloTextUIState((String) objB2, UITextStyle.HeadlineMedium, ChaloColorToken.OrangePrimary.f9835a, 0, UITextAlign.Right, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152), false, null, null, null, UiEventHandler.Companion.a(new q70(function3, 25)), 0.0f, null, 222), 9), 33);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object n(MTicketFareContainer mTicketFareContainer, ContinuationImpl continuationImpl) {
        MTicketPassengerSelectionUIStateFactory$totalAmount$1 mTicketPassengerSelectionUIStateFactory$totalAmount$1;
        MTicketFareContainer mTicketFareContainer2;
        if (continuationImpl instanceof MTicketPassengerSelectionUIStateFactory$totalAmount$1) {
            mTicketPassengerSelectionUIStateFactory$totalAmount$1 = (MTicketPassengerSelectionUIStateFactory$totalAmount$1) continuationImpl;
            int i = mTicketPassengerSelectionUIStateFactory$totalAmount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketPassengerSelectionUIStateFactory$totalAmount$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketPassengerSelectionUIStateFactory$totalAmount$1 = new MTicketPassengerSelectionUIStateFactory$totalAmount$1(this, continuationImpl);
            }
        } else {
            mTicketPassengerSelectionUIStateFactory$totalAmount$1 = new MTicketPassengerSelectionUIStateFactory$totalAmount$1(this, continuationImpl);
        }
        Object objB = mTicketPassengerSelectionUIStateFactory$totalAmount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketPassengerSelectionUIStateFactory$totalAmount$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            mTicketPassengerSelectionUIStateFactory$totalAmount$1.L$0 = mTicketFareContainer;
            mTicketPassengerSelectionUIStateFactory$totalAmount$1.label = 1;
            objB = this.f5759a.b(StringEnum.TOTAL_AMOUNT, new Object[0], mTicketPassengerSelectionUIStateFactory$totalAmount$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            mTicketFareContainer2 = mTicketFareContainer;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mTicketFareContainer2 = (MTicketFareContainer) mTicketPassengerSelectionUIStateFactory$totalAmount$1.L$0;
            ResultKt.b(objB);
        }
        UITextStyle uITextStyle = UITextStyle.DisplaySmall;
        UITextOverflow uITextOverflow = UITextOverflow.Ellipsis;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState((String) objB, uITextStyle, black_87, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, uITextOverflow, (UIFontStyle) null, (String) null, 7152);
        mTicketFareContainer2.getClass();
        return new TitleAndDescSpaceBetweenUIState(new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 0.0f, 0.0f, 14), chaloTextUIState, new TextUIState.ChaloTextUIState(d(this.b.i(mTicketFareContainer2.f5726a)), uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
    }
}
