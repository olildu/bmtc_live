package app.chalo.uistate.base;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.common.C;
import app.chalo.extensions.UtilityExtensionsKt;
import app.chalo.uistate.color.palette.ActiveChaloColorPalette;
import app.chalo.uistate.color.palette.BrandColorPalette;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloColorTokenKt {
    public static final ChaloColorToken.Custom a(float f, ChaloColorToken chaloColorToken) {
        return new ChaloColorToken.Custom(Color.m4604copywmQWz5c$default(c(chaloColorToken), f, 0.0f, 0.0f, 0.0f, 14, null));
    }

    public static final ChaloColorToken.Custom b(ChaloColorToken chaloColorToken, String hexCode) {
        Intrinsics.i(hexCode, "hexCode");
        long jC = c(chaloColorToken);
        Regex regex = UtilityExtensionsKt.f2619a;
        if (!UtilityExtensionsKt.f2619a.h(hexCode)) {
            hexCode = null;
        } else if (hexCode.length() == 4) {
            hexCode = "#" + hexCode.charAt(1) + hexCode.charAt(1) + hexCode.charAt(2) + hexCode.charAt(2) + hexCode.charAt(3) + hexCode.charAt(3);
        }
        if (hexCode != null) {
            jC = ChaloColorToken_androidKt.a(Color.INSTANCE, hexCode, jC);
        }
        return new ChaloColorToken.Custom(jC);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x021c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0221  */
    public static final long c(ChaloColorToken chaloColorToken) {
        ChaloColorToken.OrangeBackgroundDark orangeBackgroundDark;
        ChaloColorToken.Yellow50 yellow50;
        Color colorM4595boximpl;
        Intrinsics.i(chaloColorToken, "<this>");
        BrandColorPalette brandColorPalette = ActiveChaloColorPalette.f9930a;
        ChaloColorToken.Yellow50 yellow51 = ChaloColorToken.Yellow50.f9873a;
        ChaloColorToken.Yellow yellow = ChaloColorToken.Yellow.f9872a;
        ChaloColorToken.UserProfileLinearLight userProfileLinearLight = ChaloColorToken.UserProfileLinearLight.f9867a;
        ChaloColorToken.TitoOnboardingScreenYellow titoOnboardingScreenYellow = ChaloColorToken.TitoOnboardingScreenYellow.f9862a;
        ChaloColorToken.SpecialFeatureTagBackgroundColor specialFeatureTagBackgroundColor = ChaloColorToken.SpecialFeatureTagBackgroundColor.f9856a;
        ChaloColorToken.PaleYellowGradient paleYellowGradient = ChaloColorToken.PaleYellowGradient.f9839a;
        ChaloColorToken.OrangeSound orangeSound = ChaloColorToken.OrangeSound.f9837a;
        ChaloColorToken.OrangePrimaryDisabled orangePrimaryDisabled = ChaloColorToken.OrangePrimaryDisabled.f9836a;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        ChaloColorToken.OrangeBackgroundLight orangeBackgroundLight = ChaloColorToken.OrangeBackgroundLight.f9834a;
        ChaloColorToken.OrangeBackgroundDark orangeBackgroundDark2 = ChaloColorToken.OrangeBackgroundDark.f9833a;
        ChaloColorToken.OrangeBackground orangeBackground = ChaloColorToken.OrangeBackground.f9832a;
        ChaloColorToken.Orange2 orange2 = ChaloColorToken.Orange2.f9830a;
        ChaloColorToken.LightYellow2 lightYellow2 = ChaloColorToken.LightYellow2.f9821a;
        ChaloColorToken.LightOrangeSpfDark lightOrangeSpfDark = ChaloColorToken.LightOrangeSpfDark.f9818a;
        ChaloColorToken.Yellow50 yellow52 = yellow51;
        ChaloColorToken.LightOrangeSpf lightOrangeSpf = ChaloColorToken.LightOrangeSpf.f9817a;
        ChaloColorToken.Yellow yellow2 = yellow;
        ChaloColorToken.LightOrange lightOrange = ChaloColorToken.LightOrange.f9816a;
        ChaloColorToken.UserProfileLinearLight userProfileLinearLight2 = userProfileLinearLight;
        ChaloColorToken.IvoryYellow ivoryYellow = ChaloColorToken.IvoryYellow.f9812a;
        ChaloColorToken.TitoOnboardingScreenYellow titoOnboardingScreenYellow2 = titoOnboardingScreenYellow;
        ChaloColorToken.IndicatorYellow indicatorYellow = ChaloColorToken.IndicatorYellow.f9810a;
        ChaloColorToken.SpecialFeatureTagBackgroundColor specialFeatureTagBackgroundColor2 = specialFeatureTagBackgroundColor;
        ChaloColorToken.CornSilkDark cornSilkDark = ChaloColorToken.CornSilkDark.f9779a;
        ChaloColorToken.PaleYellowGradient paleYellowGradient2 = paleYellowGradient;
        ChaloColorToken.CornSilk cornSilk = ChaloColorToken.CornSilk.f9778a;
        ChaloColorToken.OrangeSound orangeSound2 = orangeSound;
        ChaloColorToken.CardLinearLight cardLinearLight = ChaloColorToken.CardLinearLight.f9776a;
        ChaloColorToken.OrangePrimaryDisabled orangePrimaryDisabled2 = orangePrimaryDisabled;
        ChaloColorToken.CardLinearDark cardLinearDark = ChaloColorToken.CardLinearDark.f9775a;
        ChaloColorToken.OrangePrimary orangePrimary2 = orangePrimary;
        ChaloColorToken.CapeHoneyYellow capeHoneyYellow = ChaloColorToken.CapeHoneyYellow.f9774a;
        ChaloColorToken.OrangeBackgroundLight orangeBackgroundLight2 = orangeBackgroundLight;
        ChaloColorToken.Brown_20 brown_20 = ChaloColorToken.Brown_20.f9772a;
        if (brandColorPalette != null) {
            if (chaloColorToken.equals(brown_20)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getF9931a());
            } else if (chaloColorToken.equals(capeHoneyYellow)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getB());
            } else if (chaloColorToken.equals(cardLinearDark)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getC());
            } else if (chaloColorToken.equals(cardLinearLight)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getD());
            } else if (chaloColorToken.equals(cornSilk)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getE());
            } else if (chaloColorToken.equals(cornSilkDark)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getF());
            } else if (chaloColorToken.equals(indicatorYellow)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getG());
            } else if (chaloColorToken.equals(ivoryYellow)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getH());
            } else if (chaloColorToken.equals(lightOrange)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getI());
            } else if (chaloColorToken.equals(lightOrangeSpf)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getJ());
            } else if (chaloColorToken.equals(lightOrangeSpfDark)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getK());
            } else if (chaloColorToken.equals(lightYellow2)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getL());
            } else if (chaloColorToken.equals(orange2)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getM());
            } else if (chaloColorToken.equals(orangeBackground)) {
                colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getN());
            } else {
                if (chaloColorToken.equals(orangeBackgroundDark2)) {
                    colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getO());
                } else {
                    orangeBackgroundDark = orangeBackgroundDark2;
                    if (chaloColorToken.equals(orangeBackgroundLight2)) {
                        colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getP());
                        orangeBackgroundLight2 = orangeBackgroundLight2;
                    } else if (chaloColorToken.equals(orangePrimary2)) {
                        orangeBackgroundLight2 = orangeBackgroundLight2;
                        colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getQ());
                        orangePrimary2 = orangePrimary2;
                    } else if (chaloColorToken.equals(orangePrimaryDisabled2)) {
                        orangeBackgroundLight2 = orangeBackgroundLight2;
                        orangePrimary2 = orangePrimary2;
                        colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getR());
                        orangePrimaryDisabled2 = orangePrimaryDisabled2;
                    } else if (chaloColorToken.equals(orangeSound2)) {
                        orangeBackgroundLight2 = orangeBackgroundLight2;
                        orangePrimary2 = orangePrimary2;
                        orangePrimaryDisabled2 = orangePrimaryDisabled2;
                        colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getS());
                        orangeSound2 = orangeSound2;
                    } else if (chaloColorToken.equals(paleYellowGradient2)) {
                        orangeBackgroundLight2 = orangeBackgroundLight2;
                        orangePrimary2 = orangePrimary2;
                        orangePrimaryDisabled2 = orangePrimaryDisabled2;
                        orangeSound2 = orangeSound2;
                        colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getT());
                        paleYellowGradient2 = paleYellowGradient2;
                    } else if (chaloColorToken.equals(specialFeatureTagBackgroundColor2)) {
                        orangeBackgroundLight2 = orangeBackgroundLight2;
                        orangePrimary2 = orangePrimary2;
                        orangePrimaryDisabled2 = orangePrimaryDisabled2;
                        orangeSound2 = orangeSound2;
                        paleYellowGradient2 = paleYellowGradient2;
                        colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getU());
                        specialFeatureTagBackgroundColor2 = specialFeatureTagBackgroundColor2;
                    } else if (chaloColorToken.equals(titoOnboardingScreenYellow2)) {
                        orangeBackgroundLight2 = orangeBackgroundLight2;
                        orangePrimary2 = orangePrimary2;
                        orangePrimaryDisabled2 = orangePrimaryDisabled2;
                        orangeSound2 = orangeSound2;
                        paleYellowGradient2 = paleYellowGradient2;
                        specialFeatureTagBackgroundColor2 = specialFeatureTagBackgroundColor2;
                        colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getV());
                        titoOnboardingScreenYellow2 = titoOnboardingScreenYellow2;
                    } else if (chaloColorToken.equals(userProfileLinearLight2)) {
                        orangeBackgroundLight2 = orangeBackgroundLight2;
                        orangePrimary2 = orangePrimary2;
                        orangePrimaryDisabled2 = orangePrimaryDisabled2;
                        orangeSound2 = orangeSound2;
                        paleYellowGradient2 = paleYellowGradient2;
                        specialFeatureTagBackgroundColor2 = specialFeatureTagBackgroundColor2;
                        titoOnboardingScreenYellow2 = titoOnboardingScreenYellow2;
                        colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getW());
                        userProfileLinearLight2 = userProfileLinearLight2;
                    } else if (chaloColorToken.equals(yellow2)) {
                        orangeBackgroundLight2 = orangeBackgroundLight2;
                        orangePrimary2 = orangePrimary2;
                        orangePrimaryDisabled2 = orangePrimaryDisabled2;
                        orangeSound2 = orangeSound2;
                        paleYellowGradient2 = paleYellowGradient2;
                        specialFeatureTagBackgroundColor2 = specialFeatureTagBackgroundColor2;
                        titoOnboardingScreenYellow2 = titoOnboardingScreenYellow2;
                        userProfileLinearLight2 = userProfileLinearLight2;
                        colorM4595boximpl = Color.m4595boximpl(brandColorPalette.getX());
                        yellow2 = yellow2;
                    } else {
                        yellow50 = yellow52;
                        colorM4595boximpl = chaloColorToken.equals(yellow50) ? Color.m4595boximpl(brandColorPalette.getY()) : null;
                    }
                    yellow50 = yellow52;
                }
                if (colorM4595boximpl != null) {
                    orangeBackgroundLight2 = orangeBackgroundLight2;
                    orangePrimary2 = orangePrimary2;
                    orangePrimaryDisabled2 = orangePrimaryDisabled2;
                    orangeSound2 = orangeSound2;
                    paleYellowGradient2 = paleYellowGradient2;
                    specialFeatureTagBackgroundColor2 = specialFeatureTagBackgroundColor2;
                    titoOnboardingScreenYellow2 = titoOnboardingScreenYellow2;
                    userProfileLinearLight2 = userProfileLinearLight2;
                    yellow2 = yellow2;
                    orangeBackgroundLight2 = orangeBackgroundLight2;
                    orangePrimary2 = orangePrimary2;
                    orangePrimaryDisabled2 = orangePrimaryDisabled2;
                    orangeSound2 = orangeSound2;
                    paleYellowGradient2 = paleYellowGradient2;
                    specialFeatureTagBackgroundColor2 = specialFeatureTagBackgroundColor2;
                    titoOnboardingScreenYellow2 = titoOnboardingScreenYellow2;
                    userProfileLinearLight2 = userProfileLinearLight2;
                    yellow2 = yellow2;
                    return colorM4595boximpl.m4615unboximpl();
                }
                orangeBackgroundLight2 = orangeBackgroundLight2;
                orangePrimary2 = orangePrimary2;
                orangePrimaryDisabled2 = orangePrimaryDisabled2;
                orangeSound2 = orangeSound2;
                paleYellowGradient2 = paleYellowGradient2;
                specialFeatureTagBackgroundColor2 = specialFeatureTagBackgroundColor2;
                titoOnboardingScreenYellow2 = titoOnboardingScreenYellow2;
                userProfileLinearLight2 = userProfileLinearLight2;
                yellow2 = yellow2;
                orangeBackgroundLight2 = orangeBackgroundLight2;
                orangePrimary2 = orangePrimary2;
                orangePrimaryDisabled2 = orangePrimaryDisabled2;
                orangeSound2 = orangeSound2;
                paleYellowGradient2 = paleYellowGradient2;
                specialFeatureTagBackgroundColor2 = specialFeatureTagBackgroundColor2;
                titoOnboardingScreenYellow2 = titoOnboardingScreenYellow2;
                userProfileLinearLight2 = userProfileLinearLight2;
                yellow2 = yellow2;
                yellow52 = yellow50;
            }
            orangeBackgroundDark = orangeBackgroundDark2;
            yellow50 = yellow52;
            if (colorM4595boximpl != null) {
                orangeBackgroundLight2 = orangeBackgroundLight2;
                orangePrimary2 = orangePrimary2;
                orangePrimaryDisabled2 = orangePrimaryDisabled2;
                orangeSound2 = orangeSound2;
                paleYellowGradient2 = paleYellowGradient2;
                specialFeatureTagBackgroundColor2 = specialFeatureTagBackgroundColor2;
                titoOnboardingScreenYellow2 = titoOnboardingScreenYellow2;
                userProfileLinearLight2 = userProfileLinearLight2;
                yellow2 = yellow2;
                orangeBackgroundLight2 = orangeBackgroundLight2;
                orangePrimary2 = orangePrimary2;
                orangePrimaryDisabled2 = orangePrimaryDisabled2;
                orangeSound2 = orangeSound2;
                paleYellowGradient2 = paleYellowGradient2;
                specialFeatureTagBackgroundColor2 = specialFeatureTagBackgroundColor2;
                titoOnboardingScreenYellow2 = titoOnboardingScreenYellow2;
                userProfileLinearLight2 = userProfileLinearLight2;
                yellow2 = yellow2;
                return colorM4595boximpl.m4615unboximpl();
            }
            orangeBackgroundLight2 = orangeBackgroundLight2;
            orangePrimary2 = orangePrimary2;
            orangePrimaryDisabled2 = orangePrimaryDisabled2;
            orangeSound2 = orangeSound2;
            paleYellowGradient2 = paleYellowGradient2;
            specialFeatureTagBackgroundColor2 = specialFeatureTagBackgroundColor2;
            titoOnboardingScreenYellow2 = titoOnboardingScreenYellow2;
            userProfileLinearLight2 = userProfileLinearLight2;
            yellow2 = yellow2;
            orangeBackgroundLight2 = orangeBackgroundLight2;
            orangePrimary2 = orangePrimary2;
            orangePrimaryDisabled2 = orangePrimaryDisabled2;
            orangeSound2 = orangeSound2;
            paleYellowGradient2 = paleYellowGradient2;
            specialFeatureTagBackgroundColor2 = specialFeatureTagBackgroundColor2;
            titoOnboardingScreenYellow2 = titoOnboardingScreenYellow2;
            userProfileLinearLight2 = userProfileLinearLight2;
            yellow2 = yellow2;
            yellow52 = yellow50;
        } else {
            orangeBackgroundDark = orangeBackgroundDark2;
        }
        if (chaloColorToken.equals(ChaloColorToken.AcGreen.f9754a)) {
            return ColorKt.Color(4292015297L);
        }
        if (chaloColorToken.equals(ChaloColorToken.ActivityBackground.f9755a)) {
            return ColorKt.Color(4293848814L);
        }
        if (chaloColorToken.equals(ChaloColorToken.AlmostBlackColor.f9756a)) {
            return ColorKt.Color(4281479730L);
        }
        if (chaloColorToken.equals(ChaloColorToken.AlmostBlackColor_60.f9757a)) {
            return ColorKt.Color(2570203698L);
        }
        if (chaloColorToken.equals(ChaloColorToken.AmountAddedText.f9758a)) {
            return ColorKt.Color(4281708101L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Black.f9759a)) {
            return ColorKt.Color(4278190080L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Black_03.f9760a)) {
            return ColorKt.Color(C.BUFFER_FLAG_FIRST_SAMPLE);
        }
        if (chaloColorToken.equals(ChaloColorToken.Black_12.f9761a)) {
            return ColorKt.Color(520093696);
        }
        if (chaloColorToken.equals(ChaloColorToken.Black_20.f9762a)) {
            return ColorKt.Color(855638016);
        }
        if (chaloColorToken.equals(ChaloColorToken.Black_30.f9763a)) {
            return ColorKt.Color(1291845632);
        }
        if (chaloColorToken.equals(ChaloColorToken.Black_40.f9764a)) {
            return ColorKt.Color(1711276032);
        }
        if (chaloColorToken.equals(ChaloColorToken.Black_54.f9765a)) {
            return ColorKt.Color(2332033024L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Black_60.f9766a)) {
            return ColorKt.Color(2566914048L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Black_70.f9767a)) {
            return ColorKt.Color(3003121664L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Black_87.f9768a)) {
            return ColorKt.Color(3724541952L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Black_90.f9769a)) {
            return ColorKt.Color(3858759680L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Blue.f9770a)) {
            return ColorKt.Color(4283869436L);
        }
        if (chaloColorToken.equals(ChaloColorToken.BrightRed.f9771a)) {
            return ColorKt.Color(4294905600L);
        }
        if (chaloColorToken.equals(brown_20)) {
            return ColorKt.Color(854948864);
        }
        if (chaloColorToken.equals(ChaloColorToken.BusAgencyTagBackground.f9773a)) {
            return ColorKt.Color(4293848814L);
        }
        if (chaloColorToken.equals(cardLinearDark)) {
            return ColorKt.Color(4294959528L);
        }
        if (chaloColorToken.equals(cardLinearLight)) {
            return ColorKt.Color(4294964964L);
        }
        if (chaloColorToken.equals(capeHoneyYellow)) {
            return ColorKt.Color(4294959784L);
        }
        if (chaloColorToken.equals(ChaloColorToken.ChaloBlueEta.f9777a)) {
            return ColorKt.Color(4280391411L);
        }
        if (chaloColorToken.equals(cornSilk)) {
            return ColorKt.Color(4294637038L);
        }
        if (chaloColorToken.equals(cornSilkDark)) {
            return ColorKt.Color(4294109403L);
        }
        if (chaloColorToken.equals(ChaloColorToken.CornSilkGradient.f9780a)) {
            return ColorKt.Color(4294964187L);
        }
        if (chaloColorToken.equals(ChaloColorToken.DarkGolden.f9782a)) {
            return ColorKt.Color(4291594240L);
        }
        if (chaloColorToken.equals(ChaloColorToken.DarkGreen.f9783a)) {
            return ColorKt.Color(4280977718L);
        }
        if (chaloColorToken.equals(ChaloColorToken.DarkGreyColor.f9784a)) {
            return ColorKt.Color(4289506476L);
        }
        if (chaloColorToken.equals(ChaloColorToken.DarkPurple.f9785a)) {
            return ColorKt.Color(4288952697L);
        }
        if (chaloColorToken.equals(ChaloColorToken.DarkRed.f9786a)) {
            return ColorKt.Color(4291176488L);
        }
        if (chaloColorToken.equals(ChaloColorToken.DimGrey.f9787a)) {
            return ColorKt.Color(4285690225L);
        }
        if (chaloColorToken.equals(ChaloColorToken.DisabledBusGreyColor.f9788a)) {
            return ColorKt.Color(4290230199L);
        }
        if (chaloColorToken.equals(ChaloColorToken.DiscountGreen.f9789a)) {
            return ColorKt.Color(4278495569L);
        }
        if (chaloColorToken.equals(ChaloColorToken.DiscountGreen2.f9790a)) {
            return ColorKt.Color(1095602579025L);
        }
        if (chaloColorToken.equals(ChaloColorToken.DiscountPercentBgGreen.f9791a)) {
            return ColorKt.Color(4292933091L);
        }
        if (chaloColorToken.equals(ChaloColorToken.DiscountPercentTextGreen.f9792a)) {
            return ColorKt.Color(4281708101L);
        }
        if (chaloColorToken.equals(ChaloColorToken.DividerColor.f9793a)) {
            return ColorKt.Color(251658240);
        }
        if (chaloColorToken.equals(ChaloColorToken.ErrorColor.f9794a)) {
            return ColorKt.Color(4293727323L);
        }
        if (chaloColorToken.equals(ChaloColorToken.FilterItemTextColor.f9795a)) {
            return ColorKt.Color(4280624421L);
        }
        if (chaloColorToken.equals(ChaloColorToken.FooterColor.f9796a)) {
            return ColorKt.Color(4292335575L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Gray42.f9797a)) {
            return ColorKt.Color(4285229931L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Gray85.f9798a)) {
            return ColorKt.Color(4292467161L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Green.f9799a)) {
            return ColorKt.Color(4284135499L);
        }
        if (chaloColorToken.equals(ChaloColorToken.GreenBase.f9800a)) {
            return ColorKt.Color(4292933091L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Grey8.f9802a)) {
            return ColorKt.Color(335544320);
        }
        if (chaloColorToken.equals(ChaloColorToken.Grey9E.f9803a)) {
            return ColorKt.Color(4288585374L);
        }
        if (chaloColorToken.equals(ChaloColorToken.GreyBorderColor.f9804a)) {
            return ColorKt.Color(867217584);
        }
        if (chaloColorToken.equals(ChaloColorToken.GreyC2.f9805a)) {
            return ColorKt.Color(4290953922L);
        }
        if (chaloColorToken.equals(ChaloColorToken.GreyColor.f9806a)) {
            return ColorKt.Color(4294309365L);
        }
        if (chaloColorToken.equals(ChaloColorToken.GreyishBlue.f9808a)) {
            return ColorKt.Color(4284115834L);
        }
        if (chaloColorToken.equals(ChaloColorToken.GreyUnderline.f9807a)) {
            return ColorKt.Color(4291085508L);
        }
        if (chaloColorToken.equals(ChaloColorToken.HomeScreenHeaderColor.f9809a)) {
            return ColorKt.Color(4284513675L);
        }
        if (chaloColorToken.equals(indicatorYellow)) {
            return ColorKt.Color(4294559046L);
        }
        if (chaloColorToken.equals(ChaloColorToken.ItemDividerColor.f9811a)) {
            return ColorKt.Color(4293519849L);
        }
        if (chaloColorToken.equals(ivoryYellow)) {
            return ColorKt.Color(4294965225L);
        }
        if (chaloColorToken.equals(ChaloColorToken.LightBlue.f9813a)) {
            return ColorKt.Color(4293522943L);
        }
        if (chaloColorToken.equals(ChaloColorToken.LightGray.f9814a)) {
            return ColorKt.Color(4293651435L);
        }
        if (chaloColorToken.equals(ChaloColorToken.LightGrey.f9815a)) {
            return ColorKt.Color(4294506744L);
        }
        if (chaloColorToken.equals(lightOrange)) {
            return ColorKt.Color(4294964192L);
        }
        if (chaloColorToken.equals(lightOrangeSpf)) {
            return ColorKt.Color(4294964192L);
        }
        if (chaloColorToken.equals(lightOrangeSpfDark)) {
            return ColorKt.Color(4294957986L);
        }
        if (chaloColorToken.equals(ChaloColorToken.LightTextColor.f9819a)) {
            return ColorKt.Color(3707764736L);
        }
        if (chaloColorToken.equals(ChaloColorToken.LightYellow.f9820a)) {
            return ColorKt.Color(4294964965L);
        }
        if (chaloColorToken.equals(lightYellow2)) {
            return ColorKt.Color(4294966258L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Linen.f9822a)) {
            return ColorKt.Color(4294963942L);
        }
        if (chaloColorToken.equals(ChaloColorToken.MapOverlayBorderColor.f9823a)) {
            return ColorKt.Color(1174424896);
        }
        if (chaloColorToken.equals(ChaloColorToken.MapOverlayColor.f9824a)) {
            return ColorKt.Color(369118528);
        }
        if (chaloColorToken.equals(ChaloColorToken.MidDarkGreen.f9825a)) {
            return ColorKt.Color(4281251392L);
        }
        if (chaloColorToken.equals(ChaloColorToken.MidGreen.f9826a)) {
            return ColorKt.Color(4283681635L);
        }
        if (chaloColorToken.equals(ChaloColorToken.NewActivityColor.f9827a)) {
            return ColorKt.Color(4293848814L);
        }
        if (chaloColorToken.equals(ChaloColorToken.OnBoardingSeparatorGradientEnd.f9828a)) {
            return ColorKt.Color(13421772);
        }
        if (chaloColorToken.equals(ChaloColorToken.OnBoardingSeparatorGradientStart.f9829a)) {
            return ColorKt.Color(4291611852L);
        }
        if (chaloColorToken.equals(orange2)) {
            return ColorKt.Color(4294278144L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Orange3.f9831a)) {
            return ColorKt.Color(4294684191L);
        }
        if (chaloColorToken.equals(orangeBackground)) {
            return ColorKt.Color(4294964966L);
        }
        if (chaloColorToken.equals(orangeBackgroundDark)) {
            return ColorKt.Color(4294962382L);
        }
        if (chaloColorToken.equals(orangeBackgroundLight2)) {
            return ColorKt.Color(4294637038L);
        }
        if (chaloColorToken.equals(orangePrimary2)) {
            return ColorKt.Color(4294867968L);
        }
        if (chaloColorToken.equals(orangePrimaryDisabled2)) {
            return ColorKt.Color(1727953920);
        }
        if (chaloColorToken.equals(orangeSound2)) {
            return ColorKt.Color(4294963412L);
        }
        if (chaloColorToken.equals(ChaloColorToken.PaleRed.f9838a)) {
            return ColorKt.Color(4294960870L);
        }
        if (chaloColorToken.equals(paleYellowGradient2)) {
            return ColorKt.Color(4294956677L);
        }
        if (chaloColorToken.equals(ChaloColorToken.PlaceholderTextColor.f9840a)) {
            return ColorKt.Color(4287203721L);
        }
        if (chaloColorToken.equals(ChaloColorToken.PremBusGradient1.f9841a)) {
            return ColorKt.Color(4294892434L);
        }
        if (chaloColorToken.equals(ChaloColorToken.PremBusGradient2.f9842a)) {
            return ColorKt.Color(4294553117L);
        }
        if (chaloColorToken.equals(ChaloColorToken.ProductProgressStatus.f9843a)) {
            return ColorKt.Color(4293722092L);
        }
        if (chaloColorToken.equals(ChaloColorToken.RealTimeFetchingStringColor.f9845a)) {
            return ColorKt.Color(4278241363L);
        }
        if (chaloColorToken.equals(ChaloColorToken.RedBase.f9846a)) {
            return ColorKt.Color(4294633190L);
        }
        if (chaloColorToken.equals(ChaloColorToken.RescheduleColor.f9847a)) {
            return ColorKt.Color(4289557504L);
        }
        if (chaloColorToken.equals(ChaloColorToken.RippleGray.f9848a)) {
            return ColorKt.Color(1107296256);
        }
        if (chaloColorToken.equals(ChaloColorToken.SectionDividerColor.f9849a)) {
            return ColorKt.Color(4294506744L);
        }
        if (chaloColorToken.equals(ChaloColorToken.Shadow.f9850a)) {
            return ColorKt.Color(1690222270);
        }
        if (chaloColorToken.equals(ChaloColorToken.ShadyGray.f9851a)) {
            return ColorKt.Color(4286611584L);
        }
        if (chaloColorToken.equals(ChaloColorToken.ShimmerBackground.f9852a)) {
            return ColorKt.Color(4294309365L);
        }
        if (chaloColorToken.equals(ChaloColorToken.ShimmerColor.f9853a)) {
            return ColorKt.Color(1107296256);
        }
        if (chaloColorToken.equals(ChaloColorToken.SilverGrey.f9854a)) {
            return ColorKt.Color(4290690750L);
        }
        if (chaloColorToken.equals(ChaloColorToken.SpecialFeatureBackGround.f9855a)) {
            return ColorKt.Color(4294961856L);
        }
        if (chaloColorToken.equals(specialFeatureTagBackgroundColor2)) {
            return ColorKt.Color(4294961856L);
        }
        if (chaloColorToken.equals(ChaloColorToken.StrikeOffFontColor.f9857a)) {
            return ColorKt.Color(4286611584L);
        }
        if (chaloColorToken.equals(ChaloColorToken.TabTitleDividerColor.f9858a)) {
            return ColorKt.Color(4291611852L);
        }
        if (chaloColorToken.equals(ChaloColorToken.TextFieldIndicator.f9859a)) {
            return ColorKt.Color(452984832);
        }
        if (chaloColorToken.equals(ChaloColorToken.TicketStatusYellow.f9861a)) {
            return ColorKt.Color(4294964192L);
        }
        if (chaloColorToken.equals(titoOnboardingScreenYellow2)) {
            return ColorKt.Color(1308601869);
        }
        if (chaloColorToken.equals(ChaloColorToken.ToolbarBgColor.f9863a)) {
            return ColorKt.Color(BodyPartID.bodyIdMax);
        }
        if (chaloColorToken.equals(ChaloColorToken.Transparent.f9864a)) {
            return ColorKt.Color(0);
        }
        if (chaloColorToken.equals(ChaloColorToken.TruecallerBlue.f9865a)) {
            return ColorKt.Color(4281569791L);
        }
        if (chaloColorToken.equals(ChaloColorToken.UnselectedDot.f9866a)) {
            return ColorKt.Color(4293848814L);
        }
        if (chaloColorToken.equals(userProfileLinearLight2)) {
            return ColorKt.Color(4294966519L);
        }
        if (chaloColorToken.equals(ChaloColorToken.VeryLightGrey.f9868a)) {
            return ColorKt.Color(4294375158L);
        }
        if (chaloColorToken.equals(ChaloColorToken.ViewScheduleColor.f9869a)) {
            return ColorKt.Color(4284513675L);
        }
        if (chaloColorToken.equals(ChaloColorToken.White.f9870a)) {
            return ColorKt.Color(BodyPartID.bodyIdMax);
        }
        if (chaloColorToken.equals(ChaloColorToken.White87.f9871a)) {
            return ColorKt.Color(3724541951L);
        }
        if (chaloColorToken.equals(yellow2)) {
            return ColorKt.Color(4294946317L);
        }
        if (chaloColorToken.equals(yellow52)) {
            return ColorKt.Color(2164239885L);
        }
        if (chaloColorToken.equals(ChaloColorToken.YesBankGray.f9874a)) {
            return ColorKt.Color(2315255808L);
        }
        if (chaloColorToken.equals(ChaloColorToken.TicketDividerColor.f9860a)) {
            return ColorKt.Color(4293319883L);
        }
        if (chaloColorToken.equals(ChaloColorToken.ProductProgressStatusBorder.f9844a)) {
            return ColorKt.Color(4281708101L);
        }
        if (chaloColorToken.equals(ChaloColorToken.GreenColor.f9801a)) {
            return ColorKt.Color(4281896508L);
        }
        if (chaloColorToken instanceof ChaloColorToken.Custom) {
            return ((ChaloColorToken.Custom) chaloColorToken).f9781a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String d(ChaloColorToken chaloColorToken) {
        long jC = c(chaloColorToken);
        float f = 255;
        try {
            return String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf((int) (Color.m4611getRedimpl(jC) * f)), Integer.valueOf((int) (Color.m4610getGreenimpl(jC) * f)), Integer.valueOf((int) (Color.m4608getBlueimpl(jC) * f))}, 3));
        } catch (Exception unused) {
            return "#000000";
        }
    }
}
