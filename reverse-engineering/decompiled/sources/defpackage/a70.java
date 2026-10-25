package defpackage;

import app.chalo.home.data.HistoryScreenConfig;
import app.chalo.home.data.HistoryScreenConfigForCity;
import app.chalo.home.data.HistoryScreenConfigForCity$$serializer;
import app.chalo.home.ui.base.HomeScreenBottomTabConfiguration;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.homescreen.data.model.app.HomePageSectionType;
import app.chalo.homescreen.data.model.app.HomePageSectionWidgetAppModel;
import app.chalo.homescreen.data.model.app.HomePageSectionWidgetAppModel$AdsterUnifiedAdSection$$serializer;
import app.chalo.homescreen.data.model.app.HomePageSectionWidgetAppModel$GamBannerAdSection$$serializer;
import app.chalo.homescreen.data.model.app.HomePageSectionWidgetAppModel$HomeFooterSection$$serializer;
import app.chalo.homescreen.data.model.app.HomePageSectionWidgetAppModel$HomeTabHooksSection$$serializer;
import app.chalo.homescreen.data.model.app.HomePageSectionWidgetAppModel$ImageResourceSection$$serializer;
import app.chalo.homescreen.data.model.app.HomePageSectionWidgetAppModel$PlotlineWidgetSection$$serializer;
import app.chalo.homescreen.data.model.app.HomePageSectionWidgetAppModel$TicketPassesSection$$serializer;
import app.chalo.homescreen.data.model.app.HomeScreenAppModel;
import app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.scenes.args.GroupTicketMetroLineOverview$$serializer;
import app.chalo.scenes.args.GroupTicketTripDetail;
import app.chalo.scenes.args.GroupTicketTripDetail$Bus$$serializer;
import app.chalo.scenes.args.GroupTicketTripDetail$Metro$$serializer;
import java.lang.annotation.Annotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.ObjectSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169a;

    public /* synthetic */ a70(int i) {
        this.f169a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f169a) {
            case 0:
                GroupTicketTripDetail.Companion companion = GroupTicketTripDetail.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.scenes.args.GroupTicketTripDetail", Reflection.a(GroupTicketTripDetail.class), new KClass[]{Reflection.a(GroupTicketTripDetail.Bus.class), Reflection.a(GroupTicketTripDetail.Metro.class)}, new KSerializer[]{GroupTicketTripDetail$Bus$$serializer.f9263a, GroupTicketTripDetail$Metro$$serializer.f9264a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 1:
                GroupTicketTripDetail.Metro.Companion companion2 = GroupTicketTripDetail.Metro.INSTANCE;
                return new ArrayListSerializer(GroupTicketMetroLineOverview$$serializer.f9257a);
            case 2:
                HistoryScreenConfig.Companion companion3 = HistoryScreenConfig.Companion;
                return new ArrayListSerializer(HistoryScreenConfigForCity$$serializer.f2871a);
            case 3:
                HistoryScreenConfigForCity.Companion companion4 = HistoryScreenConfigForCity.INSTANCE;
                return new ArrayListSerializer(IntSerializer.f18146a);
            case 4:
                return null;
            case 5:
                HomePageSectionWidgetAppModel.Companion companion5 = HomePageSectionWidgetAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 6:
                HomePageSectionWidgetAppModel.Companion companion6 = HomePageSectionWidgetAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.homescreen.data.model.app.HomePageSectionWidgetAppModel", Reflection.a(HomePageSectionWidgetAppModel.class), new KClass[]{Reflection.a(HomePageSectionWidgetAppModel.AdsterUnifiedAdSection.class), Reflection.a(HomePageSectionWidgetAppModel.GamBannerAdSection.class), Reflection.a(HomePageSectionWidgetAppModel.HomeFooterSection.class), Reflection.a(HomePageSectionWidgetAppModel.HomeTabHooksSection.class), Reflection.a(HomePageSectionWidgetAppModel.ImageResourceSection.class), Reflection.a(HomePageSectionWidgetAppModel.PlotlineWidgetSection.class), Reflection.a(HomePageSectionWidgetAppModel.TicketPassesSection.class)}, new KSerializer[]{HomePageSectionWidgetAppModel$AdsterUnifiedAdSection$$serializer.f3740a, HomePageSectionWidgetAppModel$GamBannerAdSection$$serializer.f3741a, HomePageSectionWidgetAppModel$HomeFooterSection$$serializer.f3742a, HomePageSectionWidgetAppModel$HomeTabHooksSection$$serializer.f3743a, HomePageSectionWidgetAppModel$ImageResourceSection$$serializer.f3744a, HomePageSectionWidgetAppModel$PlotlineWidgetSection$$serializer.f3745a, HomePageSectionWidgetAppModel$TicketPassesSection$$serializer.f3746a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 7:
                HomePageSectionWidgetAppModel.AdsterUnifiedAdSection.Companion companion7 = HomePageSectionWidgetAppModel.AdsterUnifiedAdSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 8:
                HomePageSectionWidgetAppModel.AdsterUnifiedAdSection.Companion companion8 = HomePageSectionWidgetAppModel.AdsterUnifiedAdSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 9:
                HomePageSectionWidgetAppModel.GamBannerAdSection.Companion companion9 = HomePageSectionWidgetAppModel.GamBannerAdSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 10:
                HomePageSectionWidgetAppModel.GamBannerAdSection.Companion companion10 = HomePageSectionWidgetAppModel.GamBannerAdSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 11:
                HomePageSectionWidgetAppModel.HomeFooterSection.Companion companion11 = HomePageSectionWidgetAppModel.HomeFooterSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 12:
                HomePageSectionWidgetAppModel.HomeFooterSection.Companion companion12 = HomePageSectionWidgetAppModel.HomeFooterSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 13:
                HomePageSectionWidgetAppModel.HomeTabHooksSection.Companion companion13 = HomePageSectionWidgetAppModel.HomeTabHooksSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 14:
                HomePageSectionWidgetAppModel.HomeTabHooksSection.Companion companion14 = HomePageSectionWidgetAppModel.HomeTabHooksSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 15:
                HomePageSectionWidgetAppModel.ImageResourceSection.Companion companion15 = HomePageSectionWidgetAppModel.ImageResourceSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 16:
                HomePageSectionWidgetAppModel.ImageResourceSection.Companion companion16 = HomePageSectionWidgetAppModel.ImageResourceSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 17:
                HomePageSectionWidgetAppModel.PlotlineWidgetSection.Companion companion17 = HomePageSectionWidgetAppModel.PlotlineWidgetSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 18:
                HomePageSectionWidgetAppModel.PlotlineWidgetSection.Companion companion18 = HomePageSectionWidgetAppModel.PlotlineWidgetSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 19:
                HomePageSectionWidgetAppModel.TicketPassesSection.Companion companion19 = HomePageSectionWidgetAppModel.TicketPassesSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 20:
                HomePageSectionWidgetAppModel.TicketPassesSection.Companion companion20 = HomePageSectionWidgetAppModel.TicketPassesSection.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageSectionType", HomePageSectionType.values());
            case 21:
                HomeScreenAppModel.Companion companion21 = HomeScreenAppModel.INSTANCE;
                return new ArrayListSerializer(HomePageSectionWidgetAppModel.INSTANCE.serializer());
            case 22:
                HomeScreenBottomTabConfiguration.Companion companion22 = HomeScreenBottomTabConfiguration.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.BottomNavTabType", BottomNavTabType.values());
            case 23:
                HomeScreenBottomTabConfiguration.Companion companion23 = HomeScreenBottomTabConfiguration.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.home.ui.base.HomeScreenBottomTabConfiguration", Reflection.a(HomeScreenBottomTabConfiguration.class), new KClass[]{Reflection.a(HomeScreenBottomTabConfiguration.ChaloBusTab.class), Reflection.a(HomeScreenBottomTabConfiguration.HomeTab.class), Reflection.a(HomeScreenBottomTabConfiguration.MyTicketsTab.class), Reflection.a(HomeScreenBottomTabConfiguration.RegularBusTab.class), Reflection.a(HomeScreenBottomTabConfiguration.UnknownTab.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.home.ui.base.HomeScreenBottomTabConfiguration.ChaloBusTab", HomeScreenBottomTabConfiguration.ChaloBusTab.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.home.ui.base.HomeScreenBottomTabConfiguration.HomeTab", HomeScreenBottomTabConfiguration.HomeTab.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.home.ui.base.HomeScreenBottomTabConfiguration.MyTicketsTab", HomeScreenBottomTabConfiguration.MyTicketsTab.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.home.ui.base.HomeScreenBottomTabConfiguration.RegularBusTab", HomeScreenBottomTabConfiguration.RegularBusTab.INSTANCE, new Annotation[0]), new ObjectSerializer("app.chalo.home.ui.base.HomeScreenBottomTabConfiguration.UnknownTab", HomeScreenBottomTabConfiguration.UnknownTab.INSTANCE, new Annotation[0])});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
            case 24:
                return new ObjectSerializer("app.chalo.home.ui.base.HomeScreenBottomTabConfiguration.ChaloBusTab", HomeScreenBottomTabConfiguration.ChaloBusTab.INSTANCE, new Annotation[0]);
            case 25:
                return new ObjectSerializer("app.chalo.home.ui.base.HomeScreenBottomTabConfiguration.HomeTab", HomeScreenBottomTabConfiguration.HomeTab.INSTANCE, new Annotation[0]);
            case 26:
                return new ObjectSerializer("app.chalo.home.ui.base.HomeScreenBottomTabConfiguration.MyTicketsTab", HomeScreenBottomTabConfiguration.MyTicketsTab.INSTANCE, new Annotation[0]);
            case 27:
                return new ObjectSerializer("app.chalo.home.ui.base.HomeScreenBottomTabConfiguration.RegularBusTab", HomeScreenBottomTabConfiguration.RegularBusTab.INSTANCE, new Annotation[0]);
            case 28:
                return new ObjectSerializer("app.chalo.home.ui.base.HomeScreenBottomTabConfiguration.UnknownTab", HomeScreenBottomTabConfiguration.UnknownTab.INSTANCE, new Annotation[0]);
            default:
                HomeScreenConfigAppModel.Companion companion24 = HomeScreenConfigAppModel.INSTANCE;
                return new ArrayListSerializer(NavigationTabAppModel.INSTANCE.serializer());
        }
    }
}
