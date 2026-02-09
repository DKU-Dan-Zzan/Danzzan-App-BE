@RestController
@RequiredArgsConstructor
@RequestMapping("/home")
public class HomeController {
    private final HomeService homeService;

    @GetMapping("/images")
    public List<HimeImageDto> getHomeImages() {
        return homeService.getHomeImages();
    }
}