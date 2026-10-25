package app.chalo.homescreen.data.model.app;

import defpackage.jk0;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel;", "", "Companion", "HomeTab", "RegularBusTab", "ChaloBusTab", "MyTicketsTab", "SearchTab", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$ChaloBusTab;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$HomeTab;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$MyTicketsTab;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$RegularBusTab;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$SearchTab;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class NavigationTabAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jk0(7));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomNavTabAppModel f3761a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$ChaloBusTab;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ChaloBusTab extends NavigationTabAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final ChaloBusAppModel c;
        public final BottomNavTabAppModel d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$ChaloBusTab$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$ChaloBusTab;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ChaloBusTab> serializer() {
                return NavigationTabAppModel$ChaloBusTab$$serializer.f3762a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ChaloBusTab(int i, BottomNavTabAppModel bottomNavTabAppModel, ChaloBusAppModel chaloBusAppModel, BottomNavTabAppModel bottomNavTabAppModel2) {
            super(bottomNavTabAppModel);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(NavigationTabAppModel$ChaloBusTab$$serializer.f3762a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = chaloBusAppModel;
            this.d = bottomNavTabAppModel2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChaloBusTab)) {
                return false;
            }
            ChaloBusTab chaloBusTab = (ChaloBusTab) obj;
            return Intrinsics.d(this.c, chaloBusTab.c) && Intrinsics.d(this.d, chaloBusTab.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "ChaloBusTab(chaloBusAppModel=" + this.c + ", navTabAppModel=" + this.d + ")";
        }

        public ChaloBusTab(ChaloBusAppModel chaloBusAppModel, BottomNavTabAppModel bottomNavTabAppModel) {
            super(bottomNavTabAppModel, 0);
            this.c = chaloBusAppModel;
            this.d = bottomNavTabAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<NavigationTabAppModel> serializer() {
            return (KSerializer) NavigationTabAppModel.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$HomeTab;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class HomeTab extends NavigationTabAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final HomeScreenAppModel c;
        public final BottomNavTabAppModel d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$HomeTab$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$HomeTab;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<HomeTab> serializer() {
                return NavigationTabAppModel$HomeTab$$serializer.f3763a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HomeTab(int i, BottomNavTabAppModel bottomNavTabAppModel, HomeScreenAppModel homeScreenAppModel, BottomNavTabAppModel bottomNavTabAppModel2) {
            super(bottomNavTabAppModel);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(NavigationTabAppModel$HomeTab$$serializer.f3763a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = homeScreenAppModel;
            this.d = bottomNavTabAppModel2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomeTab)) {
                return false;
            }
            HomeTab homeTab = (HomeTab) obj;
            return Intrinsics.d(this.c, homeTab.c) && Intrinsics.d(this.d, homeTab.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "HomeTab(homeScreenAppModel=" + this.c + ", navTabAppModel=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeTab(HomeScreenAppModel homeScreenAppModel, BottomNavTabAppModel navTabAppModel) {
            super(navTabAppModel, 0);
            Intrinsics.i(navTabAppModel, "navTabAppModel");
            this.c = homeScreenAppModel;
            this.d = navTabAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$MyTicketsTab;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MyTicketsTab extends NavigationTabAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final TicketsPassesAppModel c;
        public final BottomNavTabAppModel d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$MyTicketsTab$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$MyTicketsTab;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<MyTicketsTab> serializer() {
                return NavigationTabAppModel$MyTicketsTab$$serializer.f3764a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MyTicketsTab(int i, BottomNavTabAppModel bottomNavTabAppModel, TicketsPassesAppModel ticketsPassesAppModel, BottomNavTabAppModel bottomNavTabAppModel2) {
            super(bottomNavTabAppModel);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(NavigationTabAppModel$MyTicketsTab$$serializer.f3764a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = ticketsPassesAppModel;
            this.d = bottomNavTabAppModel2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MyTicketsTab)) {
                return false;
            }
            MyTicketsTab myTicketsTab = (MyTicketsTab) obj;
            return Intrinsics.d(this.c, myTicketsTab.c) && Intrinsics.d(this.d, myTicketsTab.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "MyTicketsTab(ticketsPassesAppModel=" + this.c + ", navTabAppModel=" + this.d + ")";
        }

        public MyTicketsTab(TicketsPassesAppModel ticketsPassesAppModel, BottomNavTabAppModel bottomNavTabAppModel) {
            super(bottomNavTabAppModel, 0);
            this.c = ticketsPassesAppModel;
            this.d = bottomNavTabAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$RegularBusTab;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class RegularBusTab extends NavigationTabAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final RegularBusScreenConfigAppModel c;
        public final BottomNavTabAppModel d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$RegularBusTab$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$RegularBusTab;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<RegularBusTab> serializer() {
                return NavigationTabAppModel$RegularBusTab$$serializer.f3765a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RegularBusTab(int i, BottomNavTabAppModel bottomNavTabAppModel, RegularBusScreenConfigAppModel regularBusScreenConfigAppModel, BottomNavTabAppModel bottomNavTabAppModel2) {
            super(bottomNavTabAppModel);
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(NavigationTabAppModel$RegularBusTab$$serializer.f3765a.getDescriptor(), i, 7);
                throw null;
            }
            this.c = regularBusScreenConfigAppModel;
            this.d = bottomNavTabAppModel2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegularBusTab)) {
                return false;
            }
            RegularBusTab regularBusTab = (RegularBusTab) obj;
            return Intrinsics.d(this.c, regularBusTab.c) && Intrinsics.d(this.d, regularBusTab.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "RegularBusTab(regularBusScreenConfigAppModel=" + this.c + ", navTabAppModel=" + this.d + ")";
        }

        public RegularBusTab(RegularBusScreenConfigAppModel regularBusScreenConfigAppModel, BottomNavTabAppModel bottomNavTabAppModel) {
            super(bottomNavTabAppModel, 0);
            this.c = regularBusScreenConfigAppModel;
            this.d = bottomNavTabAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel$SearchTab;", "Lapp/chalo/homescreen/data/model/app/NavigationTabAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchTab extends NavigationTabAppModel {
        public final BottomNavTabAppModel c;

        public SearchTab(BottomNavTabAppModel bottomNavTabAppModel) {
            super(bottomNavTabAppModel, 0);
            this.c = bottomNavTabAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchTab) && Intrinsics.d(this.c, ((SearchTab) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return "SearchTab(navTabAppModel=" + this.c + ")";
        }
    }

    public /* synthetic */ NavigationTabAppModel(BottomNavTabAppModel bottomNavTabAppModel) {
        this.f3761a = bottomNavTabAppModel;
    }

    public NavigationTabAppModel(BottomNavTabAppModel bottomNavTabAppModel, int i) {
        this.f3761a = bottomNavTabAppModel;
    }
}
