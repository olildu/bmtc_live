package app.chalo.home.ui.base;

import defpackage.e80;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenDrawerConfiguration;", "", "Companion", "ProfileScreenDrawer", "Lapp/chalo/home/ui/base/HomeScreenDrawerConfiguration$ProfileScreenDrawer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class HomeScreenDrawerConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3207a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new e80(0));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenDrawerConfiguration$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/ui/base/HomeScreenDrawerConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<HomeScreenDrawerConfiguration> serializer() {
            return (KSerializer) HomeScreenDrawerConfiguration.f3207a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/home/ui/base/HomeScreenDrawerConfiguration$ProfileScreenDrawer;", "Lapp/chalo/home/ui/base/HomeScreenDrawerConfiguration;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ProfileScreenDrawer extends HomeScreenDrawerConfiguration {
        public static final ProfileScreenDrawer INSTANCE = new ProfileScreenDrawer();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new e80(1));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProfileScreenDrawer);
        }

        public final int hashCode() {
            return 1564051132;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ProfileScreenDrawer> serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "ProfileScreenDrawer";
        }
    }
}
