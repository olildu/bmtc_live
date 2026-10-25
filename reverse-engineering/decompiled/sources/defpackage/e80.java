package defpackage;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import app.chalo.R;
import app.chalo.chalobususerprofile.data.model.HomeWorkTimingModel;
import app.chalo.chalobususerprofile.data.model.TimingVariability;
import app.chalo.compose.resources.IconAssetHelperKt;
import app.chalo.helper.HtmlFormatterFontWeight;
import app.chalo.helper.HtmlFormatterStyle;
import app.chalo.home.ui.base.HomeScreenDrawerConfiguration;
import app.chalo.homescreen.data.model.app.HomePageFeature;
import app.chalo.homescreen.data.model.app.HomeTabHooksCardSectionData;
import app.chalo.homescreen.data.model.app.HomeTabHooksCardSectionData$$serializer;
import app.chalo.homescreen.data.model.app.HomeTabHooksSectionAppModel;
import app.chalo.homescreen.data.model.app.ImageResourceCtaType;
import app.chalo.homescreen.data.model.app.ImageResourcePlacement;
import app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.utils.HtmlStyledData;
import app.chalo.utils.HtmlTextStyling;
import coil3.disk.DiskCache;
import coil3.disk.UtilsKt;
import io.github.alexzhirkevich.compottie.internal.assets.ImageAsset;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffect;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffectsState;
import io.github.alexzhirkevich.compottie.internal.helpers.BooleanIntSerializer;
import io.github.alexzhirkevich.compottie.internal.helpers.Mask$$serializer;
import io.github.alexzhirkevich.compottie.internal.layers.ImageLayer;
import io.ktor.client.plugins.cache.storage.UnlimitedCacheStorage;
import io.ktor.util.AttributesJvmKt;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.ObjectSerializer;
import org.jetbrains.compose.resources.ImageResourcesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e80 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15528a;

    public /* synthetic */ e80(int i) {
        this.f15528a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15528a) {
            case 0:
                HomeScreenDrawerConfiguration.Companion companion = HomeScreenDrawerConfiguration.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.home.ui.base.HomeScreenDrawerConfiguration", Reflection.a(HomeScreenDrawerConfiguration.class), new KClass[]{Reflection.a(HomeScreenDrawerConfiguration.ProfileScreenDrawer.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.home.ui.base.HomeScreenDrawerConfiguration.ProfileScreenDrawer", HomeScreenDrawerConfiguration.ProfileScreenDrawer.INSTANCE, new Annotation[0])});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 1:
                return new ObjectSerializer("app.chalo.home.ui.base.HomeScreenDrawerConfiguration.ProfileScreenDrawer", HomeScreenDrawerConfiguration.ProfileScreenDrawer.INSTANCE, new Annotation[0]);
            case 2:
                HomeTabHooksCardSectionData.Companion companion2 = HomeTabHooksCardSectionData.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.HomePageFeature", HomePageFeature.values());
            case 3:
                HomeTabHooksCardSectionData.Companion companion3 = HomeTabHooksCardSectionData.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 4:
                HomeTabHooksSectionAppModel.Companion companion4 = HomeTabHooksSectionAppModel.INSTANCE;
                return new ArrayListSerializer(HomeTabHooksCardSectionData$$serializer.f3752a);
            case 5:
                HomeWorkTimingModel.Companion companion5 = HomeWorkTimingModel.INSTANCE;
                return TimingVariability.INSTANCE.serializer();
            case 6:
                HomeWorkTimingModel.Companion companion6 = HomeWorkTimingModel.INSTANCE;
                return TimingVariability.INSTANCE.serializer();
            case 7:
                HtmlFormatterStyle.Companion companion7 = HtmlFormatterStyle.Companion;
                return EnumsKt.b("app.chalo.helper.HtmlFormatterFontWeight", HtmlFormatterFontWeight.values());
            case 8:
                HtmlStyledData.Companion companion8 = HtmlStyledData.Companion;
                return EnumsKt.b("app.chalo.utils.HtmlTextStyling", HtmlTextStyling.values());
            case 9:
                int i = R.font.notosansregular;
                FontWeight.Companion companion9 = FontWeight.INSTANCE;
                return FontFamilyKt.FontFamily(FontKt.m6834FontYpTlLL0$default(i, companion9.getNormal(), 0, 0, 12, null), FontKt.m6834FontYpTlLL0$default(R.font.notosanssemibold, companion9.getSemiBold(), 0, 0, 12, null), FontKt.m6834FontYpTlLL0$default(R.font.notosansbold, companion9.getBold(), 0, 0, 12, null));
            case 10:
                return new UnlimitedCacheStorage();
            case 11:
                return AttributesJvmKt.a();
            case 12:
                return new ArrayList();
            case 13:
                return new ArrayList();
            case 14:
                return new LinkedHashMap();
            case 15:
                ProvidableCompositionLocal providableCompositionLocal = IconAssetHelperKt.f1906a;
                throw new IllegalStateException("No IconAssetProvider provided`");
            case 16:
                ImageAsset.Companion companion10 = ImageAsset.INSTANCE;
                return new BooleanIntSerializer();
            case 17:
                ImageLayer.Companion companion11 = ImageLayer.Companion;
                return new LayerEffectsState();
            case 18:
                ImageLayer.Companion companion12 = ImageLayer.Companion;
                return new BooleanIntSerializer();
            case 19:
                ImageLayer.Companion companion13 = ImageLayer.Companion;
                return new BooleanIntSerializer();
            case 20:
                ImageLayer.Companion companion14 = ImageLayer.Companion;
                return new ArrayListSerializer(Mask$$serializer.f16239a);
            case 21:
                ImageLayer.Companion companion15 = ImageLayer.Companion;
                return new ArrayListSerializer(LayerEffect.INSTANCE.serializer());
            case 22:
                ImageLayer.Companion companion16 = ImageLayer.Companion;
                return new LayerEffectsState();
            case 23:
                DefaultScheduler defaultScheduler = Dispatchers.f17721a;
                return MainDispatcherLoader.f17879a.g();
            case 24:
                return (DiskCache) UtilsKt.f11530a.getValue();
            case 25:
                ImageResourceSectionAppModel.Companion companion17 = ImageResourceSectionAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ImageResourcePlacement", ImageResourcePlacement.values());
            case 26:
                ImageResourceSectionAppModel.Companion companion18 = ImageResourceSectionAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.ImageResourceCtaType", ImageResourceCtaType.values());
            case 27:
                ImageResourceSectionAppModel.Companion companion19 = ImageResourceSectionAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 28:
                Lazy lazy = ImageResourcesKt.f18776a;
                return ImageBitmapKt.m4820ImageBitmapx__hDU$default(1, 1, 0, false, null, 28, null);
            default:
                Lazy lazy2 = ImageResourcesKt.f18776a;
                float f = 1;
                return new ImageVector.Builder("emptyImageVector", Dp.m7278constructorimpl(f), Dp.m7278constructorimpl(f), 1.0f, 1.0f, 0L, 0, false, 224, null).build();
        }
    }
}
