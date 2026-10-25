package app.chalo.home.ui.chalobus;

import app.chalo.home.data.model.app.response.BannerDataResponseAppModel;
import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.homescreen.data.model.app.ChaloBusAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import defpackage.cb0;
import defpackage.hq0;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u0082\u0001\u001b\u001d\u001e\u001f !\"#$%&'()*+,-./01234567¨\u00068"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "", "ProceedBtnClickIntent", "SeeAllPassesClickedIntent", "StopSwapButtonClickedIntent", "PBExploreAvailableRoutesClicked", "BottomSheetDismissIntent", "ChaloBusScreenViewStartedIntent", "ChaloBusScreenStopIntent", "OnNotificationIconClicked", "TimePickerContinueBtnClickedIntent", "BackPressedOnDateAndTimePickerBottomSheet", "RemoveBottomSheetContentIntent", "ProceedButtonShimmerShownIntent", "ChaloBusScreenInitializationIntent", "ChaloBusPageItemClickedIntent", "StopSelectionFieldClickedIntent", "StopSelectionFieldResultIntent", "UpdateScreenStateIntent", "OnTimeChangeIntent", "PassSavingsBannerInfoBtnClickedIntent", "OnRollOverBannerClickedIntent", "PassHistoryItemClickedIntent", "ProductPurchaseNudgeSectionCtaClicked", "ProductPurchaseNudgeInfoCardClick", "PremiumBusTutorialClickedIntent", "PremiumBusTutorialViewAllClickedIntent", "ToggleSaveRideIntent", "UpdateSavedRideTimeIntent", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$BackPressedOnDateAndTimePickerBottomSheet;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$BottomSheetDismissIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ChaloBusPageItemClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ChaloBusScreenInitializationIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ChaloBusScreenStopIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ChaloBusScreenViewStartedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$OnNotificationIconClicked;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$OnRollOverBannerClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$OnTimeChangeIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$PBExploreAvailableRoutesClicked;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$PassHistoryItemClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$PassSavingsBannerInfoBtnClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$PremiumBusTutorialClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$PremiumBusTutorialViewAllClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ProceedBtnClickIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ProceedButtonShimmerShownIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ProductPurchaseNudgeInfoCardClick;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ProductPurchaseNudgeSectionCtaClicked;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$RemoveBottomSheetContentIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$SeeAllPassesClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$StopSelectionFieldClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$StopSelectionFieldResultIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$StopSwapButtonClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$TimePickerContinueBtnClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ToggleSaveRideIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$UpdateSavedRideTimeIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$UpdateScreenStateIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloBusViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$BackPressedOnDateAndTimePickerBottomSheet;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackPressedOnDateAndTimePickerBottomSheet extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackPressedOnDateAndTimePickerBottomSheet f3259a = new BackPressedOnDateAndTimePickerBottomSheet();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$BottomSheetDismissIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BottomSheetDismissIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BottomSheetDismissIntent f3260a = new BottomSheetDismissIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ChaloBusPageItemClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloBusPageItemClickedIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloBusPageFeature f3261a;
        public final String b;

        public ChaloBusPageItemClickedIntent(ChaloBusPageFeature featureType, String productConfigId) {
            Intrinsics.i(featureType, "featureType");
            Intrinsics.i(productConfigId, "productConfigId");
            this.f3261a = featureType;
            this.b = productConfigId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChaloBusPageItemClickedIntent)) {
                return false;
            }
            ChaloBusPageItemClickedIntent chaloBusPageItemClickedIntent = (ChaloBusPageItemClickedIntent) obj;
            return this.f3261a == chaloBusPageItemClickedIntent.f3261a && Intrinsics.d(this.b, chaloBusPageItemClickedIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f3261a.hashCode() * 31);
        }

        public final String toString() {
            return "ChaloBusPageItemClickedIntent(featureType=" + this.f3261a + ", productConfigId=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ChaloBusScreenInitializationIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloBusScreenInitializationIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloBusAppModel f3262a;

        static {
            ChaloBusAppModel.Companion companion = ChaloBusAppModel.INSTANCE;
        }

        public ChaloBusScreenInitializationIntent(ChaloBusAppModel chaloBusScreenData) {
            Intrinsics.i(chaloBusScreenData, "chaloBusScreenData");
            this.f3262a = chaloBusScreenData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChaloBusScreenInitializationIntent) && Intrinsics.d(this.f3262a, ((ChaloBusScreenInitializationIntent) obj).f3262a);
        }

        public final int hashCode() {
            return this.f3262a.hashCode();
        }

        public final String toString() {
            return "ChaloBusScreenInitializationIntent(chaloBusScreenData=" + this.f3262a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ChaloBusScreenStopIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChaloBusScreenStopIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChaloBusScreenStopIntent f3263a = new ChaloBusScreenStopIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ChaloBusScreenViewStartedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChaloBusScreenViewStartedIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChaloBusScreenViewStartedIntent f3264a = new ChaloBusScreenViewStartedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$OnNotificationIconClicked;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnNotificationIconClicked extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnNotificationIconClicked f3265a = new OnNotificationIconClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$OnRollOverBannerClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnRollOverBannerClickedIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BannerDataResponseAppModel f3266a;

        public OnRollOverBannerClickedIntent(BannerDataResponseAppModel bannerData) {
            Intrinsics.i(bannerData, "bannerData");
            this.f3266a = bannerData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRollOverBannerClickedIntent) && Intrinsics.d(this.f3266a, ((OnRollOverBannerClickedIntent) obj).f3266a);
        }

        public final int hashCode() {
            return this.f3266a.hashCode();
        }

        public final String toString() {
            return "OnRollOverBannerClickedIntent(bannerData=" + this.f3266a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$OnTimeChangeIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnTimeChangeIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3267a;
        public final int b;
        public final String c;

        public OnTimeChangeIntent(int i, int i2, String amOrPm) {
            Intrinsics.i(amOrPm, "amOrPm");
            this.f3267a = i;
            this.b = i2;
            this.c = amOrPm;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTimeChangeIntent)) {
                return false;
            }
            OnTimeChangeIntent onTimeChangeIntent = (OnTimeChangeIntent) obj;
            return this.f3267a == onTimeChangeIntent.f3267a && this.b == onTimeChangeIntent.b && Intrinsics.d(this.c, onTimeChangeIntent.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (((this.f3267a * 31) + this.b) * 31);
        }

        public final String toString() {
            return vo1.p(uf0.s(this.f3267a, this.b, "OnTimeChangeIntent(hour=", ", minute=", ", amOrPm="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$PBExploreAvailableRoutesClicked;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PBExploreAvailableRoutesClicked extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PBExploreAvailableRoutesClicked f3268a = new PBExploreAvailableRoutesClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$PassHistoryItemClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassHistoryItemClickedIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloBusPassHistory f3269a;

        public PassHistoryItemClickedIntent(ChaloBusPassHistory pass) {
            Intrinsics.i(pass, "pass");
            this.f3269a = pass;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassHistoryItemClickedIntent) && Intrinsics.d(this.f3269a, ((PassHistoryItemClickedIntent) obj).f3269a);
        }

        public final int hashCode() {
            return this.f3269a.hashCode();
        }

        public final String toString() {
            return "PassHistoryItemClickedIntent(pass=" + this.f3269a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$PassSavingsBannerInfoBtnClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PassSavingsBannerInfoBtnClickedIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PassSavingsBannerInfoBtnClickedIntent f3270a = new PassSavingsBannerInfoBtnClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$PremiumBusTutorialClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumBusTutorialClickedIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3271a;
        public final String b;

        public PremiumBusTutorialClickedIntent(String title, String videoUrl) {
            Intrinsics.i(title, "title");
            Intrinsics.i(videoUrl, "videoUrl");
            this.f3271a = title;
            this.b = videoUrl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumBusTutorialClickedIntent)) {
                return false;
            }
            PremiumBusTutorialClickedIntent premiumBusTutorialClickedIntent = (PremiumBusTutorialClickedIntent) obj;
            return Intrinsics.d(this.f3271a, premiumBusTutorialClickedIntent.f3271a) && Intrinsics.d(this.b, premiumBusTutorialClickedIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f3271a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("PremiumBusTutorialClickedIntent(title=", this.f3271a, ", videoUrl=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$PremiumBusTutorialViewAllClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumBusTutorialViewAllClickedIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PremiumBusTutorialViewAllClickedIntent f3272a = new PremiumBusTutorialViewAllClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PremiumBusTutorialViewAllClickedIntent);
        }

        public final int hashCode() {
            return -486815340;
        }

        public final String toString() {
            return "PremiumBusTutorialViewAllClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ProceedBtnClickIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProceedBtnClickIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProceedBtnClickIntent f3273a = new ProceedBtnClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ProceedButtonShimmerShownIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProceedButtonShimmerShownIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProceedButtonShimmerShownIntent f3274a = new ProceedButtonShimmerShownIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ProductPurchaseNudgeInfoCardClick;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductPurchaseNudgeInfoCardClick extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductPurchaseNudgeDisplayInfo f3275a;

        public ProductPurchaseNudgeInfoCardClick(ProductPurchaseNudgeDisplayInfo productPurchaseNudgeDisplayInfo) {
            Intrinsics.i(productPurchaseNudgeDisplayInfo, "productPurchaseNudgeDisplayInfo");
            this.f3275a = productPurchaseNudgeDisplayInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductPurchaseNudgeInfoCardClick) && Intrinsics.d(this.f3275a, ((ProductPurchaseNudgeInfoCardClick) obj).f3275a);
        }

        public final int hashCode() {
            return this.f3275a.hashCode();
        }

        public final String toString() {
            return "ProductPurchaseNudgeInfoCardClick(productPurchaseNudgeDisplayInfo=" + this.f3275a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ProductPurchaseNudgeSectionCtaClicked;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductPurchaseNudgeSectionCtaClicked extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductPurchaseNudgeInfoCtaType f3276a;

        public ProductPurchaseNudgeSectionCtaClicked(ProductPurchaseNudgeInfoCtaType ctaType) {
            Intrinsics.i(ctaType, "ctaType");
            this.f3276a = ctaType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductPurchaseNudgeSectionCtaClicked) && this.f3276a == ((ProductPurchaseNudgeSectionCtaClicked) obj).f3276a;
        }

        public final int hashCode() {
            return this.f3276a.hashCode();
        }

        public final String toString() {
            return "ProductPurchaseNudgeSectionCtaClicked(ctaType=" + this.f3276a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$RemoveBottomSheetContentIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoveBottomSheetContentIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RemoveBottomSheetContentIntent f3277a = new RemoveBottomSheetContentIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$SeeAllPassesClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SeeAllPassesClickedIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeeAllPassesClickedIntent f3278a = new SeeAllPassesClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$StopSelectionFieldClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopSelectionFieldClickedIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBStopSearchSource f3279a;

        public StopSelectionFieldClickedIntent(PBStopSearchSource stopSearchSource) {
            Intrinsics.i(stopSearchSource, "stopSearchSource");
            this.f3279a = stopSearchSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopSelectionFieldClickedIntent) && this.f3279a == ((StopSelectionFieldClickedIntent) obj).f3279a;
        }

        public final int hashCode() {
            return this.f3279a.hashCode();
        }

        public final String toString() {
            return "StopSelectionFieldClickedIntent(stopSearchSource=" + this.f3279a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$StopSelectionFieldResultIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopSelectionFieldResultIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBStopPlaceSelectedAppModel f3280a;
        public final PBStopSearchSource b;

        static {
            PBStopPlaceSelectedAppModel.Companion companion = PBStopPlaceSelectedAppModel.INSTANCE;
        }

        public StopSelectionFieldResultIntent(PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopSearchSource stopSearchSource) {
            Intrinsics.i(stopSearchSource, "stopSearchSource");
            this.f3280a = pBStopPlaceSelectedAppModel;
            this.b = stopSearchSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopSelectionFieldResultIntent)) {
                return false;
            }
            StopSelectionFieldResultIntent stopSelectionFieldResultIntent = (StopSelectionFieldResultIntent) obj;
            return Intrinsics.d(this.f3280a, stopSelectionFieldResultIntent.f3280a) && this.b == stopSelectionFieldResultIntent.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f3280a.hashCode() * 31);
        }

        public final String toString() {
            return "StopSelectionFieldResultIntent(result=" + this.f3280a + ", stopSearchSource=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$StopSwapButtonClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StopSwapButtonClickedIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StopSwapButtonClickedIntent f3281a = new StopSwapButtonClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$TimePickerContinueBtnClickedIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimePickerContinueBtnClickedIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimePickerContinueBtnClickedIntent f3282a = new TimePickerContinueBtnClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$ToggleSaveRideIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToggleSaveRideIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3283a;

        public ToggleSaveRideIntent(boolean z) {
            this.f3283a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleSaveRideIntent) && this.f3283a == ((ToggleSaveRideIntent) obj).f3283a;
        }

        public final int hashCode() {
            return this.f3283a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("ToggleSaveRideIntent(shouldSave=", ")", this.f3283a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$UpdateSavedRideTimeIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateSavedRideTimeIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f3284a;

        public UpdateSavedRideTimeIntent(long j) {
            this.f3284a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSavedRideTimeIntent) && this.f3284a == ((UpdateSavedRideTimeIntent) obj).f3284a;
        }

        public final int hashCode() {
            long j = this.f3284a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f3284a, "UpdateSavedRideTimeIntent(newTimeMs=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent$UpdateScreenStateIntent;", "Lapp/chalo/home/ui/chalobus/ChaloBusViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateScreenStateIntent extends ChaloBusViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HomeTabScreensRetainedData.ChaloBusScreen f3285a;

        public UpdateScreenStateIntent(HomeTabScreensRetainedData.ChaloBusScreen chaloBusScreen) {
            this.f3285a = chaloBusScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateScreenStateIntent) && Intrinsics.d(this.f3285a, ((UpdateScreenStateIntent) obj).f3285a);
        }

        public final int hashCode() {
            return this.f3285a.f3171a;
        }

        public final String toString() {
            return "UpdateScreenStateIntent(data=" + this.f3285a + ")";
        }
    }
}
