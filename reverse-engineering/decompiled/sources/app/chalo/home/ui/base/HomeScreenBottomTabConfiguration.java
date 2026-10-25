package app.chalo.home.ui.base;

import app.chalo.homescreen.data.model.app.BottomNavTabType;
import defpackage.a70;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration;", "", "Companion", "HomeTab", "RegularBusTab", "ChaloBusTab", "MyTicketsTab", "UnknownTab", "Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration$ChaloBusTab;", "Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration$HomeTab;", "Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration$MyTicketsTab;", "Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration$RegularBusTab;", "Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration$UnknownTab;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class HomeScreenBottomTabConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] b;
    public static final Object c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BottomNavTabType f3204a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration$ChaloBusTab;", "Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ChaloBusTab extends HomeScreenBottomTabConfiguration {
        public static final ChaloBusTab INSTANCE = new ChaloBusTab(BottomNavTabType.CHALO_BUS);
        public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a70(24));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChaloBusTab);
        }

        public final int hashCode() {
            return 1352238131;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ChaloBusTab> serializer() {
            return (KSerializer) d.getValue();
        }

        public final String toString() {
            return "ChaloBusTab";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<HomeScreenBottomTabConfiguration> serializer() {
            return (KSerializer) HomeScreenBottomTabConfiguration.c.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration$HomeTab;", "Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class HomeTab extends HomeScreenBottomTabConfiguration {
        public static final HomeTab INSTANCE = new HomeTab(BottomNavTabType.HOME);
        public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a70(25));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HomeTab);
        }

        public final int hashCode() {
            return -2017311499;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<HomeTab> serializer() {
            return (KSerializer) d.getValue();
        }

        public final String toString() {
            return "HomeTab";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration$MyTicketsTab;", "Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MyTicketsTab extends HomeScreenBottomTabConfiguration {
        public static final MyTicketsTab INSTANCE = new MyTicketsTab(BottomNavTabType.MY_TICKETS);
        public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a70(26));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MyTicketsTab);
        }

        public final int hashCode() {
            return 1297031835;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<MyTicketsTab> serializer() {
            return (KSerializer) d.getValue();
        }

        public final String toString() {
            return "MyTicketsTab";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration$RegularBusTab;", "Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class RegularBusTab extends HomeScreenBottomTabConfiguration {
        public static final RegularBusTab INSTANCE = new RegularBusTab(BottomNavTabType.REGULAR_BUS);
        public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a70(27));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RegularBusTab);
        }

        public final int hashCode() {
            return 1842538288;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<RegularBusTab> serializer() {
            return (KSerializer) d.getValue();
        }

        public final String toString() {
            return "RegularBusTab";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration$UnknownTab;", "Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class UnknownTab extends HomeScreenBottomTabConfiguration {
        public static final UnknownTab INSTANCE = new UnknownTab(BottomNavTabType.UNKNOWN);
        public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a70(28));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnknownTab);
        }

        public final int hashCode() {
            return 2003976140;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<UnknownTab> serializer() {
            return (KSerializer) d.getValue();
        }

        public final String toString() {
            return "UnknownTab";
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        b = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new a70(22))};
        c = LazyKt.a(lazyThreadSafetyMode, new a70(23));
    }

    public HomeScreenBottomTabConfiguration(BottomNavTabType bottomNavTabType) {
        this.f3204a = bottomNavTabType;
    }
}
