package app.chalo.productsummary.ui.ticket;

import app.chalo.behaviour.policy.TicketReceiptFormatConfig;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketSummaryReceiptUIStatesKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8821a;

        static {
            int[] iArr = new int[TicketReceiptFormatConfig.values().length];
            try {
                iArr[TicketReceiptFormatConfig.COMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TicketReceiptFormatConfig.BMTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8821a = iArr;
        }
    }

    public static TextUIState.ChaloTextUIState a(String str, UITextStyle uITextStyle) {
        return new TextUIState.ChaloTextUIState(str, uITextStyle, ChaloColorToken.Black.f9759a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
    }

    public static TextUIState.ChaloTextUIState b(String str) {
        return new TextUIState.ChaloTextUIState(str, UITextStyle.BodyMedium, ChaloColorToken.Black.f9759a, 0, UITextAlign.Left, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
    }
}
