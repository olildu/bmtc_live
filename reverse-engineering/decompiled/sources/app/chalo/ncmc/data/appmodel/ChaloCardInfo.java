package app.chalo.ncmc.data.appmodel;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardInfo;", "", "Companion", "Lapp/chalo/ncmc/data/appmodel/ClosedCardInfo;", "Lapp/chalo/ncmc/data/appmodel/OpenCardInfo;", "Lapp/chalo/ncmc/data/appmodel/SemiClosedCardInfo;", "Lapp/chalo/ncmc/data/appmodel/UnknownCardInfo;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public interface ChaloCardInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f6125a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/ChaloCardInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/ChaloCardInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f6125a = new Companion();

        public final KSerializer<ChaloCardInfo> serializer() {
            SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.ncmc.data.appmodel.ChaloCardInfo", Reflection.a(ChaloCardInfo.class), new KClass[]{Reflection.a(ClosedCardInfo.class), Reflection.a(OpenCardInfo.class), Reflection.a(SemiClosedCardInfo.class), Reflection.a(UnknownCardInfo.class)}, new KSerializer[]{ClosedCardInfo$$serializer.f6145a, OpenCardInfo$$serializer.f6154a, SemiClosedCardInfo$$serializer.f6160a, UnknownCardInfo$$serializer.f6164a});
            sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
            return sealedClassSerializer;
        }
    }

    ChaloCardDetails a();
}
