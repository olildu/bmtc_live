package app.chalo.uistate.base;

import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.vo1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ò\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\by\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:y\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz\u0082\u0001í\u0001{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001»\u0001¼\u0001½\u0001¾\u0001¿\u0001À\u0001Á\u0001Â\u0001Ã\u0001Ä\u0001Å\u0001Æ\u0001Ç\u0001È\u0001É\u0001Ê\u0001Ë\u0001Ì\u0001Í\u0001Î\u0001Ï\u0001Ð\u0001Ñ\u0001Ò\u0001Ó\u0001Ô\u0001Õ\u0001Ö\u0001×\u0001Ø\u0001Ù\u0001Ú\u0001Û\u0001Ü\u0001Ý\u0001Þ\u0001ß\u0001à\u0001á\u0001â\u0001ã\u0001ä\u0001å\u0001æ\u0001ç\u0001è\u0001é\u0001ê\u0001ë\u0001ì\u0001í\u0001î\u0001ï\u0001ð\u0001ñ\u0001ò\u0001ó\u0001¨\u0006ô\u0001"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken;", "", "AcGreen", "ActivityBackground", "AlmostBlackColor", "AlmostBlackColor_60", "AmountAddedText", "Black", "Black_03", "Black_12", "Black_20", "Black_30", "Black_40", "Black_54", "Black_60", "Black_70", "Black_87", "Black_90", "Blue", "BrightRed", "Brown_20", "BusAgencyTagBackground", "CardLinearDark", "CardLinearLight", "CapeHoneyYellow", "ChaloBlueEta", "CornSilk", "CornSilkDark", "CornSilkGradient", "DarkGolden", "MidGreen", "MidDarkGreen", "DarkGreen", "DarkGreyColor", "DarkPurple", "DarkRed", "DimGrey", "DisabledBusGreyColor", "DiscountGreen", "DiscountGreen2", "DiscountPercentBgGreen", "DiscountPercentTextGreen", "DividerColor", "ErrorColor", "FilterItemTextColor", "FooterColor", "Gray42", "Gray85", "Green", "GreenBase", "Grey8", "Grey9E", "GreyBorderColor", "GreyC2", "GreyColor", "GreyishBlue", "GreyUnderline", "HomeScreenHeaderColor", "IndicatorYellow", "ItemDividerColor", "IvoryYellow", "LightBlue", "LightGray", "LightGrey", "LightOrange", "LightOrangeSpf", "LightOrangeSpfDark", "LightTextColor", "LightYellow", "LightYellow2", "Linen", "MapOverlayBorderColor", "MapOverlayColor", "NewActivityColor", "OnBoardingSeparatorGradientEnd", "OnBoardingSeparatorGradientStart", "Orange2", "Orange3", "OrangeBackground", "OrangeBackgroundDark", "OrangeBackgroundLight", "OrangePrimary", "OrangePrimaryDisabled", "OrangeSound", "PaleRed", "PaleYellowGradient", "PlaceholderTextColor", "PremBusGradient1", "PremBusGradient2", "ProductProgressStatus", "ProductProgressStatusBorder", "RealTimeFetchingStringColor", "RedBase", "RescheduleColor", "RippleGray", "SectionDividerColor", "Shadow", "ShadyGray", "ShimmerBackground", "ShimmerColor", "SilverGrey", "SpecialFeatureBackGround", "SpecialFeatureTagBackgroundColor", "StrikeOffFontColor", "TabTitleDividerColor", "TextFieldIndicator", "TicketStatusYellow", "TitoOnboardingScreenYellow", "ToolbarBgColor", "Transparent", "TruecallerBlue", "UnselectedDot", "UserProfileLinearLight", "VeryLightGrey", "ViewScheduleColor", "White", "White87", "Yellow", "Yellow50", "YesBankGray", "TicketDividerColor", "GreenColor", TypedValues.Custom.NAME, "Lapp/chalo/uistate/base/ChaloColorToken$AcGreen;", "Lapp/chalo/uistate/base/ChaloColorToken$ActivityBackground;", "Lapp/chalo/uistate/base/ChaloColorToken$AlmostBlackColor;", "Lapp/chalo/uistate/base/ChaloColorToken$AlmostBlackColor_60;", "Lapp/chalo/uistate/base/ChaloColorToken$AmountAddedText;", "Lapp/chalo/uistate/base/ChaloColorToken$Black;", "Lapp/chalo/uistate/base/ChaloColorToken$Black_03;", "Lapp/chalo/uistate/base/ChaloColorToken$Black_12;", "Lapp/chalo/uistate/base/ChaloColorToken$Black_20;", "Lapp/chalo/uistate/base/ChaloColorToken$Black_30;", "Lapp/chalo/uistate/base/ChaloColorToken$Black_40;", "Lapp/chalo/uistate/base/ChaloColorToken$Black_54;", "Lapp/chalo/uistate/base/ChaloColorToken$Black_60;", "Lapp/chalo/uistate/base/ChaloColorToken$Black_70;", "Lapp/chalo/uistate/base/ChaloColorToken$Black_87;", "Lapp/chalo/uistate/base/ChaloColorToken$Black_90;", "Lapp/chalo/uistate/base/ChaloColorToken$Blue;", "Lapp/chalo/uistate/base/ChaloColorToken$BrightRed;", "Lapp/chalo/uistate/base/ChaloColorToken$Brown_20;", "Lapp/chalo/uistate/base/ChaloColorToken$BusAgencyTagBackground;", "Lapp/chalo/uistate/base/ChaloColorToken$CapeHoneyYellow;", "Lapp/chalo/uistate/base/ChaloColorToken$CardLinearDark;", "Lapp/chalo/uistate/base/ChaloColorToken$CardLinearLight;", "Lapp/chalo/uistate/base/ChaloColorToken$ChaloBlueEta;", "Lapp/chalo/uistate/base/ChaloColorToken$CornSilk;", "Lapp/chalo/uistate/base/ChaloColorToken$CornSilkDark;", "Lapp/chalo/uistate/base/ChaloColorToken$CornSilkGradient;", "Lapp/chalo/uistate/base/ChaloColorToken$Custom;", "Lapp/chalo/uistate/base/ChaloColorToken$DarkGolden;", "Lapp/chalo/uistate/base/ChaloColorToken$DarkGreen;", "Lapp/chalo/uistate/base/ChaloColorToken$DarkGreyColor;", "Lapp/chalo/uistate/base/ChaloColorToken$DarkPurple;", "Lapp/chalo/uistate/base/ChaloColorToken$DarkRed;", "Lapp/chalo/uistate/base/ChaloColorToken$DimGrey;", "Lapp/chalo/uistate/base/ChaloColorToken$DisabledBusGreyColor;", "Lapp/chalo/uistate/base/ChaloColorToken$DiscountGreen;", "Lapp/chalo/uistate/base/ChaloColorToken$DiscountGreen2;", "Lapp/chalo/uistate/base/ChaloColorToken$DiscountPercentBgGreen;", "Lapp/chalo/uistate/base/ChaloColorToken$DiscountPercentTextGreen;", "Lapp/chalo/uistate/base/ChaloColorToken$DividerColor;", "Lapp/chalo/uistate/base/ChaloColorToken$ErrorColor;", "Lapp/chalo/uistate/base/ChaloColorToken$FilterItemTextColor;", "Lapp/chalo/uistate/base/ChaloColorToken$FooterColor;", "Lapp/chalo/uistate/base/ChaloColorToken$Gray42;", "Lapp/chalo/uistate/base/ChaloColorToken$Gray85;", "Lapp/chalo/uistate/base/ChaloColorToken$Green;", "Lapp/chalo/uistate/base/ChaloColorToken$GreenBase;", "Lapp/chalo/uistate/base/ChaloColorToken$GreenColor;", "Lapp/chalo/uistate/base/ChaloColorToken$Grey8;", "Lapp/chalo/uistate/base/ChaloColorToken$Grey9E;", "Lapp/chalo/uistate/base/ChaloColorToken$GreyBorderColor;", "Lapp/chalo/uistate/base/ChaloColorToken$GreyC2;", "Lapp/chalo/uistate/base/ChaloColorToken$GreyColor;", "Lapp/chalo/uistate/base/ChaloColorToken$GreyUnderline;", "Lapp/chalo/uistate/base/ChaloColorToken$GreyishBlue;", "Lapp/chalo/uistate/base/ChaloColorToken$HomeScreenHeaderColor;", "Lapp/chalo/uistate/base/ChaloColorToken$IndicatorYellow;", "Lapp/chalo/uistate/base/ChaloColorToken$ItemDividerColor;", "Lapp/chalo/uistate/base/ChaloColorToken$IvoryYellow;", "Lapp/chalo/uistate/base/ChaloColorToken$LightBlue;", "Lapp/chalo/uistate/base/ChaloColorToken$LightGray;", "Lapp/chalo/uistate/base/ChaloColorToken$LightGrey;", "Lapp/chalo/uistate/base/ChaloColorToken$LightOrange;", "Lapp/chalo/uistate/base/ChaloColorToken$LightOrangeSpf;", "Lapp/chalo/uistate/base/ChaloColorToken$LightOrangeSpfDark;", "Lapp/chalo/uistate/base/ChaloColorToken$LightTextColor;", "Lapp/chalo/uistate/base/ChaloColorToken$LightYellow;", "Lapp/chalo/uistate/base/ChaloColorToken$LightYellow2;", "Lapp/chalo/uistate/base/ChaloColorToken$Linen;", "Lapp/chalo/uistate/base/ChaloColorToken$MapOverlayBorderColor;", "Lapp/chalo/uistate/base/ChaloColorToken$MapOverlayColor;", "Lapp/chalo/uistate/base/ChaloColorToken$MidDarkGreen;", "Lapp/chalo/uistate/base/ChaloColorToken$MidGreen;", "Lapp/chalo/uistate/base/ChaloColorToken$NewActivityColor;", "Lapp/chalo/uistate/base/ChaloColorToken$OnBoardingSeparatorGradientEnd;", "Lapp/chalo/uistate/base/ChaloColorToken$OnBoardingSeparatorGradientStart;", "Lapp/chalo/uistate/base/ChaloColorToken$Orange2;", "Lapp/chalo/uistate/base/ChaloColorToken$Orange3;", "Lapp/chalo/uistate/base/ChaloColorToken$OrangeBackground;", "Lapp/chalo/uistate/base/ChaloColorToken$OrangeBackgroundDark;", "Lapp/chalo/uistate/base/ChaloColorToken$OrangeBackgroundLight;", "Lapp/chalo/uistate/base/ChaloColorToken$OrangePrimary;", "Lapp/chalo/uistate/base/ChaloColorToken$OrangePrimaryDisabled;", "Lapp/chalo/uistate/base/ChaloColorToken$OrangeSound;", "Lapp/chalo/uistate/base/ChaloColorToken$PaleRed;", "Lapp/chalo/uistate/base/ChaloColorToken$PaleYellowGradient;", "Lapp/chalo/uistate/base/ChaloColorToken$PlaceholderTextColor;", "Lapp/chalo/uistate/base/ChaloColorToken$PremBusGradient1;", "Lapp/chalo/uistate/base/ChaloColorToken$PremBusGradient2;", "Lapp/chalo/uistate/base/ChaloColorToken$ProductProgressStatus;", "Lapp/chalo/uistate/base/ChaloColorToken$ProductProgressStatusBorder;", "Lapp/chalo/uistate/base/ChaloColorToken$RealTimeFetchingStringColor;", "Lapp/chalo/uistate/base/ChaloColorToken$RedBase;", "Lapp/chalo/uistate/base/ChaloColorToken$RescheduleColor;", "Lapp/chalo/uistate/base/ChaloColorToken$RippleGray;", "Lapp/chalo/uistate/base/ChaloColorToken$SectionDividerColor;", "Lapp/chalo/uistate/base/ChaloColorToken$Shadow;", "Lapp/chalo/uistate/base/ChaloColorToken$ShadyGray;", "Lapp/chalo/uistate/base/ChaloColorToken$ShimmerBackground;", "Lapp/chalo/uistate/base/ChaloColorToken$ShimmerColor;", "Lapp/chalo/uistate/base/ChaloColorToken$SilverGrey;", "Lapp/chalo/uistate/base/ChaloColorToken$SpecialFeatureBackGround;", "Lapp/chalo/uistate/base/ChaloColorToken$SpecialFeatureTagBackgroundColor;", "Lapp/chalo/uistate/base/ChaloColorToken$StrikeOffFontColor;", "Lapp/chalo/uistate/base/ChaloColorToken$TabTitleDividerColor;", "Lapp/chalo/uistate/base/ChaloColorToken$TextFieldIndicator;", "Lapp/chalo/uistate/base/ChaloColorToken$TicketDividerColor;", "Lapp/chalo/uistate/base/ChaloColorToken$TicketStatusYellow;", "Lapp/chalo/uistate/base/ChaloColorToken$TitoOnboardingScreenYellow;", "Lapp/chalo/uistate/base/ChaloColorToken$ToolbarBgColor;", "Lapp/chalo/uistate/base/ChaloColorToken$Transparent;", "Lapp/chalo/uistate/base/ChaloColorToken$TruecallerBlue;", "Lapp/chalo/uistate/base/ChaloColorToken$UnselectedDot;", "Lapp/chalo/uistate/base/ChaloColorToken$UserProfileLinearLight;", "Lapp/chalo/uistate/base/ChaloColorToken$VeryLightGrey;", "Lapp/chalo/uistate/base/ChaloColorToken$ViewScheduleColor;", "Lapp/chalo/uistate/base/ChaloColorToken$White;", "Lapp/chalo/uistate/base/ChaloColorToken$White87;", "Lapp/chalo/uistate/base/ChaloColorToken$Yellow;", "Lapp/chalo/uistate/base/ChaloColorToken$Yellow50;", "Lapp/chalo/uistate/base/ChaloColorToken$YesBankGray;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloColorToken {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$AcGreen;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AcGreen extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AcGreen f9754a = new AcGreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AcGreen);
        }

        public final int hashCode() {
            return 891914424;
        }

        public final String toString() {
            return "AcGreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$ActivityBackground;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActivityBackground extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActivityBackground f9755a = new ActivityBackground();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActivityBackground);
        }

        public final int hashCode() {
            return -64969594;
        }

        public final String toString() {
            return "ActivityBackground";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$AlmostBlackColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AlmostBlackColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AlmostBlackColor f9756a = new AlmostBlackColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AlmostBlackColor);
        }

        public final int hashCode() {
            return 1193605275;
        }

        public final String toString() {
            return "AlmostBlackColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$AlmostBlackColor_60;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AlmostBlackColor_60 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AlmostBlackColor_60 f9757a = new AlmostBlackColor_60();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AlmostBlackColor_60);
        }

        public final int hashCode() {
            return 660596958;
        }

        public final String toString() {
            return "AlmostBlackColor_60";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$AmountAddedText;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AmountAddedText extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AmountAddedText f9758a = new AmountAddedText();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AmountAddedText);
        }

        public final int hashCode() {
            return -2101307764;
        }

        public final String toString() {
            return "AmountAddedText";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Black;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Black extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Black f9759a = new Black();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Black);
        }

        public final int hashCode() {
            return 574210678;
        }

        public final String toString() {
            return "Black";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Black_03;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Black_03 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Black_03 f9760a = new Black_03();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Black_03);
        }

        public final int hashCode() {
            return -544338836;
        }

        public final String toString() {
            return "Black_03";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Black_12;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Black_12 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Black_12 f9761a = new Black_12();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Black_12);
        }

        public final int hashCode() {
            return -544338806;
        }

        public final String toString() {
            return "Black_12";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Black_20;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Black_20 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Black_20 f9762a = new Black_20();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Black_20);
        }

        public final int hashCode() {
            return -544338777;
        }

        public final String toString() {
            return "Black_20";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Black_30;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Black_30 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Black_30 f9763a = new Black_30();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Black_30);
        }

        public final int hashCode() {
            return -544338746;
        }

        public final String toString() {
            return "Black_30";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Black_40;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Black_40 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Black_40 f9764a = new Black_40();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Black_40);
        }

        public final int hashCode() {
            return -544338715;
        }

        public final String toString() {
            return "Black_40";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Black_54;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Black_54 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Black_54 f9765a = new Black_54();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Black_54);
        }

        public final int hashCode() {
            return -544338680;
        }

        public final String toString() {
            return "Black_54";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Black_60;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Black_60 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Black_60 f9766a = new Black_60();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Black_60);
        }

        public final int hashCode() {
            return -544338653;
        }

        public final String toString() {
            return "Black_60";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Black_70;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Black_70 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Black_70 f9767a = new Black_70();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Black_70);
        }

        public final int hashCode() {
            return -544338622;
        }

        public final String toString() {
            return "Black_70";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Black_87;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Black_87 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Black_87 f9768a = new Black_87();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Black_87);
        }

        public final int hashCode() {
            return -544338584;
        }

        public final String toString() {
            return "Black_87";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Black_90;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Black_90 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Black_90 f9769a = new Black_90();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Black_90);
        }

        public final int hashCode() {
            return -544338560;
        }

        public final String toString() {
            return "Black_90";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Blue;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Blue extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Blue f9770a = new Blue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Blue);
        }

        public final int hashCode() {
            return -674213117;
        }

        public final String toString() {
            return "Blue";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$BrightRed;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BrightRed extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BrightRed f9771a = new BrightRed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BrightRed);
        }

        public final int hashCode() {
            return 794793518;
        }

        public final String toString() {
            return "BrightRed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Brown_20;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Brown_20 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Brown_20 f9772a = new Brown_20();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Brown_20);
        }

        public final int hashCode() {
            return 905083920;
        }

        public final String toString() {
            return "Brown_20";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$BusAgencyTagBackground;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BusAgencyTagBackground extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BusAgencyTagBackground f9773a = new BusAgencyTagBackground();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BusAgencyTagBackground);
        }

        public final int hashCode() {
            return 1970675756;
        }

        public final String toString() {
            return "BusAgencyTagBackground";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$CapeHoneyYellow;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CapeHoneyYellow extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CapeHoneyYellow f9774a = new CapeHoneyYellow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CapeHoneyYellow);
        }

        public final int hashCode() {
            return -293377933;
        }

        public final String toString() {
            return "CapeHoneyYellow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$CardLinearDark;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardLinearDark extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardLinearDark f9775a = new CardLinearDark();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardLinearDark);
        }

        public final int hashCode() {
            return -1307033900;
        }

        public final String toString() {
            return "CardLinearDark";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$CardLinearLight;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CardLinearLight extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardLinearLight f9776a = new CardLinearLight();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CardLinearLight);
        }

        public final int hashCode() {
            return -1855729288;
        }

        public final String toString() {
            return "CardLinearLight";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$ChaloBlueEta;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloBlueEta extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChaloBlueEta f9777a = new ChaloBlueEta();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChaloBlueEta);
        }

        public final int hashCode() {
            return 230982754;
        }

        public final String toString() {
            return "ChaloBlueEta";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$CornSilk;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CornSilk extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CornSilk f9778a = new CornSilk();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CornSilk);
        }

        public final int hashCode() {
            return 62166086;
        }

        public final String toString() {
            return "CornSilk";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$CornSilkDark;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CornSilkDark extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CornSilkDark f9779a = new CornSilkDark();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CornSilkDark);
        }

        public final int hashCode() {
            return 860185820;
        }

        public final String toString() {
            return "CornSilkDark";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$CornSilkGradient;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CornSilkGradient extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CornSilkGradient f9780a = new CornSilkGradient();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CornSilkGradient);
        }

        public final int hashCode() {
            return 868829590;
        }

        public final String toString() {
            return "CornSilkGradient";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Custom;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Custom extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9781a;

        public Custom(long j) {
            this.f9781a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Custom) && Color.m4606equalsimpl0(this.f9781a, ((Custom) obj).f9781a);
        }

        public final int hashCode() {
            return Color.m4612hashCodeimpl(this.f9781a);
        }

        public final String toString() {
            return vo1.B("Custom(color=", Color.m4613toStringimpl(this.f9781a), ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$DarkGolden;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DarkGolden extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DarkGolden f9782a = new DarkGolden();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DarkGolden);
        }

        public final int hashCode() {
            return 244555784;
        }

        public final String toString() {
            return "DarkGolden";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$DarkGreen;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DarkGreen extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DarkGreen f9783a = new DarkGreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DarkGreen);
        }

        public final int hashCode() {
            return 1393444900;
        }

        public final String toString() {
            return "DarkGreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$DarkGreyColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DarkGreyColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DarkGreyColor f9784a = new DarkGreyColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DarkGreyColor);
        }

        public final int hashCode() {
            return 882681957;
        }

        public final String toString() {
            return "DarkGreyColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$DarkPurple;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DarkPurple extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DarkPurple f9785a = new DarkPurple();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DarkPurple);
        }

        public final int hashCode() {
            return 507949755;
        }

        public final String toString() {
            return "DarkPurple";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$DarkRed;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DarkRed extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DarkRed f9786a = new DarkRed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DarkRed);
        }

        public final int hashCode() {
            return -758315534;
        }

        public final String toString() {
            return "DarkRed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$DimGrey;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DimGrey extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DimGrey f9787a = new DimGrey();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DimGrey);
        }

        public final int hashCode() {
            return -534941634;
        }

        public final String toString() {
            return "DimGrey";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$DisabledBusGreyColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DisabledBusGreyColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DisabledBusGreyColor f9788a = new DisabledBusGreyColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DisabledBusGreyColor);
        }

        public final int hashCode() {
            return 958201449;
        }

        public final String toString() {
            return "DisabledBusGreyColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$DiscountGreen;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DiscountGreen extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DiscountGreen f9789a = new DiscountGreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DiscountGreen);
        }

        public final int hashCode() {
            return -1696508487;
        }

        public final String toString() {
            return "DiscountGreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$DiscountGreen2;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DiscountGreen2 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DiscountGreen2 f9790a = new DiscountGreen2();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DiscountGreen2);
        }

        public final int hashCode() {
            return -1052155495;
        }

        public final String toString() {
            return "DiscountGreen2";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$DiscountPercentBgGreen;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DiscountPercentBgGreen extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DiscountPercentBgGreen f9791a = new DiscountPercentBgGreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DiscountPercentBgGreen);
        }

        public final int hashCode() {
            return -1806096445;
        }

        public final String toString() {
            return "DiscountPercentBgGreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$DiscountPercentTextGreen;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DiscountPercentTextGreen extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DiscountPercentTextGreen f9792a = new DiscountPercentTextGreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DiscountPercentTextGreen);
        }

        public final int hashCode() {
            return -1584016741;
        }

        public final String toString() {
            return "DiscountPercentTextGreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$DividerColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DividerColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DividerColor f9793a = new DividerColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DividerColor);
        }

        public final int hashCode() {
            return -1008558733;
        }

        public final String toString() {
            return "DividerColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$ErrorColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ErrorColor f9794a = new ErrorColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorColor);
        }

        public final int hashCode() {
            return -168349148;
        }

        public final String toString() {
            return "ErrorColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$FilterItemTextColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FilterItemTextColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FilterItemTextColor f9795a = new FilterItemTextColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FilterItemTextColor);
        }

        public final int hashCode() {
            return 1243182594;
        }

        public final String toString() {
            return "FilterItemTextColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$FooterColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FooterColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FooterColor f9796a = new FooterColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FooterColor);
        }

        public final int hashCode() {
            return 1772621759;
        }

        public final String toString() {
            return "FooterColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Gray42;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gray42 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Gray42 f9797a = new Gray42();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Gray42);
        }

        public final int hashCode() {
            return 769368202;
        }

        public final String toString() {
            return "Gray42";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Gray85;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gray85 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Gray85 f9798a = new Gray85();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Gray85);
        }

        public final int hashCode() {
            return 769368329;
        }

        public final String toString() {
            return "Gray85";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Green;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Green extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Green f9799a = new Green();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Green);
        }

        public final int hashCode() {
            return 579010938;
        }

        public final String toString() {
            return "Green";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$GreenBase;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GreenBase extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GreenBase f9800a = new GreenBase();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GreenBase);
        }

        public final int hashCode() {
            return 1039216491;
        }

        public final String toString() {
            return "GreenBase";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$GreenColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GreenColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GreenColor f9801a = new GreenColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GreenColor);
        }

        public final int hashCode() {
            return -2142692855;
        }

        public final String toString() {
            return "GreenColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Grey8;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Grey8 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Grey8 f9802a = new Grey8();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Grey8);
        }

        public final int hashCode() {
            return 579011504;
        }

        public final String toString() {
            return "Grey8";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Grey9E;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Grey9E extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Grey9E f9803a = new Grey9E();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Grey9E);
        }

        public final int hashCode() {
            return 769487540;
        }

        public final String toString() {
            return "Grey9E";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$GreyBorderColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GreyBorderColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GreyBorderColor f9804a = new GreyBorderColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GreyBorderColor);
        }

        public final int hashCode() {
            return 579746799;
        }

        public final String toString() {
            return "GreyBorderColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$GreyC2;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GreyC2 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GreyC2 f9805a = new GreyC2();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GreyC2);
        }

        public final int hashCode() {
            return 769487831;
        }

        public final String toString() {
            return "GreyC2";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$GreyColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GreyColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GreyColor f9806a = new GreyColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GreyColor);
        }

        public final int hashCode() {
            return 1573439163;
        }

        public final String toString() {
            return "GreyColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$GreyUnderline;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GreyUnderline extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GreyUnderline f9807a = new GreyUnderline();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GreyUnderline);
        }

        public final int hashCode() {
            return 1998582308;
        }

        public final String toString() {
            return "GreyUnderline";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$GreyishBlue;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GreyishBlue extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GreyishBlue f9808a = new GreyishBlue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GreyishBlue);
        }

        public final int hashCode() {
            return -278571152;
        }

        public final String toString() {
            return "GreyishBlue";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$HomeScreenHeaderColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HomeScreenHeaderColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HomeScreenHeaderColor f9809a = new HomeScreenHeaderColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HomeScreenHeaderColor);
        }

        public final int hashCode() {
            return -2071477726;
        }

        public final String toString() {
            return "HomeScreenHeaderColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$IndicatorYellow;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IndicatorYellow extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IndicatorYellow f9810a = new IndicatorYellow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof IndicatorYellow);
        }

        public final int hashCode() {
            return -524103398;
        }

        public final String toString() {
            return "IndicatorYellow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$ItemDividerColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemDividerColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ItemDividerColor f9811a = new ItemDividerColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ItemDividerColor);
        }

        public final int hashCode() {
            return -156669018;
        }

        public final String toString() {
            return "ItemDividerColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$IvoryYellow;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IvoryYellow extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IvoryYellow f9812a = new IvoryYellow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof IvoryYellow);
        }

        public final int hashCode() {
            return -3726924;
        }

        public final String toString() {
            return "IvoryYellow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$LightBlue;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LightBlue extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LightBlue f9813a = new LightBlue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LightBlue);
        }

        public final int hashCode() {
            return -342065785;
        }

        public final String toString() {
            return "LightBlue";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$LightGray;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LightGray extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LightGray f9814a = new LightGray();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LightGray);
        }

        public final int hashCode() {
            return -341911664;
        }

        public final String toString() {
            return "LightGray";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$LightGrey;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LightGrey extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LightGrey f9815a = new LightGrey();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LightGrey);
        }

        public final int hashCode() {
            return -341911540;
        }

        public final String toString() {
            return "LightGrey";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$LightOrange;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LightOrange extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LightOrange f9816a = new LightOrange();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LightOrange);
        }

        public final int hashCode() {
            return -1930568677;
        }

        public final String toString() {
            return "LightOrange";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$LightOrangeSpf;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LightOrangeSpf extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LightOrangeSpf f9817a = new LightOrangeSpf();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LightOrangeSpf);
        }

        public final int hashCode() {
            return 335687566;
        }

        public final String toString() {
            return "LightOrangeSpf";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$LightOrangeSpfDark;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LightOrangeSpfDark extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LightOrangeSpfDark f9818a = new LightOrangeSpfDark();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LightOrangeSpfDark);
        }

        public final int hashCode() {
            return -515630044;
        }

        public final String toString() {
            return "LightOrangeSpfDark";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$LightTextColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LightTextColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LightTextColor f9819a = new LightTextColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LightTextColor);
        }

        public final int hashCode() {
            return 2078217513;
        }

        public final String toString() {
            return "LightTextColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$LightYellow;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LightYellow extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LightYellow f9820a = new LightYellow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LightYellow);
        }

        public final int hashCode() {
            return -1655956895;
        }

        public final String toString() {
            return "LightYellow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$LightYellow2;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LightYellow2 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LightYellow2 f9821a = new LightYellow2();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LightYellow2);
        }

        public final int hashCode() {
            return 204943857;
        }

        public final String toString() {
            return "LightYellow2";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Linen;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Linen extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Linen f9822a = new Linen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Linen);
        }

        public final int hashCode() {
            return 583369073;
        }

        public final String toString() {
            return "Linen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$MapOverlayBorderColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapOverlayBorderColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MapOverlayBorderColor f9823a = new MapOverlayBorderColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MapOverlayBorderColor);
        }

        public final int hashCode() {
            return 355581722;
        }

        public final String toString() {
            return "MapOverlayBorderColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$MapOverlayColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapOverlayColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MapOverlayColor f9824a = new MapOverlayColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MapOverlayColor);
        }

        public final int hashCode() {
            return 1701627430;
        }

        public final String toString() {
            return "MapOverlayColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$MidDarkGreen;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MidDarkGreen extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MidDarkGreen f9825a = new MidDarkGreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MidDarkGreen);
        }

        public final int hashCode() {
            return -630678162;
        }

        public final String toString() {
            return "MidDarkGreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$MidGreen;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MidGreen extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MidGreen f9826a = new MidGreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MidGreen);
        }

        public final int hashCode() {
            return -1155560508;
        }

        public final String toString() {
            return "MidGreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$NewActivityColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewActivityColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewActivityColor f9827a = new NewActivityColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NewActivityColor);
        }

        public final int hashCode() {
            return -1633323779;
        }

        public final String toString() {
            return "NewActivityColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$OnBoardingSeparatorGradientEnd;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBoardingSeparatorGradientEnd extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBoardingSeparatorGradientEnd f9828a = new OnBoardingSeparatorGradientEnd();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBoardingSeparatorGradientEnd);
        }

        public final int hashCode() {
            return 1314984874;
        }

        public final String toString() {
            return "OnBoardingSeparatorGradientEnd";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$OnBoardingSeparatorGradientStart;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBoardingSeparatorGradientStart extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBoardingSeparatorGradientStart f9829a = new OnBoardingSeparatorGradientStart();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBoardingSeparatorGradientStart);
        }

        public final int hashCode() {
            return 993187697;
        }

        public final String toString() {
            return "OnBoardingSeparatorGradientStart";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Orange2;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Orange2 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Orange2 f9830a = new Orange2();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Orange2);
        }

        public final int hashCode() {
            return 885395579;
        }

        public final String toString() {
            return "Orange2";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Orange3;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Orange3 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Orange3 f9831a = new Orange3();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Orange3);
        }

        public final int hashCode() {
            return 885395580;
        }

        public final String toString() {
            return "Orange3";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$OrangeBackground;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrangeBackground extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrangeBackground f9832a = new OrangeBackground();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OrangeBackground);
        }

        public final int hashCode() {
            return 828859173;
        }

        public final String toString() {
            return "OrangeBackground";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$OrangeBackgroundDark;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrangeBackgroundDark extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrangeBackgroundDark f9833a = new OrangeBackgroundDark();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OrangeBackgroundDark);
        }

        public final int hashCode() {
            return -1691898821;
        }

        public final String toString() {
            return "OrangeBackgroundDark";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$OrangeBackgroundLight;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrangeBackgroundLight extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrangeBackgroundLight f9834a = new OrangeBackgroundLight();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OrangeBackgroundLight);
        }

        public final int hashCode() {
            return -901639951;
        }

        public final String toString() {
            return "OrangeBackgroundLight";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$OrangePrimary;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrangePrimary extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrangePrimary f9835a = new OrangePrimary();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OrangePrimary);
        }

        public final int hashCode() {
            return -770270357;
        }

        public final String toString() {
            return "OrangePrimary";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$OrangePrimaryDisabled;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrangePrimaryDisabled extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrangePrimaryDisabled f9836a = new OrangePrimaryDisabled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OrangePrimaryDisabled);
        }

        public final int hashCode() {
            return -672751865;
        }

        public final String toString() {
            return "OrangePrimaryDisabled";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$OrangeSound;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrangeSound extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrangeSound f9837a = new OrangeSound();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OrangeSound);
        }

        public final int hashCode() {
            return 1275632824;
        }

        public final String toString() {
            return "OrangeSound";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$PaleRed;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaleRed extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaleRed f9838a = new PaleRed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PaleRed);
        }

        public final int hashCode() {
            return 1296074174;
        }

        public final String toString() {
            return "PaleRed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$PaleYellowGradient;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaleYellowGradient extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PaleYellowGradient f9839a = new PaleYellowGradient();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PaleYellowGradient);
        }

        public final int hashCode() {
            return 125186167;
        }

        public final String toString() {
            return "PaleYellowGradient";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$PlaceholderTextColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlaceholderTextColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlaceholderTextColor f9840a = new PlaceholderTextColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PlaceholderTextColor);
        }

        public final int hashCode() {
            return -1184240980;
        }

        public final String toString() {
            return "PlaceholderTextColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$PremBusGradient1;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremBusGradient1 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PremBusGradient1 f9841a = new PremBusGradient1();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PremBusGradient1);
        }

        public final int hashCode() {
            return -1875356460;
        }

        public final String toString() {
            return "PremBusGradient1";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$PremBusGradient2;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremBusGradient2 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PremBusGradient2 f9842a = new PremBusGradient2();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PremBusGradient2);
        }

        public final int hashCode() {
            return -1875356459;
        }

        public final String toString() {
            return "PremBusGradient2";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$ProductProgressStatus;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductProgressStatus extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductProgressStatus f9843a = new ProductProgressStatus();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductProgressStatus);
        }

        public final int hashCode() {
            return 124950469;
        }

        public final String toString() {
            return "ProductProgressStatus";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$ProductProgressStatusBorder;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductProgressStatusBorder extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductProgressStatusBorder f9844a = new ProductProgressStatusBorder();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductProgressStatusBorder);
        }

        public final int hashCode() {
            return 587354193;
        }

        public final String toString() {
            return "ProductProgressStatusBorder";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$RealTimeFetchingStringColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RealTimeFetchingStringColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RealTimeFetchingStringColor f9845a = new RealTimeFetchingStringColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RealTimeFetchingStringColor);
        }

        public final int hashCode() {
            return -2059139722;
        }

        public final String toString() {
            return "RealTimeFetchingStringColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$RedBase;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RedBase extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RedBase f9846a = new RedBase();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RedBase);
        }

        public final int hashCode() {
            return -1117785159;
        }

        public final String toString() {
            return "RedBase";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$RescheduleColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RescheduleColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RescheduleColor f9847a = new RescheduleColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RescheduleColor);
        }

        public final int hashCode() {
            return -1643816592;
        }

        public final String toString() {
            return "RescheduleColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$RippleGray;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RippleGray extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RippleGray f9848a = new RippleGray();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RippleGray);
        }

        public final int hashCode() {
            return -2080514916;
        }

        public final String toString() {
            return "RippleGray";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$SectionDividerColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SectionDividerColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SectionDividerColor f9849a = new SectionDividerColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SectionDividerColor);
        }

        public final int hashCode() {
            return 1482222982;
        }

        public final String toString() {
            return "SectionDividerColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Shadow;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Shadow extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Shadow f9850a = new Shadow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Shadow);
        }

        public final int hashCode() {
            return 1103664521;
        }

        public final String toString() {
            return "Shadow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$ShadyGray;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShadyGray extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShadyGray f9851a = new ShadyGray();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShadyGray);
        }

        public final int hashCode() {
            return 1303012155;
        }

        public final String toString() {
            return "ShadyGray";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$ShimmerBackground;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShimmerBackground extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShimmerBackground f9852a = new ShimmerBackground();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShimmerBackground);
        }

        public final int hashCode() {
            return -1578151674;
        }

        public final String toString() {
            return "ShimmerBackground";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$ShimmerColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShimmerColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShimmerColor f9853a = new ShimmerColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShimmerColor);
        }

        public final int hashCode() {
            return 849882251;
        }

        public final String toString() {
            return "ShimmerColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$SilverGrey;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SilverGrey extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SilverGrey f9854a = new SilverGrey();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SilverGrey);
        }

        public final int hashCode() {
            return 183321461;
        }

        public final String toString() {
            return "SilverGrey";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$SpecialFeatureBackGround;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpecialFeatureBackGround extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SpecialFeatureBackGround f9855a = new SpecialFeatureBackGround();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SpecialFeatureBackGround);
        }

        public final int hashCode() {
            return 1554741588;
        }

        public final String toString() {
            return "SpecialFeatureBackGround";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$SpecialFeatureTagBackgroundColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpecialFeatureTagBackgroundColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SpecialFeatureTagBackgroundColor f9856a = new SpecialFeatureTagBackgroundColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SpecialFeatureTagBackgroundColor);
        }

        public final int hashCode() {
            return 1006852577;
        }

        public final String toString() {
            return "SpecialFeatureTagBackgroundColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$StrikeOffFontColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StrikeOffFontColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StrikeOffFontColor f9857a = new StrikeOffFontColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StrikeOffFontColor);
        }

        public final int hashCode() {
            return 373435232;
        }

        public final String toString() {
            return "StrikeOffFontColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$TabTitleDividerColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabTitleDividerColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TabTitleDividerColor f9858a = new TabTitleDividerColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TabTitleDividerColor);
        }

        public final int hashCode() {
            return 492737494;
        }

        public final String toString() {
            return "TabTitleDividerColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$TextFieldIndicator;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextFieldIndicator extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TextFieldIndicator f9859a = new TextFieldIndicator();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TextFieldIndicator);
        }

        public final int hashCode() {
            return -861307989;
        }

        public final String toString() {
            return "TextFieldIndicator";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$TicketDividerColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketDividerColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TicketDividerColor f9860a = new TicketDividerColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TicketDividerColor);
        }

        public final int hashCode() {
            return 737970143;
        }

        public final String toString() {
            return "TicketDividerColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$TicketStatusYellow;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketStatusYellow extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TicketStatusYellow f9861a = new TicketStatusYellow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TicketStatusYellow);
        }

        public final int hashCode() {
            return -68995301;
        }

        public final String toString() {
            return "TicketStatusYellow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$TitoOnboardingScreenYellow;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitoOnboardingScreenYellow extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TitoOnboardingScreenYellow f9862a = new TitoOnboardingScreenYellow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TitoOnboardingScreenYellow);
        }

        public final int hashCode() {
            return 1704538996;
        }

        public final String toString() {
            return "TitoOnboardingScreenYellow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$ToolbarBgColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToolbarBgColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToolbarBgColor f9863a = new ToolbarBgColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToolbarBgColor);
        }

        public final int hashCode() {
            return 352253324;
        }

        public final String toString() {
            return "ToolbarBgColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Transparent;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Transparent extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Transparent f9864a = new Transparent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Transparent);
        }

        public final int hashCode() {
            return -1026123127;
        }

        public final String toString() {
            return "Transparent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$TruecallerBlue;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TruecallerBlue extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TruecallerBlue f9865a = new TruecallerBlue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TruecallerBlue);
        }

        public final int hashCode() {
            return 777080316;
        }

        public final String toString() {
            return "TruecallerBlue";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$UnselectedDot;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnselectedDot extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnselectedDot f9866a = new UnselectedDot();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnselectedDot);
        }

        public final int hashCode() {
            return 24847340;
        }

        public final String toString() {
            return "UnselectedDot";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$UserProfileLinearLight;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserProfileLinearLight extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserProfileLinearLight f9867a = new UserProfileLinearLight();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserProfileLinearLight);
        }

        public final int hashCode() {
            return -1597397732;
        }

        public final String toString() {
            return "UserProfileLinearLight";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$VeryLightGrey;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VeryLightGrey extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final VeryLightGrey f9868a = new VeryLightGrey();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VeryLightGrey);
        }

        public final int hashCode() {
            return 41153526;
        }

        public final String toString() {
            return "VeryLightGrey";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$ViewScheduleColor;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewScheduleColor extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewScheduleColor f9869a = new ViewScheduleColor();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewScheduleColor);
        }

        public final int hashCode() {
            return 1722618974;
        }

        public final String toString() {
            return "ViewScheduleColor";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$White;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class White extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final White f9870a = new White();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof White);
        }

        public final int hashCode() {
            return 593493664;
        }

        public final String toString() {
            return "White";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$White87;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class White87 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final White87 f9871a = new White87();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof White87);
        }

        public final int hashCode() {
            return -883237473;
        }

        public final String toString() {
            return "White87";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Yellow;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Yellow extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Yellow f9872a = new Yellow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Yellow);
        }

        public final int hashCode() {
            return 1273004253;
        }

        public final String toString() {
            return "Yellow";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$Yellow50;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Yellow50 extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Yellow50 f9873a = new Yellow50();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Yellow50);
        }

        public final int hashCode() {
            return -708590536;
        }

        public final String toString() {
            return "Yellow50";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/base/ChaloColorToken$YesBankGray;", "Lapp/chalo/uistate/base/ChaloColorToken;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class YesBankGray extends ChaloColorToken {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final YesBankGray f9874a = new YesBankGray();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof YesBankGray);
        }

        public final int hashCode() {
            return 445588477;
        }

        public final String toString() {
            return "YesBankGray";
        }
    }
}
